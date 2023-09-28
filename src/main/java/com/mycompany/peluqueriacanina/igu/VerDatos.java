
package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerDatos extends javax.swing.JFrame {

    Controladora control = null;
    
    public VerDatos() {
        control = new Controladora();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnElminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("HP Simplified", 0, 48)); // NOI18N
        jLabel1.setText("Visualización de Datos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        jLabel2.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        jLabel2.setText("Datos de mascotas:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnElminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\peluCaninaIMG\\borrar.png")); // NOI18N
        btnElminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElminarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\rafae\\Desktop\\peluCaninaIMG\\editar.png")); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(237, 237, 237))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnElminar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        cargarTabla();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnElminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElminarActionPerformed
        //Controlo que la tabla no esté vacía
        if(tablaMascotas.getRowCount() > 0){
            //Controlo que se haya seleccionada a una mascota
            if(tablaMascotas.getSelectedRow() != -1) {
                //Obtengo la id de la mascota a eliminar
                int num_cliente =  Integer.parseInt(String.valueOf(tablaMascotas.getValueAt (tablaMascotas.getSelectedRow(), 0)));
                //llamo al metodo borrar
                control.borrarMascota(num_cliente);
                //aviso al usuario que borró correctamente
                mostrarMensaje("Mascota elminada correctamente", "Info", "Borrado de Mascota");
                cargarTabla();
             
            }
            else{
                mostrarMensaje("No seleccionó ninguna mascota", "Error", "Error al elminar");
            }
        }
        else{
            mostrarMensaje("No hay nada que eliminar en la tabla", "Error", "Error al elminar");
        }  
    }//GEN-LAST:event_btnElminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         if(tablaMascotas.getRowCount() > 0){
            //Controlo que se haya seleccionada a una mascota
            if(tablaMascotas.getSelectedRow() != -1) {
                //Obtengo la id de la mascota a editar
                int num_cliente =  Integer.parseInt(String.valueOf(tablaMascotas.getValueAt (tablaMascotas.getSelectedRow(), 0)));
                
                //control.editarMascota(num_cliente);
                ModificarDatos pantallaModif = new ModificarDatos(num_cliente);
                pantallaModif.setVisible(true);
                pantallaModif.setLocationRelativeTo(null);
                
                this.dispose();
                
            }
            else{
                mostrarMensaje("No seleccionó ninguna mascota", "Error", "Error al elminar");
            }
        }
        else{
            mostrarMensaje("No hay nada que eliminar en la tabla", "Error", "Error al elminar");
        }  
       
        
        
    }//GEN-LAST:event_btnEditarActionPerformed
    
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if(tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if (tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnElminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        //Definir el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            //que filas y columnas no sean editables
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        //establecemos los nombres de las columnas
        String titulos[] = {"Num", "Nombre", "Color", "Raza", "Alergico", "At. Esp.","Dueno", "Cel."};
                modeloTabla.setColumnIdentifiers(titulos);
                
        //carga de los datos desde la BS
        List <Mascota> listaMascotas = control.traerMascotas();
        
        //Recorrer la lista y mostrar cada uno de los elemntos en la tabla
        if(listaMascotas != null){
            for (Mascota masco : listaMascotas){
                Object[] objeto = {masco.getNum_cliente(), masco.getNombre(), masco.getColor(), masco.getRaza(), 
                                   masco.getAlergico(), masco.getAtencion_especial(), 
                                   masco.getUnDuenio().getNombre(), masco.getUnDuenio().getCelDuenio()};
                modeloTabla.addRow(objeto);
            }
        }
        tablaMascotas.setModel(modeloTabla);
    }
}
