/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animaciones;

import clases.Clase;
import clases.animacion;
import java.awt.Graphics;

/**
 *
 * @author Wilmer Sair Ramos
 */
public class Aura extends Clase{
    public Aura(Clase s){
        this.s =s;
    }
    Clase s;
    @Override
    public animacion caminarArriba() {
       animacion an = s.caminarArriba();
       an.setIMG2("Aura.png");
       return an;
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public animacion caminardoAbajo() {
       animacion an = s.caminardoAbajo();
       an.setIMG2("Aura.png");
       return an;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public animacion caminarIzquierda() {
       animacion an =s.caminarIzquierda();
       an.setIMG2("Aura.png");
       return an;
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public animacion caminarDerecha() {
       animacion an = s.caminarDerecha();
       an.setIMG2("Aura.png");
       return an;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Clase Clonar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGraphics(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setXY(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int gety() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Graphics getG() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
