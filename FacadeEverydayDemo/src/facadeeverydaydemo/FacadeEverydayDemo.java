/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadeeverydaydemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Ivan
 */
public class FacadeEverydayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        URL url = new URL("http", "www.pluralsight.com", 80, "/author/bryan-hansen");

        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
    }

}
