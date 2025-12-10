
package lab01;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import lab01.manejo_bodega.Inventario;
import lab01.Principal.Caja;

/**
 *
 * @author Katherin Barrera
 */
public class devoluciones extends javax.swing.JFrame {
    
    public devoluciones() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("Icono.png")).getImage());
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cantidad = new javax.swing.JSpinner();
        realizar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        mensaje = new javax.swing.JTextField();
        codigo = new javax.swing.JTextField();

        setTitle("DEVOLUCIONES");

        jPanel1.setBackground(new java.awt.Color(250, 219, 122));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setText("Devoluciones");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Código del producto:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad:");

        cantidad.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cantidad.setToolTipText("Ingresa la cantidad a devolver");

        realizar.setBackground(new java.awt.Color(25, 25, 25));
        realizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        realizar.setForeground(new java.awt.Color(255, 255, 255));
        realizar.setText("Realizar");
        realizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        realizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarActionPerformed(evt);
            }
        });

        volver.setBackground(new java.awt.Color(0, 0, 0));
        volver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        mensaje.setBackground(new java.awt.Color(250, 219, 122));
        mensaje.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        mensaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mensaje.setBorder(null);

        codigo.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        codigo.setToolTipText("Ingresa el código del producto a devolver");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(realizar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(codigo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volver))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(volver)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2))
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(realizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

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

    private int[][] devoluciones = new int[1000][2];
    
    
    //Traer la información de Bodega
    manejo_bodega.Inventario inventario = new Inventario();
    private int [][] bodega = inventario.setBodega();
    private int p= inventario.setProductos();
    
    
    //Pasar la información de Compras al Reporte diario
    private reporte.Actualizar reporte = new reporte.Actualizar(); 
    int N_Devol = 0;
    double Total_Devol=0;
    
    Principal.Caja Caja = new Caja();
        
    private void realizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarActionPerformed
    try{
        int cod = Integer.parseInt(codigo.getText());
        if (cod<1) { 
                  throw new NumberFormatException("El código debe ser un número positivo.");
                    }
            if(Posicion(cod)==-1){
                throw new NumberFormatException("La devolución no puede ser realizada, el producto no existe en bodega.");
            }
        int cant= (int) cantidad.getValue();
            if (cant<1) { 
                  throw new NumberFormatException("La cantidad debe ser mínimo 1.");
            }
        
        int pos= Posicion(cod);
        int precio= bodega[pos][3];
        double egreso= cant*precio;
            if (egreso>Caja.getValorCaja()) { 
                    throw new NumberFormatException("La devolución no puede ser realizada, no hay suficiente dinero en caja.");}

        // Almacenar los datos en la matriz
        devoluciones[N_Devol][0] = cod;
        devoluciones[N_Devol][1] = cant;
        
        N_Devol++;
        Total_Devol+=cant*precio;
        reporte.devol(N_Devol, Total_Devol);
        
        //Se actualiza caja
        Caja.egresar(cant*precio);
        
        // Limpiar los campos de texto
        codigo.setText("");
        cantidad.setValue(0);

        // Mostrar mensaje de confirmación
        mensaje.setText("La devolución ha sido realizada");
    
    } catch(NumberFormatException exc){
            JOptionPane.showMessageDialog(this, "Error: " + exc.getMessage(), "Error de Ingreso", JOptionPane.ERROR_MESSAGE);  
    }
    
    }//GEN-LAST:event_realizarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed
    
 private int Posicion(int codigoProducto) {
        for (int j = 0; j < p; j++) {
            if (codigoProducto == bodega[j][0]) {
                return j; // Producto encontrado
            }
        }
        return -1; // Producto no encontrado
    }
  
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
            java.util.logging.Logger.getLogger(devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(devoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new devoluciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner cantidad;
    private javax.swing.JTextField codigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mensaje;
    private javax.swing.JButton realizar;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
