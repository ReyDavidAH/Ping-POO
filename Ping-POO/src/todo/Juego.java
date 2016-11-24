package Todo;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Juego {
        //Atri
        JFrame ventana;
        JPanel panelJuego;
        JLabel mesa;
        JLabel pelota;
        JLabel raquetaI;
        JLabel raquetaD;
        //Constr
        public Juego(){
            //Ventana
            ventana= new JFrame("Ping POO");
            ventana.setSize(1000, 500);
            ventana.setLocationRelativeTo(pelota);
            ventana.setLayout(null);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setResizable(false);
            
            panelJuego= new JPanel();
            panelJuego.setSize(ventana.getSize());
            panelJuego.setLocation(0, 0);
            panelJuego.setLayout(null);
            panelJuego.setBackground(Color.red);
            panelJuego.setVisible(true);
            ventana.add(panelJuego);
            
            mesa= new JLabel();
            mesa.setSize(panelJuego.getSize());
            mesa.setLocation(0, 0);
            mesa.setIcon(new ImageIcon("imagenes/Tablero.png"));
            mesa.setVisible(true);
            panelJuego.add(mesa, 0);
            
            raquetaI= new JLabel();
            raquetaI.setSize(10, 100);
            raquetaI.setLocation(0, 180);
            raquetaI.setIcon(new ImageIcon("imagenes/Raqueta 1.png"));
            raquetaI.setVisible(true);
            panelJuego.add(raquetaI, 0);
            
            raquetaD= new JLabel();
            raquetaD.setSize(10, 100);
            raquetaD.setLocation(985, 180);
            raquetaD.setIcon(new ImageIcon("imagenes/Raqueta 2.png"));
            raquetaD.setVisible(true);
            panelJuego.add(raquetaD, 0);
            
            pelota= new JLabel();
            pelota.setSize(25, 25);
            pelota.setLocation(487, 220);
            pelota.setIcon(new ImageIcon("imagenes/pelota.png"));
            pelota.setVisible(true);
            panelJuego.add(pelota, 0);
            
            ventana.setVisible(true);
        }
}
