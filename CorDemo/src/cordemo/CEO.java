/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cordemo;

/**
 *
 * @author Ivan
 */
public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want");
    }
    
}
