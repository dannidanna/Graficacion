/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficacion;

import java.awt.Graphics;

/**
 *
 * @author Saul
 */
public class Balon extends Componente{
    int px;
    int py;
    int radio;
    Graphics g1;

    public Balon() {
        
        radio=15;
        
        lib = new LibreriaGrafica();
    }
    
    
 @Override
 public void dibujarse(){
 }
 
 public void dibujarseRelleno(int x, int y, Graphics g){
 int r =radio;
 px=x;  py=y;g1=g;
 for(int i=r;i>=0;i--){
 lib.dibujarCirculo(px, py, i, 1,g1);
 }
 
 }
 
 public void moverBalon(int dir){
     if(dir ==1){
     dibujarseRelleno(px, py, g1);
     }
     
 }
 
}
