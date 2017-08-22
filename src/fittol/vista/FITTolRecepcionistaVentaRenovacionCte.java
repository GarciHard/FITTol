package fittol.vista;


/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class FITTolRecepcionistaVentaRenovacionCte extends javax.swing.JDialog {

    private final String numSocio;
    private final String empID;
    
    public FITTolRecepcionistaVentaRenovacionCte(java.awt.Dialog parent, boolean modal, String numSocio, String empID) {
        super(parent, modal);
        initComponents();
        this.numSocio = numSocio;
        this.empID = empID;
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
        lblMembresiaActual = new javax.swing.JLabel();
        lblFechaInicioOldM = new javax.swing.JLabel();
        lblFechaFinOldM = new javax.swing.JLabel();
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
        lblTitulo.setText("Renovación Socio");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lblImgCte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreCte.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblNombreCte.setText("Nombre : ");

        lblApellidosCte.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblApellidosCte.setText("Apellidos : ");

        lblMemberSince.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblMemberSince.setText("Miembro desde : ");

        lblMembresiaActual.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblMembresiaActual.setText("Membresia Actual : ");

        lblFechaInicioOldM.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblFechaInicioOldM.setText("Fecha Inicio : ");

        lblFechaFinOldM.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblFechaFinOldM.setText("Fecha Vencimiento : ");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        lblMembresiaTitulo.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblMembresiaTitulo.setText("Membresia : ");

        cmbMembresiaNombre.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        cmbMembresiaNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblMembresiaCosto.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblMembresiaCosto.setText("Costo : ");

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
                            .addComponent(lblMemberSince, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMembresiaActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFechaInicioOldM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFechaFinOldM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator2)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblMembresiaTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(cmbMembresiaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMembresiaCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(0, 88, Short.MAX_VALUE))
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
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblNombreCte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblApellidosCte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMemberSince)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMembresiaActual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFechaInicioOldM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFechaFinOldM))
                    .addComponent(lblImgCte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbMembresiaNombre;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblApellidosCte;
    private javax.swing.JLabel lblFechaFinNewM;
    private javax.swing.JLabel lblFechaFinOldM;
    private javax.swing.JLabel lblFechaInicioNewM;
    private javax.swing.JLabel lblFechaInicioOldM;
    private javax.swing.JLabel lblImgCte;
    private javax.swing.JLabel lblMemberSince;
    private javax.swing.JLabel lblMembresiaActual;
    private javax.swing.JLabel lblMembresiaCosto;
    private javax.swing.JLabel lblMembresiaTitulo;
    private javax.swing.JLabel lblNombreCte;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlBackground;
    // End of variables declaration//GEN-END:variables

}
