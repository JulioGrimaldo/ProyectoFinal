package vista;

import controller.controlBicis;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Bicicleta;

public class Menu extends javax.swing.JFrame {

    private static Bicicleta bici;
    private static ArrayList<Bicicleta> bicicletas = new ArrayList();
    private static Bicicleta bici2;
    private static ArrayList<Bicicleta> bicicletas2 = new ArrayList();
    controlBicis control = new controlBicis();
    controller.conexion conn = new controller.conexion();
    DefaultTableModel modelo;
    public Menu() {
        initComponents();
        inicializarTabla();
        bicicletas2 = control.listaBicicletas();
        cargarTabla(bicicletas2);
    }
    private void limpiar(){
            textBoxModelo.setText("");
            textBoxMarca.setText("");     
            textBoxColor.setText("");    
            textBoxTipo.setText("");
            textBoxNumero.setText("");
    }
    private boolean comprobarCamposVacios(){
        if(textBoxModelo.getText().isEmpty()|| textBoxMarca.getText().isEmpty() || textBoxColor.getText().isEmpty()||textBoxTipo.getText().isEmpty()||textBoxNumero.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
            return false;
        }else{
        return true;
        }
    }
    private void inicializarTabla() {
        modelo = new DefaultTableModel();
        modelo.addColumn("Modelo");
        modelo.addColumn("Marca");
        modelo.addColumn("Color");
        modelo.addColumn("Tipo");
        modelo.addColumn("Num. Piezas");
        this.tablaBicicletas.setModel(modelo);
    }
    public void cargarTabla(ArrayList<Bicicleta> bicis){
       String []info= new String [5];
       for (int i = 0; i < bicis.size(); i++) {
       info[0]=bicis.get(i).getModelo();
       info[1]=bicis.get(i).getMarca();
       info[2]=bicis.get(i).getColor();
       info[3]=bicis.get(i).getTipo();
       info[4]=Integer.toString(bicis.get(i).getnPiezas());
       modelo.addRow(info);       
       }
    }

    private Bicicleta solicitarDatos() {
        try {
            String vmodelo = textBoxModelo.getText();
            String vmarca = textBoxMarca.getText();
            String vcolor = textBoxColor.getText();
            String vtipo = textBoxTipo.getText();
            int npiezas = Integer.parseInt(textBoxNumero.getText());
            bici = new Bicicleta(vmodelo, vmarca, vcolor, vtipo, npiezas);
        } catch (Exception ex) {
            System.out.println("Ingrese los valores correctamente");
        }
        return bici;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBicicletas = new javax.swing.JTable();
        textBoxModelo = new javax.swing.JTextField();
        textBoxMarca = new javax.swing.JTextField();
        textBoxColor = new javax.swing.JTextField();
        textBoxTipo = new javax.swing.JTextField();
        textBoxConsulta = new javax.swing.JTextField();
        botonAltas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonConsulta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textBoxNumero = new javax.swing.JTextField();
        botonBajas = new javax.swing.JButton();
        botonActualizaciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        tablaBicicletas.setBackground(new java.awt.Color(153, 255, 153));
        tablaBicicletas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaBicicletas);

        textBoxModelo.setBackground(new java.awt.Color(204, 204, 204));

