/*********************************************************************************************
 * @Autor: Vásquez Santiago Germán                                                           *
 * Fecha de creación: 01/05/2022                                                             *
 * Fecha de Modificación: 09/06/2022                                                         *
 * Descripción: Es la clase para seleccionar la musica.                                                                            *  
 * *******************************************************************************************
 */
package reproductormp3yerkus.view;

import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Carpeta extends javax.swing.JFrame {
    private Principal principal;
 Carpeta(Principal principal) {
     this.principal = principal;
        initComponents();
        setLocationRelativeTo(null); // para centrar el JFrame
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooserCarpetaDeMusicas = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileChooserCarpetaDeMusicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileChooserCarpetaDeMusicasMouseClicked(evt);
            }
        });
        fileChooserCarpetaDeMusicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserCarpetaDeMusicasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 25, Short.MAX_VALUE)
                    .addComponent(fileChooserCarpetaDeMusicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fileChooserCarpetaDeMusicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileChooserCarpetaDeMusicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserCarpetaDeMusicasActionPerformed
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.mp3","mp3");
        
        File archivo = fileChooserCarpetaDeMusicas.getSelectedFile(); 
        //File archivo = fileChooserCarpetaDeMusicas.; 
        principal.modelo.addElement(archivo.toString());
        principal.show();
        this.hide();
    }//GEN-LAST:event_fileChooserCarpetaDeMusicasActionPerformed

    private void fileChooserCarpetaDeMusicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileChooserCarpetaDeMusicasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fileChooserCarpetaDeMusicasMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooserCarpetaDeMusicas;
    // End of variables declaration//GEN-END:variables
}
