/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.tpv_bar.gui.ventanas;

import es.tpv_bar.VentanaTPV;
import es.tpv_bar.gui.botones.BTCamarero;
import es.tpv_bar.gui.botones.BTMesa;
import es.tpv_bar.persistencia.modelos.BloqueUbicacionModel;
import es.tpv_bar.persistencia.modelos.CamareroModel;
import es.tpv_bar.persistencia.modelos.UbicacionModel;
import es.tpv_bar.persistencia.pojos.Camarero;
import es.tpv_bar.persistencia.pojos.Ubicacion;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author aperalta
 */
public class VentanaCamareros extends javax.swing.JDialog {

    /**
     * Variables de modelos
     *
     */
    CamareroModel um = new CamareroModel();
    BloqueUbicacionModel bum = new BloqueUbicacionModel();
    /**
     * variables de listas de botones
     */
    ArrayList<Camarero> camareros;
    private Camarero camarero;

    /**
     * Creates new form VentanaMesas
     */
    public VentanaCamareros(VentanaTPV parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        cargarMesas();
        this.parent = parent;
    }
    VentanaTPV parent;

    public VentanaCamareros(MovimientoCaja parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        cargarMesas();
        this.parent2 = parent;
    }
    MovimientoCaja parent2;
    public VentanaCamareros(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        cargarMesas();
        //this.parent2 = parent;
    }
    /**
     * Carga de las ubicaciones segun el parametro CatUbi
     */
    private void cargarMesas() {
        this.camareros = (ArrayList<Camarero>) um.getLista();
        for (int i = 0; i < this.camareros.size(); i++) {
            final BTCamarero bt = new BTCamarero(this.camareros.get(i));
            bt.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    camarero = bt.getUbicacion(); 
                    try {
                        parent.setCamarero(bt.getUbicacion());
                    } catch (NullPointerException ex) {
                       try{
                        parent2.setCamarero(bt.getUbicacion());
                       }catch(NullPointerException exp){
                       
                       }
                    }
                    dispose();
                }
            });
            this.jPanel1.add(bt);
        }
        this.jPanel1.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new java.awt.GridLayout(0, 2, 5, 5));
        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addGap(143, 143, 143))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Camarero getCamarero(){
        this.setVisible(true);
        return camarero;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
