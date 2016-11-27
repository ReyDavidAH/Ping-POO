
package Gatito;


import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gato {
    JFrame ventana;
    JPanel Inicio;
    JLabel fondo;
    JTextField jugador1;
    JTextField jugador2;
    JButton comenzar;    
    JPanel Jueguito;
    JLabel juga1;
    JLabel juga2;
    JLabel matriz[][]= new JLabel[3][3];
    int mat[][] = new int[3][3];
    int turno=1;
    JLabel labelTurno;
    int vape=0;
    Gato obj;
    
    public Gato(){
        ventana = new JFrame("El Gato");
        ventana.setSize(550,600);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
        Inicio=new JPanel();
        Inicio.setSize(ventana.getWidth(),ventana.getHeight());
        Inicio.setLayout(null);
        Inicio.setVisible(true);
        
        fondo=new JLabel();
        fondo.setIcon(new ImageIcon("imagenes/fondo.jpg"));
        fondo.setSize(ventana.getWidth(),ventana.getHeight());
        fondo.setVisible(true);
        
        Inicio.add(fondo,0);
        
        jugador1 = new JTextField("Ingresa nombre jugador 1");
        jugador1.setBounds(175, 220, 200, 30);
        jugador1.setVisible(true);
        Inicio.add(jugador1);
        
        jugador2 = new JTextField("Ingresa nombre jugador 2");
        jugador2.setBounds(175, 254, 200, 30);
        jugador2.setVisible(true);
        Inicio.add(jugador2);
        
        comenzar = new JButton("INICIAR");
        comenzar.setBounds(225, 288, 100, 30);
        comenzar.setVisible(true);
        comenzar.setBackground(Color.white);
        Inicio.add(comenzar);
        
        Jueguito=new JPanel();
        Jueguito.setSize(ventana.getWidth(),ventana.getHeight());
        Jueguito.setLayout(null);
        Jueguito.setVisible(true);        
        
        juga2=new JLabel();
        juga2.setSize(200, 30);
        juga2.setLocation(ventana.getWidth()-(10+juga2.getWidth()),10);
        juga2.setVisible(true);
        juga2.setForeground(Color.white);
        Jueguito.add(juga2,0);
        
        juga1=new JLabel();
        juga1.setSize(200, 30);
        juga1.setLocation(0,10);
        juga1.setVisible(true);
        juga1.setForeground(Color.white);
        Jueguito.add(juga1,0);
        
        labelTurno=new JLabel();
        labelTurno.setSize(300, 30);
        labelTurno.setLocation(175,500);
        labelTurno.setVisible(true);
        labelTurno.setForeground(Color.white);
        Jueguito.add(labelTurno,0);
        
        comenzar.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
            System.out.println("Presione el boton de comenzar");
            if(jugador1.getText().compareTo("Ingresa nombre jugador 1")!=0 && jugador2.getText().compareTo("Ingresa nombre jugador 2")!=0){
                Inicio.setVisible(false);
                Jueguito.add(fondo);
                juga1.setText("Jugador 1: "+jugador1.getText());
                juga2.setText("Jugador 2: "+jugador2.getText());
                labelTurno.setText("Turno del Jugador: "+jugador1.getText());
                
                for (int i = 0; i < matriz.length; i++) {
                    for(int j=0;j<matriz.length;j++){
                        mat[i][j]=0;
                        matriz[i][j]= new JLabel();
                        matriz[i][j].setIcon(new ImageIcon("imagenes/"+mat[i][j]+".png"));
                        matriz[i][j].setBounds(125+102*i,150+102*j,100,100);
                        matriz[i][j].setVisible(true);
                        Jueguito.add(matriz[i][j],0);
                    }
                }
                for (int i = 0; i < matriz.length; i++) {
                    for(int j=0;j<matriz.length;j++){
                        matriz[i][j].addMouseListener(new MouseAdapter(){
                        
                    
                        public void mouseClicked(MouseEvent e){
                            for (int k = 0; k < matriz.length; k++) {
                                for (int l = 0; l < matriz.length; l++) {
                                    if(e.getSource()==matriz[k][l]){
                                        System.out.println(k+""+l);
                                        if(mat[k][l]==0){
                                            int jugador;
                                            String nombre;
                                            if(turno==1){
                                                mat[k][l]=1;
                                                jugador=1;
                                                nombre=jugador1.getText();
                                                //obj.ganador(1, jugador1.getText());
                                                labelTurno.setText("Turno del Jugador: "+jugador2.getText());                                                
                                                turno*=-1;
                                            }
                                            else{
                                                mat[k][l]=2;
                                                jugador=2;
                                                nombre=jugador2.getText();
                                                //obj.ganador(2, jugador2.getText());
                                                labelTurno.setText("Turno del Jugador: "+jugador1.getText());
                                                turno*=-1;
                                            }
                                            matriz[k][l].setIcon(new ImageIcon("imagenes/"+mat[k][l]+".png"));       
                                            if(mat[0][0]==jugador && mat[1][1]==jugador && mat[2][2]==jugador) vape=1;       
                                            if(mat[2][0]==jugador && mat[1][1]==jugador && mat[0][2]==jugador) vape=1;
                                            if(mat[0][0]==jugador && mat[0][1]==jugador && mat[0][2]==jugador) vape=1;    
                                            if(mat[1][0]==jugador && mat[1][1]==jugador && mat[1][2]==jugador) vape=1;   
                                            if(mat[2][0]==jugador && mat[2][1]==jugador && mat[2][2]==jugador) vape=1; 
                                            if(mat[0][0]==jugador && mat[1][0]==jugador && mat[2][0]==jugador) vape=1;    
                                            if(mat[0][1]==jugador && mat[1][1]==jugador && mat[2][1]==jugador) vape=1;   
                                            if(mat[0][2]==jugador && mat[1][2]==jugador && mat[2][2]==jugador) vape=1; 
                                            if(vape==1){
                                                JOptionPane.showMessageDialog(ventana,"Gano el jugador: "+nombre);
                                                vape=0;
                                                turno=1;
                                                for (int m = 0; m < matriz.length; m++) {
                                                    for (int n = 0; n < matriz.length; n++) {
                                                        mat[m][n]=0;
                                                        matriz[m][n].setIcon(new ImageIcon("imagenes/"+mat[m][n]+".png"));                                                         
                                                    }                                                    
                                                }
                                            }
                                            int acum=0;
                                            for (int m = 0; m < matriz.length; m++) {
                                                for (int n = 0; n < matriz.length; n++) {
                                                    if(mat[m][n]!=0) acum++;                                                    
                                                }                                                
                                            }
                                            if(acum==9){
                                                JOptionPane.showMessageDialog(ventana,"Los jugadores empataron");
                                                acum=0;
                                                vape=0;
                                                turno=1;
                                                for (int m = 0; m < matriz.length; m++) {
                                                    for (int n = 0; n < matriz.length; n++) {
                                                        mat[m][n]=0;
                                                        matriz[m][n].setIcon(new ImageIcon("imagenes/"+mat[m][n]+".png"));                                                         
                                                    }                                                    
                                                }
                                            }
                                        }                                          
                                    }                                    
                                }                                
                            }
                        }                    
                        });
                    }
                }                  
                ventana.add(Jueguito);
            }
        }
        });        
        ventana.add(Inicio);
        ventana.setVisible(true);        
    }    
}
