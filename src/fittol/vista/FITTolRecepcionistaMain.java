package fittol.vista;

import fittol.modelo.EmpleadosVO;
import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;

/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class FITTolRecepcionistaMain extends javax.swing.JFrame {

    private final String empId;
    
    public FITTolRecepcionistaMain(EmpleadosVO empObj) throws IOException {
        initComponents();
        empId = empObj.getEmpId();
        lblEmpNombre.setText(empObj.getEmpNombre());
        lblEmpApPaterno.setText(empObj.getEmpApPaterno());
        lblEmpFoto.setIcon(new ImageIcon(empObj.getEmpFotoLeer().getScaledInstance(90, 90, Image.SCALE_SMOOTH)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblEmpNombre = new javax.swing.JLabel();
        lblEmpApPaterno = new javax.swing.JLabel();
        lblEmpFoto = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnAsistencia = new javax.swing.JButton();
        btnPagos = new javax.swing.JButton();
        btnNvoCte = new javax.swing.JButton();
        btnConsultarCte = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlBackground.setBackground(new java.awt.Color(245, 245, 245));

        lblTitulo.setFont(new java.awt.Font("Heiti TC", 0, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fittol/imagenes/FITTolLogo_v3.png"))); // NOI18N
        lblTitulo.setText("FITTol Recepción");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lblEmpNombre.setFont(new java.awt.Font("Heiti TC", 1, 24)); // NOI18N
        lblEmpNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblEmpApPaterno.setFont(new java.awt.Font("Heiti TC", 0, 18)); // NOI18N
        lblEmpApPaterno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblEmpFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pnlBotones.setBackground(new java.awt.Color(245, 245, 245));
        pnlBotones.setLayout(new java.awt.GridLayout(2, 3, 50, 50));

        btnAsistencia.setBackground(new java.awt.Color(52, 152, 219));
        btnAsistencia.setFont(new java.awt.Font("Heiti TC", 1, 14)); // NOI18N
        btnAsistencia.setForeground(new java.awt.Color(255, 255, 255));
        btnAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fittol/imagenes/BtnAsistenciaW.png"))); // NOI18N
        btnAsistencia.setText("Registrar Asistencia");
        btnAsistencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAsistencia.setContentAreaFilled(false);
        btnAsistencia.setOpaque(true);
        btnAsistencia.setPreferredSize(new java.awt.Dimension(200, 100));
        btnAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenciaActionPerformed(evt);
            }
        });
        pnlBotones.add(btnAsistencia);

        btnPagos.setBackground(new java.awt.Color(231, 76, 60));
        btnPagos.setFont(new java.awt.Font("Heiti TC", 1, 14)); // NOI18N
        btnPagos.setForeground(new java.awt.Color(255, 255, 255));
        btnPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fittol/imagenes/BtnPagosW.png"))); // NOI18N
        btnPagos.setText("Pagos");
        btnPagos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnPagos.setContentAreaFilled(false);
        btnPagos.setOpaque(true);
        btnPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagosActionPerformed(evt);
            }
        });
        pnlBotones.add(btnPagos);

        btnNvoCte.setBackground(new java.awt.Color(26, 188, 156));
        btnNvoCte.setFont(new java.awt.Font("Heiti TC", 1, 14)); // NOI18N
        btnNvoCte.setForeground(new java.awt.Color(255, 255, 255));
        btnNvoCte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fittol/imagenes/BtnNvoCteW.png"))); // NOI18N
        btnNvoCte.setText("Nuevo Socio");
        btnNvoCte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnNvoCte.setContentAreaFilled(false);
        btnNvoCte.setOpaque(true);
        btnNvoCte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNvoCteActionPerformed(evt);
            }
        });
        pnlBotones.add(btnNvoCte);

        btnConsultarCte.setBackground(new java.awt.Color(157, 68, 118));
        btnConsultarCte.setFont(new java.awt.Font("Heiti TC", 1, 14)); // NOI18N
        btnConsultarCte.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarCte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fittol/imagenes/BntConsultaCteW.png"))); // NOI18N
        btnConsultarCte.setText("Consultar Socio");
        btnConsultarCte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnConsultarCte.setContentAreaFilled(false);
        btnConsultarCte.setOpaque(true);
        btnConsultarCte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCteActionPerformed(evt);
            }
        });
        pnlBotones.add(btnConsultarCte);

        jButton4.setBackground(new java.awt.Color(255, 159, 44));
        jButton4.setFont(new java.awt.Font("Heiti TC", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Dietas");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton4.setContentAreaFilled(false);
        jButton4.setOpaque(true);
        pnlBotones.add(jButton4);

        jButton6.setBackground(new java.awt.Color(112, 86, 184));
        jButton6.setFont(new java.awt.Font("Heiti TC", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Rutinas");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton6.setContentAreaFilled(false);
        jButton6.setOpaque(true);
        pnlBotones.add(jButton6);

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEmpNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(lblEmpApPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmpFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEmpFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblEmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmpApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
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

    private void btnNvoCteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNvoCteActionPerformed
        new FITTolRecepcionistaNvoCte(this, true).setVisible(true);
    }//GEN-LAST:event_btnNvoCteActionPerformed

    private void btnAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistenciaActionPerformed
        new FITTolRecepcionistaAsistenciaCte(this, true).setVisible(true);
    }//GEN-LAST:event_btnAsistenciaActionPerformed

    private void btnPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagosActionPerformed
        new FITTolRecepcionistaVentaCte(this, true, empId).setVisible(true);
    }//GEN-LAST:event_btnPagosActionPerformed

    private void btnConsultarCteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCteActionPerformed
        new FITTolRecepcionistaListCte(this, true).setVisible(true);
    }//GEN-LAST:event_btnConsultarCteActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsistencia;
    private javax.swing.JButton btnConsultarCte;
    private javax.swing.JButton btnNvoCte;
    private javax.swing.JButton btnPagos;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEmpApPaterno;
    private javax.swing.JLabel lblEmpFoto;
    private javax.swing.JLabel lblEmpNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlBotones;
    // End of variables declaration//GEN-END:variables

}
