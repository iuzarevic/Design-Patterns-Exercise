/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweighteverydaydemo;

/**
 *
 * @author Ivan
 */
public class FlyweightEverydayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Integer firstInt = Integer.valueOf(5);

        Integer secondInt = Integer.valueOf(5);

        Integer thirdInt = Integer.valueOf(10);

        System.out.println(System.identityHashCode(firstInt));
        System.out.println(System.identityHashCode(secondInt));
        System.out.println(System.identityHashCode(thirdInt));
    }

}
