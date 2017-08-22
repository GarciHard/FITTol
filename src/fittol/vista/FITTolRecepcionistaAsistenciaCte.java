package fittol.vista;

import fittol.dao.ClientesDAO;
import fittol.modelo.ClientesVO;
import java.awt.event.KeyEvent;
import static java.lang.Thread.sleep;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;


/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class FITTolRecepcionistaAsistenciaCte extends javax.swing.JDialog {

    private final ClientesDAO cteDAO = new ClientesDAO();
    private ClientesVO cteObj;
    private LocalDate fechaLocal;
    private LocalTime horaLocal;
    
    public FITTolRecepcionistaAsistenciaCte(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        fechaLocal = LocalDate.now();
        lblFecha.setText("Fecha : "
                + fechaLocal.getDayOfMonth() + "/"
                + fechaLocal.getMonthValue() + "/"
                + fechaLocal.getYear());
        Runnable hiloReloj = () -> {
            try {
                while (true) {
                    horaLocal = LocalTime.now();
                    lblHora.setText(horaLocal.getHour()
                            + " : " + horaLocal.getMinute()
                            + " : " + horaLocal.getSecond());
                }
            } catch (Exception e) {
                System.out.println("errorAsistenciaCtesReloj :" + e);
            }
        };
        new Thread(hiloReloj).start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNoSocio = new javax.swing.JLabel();
        txtNoSocio = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblImgSocio = new javax.swing.JLabel();
        lblNombreSocio = new javax.swing.JLabel();
        lblApellidosSocio = new javax.swing.JLabel();
        scpMsgSocio = new javax.swing.JScrollPane();
        txaMsgSocio = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlBackground.setBackground(new java.awt.Color(245, 245, 245));

        lblTitulo.setFont(new java.awt.Font("Heiti TC", 0, 36)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fittol/imagenes/FITTolLogo_v3.png"))); // NOI18N
        lblTitulo.setText("Registro de asistencia");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lblNoSocio.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblNoSocio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNoSocio.setText("No. Socio :");

        txtNoSocio.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        txtNoSocio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNoSocio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNoSocioKeyPressed(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("jLabel2");

        lblHora.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora.setText("jLabel3");

        lblImgSocio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreSocio.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblNombreSocio.setText("Nombre : ");

        lblApellidosSocio.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        lblApellidosSocio.setText("Apellidos : ");

        txaMsgSocio.setEditable(false);
        txaMsgSocio.setColumns(20);
        txaMsgSocio.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        txaMsgSocio.setRows(5);
        txaMsgSocio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mensajes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Heiti TC", 0, 13))); // NOI18N
        scpMsgSocio.setViewportView(txaMsgSocio);

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(lblTitulo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNoSocio)
                            .addComponent(lblNoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 245, Short.MAX_VALUE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImgSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNombreSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblApellidosSocio, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(scpMsgSocio))))
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(lblHora))
                .addGap(18, 18, 18)
                .addComponent(lblNoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblImgSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblNombreSocio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblApellidosSocio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scpMsgSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
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

    private void txtNoSocioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoSocioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                cteObj = cteDAO.datosAsistencia(txtNoSocio.getText());
                if (cteObj != null) {
                    lblImgSocio.setIcon(cteObj.getCteFotoLeer());
                    lblNombreSocio.setText("Nombre : " + cteObj.getCteNombre());
                    lblApellidosSocio.setText("Apellidos : " + cteObj.getCteApPaterno() + " " + cteObj.getCteApMaterno());
                    
                    int msgBD = Integer.parseInt(cteDAO.msgSocioAsistencia(txtNoSocio.getText()));
                    
                    switch (msgBD) {
                        case 0:
                            txaMsgSocio.append("LA MEMBRESIA HA VENCIDO");
                            break;
                        case 10:
                            txaMsgSocio.append("EL SOCIO NO TIENE UNA MEMBRESIA ASOCIADA");
                            break;
                        default:
                            cteDAO.insertAsistenciaSocio(txtNoSocio.getText());
                            txaMsgSocio.append("FALTAN " + msgBD + " DÍAS PARA QUE CADUQUE LA MEMBRESIA");
                            Runnable hiloDialog = () -> {
                                for (int i = 0; i < 15; i++) {try {
                                    sleep(1000);
                                    } catch (InterruptedException ex) {}
                                }
                                this.dispose();
                            };
                            new Thread(hiloDialog).start();
                            break;
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Mensaje de la BD : " + e,
                        "Msg BD", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtNoSocioKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellidosSocio;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblImgSocio;
    private javax.swing.JLabel lblNoSocio;
    private javax.swing.JLabel lblNombreSocio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JScrollPane scpMsgSocio;
    private javax.swing.JTextArea txaMsgSocio;
    private javax.swing.JTextField txtNoSocio;
    // End of variables declaration//GEN-END:variables

}
