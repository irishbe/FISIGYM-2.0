/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fisigym.vista;

/**
 *
 * @author bdlcc
 */
public class AsignarServiciosGimnasio extends javax.swing.JFrame {

    /**
     * Creates new form AsignarServiciosGimnasio
     */
    public AsignarServiciosGimnasio() {
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
        elegirCiudadServicios = new javax.swing.JComboBox<>();
        elegirDistritoServicios = new javax.swing.JComboBox<>();
        elegirGimnasioServicios = new javax.swing.JComboBox<>();
        buttonVolver = new javax.swing.JButton();
        buttonBuscarGym = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAsignarServicios = new javax.swing.JTable();
        buttonActualizarServicio = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1090, 590));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(61, 78, 114));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fisigym/imagenes/TalleresImg.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 280, 170));

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(229, 136, 150));
        jLabel2.setText("Servicios");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ciudad:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Distrito:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gimnasio:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        elegirCiudadServicios.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        elegirCiudadServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciudad 1", "Ciudad 2", "Ciudad 3", "Ciudad 4" }));
        jPanel2.add(elegirCiudadServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 250, -1));

        elegirDistritoServicios.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        elegirDistritoServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Distrito 1", "Distrito 2", "Distrito 3", "Distrito 4" }));
        jPanel2.add(elegirDistritoServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 250, -1));

        elegirGimnasioServicios.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        elegirGimnasioServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gimnasio 1", "Gimnasio 2", "Gimnasio 3", "Gimnasio 4" }));
        jPanel2.add(elegirGimnasioServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 250, -1));

        buttonVolver.setText("Volver");
        jPanel2.add(buttonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, -1, -1));

        buttonBuscarGym.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fisigym/imagenes/lupa.png"))); // NOI18N
        buttonBuscarGym.setText("Buscar");
        jPanel2.add(buttonBuscarGym, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 260));

        jPanel3.setBackground(new java.awt.Color(219, 217, 232));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaAsignarServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Servicio", "Activo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaAsignarServicios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaAsignarServicios);
        if (tablaAsignarServicios.getColumnModel().getColumnCount() > 0) {
            tablaAsignarServicios.getColumnModel().getColumn(0).setResizable(false);
            tablaAsignarServicios.getColumnModel().getColumn(0).setPreferredWidth(150);
            tablaAsignarServicios.getColumnModel().getColumn(1).setResizable(false);
            tablaAsignarServicios.getColumnModel().getColumn(1).setPreferredWidth(50);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 580, 280));

        buttonActualizarServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fisigym/imagenes/Actualizar (2).png"))); // NOI18N
        buttonActualizarServicio.setText("Actualizar");
        jPanel3.add(buttonActualizarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fisigym/imagenes/menugym.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1090, 330));

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
            java.util.logging.Logger.getLogger(AsignarServiciosGimnasio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignarServiciosGimnasio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignarServiciosGimnasio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignarServiciosGimnasio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignarServiciosGimnasio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonActualizarServicio;
    private javax.swing.JButton buttonBuscarGym;
    private javax.swing.JButton buttonVolver;
    private javax.swing.JComboBox<String> elegirCiudadServicios;
    private javax.swing.JComboBox<String> elegirDistritoServicios;
    private javax.swing.JComboBox<String> elegirGimnasioServicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAsignarServicios;
    // End of variables declaration//GEN-END:variables
}