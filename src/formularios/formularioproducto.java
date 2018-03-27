
package formularios;

import clases.producto;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class formularioproducto extends javax.swing.JFrame {
ArrayList<producto> lPd;
DefaultTableModel modelo;

    public formularioproducto() {
        initComponents();
        modelo= (DefaultTableModel) this.jTable1.getModel();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMax = new javax.swing.JButton();
        btnMin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtMax = new javax.swing.JTextField();
        txtMin = new javax.swing.JTextField();
        btnCamb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMax.setText("Maximo");
        btnMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxActionPerformed(evt);
            }
        });

        btnMin.setText("Minimo");
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnCamb.setText("Cargar Productos");
        btnCamb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMax)
                                .addGap(37, 37, 37)
                                .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(btnCamb)
                        .addGap(114, 114, 114))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMax)
                    .addComponent(btnCamb))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMin))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recargarTabla()
    {
        this.modelo.setRowCount(0);
        for(int i=0; i<this.lPd.size(); i++)
        {
            String[] registro = { this.lPd.get(i).nombre, Double.toString(this.lPd.get(i).precio), Integer.toString(this.lPd.get(i).cantidad) };
            modelo.addRow(registro);
        }
    }
    private void btnCambActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambActionPerformed
        lPd= new ArrayList<>();
        this.lPd.add(new producto("MARTILLO",10,7));
        this.lPd.add(new producto("SERRUCHO",8,2));
        this.lPd.add(new producto("SIERRA CALADORA",80,5));
        this.lPd.add(new producto("CEPILLADORA",200,3));
        this.lPd.add(new producto("HERRAMIENTA DE IMPACTO",500,1));
        this.lPd.add(new producto("JUEGO DE CUBOS",39,10));
 
        
        this.recargarTabla();
                
    }//GEN-LAST:event_btnCambActionPerformed

    private void btnMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxActionPerformed
        int mayor = lPd.get(0).cantidad;
    
        if(mayor < this.lPd.get(1).cantidad)
        {
            mayor=this.lPd.get(1).cantidad;
            this.txtMax.setText(this.lPd.get(1).nombre);
        }else{
            this.txtMax.setText(this.lPd.get(0).nombre);
        }
        if(mayor < this.lPd.get(2).cantidad)
        {
            mayor=this.lPd.get(2).cantidad;
            this.txtMax.setText(this.lPd.get(2).nombre);
        }else{
            this.txtMax.setText(this.lPd.get(0).nombre);
        }
        if(mayor < this.lPd.get(3).cantidad)
        {
            mayor=this.lPd.get(3).cantidad;
            this.txtMax.setText(this.lPd.get(3).nombre);
        }else{
            this.txtMax.setText(this.lPd.get(0).nombre);
        }
        if(mayor < this.lPd.get(4).cantidad)
        {
            mayor=this.lPd.get(4).cantidad;
            this.txtMax.setText(this.lPd.get(4).nombre);
        }else{
            this.txtMax.setText(this.lPd.get(0).nombre);
        }
        if(mayor < this.lPd.get(5).cantidad)
        {
            mayor=this.lPd.get(5).cantidad;
            this.txtMax.setText(this.lPd.get(5).nombre);
        }else{
            this.txtMax.setText(this.lPd.get(0).nombre);
        }
        
        //this.txtMax.setText(Double.toString(mayor));
    }//GEN-LAST:event_btnMaxActionPerformed

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        int menor = lPd.get(0).cantidad;
        
        
        if(menor > this.lPd.get(1).cantidad)
        {
            menor=this.lPd.get(1).cantidad;
            this.txtMin.setText(this.lPd.get(1).nombre);
        }
        if(menor > this.lPd.get(2).cantidad)
        {
            menor=this.lPd.get(2).cantidad;
            this.txtMin.setText(this.lPd.get(2).nombre);
        }
        if(menor > this.lPd.get(3).cantidad)
        {
            menor=this.lPd.get(3).cantidad;
            this.txtMin.setText(this.lPd.get(3).nombre);
        }
        if(menor > this.lPd.get(4).cantidad)
        {
            menor=this.lPd.get(4).cantidad;
            this.txtMin.setText(this.lPd.get(4).nombre);
        }
        if(menor > this.lPd.get(5).cantidad)
        {
            menor=this.lPd.get(5).cantidad;
            this.txtMin.setText(this.lPd.get(5).nombre);
        }
        
        //this.txtMax.setText(Double.toString(mayor));
    }//GEN-LAST:event_btnMinActionPerformed

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
            java.util.logging.Logger.getLogger(formularioproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioproducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCamb;
    private javax.swing.JButton btnMax;
    private javax.swing.JButton btnMin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMin;
    // End of variables declaration//GEN-END:variables
}
