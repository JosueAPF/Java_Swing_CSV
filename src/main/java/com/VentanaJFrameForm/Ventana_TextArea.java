package com.VentanaJFrameForm;

import com.LogicaDatos.AccesoDatos;
import java.util.ArrayList;
import java.util.List;

public class Ventana_TextArea extends javax.swing.JFrame {

    public Ventana_TextArea() {
        initComponents();
        BotonMostrar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtId = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtApellido = new javax.swing.JTextField();
        TxtEdad = new javax.swing.JTextField();
        TxtIdentificador = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        BotonMostrar = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();

        jButton4.setText("jButton4");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingreso de Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setText("ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 50, 30, 15);

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 50, 50, 15);

        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 50, 60, 15);

        jLabel4.setText("Edad");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 80, 50, 15);

        jLabel5.setText("Identificacion");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 80, 90, 15);

        TxtId.setBackground(new java.awt.Color(0, 102, 102));
        TxtId.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        TxtId.setForeground(new java.awt.Color(0, 0, 0));
        TxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdActionPerformed(evt);
            }
        });
        jPanel1.add(TxtId);
        TxtId.setBounds(60, 46, 80, 28);

        TxtNombre.setBackground(new java.awt.Color(0, 102, 102));
        TxtNombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        TxtNombre.setForeground(new java.awt.Color(0, 0, 0));
        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(TxtNombre);
        TxtNombre.setBounds(200, 46, 102, 28);

        TxtApellido.setBackground(new java.awt.Color(0, 102, 102));
        TxtApellido.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        TxtApellido.setForeground(new java.awt.Color(0, 0, 0));
        TxtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(TxtApellido);
        TxtApellido.setBounds(370, 40, 120, 28);

        TxtEdad.setBackground(new java.awt.Color(0, 102, 102));
        TxtEdad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        TxtEdad.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(TxtEdad);
        TxtEdad.setBounds(60, 80, 80, 28);

        TxtIdentificador.setBackground(new java.awt.Color(0, 102, 102));
        TxtIdentificador.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        TxtIdentificador.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(TxtIdentificador);
        TxtIdentificador.setBounds(230, 80, 149, 28);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 120, 600, 20);

        BotonMostrar.setBackground(new java.awt.Color(51, 51, 51));
        BotonMostrar.setText("Mostrar");
        BotonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonMostrar);
        BotonMostrar.setBounds(350, 130, 110, 25);

        BotonGuardar.setBackground(new java.awt.Color(51, 51, 51));
        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonGuardar);
        BotonGuardar.setBounds(30, 130, 110, 25);

        BotonLimpiar.setBackground(new java.awt.Color(51, 51, 51));
        BotonLimpiar.setText("Limpiar Campos");
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonLimpiar);
        BotonLimpiar.setBounds(190, 130, 110, 25);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        TextArea.setColumns(5);
        TextArea.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TextArea.setForeground(new java.awt.Color(30, 33, 70));
        TextArea.setRows(5);
        TextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextAreaMouseClicked(evt);
            }
        });
        TextArea.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TextAreaInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(TextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdActionPerformed

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        //Boton Guardar
        String DatoId = TxtId.getText();
        String DatoNomb = TxtNombre.getText();
        String DatoApe = TxtApellido.getText();
        String DatoEda = TxtEdad.getText();
        String DatoIdent = TxtIdentificador.getText();
        List<String[]> nuevosDatos = new ArrayList<>();
        nuevosDatos.add(new String[]{DatoId, DatoNomb, DatoApe, DatoEda, DatoIdent});
        AccesoDatos.InsertarDatos(nuevosDatos);
         BotonMostrar.setVisible(true);
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void TxtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        TxtId.setText("");
        TxtNombre.setText("");
        TxtApellido.setText("");
        TxtEdad.setText("");
        TxtIdentificador.setText("");
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void TextAreaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TextAreaInputMethodTextChanged

    }//GEN-LAST:event_TextAreaInputMethodTextChanged

    private void BotonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarActionPerformed
        AccesoDatos accesoDatos = new AccesoDatos();  // Asegúrate de que puedas acceder a esta clase
        
        accesoDatos.leerDatosDesdeCSV();
        String datosCSV = accesoDatos.MostarData();  // Llama al método que devuelve los datos
        TextArea.setText(datosCSV);
       
    }//GEN-LAST:event_BotonMostrarActionPerformed

    private void TextAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextAreaMouseClicked
         try {
            int offset = TextArea.viewToModel2D(evt.getPoint());  // Obtiene la posición del clic
            int lineStart = TextArea.getLineStartOffset(TextArea.getLineOfOffset(offset));  // Inicio de la línea
            int lineEnd = TextArea.getLineEndOffset(TextArea.getLineOfOffset(offset));  // Fin de la línea
            String selectedLine = TextArea.getText().substring(lineStart, lineEnd);  // Línea seleccionada

            // Elimina la línea seleccionada del JTextArea
            TextArea.replaceRange("", lineStart, lineEnd);

            // Elimina la línea seleccionada del archivo CSV
            AccesoDatos.eliminarLineaDelCSV(selectedLine);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_TextAreaMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana_TextArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_TextArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_TextArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_TextArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_TextArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonMostrar;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtEdad;
    private javax.swing.JTextField TxtId;
    private javax.swing.JTextField TxtIdentificador;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
