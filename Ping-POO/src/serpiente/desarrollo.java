
package serpiente;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Lenovo
 */
public class desarrollo {
    //serpiente
    
    JFrame ventana;
    JPanel paneljuego;
    JLabel fondo;
    ArrayList<JLabel> serpiente;
    int x,y, desplazamiento = 20;
    Timer tiempo;
    int ban=0;
    Rectangle serp;
    int perdio = 0;
    //comida
    JLabel comida;
    int cx =0 , cy= 0;
    Rectangle comi;
    //puntos
    JLabel puntos;
    int contador = 0;
    JLabel perdiste;
    public desarrollo(){
        ventana = new JFrame("Juego de la serpiente");
        ventana.setSize(600, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
        paneljuego = new JPanel();
        paneljuego.setSize(ventana.getSize());
        paneljuego.setLayout(null);
        paneljuego.setVisible(true);
        //paneljuego.setBackground(Color.red);
        
        fondo =  new JLabel();
        fondo.setSize(paneljuego.getSize());
        fondo.setIcon(new ImageIcon("images/fondo.png"));
        fondo.setVisible(true);
        paneljuego.add(fondo,0);
        
        //serpiente
        serpiente = new ArrayList<JLabel>();
        JLabel aux = new JLabel();
        aux.setLocation(300,300);
        aux.setSize(20,20);
        aux.setIcon(new ImageIcon("images/3.png"));
        aux.setVisible(true);
        serpiente.add(aux);
        paneljuego.add(serpiente.get(0),0);
        
        ventana.add(paneljuego);
        
        //La manzanita de apple
        comida = new JLabel();
        comida.setSize(20,20);
        comida.setIcon(new ImageIcon("images/6.png"));
        Random aleatorio = new Random();
        cx = aleatorio.nextInt(540);
        cy = aleatorio.nextInt(540);
        comida.setLocation(cx, cy);
        comida.setVisible(true);
        paneljuego.add(comida,0);
        
        serp = new Rectangle(serpiente.get(0).getBounds());
        comi = new Rectangle(comida.getBounds());
        
        puntos = new JLabel("Puntuacion: "+ contador);
        puntos.setBounds(10, 20, 100, 20);
        puntos.setVisible(true);
        puntos.setForeground(Color.green);
        paneljuego.add(puntos, 0);
        tiempo = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comi.setBounds(comida.getBounds());
                serp.setBounds(serpiente.get(0).getBounds());
                if(serpiente.get(0).getX() > 540){
                    perdio = 1;
                }
                if(serpiente.get(0).getX() < 10){
                    perdio = 1;
                }
                if(serpiente.get(0).getY() > 540){
                    perdio = 1;
                }
                if(serpiente.get(0).getY() < 10){
                    perdio = 1;
                }
                if(perdio == 1){
                    tiempo.stop();
                }
                
                if(comi.intersects(serp)){
                    cx = aleatorio.nextInt(540);
                    cy = aleatorio.nextInt(540);
                    comida.setLocation(cx, cy);
                    comida.repaint();
                    System.out.println("comi");
                    JLabel aux = new JLabel();
                    aux.setLocation(200,200);
                    aux.setSize(20,20);
                    aux.setIcon(new ImageIcon("images/1.png"));
                    aux.setVisible(true);
                    serpiente.add(aux);
                    paneljuego.add(serpiente.get(serpiente.size()-1),0);
                    System.out.println(""+ serpiente.size());
                    contador += 1;
                    puntos.setText("Puntuacion: "+ contador);
                    puntos.repaint();
                }
                
                //serpiente.get(0).setLocation(serpiente.get(0).getX()+x,serpiente.get(0).getY()+y);
                for(int i = serpiente.size()-1; i > 0; i--){
                    serpiente.get(i).setLocation(serpiente.get(i-1).getLocation());
                    serpiente.get(i).repaint(); 
                }
                serpiente.get(0).setLocation(serpiente.get(0).getX()+x,serpiente.get(0).getY()+y); 
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
                if(e.getKeyCode() ==  KeyEvent.VK_UP){
                    System.out.println("arriba");
                    if(serpiente.get(0).getY()>0){
                        y = -desplazamiento;
                        x = 0;
                        serpiente.get(0).setIcon(new ImageIcon("images/2.png"));
                    }
                    if(ban==0){
                        tiempo.start();
                        ban=1;
                    }
                }
                 if(e.getKeyCode() ==  KeyEvent.VK_DOWN){
                    System.out.println("abajo");
                    if(serpiente.get(0).getY()<600){
                        y = desplazamiento;
                        x = 0;
                        serpiente.get(0).setIcon(new ImageIcon("images/4.png"));
                    }
                    if(ban==0){
                        tiempo.start();
                        ban=1;
                    }
                }
                  if(e.getKeyCode() ==  KeyEvent.VK_LEFT){
                    System.out.println("izquierda");
                    if(serpiente.get(0).getX()>0){
                        y = 0;
                        x = -desplazamiento;
                        serpiente.get(0).setIcon(new ImageIcon("images/5.png"));
                    }
                    if(ban==0){
                        tiempo.start();
                        ban=1;
                    }
                }
                 if(e.getKeyCode() ==  KeyEvent.VK_RIGHT){
                    System.out.println("derecha");
                    if(serpiente.get(0).getX()<600){
                        y = 0;
                        x = desplazamiento;
                        serpiente.get(0).setIcon(new ImageIcon("images/3.png"));
                    }
                    if(ban==0){
                        tiempo.start();
                        ban=1;
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
