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
public class labelBerformat {
public static void main(String[] args) {
JFrame frame = new JFrame("Membuat Label");
JLabel label = new JLabel("Pemrograman Berorientasi Obyek");
label.setForeground(Color.white);
label.setBackground(Color.black); 
label.setOpaque(true);
label.setFont(new Font("SansSerif", Font.BOLD, 14)); 
frame.getContentPane().add(label);
frame.pack();
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
} 
}
