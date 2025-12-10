package lab01;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import lab01.amigo_frec.Clientes;
import lab01.manejo_bodega.Inventario;

/**
 *
 * @author Katherin Barrera
 */
public class registro_venta extends javax.swing.JFrame {
  
    
    public registro_venta() {
         
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("Icono.png")).getImage());
    }

    manejo_bodega.Inventario inventario = new Inventario();
    private int [][] bodega = inventario.setBodega();
    private int p= inventario.setProductos();
 
    
    
    amigo_frec.Clientes CLIENTES =new Clientes();
    private double[][] clientes= CLIENTES.set();
    private int cl= CLIENTES.N();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        cantidad = new javax.swing.JSpinner();
        finalizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        volver = new javax.swing.JButton();
        identificacion = new javax.swing.JTextField();

        setTitle("MANEJO DE VENTAS");

        jPanel1.setBackground(new java.awt.Color(250, 219, 122));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setText("Registro de Ventas");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Registre su identificación:");

        agregar.setBackground(new java.awt.Color(25, 25, 25));
        agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(255, 255, 255));
        agregar.setText("Agregar");
        agregar.setToolTipText("Con este botón podrás adicionar un nuevo producto");
        agregar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Registre el código del producto:");

        codigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        codigo.setToolTipText("Ingresa el código del producto a comprar");

        cantidad.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cantidad.setToolTipText("Ingresa la cantidad a comprar");

        finalizar.setBackground(new java.awt.Color(25, 25, 25));
        finalizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        finalizar.setForeground(new java.awt.Color(255, 255, 255));
        finalizar.setText("Finalizar compra");
        finalizar.setToolTipText("Dale click aquí para generar la factura");
        finalizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Registre la cantidad del producto:");

        resultado.setEditable(false);
        resultado.setColumns(20);
        resultado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resultado.setRows(5);
        resultado.setToolTipText("Aquí se muestran los productos comprados por el cliente");
        jScrollPane1.setViewportView(resultado);

        volver.setBackground(new java.awt.Color(0, 0, 0));
        volver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("Volver");
        volver.setBorder(null);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        identificacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        identificacion.setToolTipText("Ingresa la identificación del cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(103, 103, 103)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(identificacion)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(volver)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    int subtotal = (int) 0.0;
    private int[] ag = new int[1000];
    private int agCount = 0;
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
       try { 
        // Obtener los valores
        int cod = Integer.parseInt(codigo.getText());
        if (cod < 1) { 
            throw new NumberFormatException("El código debe ser un número positivo.");
        }
        
        int pos = posicion(cod);
        if(pos == -1){
            throw new NumberFormatException("El código del producto no se encuentra en bodega.");
        }
        
        int cant = (int) cantidad.getValue();
        if (cant < 1) { 
            throw new NumberFormatException("La cantidad debe ser mínimo 1.");
        }
        
        if (cant > bodega[pos][1]) {
            throw new NumberFormatException("No hay suficiente stock. Stock disponible: " + bodega[pos][1]);
        }
        
        int pre = bodega[pos][3];
        int total = cant * pre;

       // Verificar que no se exceda el tamaño del arreglo
        if (agCount + 4 > ag.length) {  // 4 espacios por producto
            JOptionPane.showMessageDialog(this, "Se ha alcanzado el límite de productos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Agregar los valores al arreglo unidimensional
        ag[agCount] = cod;   // Código
        ag[agCount + 1] = cant;  // Cantidad
        ag[agCount + 2] = pre;   // Precio
        ag[agCount + 3] = total; // Total
        agCount += 4;  // Incrementar en 4 porque son 4 datos por producto
        

        if(cant==bodega[pos][1] || bodega[pos][1]-cant<5){
            //Si la diferencia es 0 o es menor a 5, entonces eliminamos el producto de bodega.
            for (int i = pos; i < p - 1; i++) {
                bodega[i] = bodega[i + 1];
            }
            p--;
            inventario.actualizar(bodega,p);
        } else{
            //De lo contrario, le restamos la cantidad vendida al stock en bodega.
            bodega[pos][1]-=cant;
        }
        
        
        subtotal += total;
        actualizarTextArea();
        codigo.setText("");
        cantidad.setValue(0);
        
       } catch(NumberFormatException exc){
            JOptionPane.showMessageDialog(this, "Error: " + exc.getMessage(), "Error de Ingreso", JOptionPane.ERROR_MESSAGE);
           
       }
    
            
    }//GEN-LAST:event_agregarActionPerformed

    private reporte.Actualizar reporte = new reporte.Actualizar(); 
    int N_Ventas=0;
    double Total_Ventas=0;
    double descuento=1;
    
    Principal.Caja Caja = new Principal.Caja();;
    
    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
       try{
        int id= Integer.parseInt(identificacion.getText());
        if (id < 1) { 
            throw new NumberFormatException("La identificación debe ser un número positivo.");
        }
        desc(id);
        
        N_Ventas++;
        Total_Ventas+=(subtotal*descuento);
        reporte.ventas(N_Ventas, Total_Ventas);
         
         //Se actualiza caja
         Caja.ingresar(subtotal*descuento);
         
        facturacion sv =new facturacion();
        sv.identi(Integer.parseInt(identificacion.getText())); 
        sv.text( resultado.getText()); 
        sv.setSubtotal(subtotal);
        sv.setTotal(subtotal*descuento);
        sv.setVisible(true);
        
       } catch(NumberFormatException exc){
           
            JOptionPane.showMessageDialog(this, "Error: " + exc.getMessage(), "Error de Ingreso", JOptionPane.ERROR_MESSAGE);
       } 
    }//GEN-LAST:event_finalizarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed
    
    int posicion(int cod) {
        for (int j = 0; j < p; j++) {
            if (cod == bodega[j][0]) {
                return j; // Producto encontrado
            }
        }
        return -1; // Producto no encontrado
    }
    void desc(double ID) {
        if (clientes!=null){
            for (int j = 0; j < cl; j++) {
                if (ID == clientes[j][0]) {
                    descuento = clientes [j][2]; //Descuento registrado en la matriz clientes
                } else{
                    descuento = 1; //No hay descuento
                }
            }
        } 
    }

    private void actualizarTextArea() {
        String s = "Código\tCantidad\tTotal\n";// Encabezados de columnas

        for (int i = 0; i < agCount; i += 4) { // Itera de 4 en 4
            s += ag[i] + "\t" + ag[i + 1] + "\t" + ag[i + 3] + "\n";
             resultado.setText(s.toString());
        }
    } 
    
    public int[] getProductos() {
    return ag; 
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
            java.util.logging.Logger.getLogger(registro_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro_venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    public javax.swing.JSpinner cantidad;
    public javax.swing.JTextField codigo;
    private javax.swing.JButton finalizar;
    public javax.swing.JTextField identificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultado;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
    
  }

