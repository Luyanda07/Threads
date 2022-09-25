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
public class PrintThreadApp {
    
    public static void main(String []args){
        PrintNumbers pn = new PrintNumbers();
        
        Thread t1 = new PrintThread(pn, 50);
        
        //start the thread
        t1.start();
        
    }
    
}
