package lab01;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lab01.Principal.Caja;
import lab01.reporte.Actualizar;

/**
 *
 * @author Valeria Florez
 */
public class manejo_bodega extends javax.swing.JFrame {
       
    public manejo_bodega() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("Icono.png")).getImage());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estado = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Registro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        costo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        cant = new javax.swing.JTextField();
        cod = new javax.swing.JTextField();
        volver2 = new javax.swing.JButton();
        mensaje = new javax.swing.JTextField();
        Inventario = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        codi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        eliminar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        Proveedores = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        codc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        costoc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        comprado = new javax.swing.JButton();
        cantc = new javax.swing.JTextField();
        volver1 = new javax.swing.JButton();
        mensaje2 = new javax.swing.JTextField();

        setTitle("MANEJO DE BODEGA");

        Registro.setBackground(new java.awt.Color(250, 219, 122));
        Registro.setPreferredSize(new java.awt.Dimension(475, 350));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Código");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad existente");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Costo por unidad");

        costo.setToolTipText("Ingrese el costo del producto por unidad en pesos");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel5.setText("Registro de Productos");

        agregar.setBackground(new java.awt.Color(25, 25, 25));
        agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(255, 255, 255));
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        cant.setToolTipText("Ingrese la cantidad existente del producto en bodega");

        cod.setToolTipText("Ingresa el código del producto, recuerda que este tiene que ser un número positivo");

        volver2.setBackground(new java.awt.Color(0, 0, 0));
        volver2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        volver2.setForeground(new java.awt.Color(255, 255, 255));
        volver2.setText("Volver");
        volver2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver2ActionPerformed(evt);
            }
        });

        mensaje.setBackground(new java.awt.Color(250, 219, 122));
        mensaje.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        mensaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mensaje.setBorder(null);

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro);
        Registro.setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volver2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                .addGap(0, 105, Short.MAX_VALUE)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(costo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cant, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(185, 185, 185))))
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(volver2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(39, 39, 39)
                        .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(37, 37, 37))
        );

        jTabbedPane1.addTab("Registro de productos", Registro);

        Inventario.setBackground(new java.awt.Color(250, 219, 122));
        Inventario.setPreferredSize(new java.awt.Dimension(605, 315));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Código");

        codi.setToolTipText("Ingresa el código del producto a buscar o eliminar.");

        jLabel8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel8.setText("Control de Inventario");

        buscar.setBackground(new java.awt.Color(25, 25, 25));
        buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Unidades", "Costo", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table);

        eliminar.setBackground(new java.awt.Color(25, 25, 25));
        eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        actualizar.setBackground(new java.awt.Color(25, 25, 25));
        actualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        actualizar.setForeground(new java.awt.Color(255, 255, 255));
        actualizar.setText("Actualizar");
        actualizar.setToolTipText("Mostrar el inventario completo");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        volver.setBackground(new java.awt.Color(0, 0, 0));
        volver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("Volver");
        volver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InventarioLayout = new javax.swing.GroupLayout(Inventario);
        Inventario.setLayout(InventarioLayout);
        InventarioLayout.setHorizontalGroup(
            InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InventarioLayout.createSequentialGroup()
                .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InventarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel8))
                    .addGroup(InventarioLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codi, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InventarioLayout.createSequentialGroup()
                .addGap(0, 42, Short.MAX_VALUE)
                .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InventarioLayout.createSequentialGroup()
                        .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InventarioLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        InventarioLayout.setVerticalGroup(
            InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InventarioLayout.createSequentialGroup()
                .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InventarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volver))
                    .addGroup(InventarioLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8))
                    .addGroup(InventarioLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(codi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar)
                            .addComponent(eliminar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(actualizar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inventario", Inventario);

        Proveedores.setBackground(new java.awt.Color(250, 219, 122));
        Proveedores.setPreferredSize(new java.awt.Dimension(605, 315));

        jLabel9.setText("Código");

        codc.setToolTipText("Ingresa el código del producto, recuerda que este tiene que ser un número positivo");

        jLabel10.setText("Cantidad comprada");

        jLabel11.setText("Costo por unidad");

        costoc.setToolTipText("Ingrese el costo del producto por unidad en pesos");

        jLabel12.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel12.setText("Compra a Productores");

        comprado.setBackground(new java.awt.Color(25, 25, 25));
        comprado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comprado.setForeground(new java.awt.Color(255, 255, 255));
        comprado.setText("Comprado");
        comprado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compradoActionPerformed(evt);
            }
        });

        cantc.setToolTipText("Ingrese la cantidad a comprar");

        volver1.setBackground(new java.awt.Color(0, 0, 0));
        volver1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        volver1.setForeground(new java.awt.Color(255, 255, 255));
        volver1.setText("Volver");
        volver1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver1ActionPerformed(evt);
            }
        });

        mensaje2.setBackground(new java.awt.Color(250, 219, 122));
        mensaje2.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        mensaje2.setBorder(null);

        javax.swing.GroupLayout ProveedoresLayout = new javax.swing.GroupLayout(Proveedores);
        Proveedores.setLayout(ProveedoresLayout);
        ProveedoresLayout.setHorizontalGroup(
            ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(volver1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jLabel12)
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProveedoresLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(comprado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ProveedoresLayout.createSequentialGroup()
                            .addGroup(ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProveedoresLayout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProveedoresLayout.createSequentialGroup()
                                    .addGroup(ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel10))
                                    .addGap(18, 18, 18)))
                            .addGroup(ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cantc, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(codc, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(costoc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ProveedoresLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(mensaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(165, 165, 165))
        );
        ProveedoresLayout.setVerticalGroup(
            ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProveedoresLayout.createSequentialGroup()
                .addGroup(ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProveedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volver1))
                    .addGroup(ProveedoresLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel12)))
                .addGap(33, 33, 33)
                .addGroup(ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(comprado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mensaje2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Compra a Proveedores", Proveedores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static class Inventario {
        private static int N = 0;
        private static int[][] inventario= new int[1000][5];

        public static synchronized void actualizar(int[][] bodega, int N_Productos) { 
            inventario=bodega;
            N= N_Productos;
        }
        public static synchronized int[][] setBodega() { 
            return inventario;
        }
        public static synchronized int setProductos(){
            return N;
        }
    }
    manejo_bodega.Inventario inventario = new Inventario();
    
  
    private int [][] bodega = inventario.setBodega();
    private int N_Productos= inventario.setProductos();
    
    //INVENTARIO
    DefaultTableModel tabla = new DefaultTableModel();
    
   
    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        limpiar(tabla);
        String ids [] = {"Código","Unidades","Costo","Precio"};
        tabla.setColumnIdentifiers(ids);
        table.setModel(tabla);
        mostrar(bodega);
        inventario.actualizar(bodega, N_Productos);
    }//GEN-LAST:event_actualizarActionPerformed
    
    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        try{
        int codb= Integer.parseInt(codi.getText()); 
        if(Posicion(codb)==-1){
            throw new NumberFormatException("No existe el código en el sistema.");
        } 
        
        limpiar(tabla);
            int pos= Posicion(Integer.parseInt(codi.getText()));
            // Mostrar los datos del código buscado
                Object[] datos = {bodega[pos][0], bodega[pos][1], bodega[pos][2],bodega[pos][3]};
                tabla.addRow(datos);
                
        } catch(NumberFormatException exc){
            JOptionPane.showMessageDialog(this, "Error: " + exc.getMessage(), "Error de Ingreso", JOptionPane.ERROR_MESSAGE);
        }     

    }//GEN-LAST:event_buscarActionPerformed
    
    
    //REGISTRO
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        try { //usamos Try-Catch para manejar posibles excepciones   
            
            // Datos del nuevo producto
                int codigoProducto = Integer.parseInt(cod.getText());            
                if (codigoProducto<1) { 
                  throw new NumberFormatException("El código debe ser un número positivo.");
                    }
                if(Posicion(codigoProducto)!=-1){
                    throw new NumberFormatException("Ya existe un producto con el código ingresado.");
                }
                
                int cantidadProducto = Integer.parseInt(cant.getText());
                if (cantidadProducto<5) { 
                  throw new NumberFormatException("La cantidad debe ser mínimo a 5.");
                    }
                int costoProducto = Integer.parseInt(costo.getText());
                if (costoProducto<1) { 
                  throw new NumberFormatException("El costo debe ser un número positivo.");
                    }

                int precioVenta = (int) (costoProducto + 0.2 * costoProducto);
                if (precioVenta<1) { 
                  throw new NumberFormatException("El costo debe ser un número positivo.");
                    }
                
                if(N_Productos>=bodega.length){
                    throw new NumberFormatException("Lo sentimos, ya no hay espacio disponible.");
                }
                
            int[] X ={codigoProducto,cantidadProducto, costoProducto, precioVenta}; // Valor a insertar
                    
            // Buscar la posición de inserción 
                int pos= InsertarEn(codigoProducto);

            // Desplazar elementos hacia la derecha (ajustando los índices)
                for (int i = N_Productos - 1; i >= pos; i--) {
                    bodega[i + 1] = bodega[i];
                }

            // Insertar el nuevo elemento
                bodega[pos] = X;
                N_Productos++; 
            
            inventario.actualizar(bodega, N_Productos);
            mensaje.setText("Producto añadido con éxito");
            

        } catch(NumberFormatException exc){
            JOptionPane.showMessageDialog(this, "Error: " + exc.getMessage(), "Error de Ingreso", JOptionPane.ERROR_MESSAGE);
        }     
    }//GEN-LAST:event_agregarActionPerformed

    //INVENTARIO
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        try{
            int codx=  Integer.parseInt(codi.getText());
            if (codx<1) { 
                  throw new NumberFormatException("El código debe ser un número positivo.");
                    }
                if(Posicion(codx)==-1){
                    throw new NumberFormatException("No existe el código en el sistema");
                }
            eliminar(bodega, codx);
            
            limpiar(tabla);
            String ids [] = {"Código","Unidades","Costo","Precio"};
            tabla.setColumnIdentifiers(ids);
            table.setModel(tabla);
            mostrar(bodega); 
            
            inventario.actualizar(bodega, N_Productos);
            
        } catch(NumberFormatException exc){
            JOptionPane.showMessageDialog(this, "Error: " + exc.getMessage(), "Error de Ingreso", JOptionPane.ERROR_MESSAGE);
        }   
        
        
        
    }//GEN-LAST:event_eliminarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

    private void volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_volver1ActionPerformed

    private void volver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_volver2ActionPerformed

    //COMPRA A PROVEEDORES
    
    //Pasar la información de Compras al Reporte diario
    private reporte.Actualizar reporte = new Actualizar(); 
    int N_Compras=0;
    int Total_Compras=0;
    Principal.Caja Caja = new Caja();
    
    
    private void compradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compradoActionPerformed
       try {
            int codigoProducto = Integer.parseInt(codc.getText());            
                if (codigoProducto<1) { 
                    throw new NumberFormatException("El código debe ser un número positivo.");}
            int cantidadProducto = Integer.parseInt(cantc.getText());
                if (cantidadProducto<1) { 
                    throw new NumberFormatException("La cantidad debe ser mínimo 1 producto");}            
            int costoProducto = Integer.parseInt(costoc.getText());
                if (costoProducto<1) { 
                    throw new NumberFormatException("El costo debe ser un número positivo.");}
            int precioVenta = (int) (costoProducto + 0.2 * costoProducto);
                if (precioVenta<1) { 
                  throw new NumberFormatException("El costo debe ser un número positivo.");}
            
            double egreso= cantidadProducto*costoProducto;
                if (egreso>Caja.getValorCaja()) { 
                    throw new NumberFormatException("La compra no puede ser realizada, no hay suficiente dinero en caja.");}
                
            procesarProducto(codigoProducto, cantidadProducto, costoProducto, precioVenta);
            inventario.actualizar(bodega, N_Productos);
            //Se actualiza caja
            Caja.egresar(cantidadProducto*costoProducto);
            
            mensaje2.setText("Compra realizada");
            N_Compras++;
            Total_Compras+=(cantidadProducto*costoProducto);
            reporte.compras(N_Compras, Total_Compras);
            
        } catch(NumberFormatException exc){
            JOptionPane.showMessageDialog(this, "Error: " + exc.getMessage(), "Error de Ingreso", JOptionPane.ERROR_MESSAGE);
        }     
    }//GEN-LAST:event_compradoActionPerformed

   
    
    //FUNCIONES Y SUBRUTINAS
    
    //Subrutina que permite mostrar la tabla completa con la información del vector
    void mostrar(int bodega[][]){
        limpiar(tabla);
        JOptionPane.showMessageDialog(this,"Datos actualizados");
        for (int k = 0; k < N_Productos; k++) {
            Object[] f = {bodega[k][0], bodega[k][1], bodega[k][2], bodega[k][3]};
            tabla.addRow(f);
        }
    }
    
    //Subrutina que permite eliminar el contenido de la tabla
    void limpiar(DefaultTableModel tabla){
        //Eliminamos las filas existentes
        
        int rowCount = tabla.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            tabla.removeRow(i);
        }
    }
    
    //Subrutina que elimina del arreglo bodega un producto a partir de su código
    void eliminar(int bodega[][], int x){
            int pos= Posicion(x); 
            // Desplazar elementos hacia la izquierda
            for (int i = pos; i < N_Productos - 1; i++) {
                bodega[i] = bodega[i + 1];
            }
            N_Productos--; // Reducir el tamaño efectivo del arreglo
    }
      
    // Función que busca la posición donde debe ser insertado el producto
    private int InsertarEn(int codigoProducto) {
        for (int j = 0; j < N_Productos; j++) {
            if ( codigoProducto< bodega[j][0]) {
                return j; // Encontramos la posición correcta
            } 
        }   
        return N_Productos;  // Si no encontramos una posición, lo agregamos al final
    }
    
    // Función que busca la posición de un producto, de no existir retorna -1
    private int Posicion(int codigoProducto) {
        for (int j = 0; j < N_Productos; j++) {
            if (codigoProducto == bodega[j][0]) {
                return j; // Producto encontrado
            }
        }
        return -1; // Producto no encontrado
    }
    
    //Subrutina que procesa el producto al hacerse una compra a los productores
    private void procesarProducto(int codigoProducto, int cantidadProducto, int costoProducto, int precioVenta) {
        int pos = Posicion(codigoProducto);
        if (pos != -1) {
            // Actualizar el producto existente
            bodega[pos][1]+=cantidadProducto;

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas actualizar el costo del producto " + codigoProducto +
                            "?", "Confirmación", JOptionPane.YES_NO_OPTION);
            // Si la respuesta es "Sí"
            if (respuesta == JOptionPane.YES_OPTION) {
                bodega[pos][2]=costoProducto;
                bodega[pos][3]=precioVenta;
                JOptionPane.showMessageDialog(this,"Costo y Precio Actualizados.");
            }
        } else { //pos=-1 no existe
            
            int ind= InsertarEn(codigoProducto);
            
            // Insertar el nuevo producto
            int[] X ={codigoProducto,cantidadProducto, costoProducto, precioVenta}; // Valor a insertar
            
            // Desplazar elementos hacia la derecha (ajustando los índices)
            for (int i = N_Productos - 1; i >= ind; i--) {
                bodega[i + 1] = bodega[i];
            }
            // Insertar el nuevo elemento
            bodega[ind] = X;
            N_Productos++; 
        }
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
            java.util.logging.Logger.getLogger(manejo_bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manejo_bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manejo_bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manejo_bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manejo_bodega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Inventario;
    private javax.swing.JPanel Proveedores;
    private javax.swing.JPanel Registro;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton agregar;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cant;
    private javax.swing.JTextField cantc;
    private javax.swing.JTextField cod;
    private javax.swing.JTextField codc;
    private javax.swing.JTextField codi;
    private javax.swing.JButton comprado;
    private javax.swing.JTextField costo;
    private javax.swing.JTextField costoc;
    private javax.swing.JButton eliminar;
    private javax.swing.ButtonGroup estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField mensaje;
    private javax.swing.JTextField mensaje2;
    private javax.swing.JTable table;
    private javax.swing.JButton volver;
    private javax.swing.JButton volver1;
    private javax.swing.JButton volver2;
    // End of variables declaration//GEN-END:variables
}
