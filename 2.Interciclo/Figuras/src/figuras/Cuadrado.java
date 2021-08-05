/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.awt.Graphics;

/**
 *
 * @author Lenovo
 */
public class Cuadrado implements Dibujos {

    @Override
    public void Dibujar(Graphics g) {
        g.setColor(java.awt.Color.black);
        g.fillRect(15, 30,100, 100);
    }
    
}
