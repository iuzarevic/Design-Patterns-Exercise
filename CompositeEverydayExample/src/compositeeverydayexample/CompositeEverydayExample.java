/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeeverydayexample;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ivan
 */
public class CompositeEverydayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String,String> pa = new HashMap<>();
        pa.put("site_role", "person");
        pa.put("access_role", "limited");
        
        Map<String,String> ga = new HashMap<>();
        ga.put("group_role", "claims");
        
        Map<String,String> sa = new HashMap<>();
        sa.putAll(pa);
        sa.putAll(ga);
        System.out.println(sa);
    }
}
