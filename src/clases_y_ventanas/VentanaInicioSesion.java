/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */


package clases_y_ventanas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ESTUDIANTE
 */
public class VentanaInicioSesion extends javax.swing.JPanel {

    /**
     * Creates new form VentanaInicioSesion
     */
    public VentanaInicioSesion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextUsuarioContra = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextUsuario = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/user 1.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 150, 130));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Usuario:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jTextUsuarioContra.setBackground(new java.awt.Color(255, 255, 255));
        jTextUsuarioContra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextUsuarioContra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204), 2));
        jTextUsuarioContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsuarioContraActionPerformed(evt);
            }
        });
        jPanel2.add(jTextUsuarioContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 240, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(74, 193, 125));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Iniciar Sesion");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 60));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 60));

        jTextUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 255), 2));
        jTextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(jTextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 240, -1));

        btnAceptar.setBackground(new java.awt.Color(0, 204, 51));
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 240, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/hojas-tropicales.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 70, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/hormiguero_1.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 250, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Registrarse");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, 30));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("¿No tiene una cuenta?");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 500));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Diseño sin título 1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextUsuarioContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsuarioContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUsuarioContraActionPerformed

    private void jTextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUsuarioActionPerformed

    public String user;
    
    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked

        if(jTextUsuario.getText() == "" || jTextUsuarioContra.getText() == "")
        {
            System.out.println("Ningun campo puede estar vacio");
        }
        else
        {
            user = jTextUsuario.getText();

            String query = "Select * From tbUsuarios Where UsuarioUsuario = ? AND ContraUsuario = ?";
            try {
                PreparedStatement confirmUser = ConexionSQL.getConnection().prepareStatement(query);
                confirmUser.setString(1, user);
                confirmUser.setString(2, jTextUsuarioContra.getText());
                ResultSet resultSet = confirmUser.executeQuery();

                if (!resultSet.next()) {
                    System.out.println("No se ha encontrado el usuario");
                } else {
                    System.out.println("Bienvenido");
                    InicioPrincipal home = new InicioPrincipal();
                    home.setVisible(true);
                    setVisible(false);
                }

            } catch (Exception e) {
                System.out.println("ERROR en el query: " + e.toString());
            }
        }
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        VentanaRegistro registro = new VentanaRegistro();
        registro.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextUsuario;
    private javax.swing.JTextField jTextUsuarioContra;
    // End of variables declaration//GEN-END:variables
}
