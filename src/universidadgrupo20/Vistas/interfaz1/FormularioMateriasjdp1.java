/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo20.Vistas.interfaz1;

/**
 *
 * @author User
 */
public class FormularioMateriasjdp1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioAlumnojdp
     */
    public FormularioMateriasjdp1() {
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
        jbEliminar = new javax.swing.JButton();
        jBnuevaMat = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jRadioBestado = new javax.swing.JRadioButton();
        jTmateriaAño = new javax.swing.JTextField();
        jTmateriaNombre = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jTidMateria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulario Materias");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario Materias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbEliminar.setText("Eliminar");
        jPanel1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 103, 37));

        jBnuevaMat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBnuevaMat.setText("Nuevo");
        jBnuevaMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevaMatActionPerformed(evt);
            }
        });
        jPanel1.add(jBnuevaMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 103, 37));

        jbGuardar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 103, 37));

        jbSalir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbSalir.setText("Salir");
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 103, 37));

        jRadioBestado.setText("Activo");
        jPanel1.add(jRadioBestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));
        jPanel1.add(jTmateriaAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 170, -1));
        jPanel1.add(jTmateriaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 170, -1));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("buscar");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 80, 20));
        jPanel1.add(jTidMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 86, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 56, 26));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Año");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 56, 26));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Estado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 47, 26));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Codigo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 47, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBnuevaMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevaMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBnuevaMatActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBnuevaMat;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioBestado;
    private javax.swing.JTextField jTidMateria;
    private javax.swing.JTextField jTmateriaAño;
    private javax.swing.JTextField jTmateriaNombre;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    // End of variables declaration//GEN-END:variables
}