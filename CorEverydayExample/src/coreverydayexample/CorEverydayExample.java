/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coreverydayexample;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivan
 */
public class CorEverydayExample {
    private static final Logger logger = Logger.getLogger(CorEverydayExample.class.getName());
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //level to log at
        logger.setLevel(Level.FINER);

        ConsoleHandler handler = new ConsoleHandler();
        //level to publish at
        handler.setLevel(Level.FINER);
        logger.addHandler(handler);

        logger.finest("Finest level of logging"); //this one won't print
        logger.finer("Finer level, but not as fine as finest");
        logger.fine("Fine, but not as fine as finer or finest");

    }
}
