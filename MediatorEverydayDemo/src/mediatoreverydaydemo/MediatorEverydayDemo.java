/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatoreverydaydemo;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Ivan
 */
public class MediatorEverydayDemo {

    //private Toolkit toolkit;
    private Timer timer;

    public MediatorEverydayDemo(int seconds) {
        //toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
        timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000);
    }

    class RemindTask extends TimerTask {

        public void run() {
            System.out.println("Time's up!");
            //toolkit.beep();
        }
    }

    class RemindTaskWithoutBeep extends TimerTask {

        public void run() {
            System.out.println("Now Time's really up!");
            timer.cancel();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("About to schedule task.");
        new MediatorEverydayDemo(3);
        System.out.println("Task scheduled.");
    }

}
