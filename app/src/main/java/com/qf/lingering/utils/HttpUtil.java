package com.qf.lingering.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by heyanqiu on 2017/2/20.
 * 网络下载类
 */

public class HttpUtil {
    //根据地址去下载网络数据,得到通用对象字节数组
    public static byte[] getBytes(String path){
        InputStream is=null;
        ByteArrayOutputStream baos=null;
        try {
            URL url=new URL(path);
            HttpURLConnection connection= (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(5000);
            connection.setRequestMethod("GET");
            connection.connect();
            if (200==connection.getResponseCode()){
                is = connection.getInputStream();
                baos=new ByteArrayOutputStream();
                int len=0;
                byte[] buffer=new byte[1024];
                while ((len=is.read(buffer))!=-1){
                    baos.write(buffer,0,len);
                }
                byte[] bytes = baos.toByteArray();
                return bytes;

            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (baos!=null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }


}
