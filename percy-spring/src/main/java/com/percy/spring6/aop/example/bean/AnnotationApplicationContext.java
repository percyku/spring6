package com.percy.spring6.aop.example.bean;

import com.percy.spring6.aop.example.anno.Bean;
import com.percy.spring6.aop.example.anno.Di;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AnnotationApplicationContext implements ApplicationContext{

    //創建Map 集合 放 bean 對象
    private  Map<Class,Object> beanFactory =new HashMap<>();

    private static String rootPath;

    //返回對象
    @Override
    public Object getBean(Class clazz) {
        return beanFactory.get(clazz);
    }


    //設立包掃描規則
    //當前包及其子包，那個類別有@Bean註解，把這個類別通過反射實例化
    public AnnotationApplicationContext(String basePackage) {
//    public static void pathdemo1(String basePackage) {
        try{
            //com.percy
            //1 把.替換成\
            String packagePath = basePackage.replaceAll("\\.", "\\\\");

            //2 獲取包的絕對路徑
            Enumeration<URL> urls = Thread.currentThread().getContextClassLoader().getResources(packagePath);
            while(urls.hasMoreElements()){
                URL url =urls.nextElement();
                String filePath = URLDecoder.decode(url.getFile(), "utf-8");
                //獲取包前面路徑部分，字符串擷取
                rootPath = filePath.substring(0,filePath.length()-packagePath.length());
                //包掃描
                loadBean(new File(filePath));
            }
        }catch(Exception e){
            throw new RuntimeException(e);
        }

        //屬性的注入
        loadDi();

    }



    //包掃描過程，實例化
    private  void loadBean(File file)throws Exception{
//    private static void loadBean(File file)throws Exception{
        //1判斷當前是否文件夾
        if(file.isDirectory()){
            //2獲取文件裡面所有內容
            File[] childrenFiles = file.listFiles();

            //3 判斷文件夾裡面為空，直接返回
            if(childrenFiles == null || childrenFiles.length == 0){
                return;
            }

            //4如果文件夾裡面如果文件夾裡面不為空，遍歷文件夾所有內容
            for(File child :childrenFiles){
                //4.1 遍歷得到所有file對象，繼續判斷，如果還是文件夾，遞歸
                if(child.isDirectory()){
                    //遞歸
                    loadBean(child);
                }else{
                    //4.2 遍歷得到所有file對象不是文件夾，是文件
                    //4.3  得到包路徑＋類名稱部分，字符串擷取過程
                    String pathWithClass = child.getAbsolutePath().substring(rootPath.length() - 1);

                    //4.4  判斷當前文件類型是否.class
                    if(pathWithClass.contains(".class")){
                        //4.5 如果是.class類型，把路徑 \ 替換成. 把.class 去掉
                        //com.percy.service.UserServiceImpl
                        String allName= pathWithClass.replaceAll("\\\\",".").replace(".class","");

                        //4.6 判斷類上面是否有註解 @Bean 如果有，就實例化
                        //4.6.1 獲取類的class
                        Class<?> clazz = Class.forName(allName);
                        //4.6.2 判斷不是接口
                        if(!clazz.isInterface()){
                            //4.6.3 判斷類上面是否有註解 @Bean
                            Bean annotation =(Bean) clazz.getAnnotation(Bean.class);
                            if(annotation != null){
                                //4.6.4 實例化
                                Object instance = clazz.getConstructor().newInstance();

                                //4.7 把對象實例化之後，放到map集合beanFactory
                                //4.7.1 判斷當前類如果有接口，讓接口class作為map的key
                                if(clazz.getInterfaces().length>0){
                                    beanFactory.put(clazz.getInterfaces()[0],instance);
                                }else{
                                    beanFactory.put(clazz,instance);
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    //屬性的注入
    private void loadDi(){
        //實例化對象在beanFactory 的map 集合裡面
        //1 歷遍beanFactory的map集合
        Set<Map.Entry<Class, Object>> entries = beanFactory.entrySet();

        for(Map.Entry<Class, Object> entry:entries){
            //2 獲取map 集合每一個對象(value) 每個對象數性獲取到
            Object obj = entry.getValue();
            //獲取對象class

            Class<?> clazz = obj.getClass();

            //獲取每個對象的屬性
            Field[] declaredFields = clazz.getDeclaredFields();

            //3 歷遍的到每個對象屬性數組，得到每個屬性
            for(Field filed: declaredFields){
                //4 判斷屬性上面是否有@Di註解

                Di annotation = filed.getAnnotation(Di.class);
                if(annotation!= null){
                    //如果是私有屬性，設置可以設置值
                    filed.setAccessible(true);

                    //5 如果有@Di 註解 把對象進行設置(注入)
                    try{
                        filed.set(obj,beanFactory.get(filed.getType()));
                    }catch(IllegalAccessException e){
                        throw new RuntimeException(e);
                    }

                }
            }








        }





    }



//    public static void main(String[] args) {
//        pathdemo1("com.percy");
//    }


}
