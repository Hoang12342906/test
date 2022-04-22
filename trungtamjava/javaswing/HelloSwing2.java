/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trungtamjava.javaswing;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author ADMIN
 */
public class HelloSwing2 extends JFrame{
    public HelloSwing2()throws HeadlessException {
       setSize (400,400);
       setVisible(true);
    }
    public static void main(String[]args){
        HelloSwing helloSwing = new HelloSwing();
    }

}
