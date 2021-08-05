package eventos;

import javax.swing.JFrame;

public class VentaRa extends JFrame {
    public ActionMouse panelRaton;
    public VentaRa(){
        setTitle("Juego del Laberinto");
        setBounds(0,0,500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initcomponents(); //siempre

    }
    public void initcomponents(){
        panelRaton=new ActionMouse();
        setContentPane(panelRaton);
        panelRaton.repaint();
        addMouseMotionListener(panelRaton); 
    }
}
