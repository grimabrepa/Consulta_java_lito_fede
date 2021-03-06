/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominio.gui;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Marcelo
 */
public class Gui extends javax.swing.JFrame {

    
    public Gui() {
        initComponents();
        //Este objeto almacena la direccion del recurso donde esta guardada la imagen
        ImageIcon ruta = new ImageIcon(getClass().getResource("/imagenes/logo_marcelo.png"));
        //Este objeto obtiene la imagen almacenada en la ruta y lo dimensiona al tamaño de su contenedor (jlabel)
        Icon logo = new ImageIcon(ruta.getImage().getScaledInstance(lbimagen.getWidth(), lbimagen.getHeight(),Image.SCALE_DEFAULT));
        //Coloco la imagen dentro del contenedor (Jpanel)
        lbimagen.setIcon(logo);
        //Este metodo le avisa a la maquina virtual que repinte este objeto.
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPderecha = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlNombre = new javax.swing.JTextField();
        jPizquierda = new javax.swing.JPanel();
        lbimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jlNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jlNombreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout JPderechaLayout = new javax.swing.GroupLayout(JPderecha);
        JPderecha.setLayout(JPderechaLayout);
        JPderechaLayout.setHorizontalGroup(
            JPderechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPderechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPderechaLayout.setVerticalGroup(
            JPderechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPderechaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(JPderechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPizquierdaLayout = new javax.swing.GroupLayout(jPizquierda);
        jPizquierda.setLayout(jPizquierdaLayout);
        jPizquierdaLayout.setHorizontalGroup(
            jPizquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPizquierdaLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(lbimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPizquierdaLayout.setVerticalGroup(
            jPizquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPizquierdaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lbimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPderecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPizquierda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPderecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPizquierda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Validacion para que solo se ingrese texto
    private void jlNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlNombreKeyTyped
        // capturo la tecla que se presiono y alamceno en la variable tecla
        char tecla =evt.getKeyChar();
        
        // en el condicional pregunto con un metodo de la clase Character si es un numero
        if(Character.isDigit(tecla)){
            evt.consume();// con este metodo le digo que desestime el caracter ingresadoo
        }
        //Validacion para que solo se ingrese hasta 4 caracteres
        if(jlNombre.getText().length()>=4){
            evt.consume();
        }
    }//GEN-LAST:event_jlNombreKeyTyped



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPderecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPizquierda;
    private javax.swing.JTextField jlNombre;
    private javax.swing.JLabel lbimagen;
    // End of variables declaration//GEN-END:variables
}
