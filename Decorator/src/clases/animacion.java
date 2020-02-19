      /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Wilmer Sair Ramos
 */
public class animacion extends Thread {

    int mx = 0,mx2=0;
    int my;
    Graphics2D g2d;
    Image img = null, img2 = null;
    int x, y, limite, limite2;
    boolean estado = true;

    public animacion(Graphics g, String s, int my, int x, int y, int limite) {
        ImageIcon icon = new ImageIcon(s);
        img = icon.getImage();
        g2d = (Graphics2D) g;
        this.my = my;
        this.x = x;
        this.y = y;
        this.limite = limite;

    }

    public animacion(Graphics g, String s1, String s2, int my, int x, int y, int limite1, int limite2) {
        ImageIcon icon = new ImageIcon(s1);
        ImageIcon icon2 = new ImageIcon(s2);
        img = icon.getImage();
        img2 = icon2.getImage();
        g2d = (Graphics2D) g;
        this.my = my;
        this.x = x;
        this.y = y;
        this.limite = limite1;
        this.limite2 = limite2;

    }

    @Override
    public void run() {
        if (img2 != null) {
            System.out.println(img2 != null);
            while (estado) {
                if (mx != limite) {
                    mx++;
                } else {
                    mx = 0;
                }
                if (mx2 != 3) {
                    mx2++;
                } else {
                    mx2 = 0;
                }
                System.out.println(mx);
                g2d.clearRect(x, y, 64, 64);
                g2d.drawImage(img, x, y, x + 64, y + 64, mx * 64, my * 64, (mx * 64) + 64, (my * 64) + 64, null);
                g2d.drawImage(img2, x, y, x + 64, y + 64, mx2 * 64, 0 , (mx2 * 64) + 64, 64, null);
                
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(animacion.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } else {
            while (estado) {
                if (mx != limite) {
                    mx++;
                } else {
                    mx = 0;
                }
                System.out.println(mx);
                g2d.clearRect(x, y, 64, 64);
                g2d.drawImage(img, x, y, x + 64, y + 64, mx * 64, my * 64, (mx * 64) + 64, (my * 64) + 64, null);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(animacion.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    public void suspender() {
        estado = false;
    }
    public void setIMG2(String s){
        ImageIcon icon2 = new ImageIcon(s);
        img2 = icon2.getImage();
    }
}