        textBoxMarca.setBackground(new java.awt.Color(204, 204, 204));
        textBoxMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textBoxMarcaKeyTyped(evt);
            }
        });

        textBoxColor.setBackground(new java.awt.Color(204, 204, 204));
        textBoxColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textBoxColorKeyTyped(evt);
            }
        });

        textBoxTipo.setBackground(new java.awt.Color(204, 204, 204));
        textBoxTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textBoxTipoKeyTyped(evt);
            }
        });

        textBoxConsulta.setBackground(new java.awt.Color(204, 204, 204));

        botonAltas.setBackground(new java.awt.Color(0, 255, 204));
        botonAltas.setText("Altas");
        botonAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltasActionPerformed(evt);
            }
        });

        jLabel1.setText("Consulta");

        botonConsulta.setBackground(new java.awt.Color(153, 255, 204));
        botonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultaActionPerformed(evt);
            }
        });

        jLabel2.setText("Modelo");

        jLabel3.setText("Marca");

        jLabel4.setText("Color");

        jLabel5.setText("Tipo");

        jLabel6.setText("Numero P.");

        textBoxNumero.setBackground(new java.awt.Color(204, 204, 204));
        textBoxNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textBoxNumeroKeyTyped(evt);
            }
        });

        botonBajas.setBackground(new java.awt.Color(153, 255, 204));
        botonBajas.setText("Bajas");
        botonBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBajasActionPerformed(evt);
            }
        });

        botonActualizaciones.setBackground(new java.awt.Color(153, 255, 204));
        botonActualizaciones.setText("Actualizaciones");
        botonActualizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 380, Short.MAX_VALUE)
                .addComponent(botonConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(textBoxConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addComponent(textBoxNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addComponent(textBoxMarca)
                                .addComponent(textBoxModelo)
                                .addComponent(textBoxColor)
                                .addComponent(textBoxTipo))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(botonActualizaciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(botonBajas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonAltas, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBoxConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(botonAltas)
                        .addGap(18, 18, 18)
                        .addComponent(botonBajas)
                        .addGap(18, 18, 18)
                        .addComponent(botonActualizaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBoxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBoxColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBoxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void botonAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltasActionPerformed
        boolean resul= comprobarCamposVacios();
        if(resul==false){
            
        }else{
        bici = solicitarDatos();
        control.alta(bici);
        bicicletas2 = control.listaBicicletas();
        inicializarTabla();
        cargarTabla(bicicletas2);
        limpiar();
        }
        
    }//GEN-LAST:event_botonAltasActionPerformed

    private void botonBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajasActionPerformed
        if (textBoxModelo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellene el campo Modelo");
        } else {
            String vmodelo = textBoxModelo.getText();
            control.elimina(vmodelo);
            bicicletas2 = control.listaBicicletas();
            inicializarTabla();
            cargarTabla(bicicletas2);
            limpiar();
        }
    }//GEN-LAST:event_botonBajasActionPerformed

    private void botonActualizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizacionesActionPerformed
       boolean resul= comprobarCamposVacios();
        if(resul==false){
            
        }else{
        String vmodelo = JOptionPane.showInputDialog("Introduzca el modelo a modificar::");
        bici = solicitarDatos();
        control.actualiza(bici, vmodelo);
        bicicletas2 = control.listaBicicletas();
        inicializarTabla();
        cargarTabla(bicicletas2);
        limpiar();
        }
    }//GEN-LAST:event_botonActualizacionesActionPerformed

    private void botonConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultaActionPerformed
            String vmodelo=textBoxConsulta.getText();
            if(vmodelo.equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese el modelo a buscar");
            }else{
                bicicletas2=control.listaBicicletas(vmodelo);
            for (int i = 0; i < bicicletas2.size(); i++) {
            textBoxModelo.setText(bicicletas2.get(i).getModelo());
            textBoxMarca.setText(bicicletas2.get(i).getMarca());     
            textBoxColor.setText(bicicletas2.get(i).getColor());    
            textBoxTipo.setText(bicicletas2.get(i).getTipo());
            textBoxNumero.setText(String.valueOf(bicicletas2.get(i).getnPiezas()));
            inicializarTabla();
            cargarTabla(bicicletas2);         
            }            
        }              
    }//GEN-LAST:event_botonConsultaActionPerformed

    private void textBoxNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBoxNumeroKeyTyped
       int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }
    }//GEN-LAST:event_textBoxNumeroKeyTyped

    private void textBoxColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBoxColorKeyTyped
       int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_textBoxColorKeyTyped

    private void textBoxTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBoxTipoKeyTyped
       int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_textBoxTipoKeyTyped

    private void textBoxMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBoxMarcaKeyTyped
        int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_textBoxMarcaKeyTyped


    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizaciones;
    private javax.swing.JButton botonAltas;
    private javax.swing.JButton botonBajas;
    private javax.swing.JButton botonConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaBicicletas;
    private javax.swing.JTextField textBoxColor;
    private javax.swing.JTextField textBoxConsulta;
    private javax.swing.JTextField textBoxMarca;
    private javax.swing.JTextField textBoxModelo;
    private javax.swing.JTextField textBoxNumero;
    private javax.swing.JTextField textBoxTipo;
    // End of variables declaration//GEN-END:variables
}
