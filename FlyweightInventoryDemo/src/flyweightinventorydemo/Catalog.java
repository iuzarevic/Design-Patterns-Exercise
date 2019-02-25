/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightinventorydemo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ivan
 */
public class Catalog {
    private Map<String, Item> items = new HashMap<String, Item>();
    
    //factory method
    public Item lookup(String itemName) {
        if(!items.containsKey(itemName)) {
            items.put(itemName, new Item(itemName));
        }
        return items.get(itemName);
    }
    
    public int totalItemsMade() {
        return items.size();
    }
}
