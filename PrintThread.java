/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut;

/**
 *
 * @author hp
 */
public class PrintThread extends Thread{
    private PrintNumbers pn;
    private int number;

    public PrintThread(PrintNumbers pn, int number) {
        this.pn = pn;
        this.number = number;
    }
    
    public void run(){
        pn.display(number);
    }
    
}
