/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fisigym.vista;

/**
 *
 * @author bdlcc
 */
public class GestionarClientes extends javax.swing.JFrame {

    /**
     * Creates new form GestionarClientes
     */
    public GestionarClientes() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreClienteAdmin = new javax.swing.JTextField();
        txtApellidoClienteAdmin = new javax.swing.JTextField();
        txtDNIClienteAdmin = new javax.swing.JTextField();
        txtCorreoClienteAdmin = new javax.swing.JTextField();
        txtTeléfonoClienteAdmin = new javax.swing.JTextField();
        seleccionarMembresiaClienteA = new javax.swing.JComboBox<>();
        selecionarGimnasioClienteAdmin = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtBuscarDniC = new javax.swing.JTextField();
        buscarDniC = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1090, 590));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(61, 78, 114));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DNI:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Correo:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gimnasio:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Teléfono:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Membresía:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));
        jPanel2.add(txtNombreClienteAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 280, -1));
        jPanel2.add(txtApellidoClienteAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 280, -1));
        jPanel2.add(txtDNIClienteAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 280, -1));
        jPanel2.add(txtCorreoClienteAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 260, -1));
        jPanel2.add(txtTeléfonoClienteAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 260, -1));

        seleccionarMembresiaClienteA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diamante", "Zafiro", "Esmeralda" }));
        jPanel2.add(seleccionarMembresiaClienteA, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 240, -1));

        selecionarGimnasioClienteAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(selecionarGimnasioClienteAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 210, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Volver");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 150));

        jPanel3.setBackground(new java.awt.Color(219, 217, 232));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombres", "Apellido", "Correo", "Gimnasio", "Membresía"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 960, 340));

        jPanel4.setBackground(new java.awt.Color(248, 231, 248));
        jPanel4.setPreferredSize(new java.awt.Dimension(570, 40));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel8.setText("Buscar DNI:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        jPanel4.add(txtBuscarDniC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 270, -1));

        buscarDniC.setText("Buscar");
        jPanel4.add(buscarDniC, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fisigym/imagenes/GuardarTodo.png"))); // NOI18N
        jButton2.setText("Grabar");
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fisigym/imagenes/nuevo.png"))); // NOI18N
        jButton3.setText("Nuevo");
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fisigym/imagenes/Actualizar (2).png"))); // NOI18N
        jButton4.setText("Editar");
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fisigym/imagenes/eliminar.png"))); // NOI18N
        jButton5.setText("Eliminar");
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1090, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(GestionarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarDniC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> seleccionarMembresiaClienteA;
    private javax.swing.JComboBox<String> selecionarGimnasioClienteAdmin;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtApellidoClienteAdmin;
    private javax.swing.JTextField txtBuscarDniC;
    private javax.swing.JTextField txtCorreoClienteAdmin;
    private javax.swing.JTextField txtDNIClienteAdmin;
    private javax.swing.JTextField txtNombreClienteAdmin;
    private javax.swing.JTextField txtTeléfonoClienteAdmin;
    // End of variables declaration//GEN-END:variables
}
