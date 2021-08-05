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
public class Triangulo implements Dibujos {

    @Override
    public void Dibujar(Graphics g) {
        g.setColor(java.awt.Color.red);
        int x []={25,125,225};
        int y []={125,20,125};
        g.fillPolygon(x, y, 3);
    }
    
}
