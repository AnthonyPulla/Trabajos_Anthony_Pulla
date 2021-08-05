package figuras;
import java.awt.Graphics;
public class Linea implements Dibujos{
    @Override
    public void Dibujar(Graphics g) {  
        g.setColor(java.awt.Color.yellow);
        g.drawLine(50, 50, 450, 50);
    }
}
