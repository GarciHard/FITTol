package fittol.vista;

import fittol.dao.ClientesDAO;
import fittol.modelo.ClientesVO;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class FITTolRecepcionistaNvoCte extends javax.swing.JDialog {
    
    private int valorImg;
    private final ClientesDAO cteDAO = new ClientesDAO();
        
    public FITTolRecepcionistaNvoCte(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            lblNoSocio.setText(String.valueOf(cteDAO.generarIdSocio()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Mensaje de la BD : " + e,
                    "Msg BD", JOptionPane.PLAIN_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlBackground = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnCteFoto = new javax.swing.JButton();
        lblTituloNoSocio = new javax.swing.JLabel();
        lblNoSocio = new javax.swing.JLabel();
        lblNombreSocio = new javax.swing.JLabel();
        txtNombreSocio = new javax.swing.JTextField();
        lblApPaternoSocio = new javax.swing.JLabel();
        txtApPaternoSocio = new javax.swing.JTextField();
        lblApMaternoSocio = new javax.swing.JLabel();
        txtApMaternoSocio = new javax.swing.JTextField();
        lblSexoSocio = new javax.swing.JLabel();
        rbtMasculino = new javax.swing.JRadioButton();
        rbtFemenino = new javax.swing.JRadioButton();
        lblFechaSocio = new javax.swing.JLabel();
        dtcFechaSocio = new com.toedter.calendar.JDateChooser();
        lblTelefonoSocio = new javax.swing.JLabel();
        txtTelefonoSocio = new javax.swing.JTextField();
        btnGuardarSocio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlBackground.setBackground(new java.awt.Color(245, 245, 245));

        lblTitulo.setFont(new java.awt.Font("Heiti TC", 0, 36)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fittol/imagenes/FITTolLogo_v3.png"))); // NOI18N
        lblTitulo.setText("Registro Socio");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btnCteFoto.setBackground(new java.awt.Color(245, 245, 245));
        btnCteFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fittol/imagenes/BtnNvoUsrB.png"))); // NOI18N
        btnCteFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCteFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCteFotoActionPerformed(evt);
            }
        });

        lblTituloNoSocio.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblTituloNoSocio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloNoSocio.setText("No. de Socio");

        lblNoSocio.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblNoSocio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNoSocio.setText("123456789");

        lblNombreSocio.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblNombreSocio.setText("Nombre (s) ");

        txtNombreSocio.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N

        lblApPaternoSocio.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblApPaternoSocio.setText("Apellido Paterno");

        txtApPaternoSocio.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N

        lblApMaternoSocio.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblApMaternoSocio.setText("Apellido Materno");

        txtApMaternoSocio.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N

        lblSexoSocio.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblSexoSocio.setText("Sexo");

        buttonGroup1.add(rbtMasculino);
        rbtMasculino.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        rbtMasculino.setText("M");

        buttonGroup1.add(rbtFemenino);
        rbtFemenino.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        rbtFemenino.setText("F");

        lblFechaSocio.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblFechaSocio.setText("Fecha Nacimiento");

        lblTelefonoSocio.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblTelefonoSocio.setText("Teléfono");

        txtTelefonoSocio.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N

        btnGuardarSocio.setBackground(new java.awt.Color(46, 204, 113));
        btnGuardarSocio.setFont(new java.awt.Font("Heiti TC", 0, 12)); // NOI18N
        btnGuardarSocio.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fittol/imagenes/BtnSaveCteW.png"))); // NOI18N
        btnGuardarSocio.setText("Guardar");
        btnGuardarSocio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnGuardarSocio.setOpaque(true);
        btnGuardarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarSocioActionPerformed(evt);
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
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblNoSocio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTituloNoSocio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(btnCteFoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNombreSocio)
                                    .addComponent(lblApPaternoSocio)
                                    .addComponent(lblApMaternoSocio)
                                    .addComponent(txtNombreSocio, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(txtApPaternoSocio)
                                    .addComponent(txtApMaternoSocio))
                                .addGap(18, 18, 18)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblFechaSocio)
                                    .addComponent(lblTelefonoSocio)
                                    .addComponent(txtTelefonoSocio)
                                    .addComponent(lblSexoSocio)
                                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                        .addComponent(rbtMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbtFemenino))
                                    .addComponent(dtcFechaSocio, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(btnCteFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTituloNoSocio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNoSocio))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreSocio)
                            .addComponent(lblFechaSocio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombreSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtcFechaSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblApPaternoSocio)
                                    .addComponent(lblTelefonoSocio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtApPaternoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefonoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblApMaternoSocio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApMaternoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(lblSexoSocio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbtMasculino)
                                    .addComponent(rbtFemenino))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarSocio)
                .addContainerGap())
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

    private void btnCteFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCteFotoActionPerformed
        FITTolFoto imgSocio = new FITTolFoto(this, true);
        imgSocio.setVisible(true);
        valorImg = imgSocio.getValorImg();
        if (valorImg == 1) {
            ImageIcon img = new ImageIcon("src/fittol/imagenes/test.png");
            btnCteFoto.setIcon(new ImageIcon(img.getImage().getScaledInstance(90, 110, Image.SCALE_SMOOTH)));
        }
    }//GEN-LAST:event_btnCteFotoActionPerformed

    private void btnGuardarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarSocioActionPerformed
        String valor = validarCampos();
        if (valor.compareTo("ok") == 0) {
            try {
                cteDAO.guardarSocio(clienteObj());
                JOptionPane.showMessageDialog(this, "Socio Registrado Con Éxito",
                        "Msg BD", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Mensaje de la BD : " + e,
                        "Msg BD", JOptionPane.INFORMATION_MESSAGE);
            } finally {
                limpiarCampos();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Mensaje de la BD : " + valor,
                    "Msg BD", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarSocioActionPerformed
 
    private ClientesVO clienteObj() {  
        
        String sexo = "";
        if (rbtMasculino.isSelected()) {
            sexo = "M";
        }
        if (rbtFemenino.isSelected()) {
            sexo = "F";
        }
        System.out.println("ESTADO DEL S : " + sexo);
        return new ClientesVO(txtNombreSocio.getText(), txtApPaternoSocio.getText(),
                txtApMaternoSocio.getText(), dtcFechaSocio.getDate(), sexo, txtTelefonoSocio.getText(),
                new File("src/fittol/imagenes/test.png"));
    }
    private String validarCampos() {
        if (valorImg != 1) {
            return "Debe tomar una foto";
        } else if (txtNombreSocio.getText().isEmpty()) {
            return "Debe ingresar nombre";
        } else if (txtApPaternoSocio.getText().isEmpty()) {
            return "Debe ingresar apellido paterno";
        } else if (txtApMaternoSocio.getText().isEmpty()) {
            return "Debe ingresar apellido materno";
        } else if (dtcFechaSocio.getDate() == null) {
            return "Ingrese una fecha valida";
        } else if (txtTelefonoSocio.getText().isEmpty()) {
            return "Ingrese un numero valido";
        } else if (rbtFemenino.isSelected() == false && rbtMasculino.isSelected() == false) {
            return "Debe seleccionar sexo";
        } else 
            return "ok";
    }
    private void limpiarCampos() {
        btnCteFoto.setIcon(new ImageIcon("src/fittol/imagenes/BtnNvoUsrB.png"));
        try {
            lblNoSocio.setText(String.valueOf(cteDAO.generarIdSocio()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Mensaje de la BD : " + e,
                    "Msg BD", JOptionPane.PLAIN_MESSAGE);
        }
        txtNombreSocio.setText("");
        txtApPaternoSocio.setText("");
        txtApMaternoSocio.setText("");
        dtcFechaSocio.setCalendar(null);
        txtTelefonoSocio.setText("");
        buttonGroup1.clearSelection();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCteFoto;
    private javax.swing.JButton btnGuardarSocio;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dtcFechaSocio;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApMaternoSocio;
    private javax.swing.JLabel lblApPaternoSocio;
    private javax.swing.JLabel lblFechaSocio;
    private javax.swing.JLabel lblNoSocio;
    private javax.swing.JLabel lblNombreSocio;
    private javax.swing.JLabel lblSexoSocio;
    private javax.swing.JLabel lblTelefonoSocio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloNoSocio;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JRadioButton rbtFemenino;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JTextField txtApMaternoSocio;
    private javax.swing.JTextField txtApPaternoSocio;
    private javax.swing.JTextField txtNombreSocio;
    private javax.swing.JTextField txtTelefonoSocio;
    // End of variables declaration//GEN-END:variables

}
