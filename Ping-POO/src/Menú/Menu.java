//Se immportan las clases ya hechas anteriormente en éste nuevo paquete.
package Menú;
import Gatito.Gato;
import Todo.Juego;
import serpiente.desarrollo;

public class Menu extends javax.swing.JFrame {

    //Aquí se crea el nuevo menú
    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotónPingPOO = new javax.swing.JButton();
        BotónGato = new javax.swing.JButton();
        BotónViborín = new javax.swing.JButton();
        BotónSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotónPingPOO.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotónPingPOO.setForeground(new java.awt.Color(0, 0, 0));
        BotónPingPOO.setText("Iniciar Ping POO");
        BotónPingPOO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotónPingPOO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotónPingPOO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotónPingPOOActionPerformed(evt);
            }
        });
        getContentPane().add(BotónPingPOO, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        BotónGato.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotónGato.setForeground(new java.awt.Color(0, 0, 0));
        BotónGato.setText("Iniciar Gato");
        BotónGato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotónGato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotónGato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotónGatoActionPerformed(evt);
            }
        });
        getContentPane().add(BotónGato, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, 30));

        BotónViborín.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotónViborín.setForeground(new java.awt.Color(0, 0, 0));
        BotónViborín.setText("Iniciar Viborín Viborón");
        BotónViborín.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotónViborín.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotónViborín.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotónViborínActionPerformed(evt);
            }
        });
        getContentPane().add(BotónViborín, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, 30));

        BotónSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotónSalir.setForeground(new java.awt.Color(0, 0, 0));
        BotónSalir.setText("Salir :(");
        BotónSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotónSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotónSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotónSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotónSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menú/Menú.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menú/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 441, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotónSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotónSalirActionPerformed
        //Éste botón cierra el programa completo.
        System.exit(0);
    }//GEN-LAST:event_BotónSalirActionPerformed

    private void BotónPingPOOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotónPingPOOActionPerformed
        //Éste código abre el juego Ping POO.
        Juego boton=new Juego();
    }//GEN-LAST:event_BotónPingPOOActionPerformed

    private void BotónGatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotónGatoActionPerformed
        //Éste código se ejecuta al presionar el botón número 2.
        Gato gatox=new Gato();
    }//GEN-LAST:event_BotónGatoActionPerformed

    private void BotónViborínActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotónViborínActionPerformed
        desarrollo viboron=new desarrollo();
    }//GEN-LAST:event_BotónViborínActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotónGato;
    private javax.swing.JButton BotónPingPOO;
    private javax.swing.JButton BotónSalir;
    private javax.swing.JButton BotónViborín;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}