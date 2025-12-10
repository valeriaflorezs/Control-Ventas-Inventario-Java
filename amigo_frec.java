package lab01;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Valeria Florez
 */
public class amigo_frec extends javax.swing.JFrame {
    
    public amigo_frec() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("Icono.png")).getImage());
    }
    
    public static class Clientes {
        private static int cl = 0;
        private static double[][] clientes = new double [100][5];

        public static synchronized void actualizar(double[][] CLIENTES , int CL) { 
            clientes=CLIENTES;
            cl= CL;
        }
        public static synchronized double[][] set() { 
            return clientes;
        }
        public static synchronized int N(){
            return cl;
        }
    }
    
    amigo_frec.Clientes CLIENTES =new Clientes();
    private double[][] clientes= CLIENTES.set();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        acum = new javax.swing.JSpinner();
        volver = new javax.swing.JButton();
        mensaje = new javax.swing.JTextField();

        setTitle("TARJETA AMIGO FRECUENTE");

        jPanel1.setBackground(new java.awt.Color(250, 219, 122));
        jPanel1.setPreferredSize(new java.awt.Dimension(605, 315));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Identificación");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel5.setText("Registro de Clientes");

        registrar.setBackground(new java.awt.Color(25, 25, 25));
        registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Acumulado en compras");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(registrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(acum))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volver))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(volver)
                .addGap(1, 1, 1)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(acum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(registrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int cl=0;
    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        try { 
        int ident= Integer.parseInt(id.getText());
        if (ident<1) { 
                  throw new NumberFormatException("La identificación debe ser un número positivo.");
                    }
        if(existe(ident)){
            throw new NumberFormatException("Ya existe un cliente con el ID ingresado.");
                }
        
        int ac= (int) acum.getValue();
        if (ac<1) { 
                  throw new NumberFormatException("La cantidad acumulada en compras debe ser un número positivo.");
                    }
        
        int pos= InsertarEn(ident);
        clientes[pos][0]=ident;
        clientes[pos][1]=ac;
        
        if(ac>500000){
            clientes[pos][2]= 0.7; //Cliente Platino 30%
        } else{
            if(ac>100000){
                clientes[pos][2]= 0.8; //Cliente V.I.P 20%
            } else{
                clientes[pos][2]= 0.9; //Cliente Regular 10%
            } 
        }

        cl++;
        CLIENTES.actualizar(clientes,cl);
        } catch(NumberFormatException exc){
            JOptionPane.showMessageDialog(this, "Error: " + exc.getMessage(), "Error de Ingreso", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_registrarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed
    
    boolean existe(int ID) {
       for (int j = 0; j < cl; j++) {
           if (ID == clientes[j][0]) {
               return true; 
           }
       }
       return false; // 
    }

    int InsertarEn(int ID) {
        for (int j = 0; j < cl; j++) {
            if ( ID< clientes[j][0]) {
                return j; // Encontramos la posición correcta
            } 
        }   
        return cl;  // Si no encontramos una posición, lo agregamos al final
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
            java.util.logging.Logger.getLogger(amigo_frec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(amigo_frec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(amigo_frec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(amigo_frec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new amigo_frec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner acum;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mensaje;
    private javax.swing.JButton registrar;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
