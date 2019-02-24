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
public class CompositeMenuDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "/main");

        Menuitem safetyMenuItem = new Menuitem("Safety", "/safety");

        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");

        mainMenu.add(claimsSubMenu);

        Menuitem personalClaimsMenu = new Menuitem("Personal Claim", "/personalClaims");

        claimsSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu.toString());
    }

}
