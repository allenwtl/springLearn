package org.allen.springbeans;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Enumeration;

/**
 * Created by allen on 2015/9/15.
 */
public class JavaReadePropertyFile {
/*
    public static void main(String[] args) {
        try {
            System.out.println("user.dir = [" + System.getProperty("user.dir") + "]");

            //目录基础是  user.dir 的值
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("spring/pom.xml")));
            String str ;
            while ((str = br.readLine()) != null){
                System.out.println("str = [" + str + "]");
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/


/*    public static void main(String[] args) {

        InputStream is = ClassLoader.getSystemResourceAsStream("spring-config/spring-context.xml");

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) {

        try {
            Enumeration resourceUrls = Thread.currentThread().getContextClassLoader().getResources("spring-config/logback.xml");

            while (resourceUrls.hasMoreElements()) {
                URL url = (URL) resourceUrls.nextElement();
                System.out.println(url);

                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                String str;
                while ((str = in.readLine()) != null) {
                    System.out.println(str);
                }
                in.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
