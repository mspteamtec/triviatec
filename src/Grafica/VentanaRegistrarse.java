/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Grafica;
import triviatec.*;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
/**
 *
 * @author QRly
 */

public class VentanaRegistrarse extends javax.swing.JFrame {

    Trivia nuevatrivia = new Trivia();
    public VentanaRegistrarse() {
        initComponents();
     
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rbProfesor);
        grupo.add(rbEstudiante);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        EntradaContrasena = new javax.swing.JPasswordField();
        txtnombre = new javax.swing.JLabel();
        txtcedula = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JLabel();
        txtcontrasena = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        EntradaNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        EntradaCedula = new javax.swing.JTextField();
        rbEstudiante = new javax.swing.JRadioButton();
        rbProfesor = new javax.swing.JRadioButton();
        txtcarne = new javax.swing.JLabel();
        EntradaCarne = new javax.swing.JTextField();
        BtnRegistrar = new javax.swing.JButton();
        EntradaCorreo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EntradaContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaContrasenaActionPerformed(evt);
            }
        });

        txtnombre.setText("Nombre");

        txtcedula.setText("Cédula");

        txtcorreo.setText("Correo Electrónico");

        txtcontrasena.setText("Contraseña");

        jButton1.setText("Seleccionar...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Imagen de Perfil");

        EntradaCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaCedulaActionPerformed(evt);
            }
        });

        rbEstudiante.setText("Estudiante ");
        rbEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEstudianteActionPerformed(evt);
            }
        });

        rbProfesor.setText("Profesor");
        rbProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProfesorActionPerformed(evt);
            }
        });

        txtcarne.setText("Carné ");

        EntradaCarne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaCarneActionPerformed(evt);
            }
        });

        BtnRegistrar.setText("Registrar");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        jButton2.setText("Imprimir Usuarios<-Pruebas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Inciar Sesion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbProfesor)
                            .addComponent(rbEstudiante))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtnombre)
                                        .addComponent(txtcedula)
                                        .addComponent(txtcorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtcontrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtcarne, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EntradaNombre)
                                    .addComponent(EntradaCedula)
                                    .addComponent(EntradaContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(EntradaCarne)
                                    .addComponent(EntradaCorreo))
                                .addGap(20, 20, 20))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRegistrar)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcorreo)
                        .addComponent(EntradaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rbEstudiante)
                                .addGap(11, 11, 11)
                                .addComponent(rbProfesor))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EntradaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombre))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EntradaCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcedula))))
                        .addGap(38, 38, 38)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntradaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcontrasena))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcarne)
                    .addComponent(EntradaCarne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegistrar)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Registrar Usuarios", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Registrar Cursos", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
        if(rbEstudiante.isSelected()){
            Estudiante estudiante = new Estudiante();
            int carne= Integer.parseInt(EntradaCarne.getText());
            String nombre = EntradaNombre.getText();
            int cedula = Integer.parseInt(EntradaCedula.getText());
            String correo = EntradaCorreo.getText();
            String contraseña = EntradaContrasena.getText();

            estudiante.setCarne(carne);
            estudiante.setNombre(nombre);
            estudiante.setCedula(cedula);
            estudiante.setCorreoelectronico(correo);
            estudiante.setContraseña(contraseña);
            estudiante.setFechaderegistro("Aun falta usar datepickes");
            estudiante.setFotografia("Aun falta usar filepicker");
            
           nuevatrivia.registrarEstudiante(estudiante);
            limpiartextos();
            
        }
        else if(rbProfesor.isSelected()){
            Profesor profesor = new Profesor();
            String nombre = EntradaNombre.getText();
            int cedula = Integer.parseInt(EntradaCedula.getText());
            String correo = EntradaCorreo.getText();
            String contraseña = EntradaContrasena.getText();

          
            profesor.setNombre(nombre);
            profesor.setCedula(cedula);
            profesor.setCorreoelectronico(correo);
            profesor.setContraseña(contraseña);
            profesor.setFechaderegistro("Aun falta usar datepickes");
            profesor.setFotografia("Aun falta usar filepicker");
            nuevatrivia.registrarProfesor(profesor);
            limpiartextos();
                    }
        else{
            JOptionPane.showMessageDialog(rootPane, "Seleccione el tipo de usuario");
            
        }
    }//GEN-LAST:event_BtnRegistrarActionPerformed
    public void limpiartextos(){
         EntradaCarne.setText("");
         EntradaNombre.setText("");
         EntradaCedula.setText("");
         EntradaCorreo.setText("");
        EntradaContrasena.setText("");
    }
    
    private void EntradaCarneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaCarneActionPerformed

    }//GEN-LAST:event_EntradaCarneActionPerformed

    private void rbProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProfesorActionPerformed
        EntradaCarne.setEnabled(false);
    }//GEN-LAST:event_rbProfesorActionPerformed

    private void rbEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEstudianteActionPerformed
        EntradaCarne.setEnabled(true);
    }//GEN-LAST:event_rbEstudianteActionPerformed

    private void EntradaCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaCedulaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        nuevatrivia.imprimirestudiante();
        nuevatrivia.imprimirprofesor();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void EntradaContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaContrasenaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            VentanaInicio inicio = new VentanaInicio();
            inicio.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JTextField EntradaCarne;
    private javax.swing.JTextField EntradaCedula;
    private javax.swing.JPasswordField EntradaContrasena;
    private javax.swing.JTextField EntradaCorreo;
    private javax.swing.JTextField EntradaNombre;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbEstudiante;
    private javax.swing.JRadioButton rbProfesor;
    private javax.swing.JLabel txtcarne;
    private javax.swing.JLabel txtcedula;
    private javax.swing.JLabel txtcontrasena;
    private javax.swing.JLabel txtcorreo;
    private javax.swing.JLabel txtnombre;
    // End of variables declaration//GEN-END:variables

 
}
