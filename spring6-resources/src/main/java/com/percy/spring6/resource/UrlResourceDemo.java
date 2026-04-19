package com.percy.spring6.resource;

import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;

//掩飾UrlResource訪問網路資源
public class UrlResourceDemo {

    public static void main(String[] args) {
        //http前綴開頭
//        loadUrlResource("https://www.google.com/");
        //file 前綴開頭
        loadUrlResource("file:percy.txt");
    }
    //訪問前綴http,file
    public static void loadUrlResource(String path){

        try {
            //create Resource 實現類的對象 UrlResource
            UrlResource urlResource =new UrlResource(path);
            //獲取實現類訊息
            System.out.println(urlResource.getFilename());
            System.out.println(urlResource.getURL());
            System.out.println(urlResource.getDescription());
            System.out.println(urlResource.getInputStream().read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}
