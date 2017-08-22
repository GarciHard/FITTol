package fittol.vista;

import fittol.dao.ClientesDAO;
import fittol.dao.MembresiasDAO;
import fittol.dao.VentasDAO;
import fittol.modelo.ClientesVO;
import fittol.modelo.MembresiasVO;
import java.time.LocalDate;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class FITTolRecepcionistaVentaCteN extends javax.swing.JDialog {

    
    private DefaultComboBoxModel cmbMemModel;
    private final ClientesDAO cteDAO = new ClientesDAO();
    private final MembresiasDAO memDAO = new MembresiasDAO();
    private final VentasDAO venDAO = new VentasDAO();
    private MembresiasVO memObj;
    private ClientesVO cteObj;
    private final String numSocio;
    private final String empID;
    private String memID;
    
    public FITTolRecepcionistaVentaCteN(java.awt.Dialog parent, boolean modal, String numSocio, String empID) {
        super(parent, modal);
        initComponents();
        this.numSocio = numSocio;
        this.empID = empID;
        try {
            cteObj = cteDAO.datosSocioNuevaM(numSocio);
            lblImgCte.setIcon(cteObj.getCteFotoLeer());
            lblNombreCte.setText("Nombre : " + cteObj.getCteNombre());
            lblApellidosCte.setText("Apellidos : " + cteObj.getCteApMaterno() + " " + cteObj.getCteApMaterno());
            lblMemberSince.setText("Miembro desde : " + cteObj.getCteFechaInscripcion());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Mensaje de la BD : " + e,
                    "Msg BD", JOptionPane.PLAIN_MESSAGE);
        }
        try {
            cmbMemModel = new DefaultComboBoxModel();
            for (int x = 0; x < memDAO.membresiasInfoArr().size(); x++) {
                memObj = memDAO.membresiasInfoArr().get(x);
                cmbMemModel.addElement(memObj.getMemNombre());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Mensaje de la BD s: " + e,
                    "Msg BD", JOptionPane.PLAIN_MESSAGE);
        }
        cmbMembresiaNombre.setModel(cmbMemModel);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblImgCte = new javax.swing.JLabel();
        lblNombreCte = new javax.swing.JLabel();
        lblApellidosCte = new javax.swing.JLabel();
        lblMemberSince = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblMembresiaTitulo = new javax.swing.JLabel();
        cmbMembresiaNombre = new javax.swing.JComboBox<>();
        lblMembresiaCosto = new javax.swing.JLabel();
        lblFechaInicioNewM = new javax.swing.JLabel();
        lblFechaFinNewM = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlBackground.setBackground(new java.awt.Color(245, 245, 245));

        lblTitulo.setFont(new java.awt.Font("Heiti TC", 0, 36)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fittol/imagenes/FITTolLogo_v3.png"))); // NOI18N
        lblTitulo.setText("Membresia Individual");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lblImgCte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreCte.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblNombreCte.setText("Nombre : ");

        lblApellidosCte.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblApellidosCte.setText("Apellidos : ");

        lblMemberSince.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblMemberSince.setText("Miembro desde : ");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        lblMembresiaTitulo.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblMembresiaTitulo.setText("Membresia : ");

        cmbMembresiaNombre.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        cmbMembresiaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMembresiaNombreActionPerformed(evt);
            }
        });

        lblMembresiaCosto.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N

        lblFechaInicioNewM.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblFechaInicioNewM.setText("Fecha Inicio : ");

        lblFechaFinNewM.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblFechaFinNewM.setText("Fecha Vencimiento : ");

        lblTotal.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblTotal.setText("Total a pagar : ");

        btnGuardar.setBackground(new java.awt.Color(46, 204, 113));
        btnGuardar.setFont(new java.awt.Font("Heiti TC", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fittol/imagenes/BtnSaveW.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnGuardar.setOpaque(true);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblImgCte, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreCte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblApellidosCte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMemberSince, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator2)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblMembresiaTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(cmbMembresiaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMembresiaCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblFechaInicioNewM, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFechaFinNewM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImgCte, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblNombreCte)
                        .addGap(18, 18, 18)
                        .addComponent(lblApellidosCte)
                        .addGap(18, 18, 18)
                        .addComponent(lblMemberSince)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMembresiaTitulo)
                    .addComponent(cmbMembresiaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMembresiaCosto))
                .addGap(18, 18, 18)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaInicioNewM)
                    .addComponent(lblFechaFinNewM))
                .addGap(18, 18, 18)
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMembresiaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMembresiaNombreActionPerformed
        String nombreMem = cmbMembresiaNombre.getSelectedItem().toString();        
        try {
            LocalDate fechaLocal = LocalDate.now();
            memObj = memDAO.membresiasInfo(nombreMem).get(0);
            this.memID = memObj.getMemId();
            lblFechaInicioNewM.setText("Fecha Inicio : " + fechaLocal.getDayOfMonth() + "/"
                    + fechaLocal.getMonthValue() + "/"
                    + fechaLocal.getYear());
            
            LocalDate fechaLocalFin = fechaLocal.plusDays(memObj.getMemDuracion());
            lblFechaFinNewM.setText("Fecha Vencimiento : " + fechaLocalFin.getDayOfMonth() + "/"
                    + fechaLocalFin.getMonthValue() + "/"
                    + fechaLocalFin.getYear());

            lblTotal.setText("Total a pagar : " + String.valueOf(memObj.getMemCosto()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Mensaje de la BD : " + e,
                    "Msg BD", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_cmbMembresiaNombreActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            venDAO.membresiaSocioIndividual(numSocio, memID, empID);
            JOptionPane.showMessageDialog(this, "Membresia Registrada Con Éxito",
                    "Msg BD", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Mensaje de la BD : " + e,
                    "Msg BD", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbMembresiaNombre;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblApellidosCte;
    private javax.swing.JLabel lblFechaFinNewM;
    private javax.swing.JLabel lblFechaInicioNewM;
    private javax.swing.JLabel lblImgCte;
    private javax.swing.JLabel lblMemberSince;
    private javax.swing.JLabel lblMembresiaCosto;
    private javax.swing.JLabel lblMembresiaTitulo;
    private javax.swing.JLabel lblNombreCte;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlBackground;
    // End of variables declaration//GEN-END:variables

}
