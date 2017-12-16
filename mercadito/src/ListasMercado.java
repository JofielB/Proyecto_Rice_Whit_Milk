
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author jofie
 */
public class ListasMercado extends javax.swing.JFrame {


    private final static String SEPARADORGRANDE = "------------------------------------------------";
    private final static String SEPARADORPEQUEÑO = "---------------------";
    private final static String NOMALSUPER = "                        Alsuper";
    private final static String NOMWALMART = "                        Walmart";
    private final static String NOMSORIANA = "                        Soriana";
    private String productosNoEnc = "";
    private double gastosAprx = 0;
    private int productosEnc = 0;
    private int productosFal = 0;
    /**
     * Creates new form ListasMercado
     * En esta parte se compara la lista del usuario 
     * con las distintas listas de productos y se 
     * muestran los productos que se encuentran con sus precios
     * y tambien los productos no encontrados
     */
    public ListasMercado() {
        initComponents();
        Mercadito.llenarWalmart();
        Mercadito.llenarAlsuper();
        Mercadito.llenarSoriana();
        ListaDE tLista = Mercadito.listaProductosUsuario;
        ListaDE tWal = Mercadito.listaWalmart;
        ListaDE tAls = Mercadito.listaAlsuper;
        ListaDE tSor = Mercadito.listaSoriana;

        String mensajeWalmart = NOMWALMART + "\n" + SEPARADORGRANDE + "\n" + "Productos encontrados:" + "\n"
                + SEPARADORPEQUEÑO + "\n";
        for (int i = 0; i < tLista.contarNodos(); i++) { //Se compara la lista del usuario con las demas
            String pUsuario = ((Producto) (tLista.get(i).getiVal())).getNombre();
            boolean agregado = false;
            for (int j = 0; j < tWal.contarNodos(); j++) {//Se entra a la lista del mercado
                Producto pActual = ((Producto) tWal.get(j).getiVal());
                String pMercado = pActual.getNombre();
                if (pUsuario.equals(pMercado)) {//Si se encuentra el producto se agrega
                    mensajeWalmart += pMercado + "   $" + pActual.getPrecio() + "\n";
                    gastosAprx += pActual.getPrecio();
                    productosEnc++;
                    agregado = true;
                    j = tWal.contarNodos();
                }
            }
            if (!agregado) {//Si no se encuentra el producto
                for (int j = 0; j < tWal.contarNodos(); j++) {
                    Producto pActual = ((Producto) tWal.get(j).getiVal());
                    String pMercado = pActual.getMarca();
                    if (pUsuario.equals(pMercado)) {
                        mensajeWalmart += pMercado + "   $" + pActual.getPrecio() + "\n";
                        gastosAprx += pActual.getPrecio();
                        productosEnc++;
                        agregado = true;
                        j = tWal.contarNodos();
                    }
                }
            }
            if (!agregado) {//Si no se encuentra el producto
                productosFal++;
                productosNoEnc += pUsuario + "\n";
            }
        }
        //SE LLENA EL MENSAJE Y SE MUESTRA
        mensajeWalmart += SEPARADORPEQUEÑO + "\n" + "Productos no encontrados:" + "\n" + SEPARADORPEQUEÑO
                + "\n" + productosNoEnc;
        pEncotradosWal.setText(pEncotradosWal.getText() + " " + productosEnc);
        pFaltantesWal.setText(pFaltantesWal.getText() + " " + productosFal);
        gastosAproxWal.setText(gastosAproxWal.getText() + " $" + gastosAprx);
        areaWalmart.setText(mensajeWalmart);

        productosNoEnc = "";
        gastosAprx = 0;
        productosEnc = 0;
        productosFal = 0;
        String mensajeAlsuper = NOMALSUPER + "\n" + SEPARADORGRANDE + "\n" + "Productos encontrados:" + "\n"
                + SEPARADORPEQUEÑO + "\n";
        
        //MISMOS ALGORITMO DE BUSQUEDA PERO EN DIFERENTE TIENDA(LISTA)
        for (int i = 0; i < tLista.contarNodos(); i++) {
            String pUsuario = ((Producto) (tLista.get(i).getiVal())).getNombre();
            boolean agregado = false;
            for (int j = 0; j < tAls.contarNodos(); j++) {
                Producto pActual = ((Producto) tAls.get(j).getiVal());
                String pMercado = pActual.getNombre();
                if (pUsuario.equals(pMercado)) {
                    mensajeAlsuper += pMercado + "   $" + pActual.getPrecio() + "\n";
                    gastosAprx += pActual.getPrecio();
                    productosEnc++;
                    agregado = true;
                    j = tAls.contarNodos();
                }
            }
            if (!agregado) {
                for (int j = 0; j < tAls.contarNodos(); j++) {
                    Producto pActual = ((Producto) tAls.get(j).getiVal());
                    String pMercado = pActual.getMarca();
                    if (pUsuario.equals(pMercado)) {
                        mensajeAlsuper += pMercado + "   $" + pActual.getPrecio() + "\n";
                        gastosAprx += pActual.getPrecio();
                        productosEnc++;
                        agregado = true;
                        j = tAls.contarNodos();
                    }
                }
            }
            if (!agregado) {
                productosFal++;
                productosNoEnc += pUsuario + "\n";
            }
        }

        mensajeAlsuper += SEPARADORPEQUEÑO + "\n" + "Productos no encontrados:" + "\n" + SEPARADORPEQUEÑO
                + "\n" + productosNoEnc;
        pEncotradosAls.setText(pEncotradosAls.getText() + " " + productosEnc);
        pFaltantesAls.setText(pFaltantesAls.getText() + " " + productosFal);
        gastosAproxAls.setText(gastosAproxAls.getText() + " $" + gastosAprx);
        areaAlsuper.setText(mensajeAlsuper);

        productosNoEnc = "";
        gastosAprx = 0;
        productosEnc = 0;
        productosFal = 0;
        
        //MISMOS ALGORITMO DE BUSQUEDA PERO EN DIFERENTE TIENDA(LISTA)
        String mensajeSoriana = NOMSORIANA + "\n" + SEPARADORGRANDE + "\n" + "Productos encontrados:" + "\n"
                + SEPARADORPEQUEÑO + "\n";
        for (int i = 0; i < tLista.contarNodos(); i++) {
            String pUsuario = ((Producto) (tLista.get(i).getiVal())).getNombre();
            boolean agregado = false;
            for (int j = 0; j < tSor.contarNodos(); j++) {
                Producto pActual = ((Producto) tSor.get(j).getiVal());
                String pMercado = pActual.getNombre();
                if (pUsuario.equals(pMercado)) {
                    mensajeSoriana += pMercado + "   $" + pActual.getPrecio() + "\n";
                    gastosAprx += pActual.getPrecio();
                    productosEnc++;
                    agregado = true;
                    j = tSor.contarNodos();
                }
            }
            if (!agregado) {
                for (int j = 0; j < tSor.contarNodos(); j++) {
                    Producto pActual = ((Producto) tSor.get(j).getiVal());
                    String pMercado = pActual.getMarca();
                    if (pUsuario.equals(pMercado)) {
                        mensajeSoriana += pMercado + "   $" + pActual.getPrecio() + "\n";
                        gastosAprx += pActual.getPrecio();
                        productosEnc++;
                        agregado = true;
                        j = tSor.contarNodos();
                    }
                }
            }
            if (!agregado) {
                productosFal++;
                productosNoEnc += pUsuario + "\n";
            }
        }
        mensajeSoriana += SEPARADORPEQUEÑO + "\n" + "Productos no encontrados:" + "\n" + SEPARADORPEQUEÑO
                + "\n" + productosNoEnc;
        pEncotradosSor.setText(pEncotradosSor.getText() + " " + productosEnc);
        pFaltantesSor.setText(pFaltantesSor.getText() + " " + productosFal);
        gastosAproxSor.setText(gastosAproxSor.getText() + " $" + gastosAprx);
        areaSoriana.setText(mensajeSoriana);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaWalmart = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaAlsuper = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaSoriana = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        selecWalmart = new javax.swing.JButton();
        selecAlsuper = new javax.swing.JButton();
        selecSoriana = new javax.swing.JButton();
        pEncotradosWal = new javax.swing.JLabel();
        pFaltantesWal = new javax.swing.JLabel();
        gastosAproxWal = new javax.swing.JLabel();
        pEncotradosAls = new javax.swing.JLabel();
        pFaltantesAls = new javax.swing.JLabel();
        gastosAproxAls = new javax.swing.JLabel();
        pFaltantesSor = new javax.swing.JLabel();
        gastosAproxSor = new javax.swing.JLabel();
        pEncotradosSor = new javax.swing.JLabel();
        agregarMasProductos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        areaWalmart.setEditable(false);
        areaWalmart.setColumns(20);
        areaWalmart.setRows(5);
        jScrollPane1.setViewportView(areaWalmart);

        areaAlsuper.setEditable(false);
        areaAlsuper.setColumns(20);
        areaAlsuper.setRows(5);
        jScrollPane2.setViewportView(areaAlsuper);

        areaSoriana.setEditable(false);
        areaSoriana.setColumns(20);
        areaSoriana.setRows(5);
        jScrollPane3.setViewportView(areaSoriana);

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel1.setText("Walmart");

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel2.setText("Alsuper");

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel3.setText("Soriana");

        selecWalmart.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        selecWalmart.setText("Seleccionar");
        selecWalmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecWalmartActionPerformed(evt);
            }
        });

        selecAlsuper.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        selecAlsuper.setText("Seleccionar");
        selecAlsuper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecAlsuperActionPerformed(evt);
            }
        });

        selecSoriana.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        selecSoriana.setText("Seleccionar");
        selecSoriana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecSorianaActionPerformed(evt);
            }
        });

        pEncotradosWal.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        pEncotradosWal.setText("Productos encontrados:");

        pFaltantesWal.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        pFaltantesWal.setText("Productos faltantes:");

        gastosAproxWal.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        gastosAproxWal.setText("Gastos aproximado:");

        pEncotradosAls.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        pEncotradosAls.setText("Productos encontrados:");

        pFaltantesAls.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        pFaltantesAls.setText("Productos faltantes:");

        gastosAproxAls.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        gastosAproxAls.setText("Gastos aproximados:");

        pFaltantesSor.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        pFaltantesSor.setText("Productos faltantes:");

        gastosAproxSor.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        gastosAproxSor.setText("Gastos aproximados:");

        pEncotradosSor.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        pEncotradosSor.setText("Productos encontrados:");

        agregarMasProductos.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        agregarMasProductos.setText("Agregar mas productos a la lista");
        agregarMasProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarMasProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1)
                        .addGap(0, 92, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pEncotradosWal)
                            .addComponent(pFaltantesWal)
                            .addComponent(gastosAproxWal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(selecWalmart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pEncotradosAls)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pFaltantesAls)
                                    .addComponent(gastosAproxAls))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(selecAlsuper)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(96, 96, 96)
                            .addComponent(jLabel3)
                            .addGap(100, 100, 100))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gastosAproxSor))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(selecSoriana))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pEncotradosSor)
                                    .addComponent(pFaltantesSor))))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agregarMasProductos)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pEncotradosWal)
                    .addComponent(pEncotradosSor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(pFaltantesWal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gastosAproxWal)
                        .addGap(18, 18, 18)
                        .addComponent(selecWalmart))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(pFaltantesSor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gastosAproxSor)
                        .addGap(18, 18, 18)
                        .addComponent(selecSoriana)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(agregarMasProductos)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pEncotradosAls)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pFaltantesAls)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gastosAproxAls)
                                .addGap(18, 18, 18)
                                .addComponent(selecAlsuper))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Vulves a la ventana donde creas tu lista
     * @param evt 
     */
    private void agregarMasProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarMasProductosActionPerformed
        dispose();
        ListaSuperMercado ventana = new ListaSuperMercado();
        ventana.setVisible(true);
    }//GEN-LAST:event_agregarMasProductosActionPerformed
    /**
     * En caso de seleccionar la lista de walmart
     * se guarda como la ultima lista del usuario 
     * y se manda a la ventana principal del usuario
     * @param evt 
     */
    private void selecWalmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecWalmartActionPerformed
        guardarLista(areaWalmart.getText());
        dispose();
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);

    }//GEN-LAST:event_selecWalmartActionPerformed
    /**
     * En caso de seleccionar la lista de alsuper
     * se guarda como la ultima lista del usuario 
     * y se manda a la ventana principal del usuario
     * @param evt 
     */
    private void selecAlsuperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecAlsuperActionPerformed
        guardarLista(areaAlsuper.getText());
        dispose();
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }//GEN-LAST:event_selecAlsuperActionPerformed
    /**
     * En caso de seleccionar la lista de soriana
     * se guarda como la ultima lista del usuario 
     * y se manda a la ventana principal del usuario
     * @param evt 
     */
    private void selecSorianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecSorianaActionPerformed
        guardarLista(areaSoriana.getText());
        dispose();
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }//GEN-LAST:event_selecSorianaActionPerformed
    /**
     * Este metodo se utiliza para anexar la lista 
     * con el perfil del usuario y guardar el documento 
     * @param lista lista del mandado del usuario
     */
    private void guardarLista(String lista) {
        Mercadito.mensajeMandadoUsuario = lista;
        ((User) (Mercadito.listaUsuarios.get(Mercadito.posicionUsuario).getiVal())).setUltimaListaP(lista);
        try {
            FileOutputStream archivoSalidaUno = new FileOutputStream(Mercadito.nombreListaU);
            ObjectOutputStream salidaDeDato = new ObjectOutputStream(archivoSalidaUno);
            salidaDeDato.writeObject(Mercadito.listaUsuarios);
            salidaDeDato.close();
        } catch (IOException e) {
        }
    }

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
            java.util.logging.Logger.getLogger(ListasMercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListasMercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListasMercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListasMercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListasMercado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarMasProductos;
    private javax.swing.JTextArea areaAlsuper;
    private javax.swing.JTextArea areaSoriana;
    private javax.swing.JTextArea areaWalmart;
    private javax.swing.JLabel gastosAproxAls;
    private javax.swing.JLabel gastosAproxSor;
    private javax.swing.JLabel gastosAproxWal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel pEncotradosAls;
    private javax.swing.JLabel pEncotradosSor;
    private javax.swing.JLabel pEncotradosWal;
    private javax.swing.JLabel pFaltantesAls;
    private javax.swing.JLabel pFaltantesSor;
    private javax.swing.JLabel pFaltantesWal;
    private javax.swing.JButton selecAlsuper;
    private javax.swing.JButton selecSoriana;
    private javax.swing.JButton selecWalmart;
    // End of variables declaration//GEN-END:variables
}
