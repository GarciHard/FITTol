package fittol.vista;

import fittol.dao.ConexionDB;
import fittol.modelo.ClientesVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 * Hecho con <3 por:
 * @author GarciHard
 */

public class FITTolRecepcionistaListCte extends javax.swing.JDialog {

    private ClientesVO temp = new ClientesVO();
    private DefaultTableModel modelTemp;
    private int b;
    private String whereTemp;
    private String[] busquedaTemp;
    private ArrayList<ClientesVO> listPelis;
    protected ConexionDB connection = new ConexionDB();
        
    public FITTolRecepcionistaListCte(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            connection.conectar();
        } catch (Exception e) {
        }
        modelTemp = (DefaultTableModel) pelis.getModel();
        buscar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        busqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pelis = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                busquedaKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busquedaKeyReleased(evt);
            }
        });

        pelis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID SOCIO", "NOMBRE", "AP PATERNO", "AP MATERNO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pelis);

        jLabel1.setFont(new java.awt.Font("Heiti TC", 0, 14)); // NOI18N
        jLabel1.setText("Buscar : ");

        jLabel2.setFont(new java.awt.Font("Heiti SC", 0, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fittol/imagenes/FITTolLogo_v3.png"))); // NOI18N
        jLabel2.setText("Consultar Socios");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busqueda))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
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

    private void busquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyTyped
        // TODO add your handling code here:
        if ((busqueda.getText().toUpperCase().isEmpty() && evt.getKeyChar() + "" == " ") || !temp.regExp(evt.getKeyChar() + "", "[ñÑ0-9\\w.\\s,\\+\\-]")) {
            evt.consume();
        }
    }//GEN-LAST:event_busquedaKeyTyped

    private void busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busquedaKeyReleased
        // TODO add your handling code here:
        if (busqueda.getText().toUpperCase().trim().isEmpty()) {
            if (!busqueda.getText().toUpperCase().isEmpty()) {
                busqueda.setText("");
            }
        }
        buscar();
    }//GEN-LAST:event_busquedaKeyReleased

    private void vaciarPelis() {
        int a = pelis.getModel().getRowCount() - 1;  //Índices van de 0 a n-1
        //System.out.println("Tabla "+a);   //Para mostrar por consola el resultado
        for (int i = a; i >= 0; i--) {

            //System.out.println("i "+i);    //Para mostrar por consola el resultado
            modelTemp.removeRow(i);
        }
    }

    public void buscar() {
        vaciarPelis();
        if (buscarProductos(busqueda.getText().toUpperCase().compareTo("") == 0 ? "%" : busqueda.getText().toUpperCase()) != null) {
            b = 0;
            while (b < listPelis.size()) {
                temp = listPelis.get(b);
                modelTemp.addRow(new Object[]{temp.getCteId(), temp.getCteNombre(), temp.getCteApPaterno(), temp.getCteApMaterno()});
                b++;
            }
        }
    }

    private ArrayList<ClientesVO> buscarProductos(String busqueda) {
        busqueda = busqueda.trim();
        busqueda = temp.regReplace(busqueda, "\\s+", " ");
        busquedaTemp = temp.regSplit(busqueda, "\\s");
        whereTemp = "";
        for (String busca : busquedaTemp) {
            if (!whereTemp.isEmpty()) {
                whereTemp += ") AND (";
            } else {
                whereTemp += "(";
            }
            try {
                whereTemp += "UPPER(cte_id) LIKE '%" + busca
                        + "%' OR UPPER(cte_nombre) LIKE '%" + busca
                        + "%' OR UPPER(cte_appaterno) LIKE '%" + busca
                        + "%' OR UPPER(cte_apmaterno) LIKE '%" + busca
                        + "%' OR UPPER(cte_nombre ||' '|| cte_appaterno) LIKE '%" + busca
                        + "%' OR UPPER(cte_nombre ||' '|| cte_apmaterno) LIKE '%" + busca
                        + "%' OR UPPER(cte_nombre ||' '|| cte_appaterno ||' '|| cte_apmaterno) LIKE '%" + busca
                        + "%' OR UPPER(cte_appaterno ||' '|| cte_apmaterno) LIKE '%" + busca + "'";
            } catch (Exception ex) {
            }
        }
        whereTemp += ")";
        try {
            whereTemp = "SELECT * from clientes WHERE " + whereTemp;
            PreparedStatement consulta = connection.getConexion().prepareStatement(whereTemp);
            ResultSet res = consulta.executeQuery();
            b = 0;
            listPelis = new ArrayList<ClientesVO>();
            while (res.next()) {
                temp = new ClientesVO();
                temp.setCteId(res.getString("cte_id"));
                temp.setCteNombre(res.getString("cte_nombre"));
                temp.setCteApPaterno(res.getString("cte_appaterno"));
                temp.setCteApMaterno(res.getString("cte_apmaterno"));

                listPelis.add(temp);
                b++;
            }
            if (b > 0) {
                return listPelis;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField busqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable pelis;
    private javax.swing.JPanel pnlBackground;
    // End of variables declaration//GEN-END:variables

}
