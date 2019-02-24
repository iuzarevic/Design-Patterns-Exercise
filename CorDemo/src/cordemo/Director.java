/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cordemo;

/**
 * This is a concreteHandler
 *
 * @author Ivan
 */
public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Directors can approve conferences");
        } else {
            successor.handleRequest(request);
        }
    }
}
