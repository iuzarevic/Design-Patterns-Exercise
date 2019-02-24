/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositemenudemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

/**
 *
 * @author Ivan
 */
public abstract class MenuComponent {

    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    String print(MenuComponent menuComponent) {
        StringBuilder b = new StringBuilder(name);
        b.append(": ");
        b.append(url);
        b.append("\n");
        return b.toString();
    }

}
