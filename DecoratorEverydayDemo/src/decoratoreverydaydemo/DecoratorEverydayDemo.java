/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratoreverydaydemo;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author Ivan
 */
public class DecoratorEverydayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File f = new File("./output.txt");
        f.createNewFile();
        
        OutputStream oStream = new FileOutputStream(f);
        DataOutputStream doStream = new DataOutputStream(oStream);
        doStream.writeChars("text");
        
        doStream.close();
        oStream.close();
    }
    
}
