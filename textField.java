/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frame;

/**
 *
 * @author LENOVO
 */


import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
public class textField {
public static void main(String[ ] args) {
JFrame frame = new JFrame("Membuat TeksField");
JLabel label = new JLabel("Nama :");
JTextField textField = new JTextField(20);
frame.getContentPane().setLayout(new FlowLayout());
frame.getContentPane().add(label);
frame.getContentPane().add(textField); 
frame.pack();
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
} 
}
