package Graficas;
import javax.swing.JFrame;
public class Ventana extends JFrame{
        private Panel panelprincipal=new Panel();

    public Ventana(){
        setTitle("Gráfica 2D");
        setBounds(0, 0, 300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponentes();
    }
    public void initComponentes(){
        panelprincipal=new Panel();
        setContentPane(panelprincipal);
        panelprincipal.repaint();
        addKeyListener(panelprincipal);
    }
}
