/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositemenudemo;

/**
 *
 * @author Ivan
 */
public class Menuitem extends MenuComponent {

    public Menuitem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return print(this);
    }
}
