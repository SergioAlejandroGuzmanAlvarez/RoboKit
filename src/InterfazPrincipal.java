import java.awt.Color;



/**
 *
 * @author kebin
 */
public class InterfazPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfazPrincipal
     */
    public InterfazPrincipal() {
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

        jpnSuperior = new javax.swing.JPanel();
        lblArchivo = new javax.swing.JLabel();
        lblSeleccion = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        lblAyuda = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblCentrar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lbl_Icono = new javax.swing.JLabel();
        lblAyuda1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnOpen = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnCompile = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Léxico = new javax.swing.JButton();
        Léxico1 = new javax.swing.JButton();
        Léxico2 = new javax.swing.JButton();
        Léxico3 = new javax.swing.JButton();
        Léxico4 = new javax.swing.JButton();
        Léxico5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTree4 = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnSuperior.setBackground(new java.awt.Color(81, 90, 92));

        lblArchivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblArchivo.setForeground(new java.awt.Color(255, 255, 255));
        lblArchivo.setText("Archivo");

        lblSeleccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        lblSeleccion.setText("Selección");

        lblEditar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setText("Editar");

        lblAyuda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAyuda.setForeground(new java.awt.Color(255, 255, 255));
        lblAyuda.setText("Ayuda");
        lblAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAyudaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAyudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAyudaMouseExited(evt);
            }
        });
        lblAyuda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblAyudaKeyPressed(evt);
            }
        });

        lblMinimizar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/min.png"))); // NOI18N

        lblCentrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCentrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCentrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/centrar.png"))); // NOI18N

        lblCerrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        lbl_Icono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_Icono.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logopng2.png"))); // NOI18N

        lblAyuda1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAyuda1.setForeground(new java.awt.Color(255, 255, 255));
        lblAyuda1.setText("RoboKit");

        jPanel2.setBackground(new java.awt.Color(233, 231, 231));

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open-file.png"))); // NOI18N
        btnOpen.setText("Abrir");

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnNew.setText("Nuevo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnCompile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/compile.png"))); // NOI18N
        btnCompile.setText("Compilar");

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnSave.setText("Guardar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnCompile, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(694, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCompile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnOpen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnSuperiorLayout = new javax.swing.GroupLayout(jpnSuperior);
        jpnSuperior.setLayout(jpnSuperiorLayout);
        jpnSuperiorLayout.setHorizontalGroup(
            jpnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Icono)
                .addGap(40, 40, 40)
                .addComponent(lblArchivo)
                .addGap(50, 50, 50)
                .addComponent(lblEditar)
                .addGap(50, 50, 50)
                .addComponent(lblSeleccion)
                .addGap(41, 41, 41)
                .addComponent(lblAyuda)
                .addGap(248, 248, 248)
                .addComponent(lblAyuda1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 505, Short.MAX_VALUE)
                .addComponent(lblMinimizar)
                .addGap(18, 18, 18)
                .addComponent(lblCentrar)
                .addGap(18, 18, 18)
                .addComponent(lblCerrar)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnSuperiorLayout.setVerticalGroup(
            jpnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSuperiorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMinimizar)
                    .addComponent(lblCentrar)
                    .addComponent(lblCerrar)
                    .addComponent(lbl_Icono)
                    .addGroup(jpnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblArchivo)
                        .addComponent(lblSeleccion)
                        .addComponent(lblEditar)
                        .addComponent(lblAyuda)
                        .addComponent(lblAyuda1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Explorador de archivos");

        jLabel2.setText("Fases");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        Léxico.setText("Semántico");
        Léxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LéxicoActionPerformed(evt);
            }
        });

        Léxico1.setText("Léxico");
        Léxico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Léxico1ActionPerformed(evt);
            }
        });

        Léxico2.setText("Sintáctico");
        Léxico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Léxico2ActionPerformed(evt);
            }
        });

        Léxico3.setText("Optimización");
        Léxico3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Léxico3ActionPerformed(evt);
            }
        });

        Léxico4.setText("Código intermedio");
        Léxico4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Léxico4ActionPerformed(evt);
            }
        });

        Léxico5.setText("Código objeto");
        Léxico5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Léxico5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Léxico1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Léxico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Léxico3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(Léxico4, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(Léxico5, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(Léxico2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Léxico1)
                .addGap(18, 18, 18)
                .addComponent(Léxico2)
                .addGap(12, 12, 12)
                .addComponent(Léxico)
                .addGap(18, 18, 18)
                .addComponent(Léxico4)
                .addGap(18, 18, 18)
                .addComponent(Léxico3)
                .addGap(18, 18, 18)
                .addComponent(Léxico5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("Output");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jScrollPane4.setViewportView(jTree4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jpnSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAyudaMouseClicked

    }//GEN-LAST:event_lblAyudaMouseClicked

    private void lblAyudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAyudaMouseEntered
        lblAyuda.setForeground(Color.red);
    }//GEN-LAST:event_lblAyudaMouseEntered

    private void lblAyudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAyudaMouseExited
        lblAyuda.setForeground(Color.white);
    }//GEN-LAST:event_lblAyudaMouseExited

    private void lblAyudaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblAyudaKeyPressed

    }//GEN-LAST:event_lblAyudaKeyPressed

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewActionPerformed

    private void LéxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LéxicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LéxicoActionPerformed

    private void Léxico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Léxico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Léxico1ActionPerformed

    private void Léxico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Léxico2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Léxico2ActionPerformed

    private void Léxico3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Léxico3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Léxico3ActionPerformed

    private void Léxico4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Léxico4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Léxico4ActionPerformed

    private void Léxico5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Léxico5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Léxico5ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Léxico;
    private javax.swing.JButton Léxico1;
    private javax.swing.JButton Léxico2;
    private javax.swing.JButton Léxico3;
    private javax.swing.JButton Léxico4;
    private javax.swing.JButton Léxico5;
    private javax.swing.JButton btnCompile;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTree jTree4;
    private javax.swing.JPanel jpnSuperior;
    private javax.swing.JLabel lblArchivo;
    private javax.swing.JLabel lblAyuda;
    private javax.swing.JLabel lblAyuda1;
    private javax.swing.JLabel lblCentrar;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblSeleccion;
    private javax.swing.JLabel lbl_Icono;
    // End of variables declaration//GEN-END:variables
}
