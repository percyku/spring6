package com.percy.spring6.resource;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

//訪問類路徑下的資玄
public class ClassPathResourceDemo  {

    public static void main(String[] args) {
        loadClasspathResource("percy.txt");
    }


    public static void loadClasspathResource(String path){

        ClassPathResource classPathResource= new ClassPathResource(path);

        System.out.println(classPathResource.getFilename());
        System.out.println(classPathResource.getDescription());
        //獲取文件內容
        try {
            InputStream in =classPathResource.getInputStream();
            byte[]b =new byte[1024];

            while(in.read(b)!=-1){
                System.out.println(new String(b));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
