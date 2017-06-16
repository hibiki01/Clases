package Ejercicios;
//2.-

import javax.swing.DefaultListModel;



public class frm_ejercicio03 extends javax.swing.JFrame {

    DefaultListModel m=new DefaultListModel();
    
    public frm_ejercicio03() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        bt_agregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_cantidad = new javax.swing.JLabel();
        txt_reemplazado = new javax.swing.JTextField();
        lbl_2 = new javax.swing.JLabel();
        txt_buscado = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_nombres = new javax.swing.JList<>();
        bt_eliminar = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_agregar.setText("agregar");
        bt_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarActionPerformed(evt);
            }
        });
        bt_agregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bt_agregarKeyPressed(evt);
            }
        });

        jLabel1.setText("Busqueda de elemento");

        lbl_1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Reemplazar elemento");

        jLabel4.setText("Numero de elementos");

        lbl_cantidad.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_reemplazado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_reemplazadoActionPerformed(evt);
            }
        });
        txt_reemplazado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_reemplazadoKeyPressed(evt);
            }
        });

        lbl_2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_buscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscadoActionPerformed(evt);
            }
        });
        txt_buscado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_buscadoKeyPressed(evt);
            }
        });

        jScrollPane2.setViewportView(lst_nombres);

        bt_eliminar.setText("Eliminar");
        bt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nombre)
                    .addComponent(bt_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_buscado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_reemplazado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel4, lbl_1, lbl_cantidad, txt_buscado});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbl_2, txt_reemplazado});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buscado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_reemplazado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(bt_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel3, jLabel4, lbl_1, lbl_2, lbl_cantidad, txt_buscado, txt_reemplazado});

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void bt_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarActionPerformed
        String nom=this.txt_nombre.getText();
        int tamaño=m.size();
        boolean bandera=false;
        for(int i=0;i<tamaño;i++){
            if(m.getElementAt(i).equals(nom)){
                bandera=true; break;
            }
        }
        if(!bandera){
            m.addElement(nom);
        }
        this.lst_nombres.setModel(m);
        this.txt_nombre.setText("");
        this.txt_nombre.requestFocus();
    }//GEN-LAST:event_bt_agregarActionPerformed

    private void txt_buscadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscadoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==evt.VK_ENTER){
            //Codigo para buscar un elemento en la lista
            String buscado=this.txt_buscado.getText();
            boolean b=false;
            for(int i=0;i<m.size();i++){
                if(m.getElementAt(i).equals(buscado)){
                    b=true; break;
                }
            }
            if(b){
                this.lbl_1.setText("Encontrado!");
            }else{
                this.lbl_1.setText("No Encontrado!");
            }
        }
    }//GEN-LAST:event_txt_buscadoKeyPressed

    private void bt_agregarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_agregarKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bt_agregarKeyPressed

    private void txt_buscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscadoActionPerformed

    private void bt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarActionPerformed
        // TODO add your handling code here:
        int indice=this.lst_nombres.getSelectedIndex();
        m.remove(indice);
    }//GEN-LAST:event_bt_eliminarActionPerformed

    private void txt_reemplazadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_reemplazadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_reemplazadoActionPerformed

    private void txt_reemplazadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_reemplazadoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==evt.VK_ENTER){
            //Codigo para buscar un elemento en la lista
            int indice=this.lst_nombres.getSelectedIndex();
            m.remove(indice);
            m.add(indice,this.txt_reemplazado.getText());
        }        
    }//GEN-LAST:event_txt_reemplazadoKeyPressed

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
            java.util.logging.Logger.getLogger(frm_ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ejercicio03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregar;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JList<String> lst_nombres;
    private javax.swing.JTextField txt_buscado;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_reemplazado;
    // End of variables declaration//GEN-END:variables
}
