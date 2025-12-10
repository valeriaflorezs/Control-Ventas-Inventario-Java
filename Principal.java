package lab01;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Valeria Florez
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("Icono.png")).getImage());
    }
    
        
                
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Manejo_Bodega = new javax.swing.JButton();
        Manejo_Ventas = new javax.swing.JButton();
        Proceso_Devolucion = new javax.swing.JButton();
        Tarjeta = new javax.swing.JButton();
        Reporte_Diario = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Software de Control de Ventas y Compras de Almacenes la prosperidad");
        setBackground(new java.awt.Color(244, 161, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(25, 25, 25));
        jPanel1.setForeground(new java.awt.Color(244, 161, 0));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Software de Control de Ventas y Compras ");

        Manejo_Bodega.setBackground(new java.awt.Color(244, 161, 0));
        Manejo_Bodega.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        Manejo_Bodega.setForeground(new java.awt.Color(255, 255, 255));
        Manejo_Bodega.setText("Manejo de Bodega");
        Manejo_Bodega.setToolTipText("Gestiona el inventario de productos y consulta de stock.");
        Manejo_Bodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Manejo_BodegaActionPerformed(evt);
            }
        });

        Manejo_Ventas.setBackground(new java.awt.Color(244, 161, 0));
        Manejo_Ventas.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        Manejo_Ventas.setForeground(new java.awt.Color(255, 255, 255));
        Manejo_Ventas.setText("Manejo de Ventas");
        Manejo_Ventas.setToolTipText("Registra las ventas realizadas, genera facturas y calcula el total de ventas diarias.");
        Manejo_Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Manejo_VentasActionPerformed(evt);
            }
        });

        Proceso_Devolucion.setBackground(new java.awt.Color(244, 161, 0));
        Proceso_Devolucion.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        Proceso_Devolucion.setForeground(new java.awt.Color(255, 255, 255));
        Proceso_Devolucion.setText("Devoluciones");
        Proceso_Devolucion.setToolTipText("Registra los productos devueltos por los clientes.");
        Proceso_Devolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proceso_DevolucionActionPerformed(evt);
            }
        });

        Tarjeta.setBackground(new java.awt.Color(244, 161, 0));
        Tarjeta.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        Tarjeta.setForeground(new java.awt.Color(255, 255, 255));
        Tarjeta.setText("Clientes Frecuentes");
        Tarjeta.setToolTipText("Administra el programa de fidelización de clientes, asignando descuentos según el nivel de compra.");
        Tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarjetaActionPerformed(evt);
            }
        });

        Reporte_Diario.setBackground(new java.awt.Color(244, 161, 0));
        Reporte_Diario.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        Reporte_Diario.setForeground(new java.awt.Color(255, 255, 255));
        Reporte_Diario.setText("Reporte Diario");
        Reporte_Diario.setToolTipText("Genera un resumen detallado de las operaciones realizadas durante el día.");
        Reporte_Diario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reporte_DiarioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Almacenes La Prosperidad");

        jTabbedPane1.setBackground(new java.awt.Color(244, 161, 0));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(244, 161, 0));
        jButton1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton1.setText("Manual de Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jTextArea6.setRows(5);
        jTextArea6.setText("*******************************************************************\n                                  ¡Bienvenido a Almacenes La Prosperidad!\nNos complace darte la bienvenida al nuevo Sistema de Control de Ventas y \nCompras de Almacenes La Prosperidad. \n\n** En las pestañas superiores encontrarás una breve descripción de las principales \nfunciones del sistema. Para obtener información más detallada sobre el uso y \ncaracterísticas del software, te recomendamos consultar el manual disponible \na continuación.\n*******************************************************************");
        jScrollPane6.setViewportView(jTextArea6);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jButton1)
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(61, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("General", jPanel6);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("***********************************************************************\nLa sección de Bodega te permite tener un control completo sobre todos los productos \ndel almacén. Desde aquí podrás:\n\n- Añadir nuevos productos al inventario, ingresando su código, descripción, \ncosto por unidad y cantidad disponible. Esto te asegura que los nuevos productos \nestén disponibles para la venta inmediatamente.\n\n- Actualizar la información de los productos existentes. Si se adquieren más unidades \nde un producto o cambia su costo, puedes ajustar estos datos en tiempo real.\n\n- Eliminar productos que ya no están disponibles. Si un producto deja de venderse \no se ha agotado, puedes retirarlo del inventario. Además, el sistema te avisará \nsi algún producto está por debajo del stock mínimo (5 unidades), ayudándote \na mantener siempre un nivel adecuado de inventario.\n***********************************************************************");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Bodega", jPanel2);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("***********************************************************************\nLa sección de Ventas está diseñada para registrar y gestionar todas las transacciones de \ncompra que realizan los clientes en el día. Aquí puedes:\n\n- Registrar cada venta ingresando el código del producto y la cantidad vendida. \nEl sistema verificará automáticamente el inventario y ajustará la cantidad disponible.\n\n- Generar facturas personalizadas para cada cliente, detallando los productos comprados, \nel precio unitario, el total pagado y cualquier descuento aplicado.\n\n- Al final de cada jornada, consulta el reporte diario para revisar el número \ntotal de ventas realizadas, así como el monto total vendido. Esto te permitirá llevar \nun control preciso de las ganancias diarias y gestionar el flujo de caja de manera efectiva.\n***********************************************************************");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Ventas", jPanel3);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("***********************************************************************\nEn la sección de Devoluciones, puedes procesar los productos que los clientes desean \ndevolver. Este proceso incluye:\n\n- Registrar cada devolución, ingresando el código del producto devuelto. El sistema \nactualizará el inventario automáticamente, eliminando el producto si es necesario, \nya que los artículos devueltos no vuelven a estar disponibles para la venta.\n\n-  Al final de cada jornada, consulta el reporte diario, que te permitirá ver cuántos \nproductos fueron devueltos, el valor total de las devoluciones y el impacto en el \ninventario. \nEl sistema también controlará la caja para asegurarse de que haya suficiente dinero \ndisponible para realizar el reembolso, en caso de ser necesario.\n***********************************************************************");
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Devoluciones", jPanel4);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("***********************************************************************\nEl programa ofrece un sistema de Tarjetas de Cliente Frecuente, diseñado para \nrecompensar la fidelidad de los clientes con descuentos. Desde aquí puedes:\n\n- Registrar nuevos clientes en el sistema, creando una tarjeta que les permitirá \nrecibir descuentos en futuras compras. Solo necesitas ingresar la identificación \ndel cliente y asignarle una tarjeta.\n\nEl sistema clasifica automáticamente a los clientes en tres categorías según \nsus compras acumuladas:\n* Regular: Clientes que se registran por primera vez, obtienen un 10% de \ndescuento en todas sus compras.\n* V.I.P: Clientes que acumulan compras superiores a $100,000, reciben un 20%\nde descuento.\n* Platino: Clientes que superan los $500,000 en compras, obtienen un 30% \nde descuento.\nEl programa aplica los descuentos automáticamente cuando un cliente frecuente \nrealiza una compra, agilizando el proceso y mejorando la experiencia del cliente.\n***********************************************************************");
        jScrollPane4.setViewportView(jTextArea4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Clientes frecuentes", jPanel5);

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.setText("******************************************************\n\nAl final de cada día, el sistema muestra los siguientes reportes:\n\n- Número de ventas realizadas.\n- Número de devoluciones.\n- Total en pesos de ventas y devoluciones.\n- Número de compras realizadas a los productores.\n- Total en pesos de compras realizadas.\n\n*******************************************************");
        jScrollPane5.setViewportView(jTextArea5);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Reporte", jPanel7);

        jButton2.setBackground(new java.awt.Color(244, 161, 0));
        jButton2.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton2.setText("Apagar Software");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Manejo_Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Manejo_Bodega, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Proceso_Devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Reporte_Diario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Manejo_Bodega, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Manejo_Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Proceso_Devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Reporte_Diario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static class Caja {
        private static double valorCaja = 0.0; // Variable estática para almacenar el valor de la caja

        public static synchronized void ingresar(double monto) { 
            valorCaja += monto;
        }
        public static synchronized void egresar(double monto) {
            valorCaja -= monto;
        }
        public static synchronized double getValorCaja() {
            return valorCaja;
        }
    }
    private void Reporte_DiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reporte_DiarioActionPerformed
        reporte sv= new reporte();
        sv.setVisible(true);
    }//GEN-LAST:event_Reporte_DiarioActionPerformed

    private void Manejo_BodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Manejo_BodegaActionPerformed
        manejo_bodega sv =new manejo_bodega();
        sv.setVisible(true);
    }//GEN-LAST:event_Manejo_BodegaActionPerformed

    private void Manejo_VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Manejo_VentasActionPerformed
        registro_venta sv =new registro_venta();
        sv.setVisible(true);
    }//GEN-LAST:event_Manejo_VentasActionPerformed

    private void Proceso_DevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proceso_DevolucionActionPerformed
        devoluciones sv =new devoluciones();
        sv.setVisible(true);
    }//GEN-LAST:event_Proceso_DevolucionActionPerformed

    private void TarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarjetaActionPerformed
        amigo_frec sv =new amigo_frec();
        sv.setVisible(true);
    }//GEN-LAST:event_TarjetaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://heyzine.com/flip-book/e368082b14.html"));
        } catch (URISyntaxException | IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al abrir el enlace.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Manejo_Bodega;
    private javax.swing.JButton Manejo_Ventas;
    private javax.swing.JButton Proceso_Devolucion;
    private javax.swing.JButton Reporte_Diario;
    private javax.swing.JButton Tarjeta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    // End of variables declaration//GEN-END:variables
}
