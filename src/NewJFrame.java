/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Alex
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null);
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
        jpnSuperior = new javax.swing.JPanel();
        lblArchivo = new javax.swing.JLabel();
        lblSeleccion = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        lblAyuda = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblCentrar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lbl_Icono = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        lblMinimizar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimizar.setText("Minimizar");

        lblCentrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCentrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCentrar.setText("Centrar");

        lblCerrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrar.setText("Cerrar");

        lbl_Icono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_Icono.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Icono.setText("Icono");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimizar)
                .addGap(26, 26, 26)
                .addComponent(lblCentrar)
                .addGap(18, 18, 18)
                .addComponent(lblCerrar)
                .addGap(26, 26, 26))
        );
        jpnSuperiorLayout.setVerticalGroup(
            jpnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSuperiorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpnSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArchivo)
                    .addComponent(lblSeleccion)
                    .addComponent(lblEditar)
                    .addComponent(lblAyuda)
                    .addComponent(lblMinimizar)
                    .addComponent(lblCentrar)
                    .addComponent(lblCerrar)
                    .addComponent(lbl_Icono))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jpnSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1350, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpnSuperior;
    private javax.swing.JLabel lblArchivo;
    private javax.swing.JLabel lblAyuda;
    private javax.swing.JLabel lblCentrar;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblSeleccion;
    private javax.swing.JLabel lbl_Icono;
    // End of variables declaration//GEN-END:variables
}
