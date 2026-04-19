package com.percy.spring6.resource;

import java.io.IOException;
import java.io.InputStream;

//訪問系統中的資源
public class FileSystemResource {

    public static void main(String[] args) {
        //相對路徑
        loadFileResource("percy.txt");
        //絕對路徑
//        loadFileResource("/Users/guxiansheng/Codes/java-tutorial/Spring6/percy.txt");
    }


    public static void loadFileResource(String path){
        org.springframework.core.io.FileSystemResource fileSystemResource =new org.springframework.core.io.FileSystemResource(path);
        System.out.println(fileSystemResource.getFilename());
        System.out.println(fileSystemResource.getDescription());
        try {
            InputStream in =fileSystemResource.getInputStream();
            byte[]b =new byte[1024];

            while(in.read(b)!=-1){
                System.out.println(new String(b));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
