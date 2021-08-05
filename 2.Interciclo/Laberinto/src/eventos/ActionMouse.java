package eventos;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class ActionMouse extends JPanel implements  MouseListener, MouseMotionListener{
    public Raton figuraRaton;
    public Random rnd =new Random(); 
    public ActionMouse(){
        setBounds(0, 0, 500, 500);
        figuraRaton=new Raton(0, 0, 10, 10);
    }
    @Override
    public void paint(Graphics lienzo){
        lienzo.clearRect(0, 0, 500, 500);
        lienzo.setColor(Color.black);   
        lienzo.drawLine(100, 100, 150, 100); 
        lienzo.drawLine(150, 100, 150, 180); 
        lienzo.drawLine(170, 100, 170, 180); 
        lienzo.drawLine(150, 180, 170, 180);
        lienzo.drawLine(190, 120, 190, 200);
        lienzo.drawLine(190, 120, 270, 120);
        lienzo.drawLine(170, 100, 270, 100);
        lienzo.drawLine(130, 130, 130, 200);
        lienzo.drawLine(90, 130, 130, 130);
        lienzo.drawLine(130, 200, 190, 200);
        lienzo.drawString("Iniciar", 50, 150);
        lienzo.drawString("Final", 310, 100);
        lienzo.fillOval(figuraRaton.getX(), figuraRaton.getY(), figuraRaton.getAncho(), figuraRaton.getAlto());

    }
    @Override
    public void mouseClicked(MouseEvent me) {
        figuraRaton.setX(me.getX());
        figuraRaton.setY(me.getY());
        this.repaint();
    }
    @Override
    public void mouseMoved(MouseEvent me) {
        figuraRaton.setX(me.getX());
        figuraRaton.setY(me.getY());
        if(me.getY()==100 && (me.getX()<=150 && me.getX()>=100)){ //1
            JOptionPane.showMessageDialog(this, "Fallaste");
        }else if(me.getX()==150 && me.getY()>=100 && me.getY()<=180){//2
            JOptionPane.showMessageDialog(this, "Fallaste");
        }else if(me.getX()==170 && me.getY()>=100 && me.getY()<=180){//3
            JOptionPane.showMessageDialog(this, "Fallaste");
        }else if(me.getY()==180 && me.getX()>=150 && me.getX()<=170){//4
            JOptionPane.showMessageDialog(this, "Fallaste");
        }else if(me.getX()==190 && me.getY()>=120 && me.getY()<=200){//5
            JOptionPane.showMessageDialog(this, "Fallaste");
        }else if(me.getY()==120 && me.getX()>=190 && me.getX()<=270){//6
            JOptionPane.showMessageDialog(this, "Fallaste");
        }else if(me.getY()==100 && me.getX()>=170 && me.getX()<=270){//7
            JOptionPane.showMessageDialog(this, "Fallaste");
        }else if(me.getX()==130 && me.getY()>=130 && me.getY()<=200){//8
            JOptionPane.showMessageDialog(this, "Fallaste");
        }else if(me.getY()==130 && me.getX()>=90 && me.getX()<=130){//9
            JOptionPane.showMessageDialog(this, "Fallaste");
        }else if(me.getX()==200 && me.getY()>=130 && me.getY()<=190){//10
            JOptionPane.showMessageDialog(this, "Fallaste");
        }else if (me.getX()==300){
            JOptionPane.showMessageDialog(this, "Ganaste");
        }
        this.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
