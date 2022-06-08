/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keypad;

import java.awt.Component;
import java.awt.Frame;
import java.awt.TextField;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.Instant;
import java.util.*;
import java.awt.event.*;

/**
 *
 * @author dat222003
 */
public class keypad_01 extends Frame implements KeyListener {
    
    

    List<String> keyarr = new ArrayList<>();

     /**
     * @param args the command line arguments
     */

    public keypad_01(){
      super("keypad");
      setSize(500,500);
      setVisible(true);
      addKeyListener(this);
      TextField t = new TextField();
      add(t);
      
      addWindowListener(new WindowAdapter(){
          @Override
          public void windowClosing(WindowEvent we){
              System.exit(0);
          }
      });
      
      
    }

   
    public static void main(String[] args) {
        keypad_01 keypad = new keypad_01();
        
    }

    @Override
    public void keyPressed(KeyEvent e){
//      System.out.println("pressed: " + e.getKeyChar()+"time: "+ Instant.now());
//      start = System.currentTimeMillis();
    }

    @Override
    public void keyReleased(KeyEvent e){
      System.out.println("released: " + e.getKeyChar()+" time: "+ Instant.now() );
      String time =  Instant.now().toString();
      System.out.println("time: " + time.charAt(17)+time.charAt(18));
      int second = (int)time.charAt(17) + (int)time.charAt(18);
      System.out.println(" Second: " + (int)(second));
      keyarr.add(Integer.toString(second ));
      Object[] key = keyarr.toArray();
        System.out.println(Arrays.toString(key));
    }
   
    @Override
    public void keyTyped(KeyEvent e) {
    
    }


    
}
