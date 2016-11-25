package Todo;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
public class Juego {
        //Atri
        JFrame ventana;
        JPanel panelJuego;
        JLabel mesa;
        JLabel pelota;
        JLabel raquetaI;
        JLabel raquetaD;
        Rectangle raqueI, raqueD, pel;
       
        
        
        int raqVel=10, px, py, pelvel=1, aleatorioX, aleatorioY, milisegundos=200/*Velocidad a la que viaja la pelota*/, pause=0;
        Random ale=new Random();
        Timer tiempo;
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
            
            raqueI= new Rectangle(raquetaI.getBounds());
            raqueD= new Rectangle(raquetaD.getBounds());
            pel= new Rectangle(pelota.getBounds());
            
            raqueI.setBounds(raquetaI.getBounds());
            raqueD.setBounds(raquetaD.getBounds());
            aleatorioX= ale.nextInt(10)+1;
            aleatorioY= ale.nextInt(10)+1;
            
            
            
            tiempo= new Timer(milisegundos, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pelota.setLocation(pelota.getX()+(pelvel*aleatorioX), pelota.getY()+(pelvel*aleatorioY));
                    pelota.repaint();
                }
            });
            
            
            
            
            ventana.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    if (raquetaD.getY()>0 && e.getKeyCode()== KeyEvent.VK_UP){
                        raquetaD.setLocation(raquetaD.getX(), raquetaD.getY()-raqVel);
                        raqueD.setBounds(raquetaD.getBounds());
                    }
                    if (raquetaD.getY()<371 && e.getKeyCode()== KeyEvent.VK_DOWN){ 
                        raquetaD.setLocation(raquetaD.getX(), raquetaD.getY()+raqVel);
                        raqueD.setBounds(raquetaD.getBounds());
                    }
                    if (raquetaI.getY()>0 && e.getKeyCode()== KeyEvent.VK_W){
                        raquetaI.setLocation(raquetaI.getX(), raquetaI.getY()-raqVel);
                        raqueI.setBounds(raquetaI.getBounds());
                    }
                    if (raquetaI.getY()<371 && e.getKeyCode()== KeyEvent.VK_S){
                        raquetaI.setLocation(raquetaI.getX(), raquetaI.getY()+raqVel);
                        raqueI.setBounds(raquetaI.getBounds());
                    }
                    if(e.getKeyCode()==KeyEvent.VK_SPACE){
                        if(pause==0){
                            tiempo.start();
                            pause=1;
                        }else{
                            tiempo.stop();
                            pause=0;
                        }
                    }
                }
                
                @Override
                public void keyReleased(KeyEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            });
            
            ventana.setVisible(true);
        }
}
