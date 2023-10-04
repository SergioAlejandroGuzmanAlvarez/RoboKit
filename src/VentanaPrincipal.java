/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Alex
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        jpnSuperior = new javax.swing.JPanel();
        lblArchivo = new javax.swing.JLabel();
        lblSeleccion = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        lblAyuda = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblCentrar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lbl_Icono = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jpnInferior = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        lblTitulo3 = new javax.swing.JLabel();
        lblTitulo4 = new javax.swing.JLabel();
        lblTitulo5 = new javax.swing.JLabel();

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
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblTitulo.setText("Bienvenido a RoboKit IDE");

        lblTitulo1.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTitulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        lblTitulo1.setText("Abrir una carpeta");

        lblTitulo2.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTitulo2.setText("A programar!");

        lblTitulo3.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTitulo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        lblTitulo3.setText("Crear un nuevo archivo");

        lblTitulo4.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTitulo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        lblTitulo4.setText("Abrir un archivo");

        lblTitulo5.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTitulo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        lblTitulo5.setText("Abrir una carpeta");

        javax.swing.GroupLayout jpnInferiorLayout = new javax.swing.GroupLayout(jpnInferior);
        jpnInferior.setLayout(jpnInferiorLayout);
        jpnInferiorLayout.setHorizontalGroup(
            jpnInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnInferiorLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jpnInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo1)
                    .addComponent(lblTitulo3)
                    .addComponent(lblTitulo2)
                    .addComponent(lblTitulo)
                    .addComponent(lblTitulo4)
                    .addComponent(lblTitulo5))
                .addContainerGap(778, Short.MAX_VALUE))
        );
        jpnInferiorLayout.setVerticalGroup(
            jpnInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnInferiorLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblTitulo)
                .addGap(31, 31, 31)
                .addComponent(lblTitulo2)
                .addGap(41, 41, 41)
                .addComponent(lblTitulo3)
                .addGap(18, 18, 18)
                .addComponent(lblTitulo4)
                .addGap(22, 22, 22)
                .addComponent(lblTitulo5)
                .addGap(27, 27, 27)
                .addComponent(lblTitulo1)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jPanel1.add(jpnInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1250, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpnInferior;
    private javax.swing.JPanel jpnSuperior;
    private javax.swing.JLabel lblArchivo;
    private javax.swing.JLabel lblAyuda;
    private javax.swing.JLabel lblCentrar;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblSeleccion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lblTitulo5;
    private javax.swing.JLabel lbl_Icono;
    // End of variables declaration//GEN-END:variables
}
