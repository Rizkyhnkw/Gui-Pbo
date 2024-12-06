/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frame;

/**
 *
 * @author LENOVO
 */


 import java.awt.*; 
public class windowText extends Frame {
@Override
public void paint(Graphics g) { 
setSize(300, 200);
setTitle(getClass().getName());
Font f = new Font( "Monospaced" , Font.BOLD, 16); 
g.setFont(f);
g.drawString( "Hello ...", 10 , 100); 
g.drawString( "Salam kenal dari Bekasi ... ", 30 ,120); 
} 
public static void main(String[ ] args) {
windowText coba = new windowText();
coba.setSize(500, 300);
coba.setLocation(200, 100); 
coba.setTitle("Window Text" ); 
coba.show();
} 
}
    

