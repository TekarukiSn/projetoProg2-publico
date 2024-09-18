package projetoprog;

import java.awt.Color;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TelaClientes extends javax.swing.JInternalFrame {

    
    public TelaClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtVolEnc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDataI = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDataF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtValorEnc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMulta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTempServ = new javax.swing.JTextField();
        btnCadastroCliente = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Cadastrar Clientes");

        jLabel2.setText("Latitude (graus):");

        jLabel3.setText("Longitude (graus):");

        jLabel4.setText("Peso Encomenda:");

        jLabel5.setText("Vol. Eencomenda:");

        jLabel6.setText("Data entrega ini:");

        txtDataI.setForeground(new java.awt.Color(153, 153, 153));
        txtDataI.setText("dd/MM/yyyy HH:mm");
        txtDataI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataIFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataIFocusLost(evt);
            }
        });
        txtDataI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataIActionPerformed(evt);
            }
        });

        jLabel7.setText("Data entrega fin:");

        txtDataF.setForeground(new java.awt.Color(153, 153, 153));
        txtDataF.setText("dd/MM/yyyy HH:mm");
        txtDataF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataFFocusLost(evt);
            }
        });
        txtDataF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataFActionPerformed(evt);
            }
        });

        jLabel8.setText("Valor Encomenda:");

        jLabel9.setText("Multa por atraso(%):");

        jLabel10.setText("Temp. Serv:");

        btnCadastroCliente.setText("Cadastrar");
        btnCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLat, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtVolEnc, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLong)))
                                .addGap(209, 209, 209)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtValorEnc, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMulta))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTempServ))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDataF))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDataI, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(btnCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtValorEnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(txtTempServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVolEnc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDataI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtDataF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(btnCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroClienteActionPerformed
        try{
            double lat = Double.parseDouble(txtLat.getText());
            double longi = Double.parseDouble(txtLong.getText());
            double pesoE = Double.parseDouble(txtPeso.getText());
            double volE = Double.parseDouble(txtVolEnc.getText());
            DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            String dataI = txtDataI.getText();
            String dataF = txtDataF.getText();
            LocalDateTime dI = LocalDateTime.parse(dataI, fmt1);
            LocalDateTime dF = LocalDateTime.parse(dataF, fmt1);
            Duration d = Duration.between(dI, dF);
            if(d.toMinutes() < 0){
                throw new IllegalArgumentException("Data invalida!");
            }
            double valorEnc = Double.parseDouble(txtValorEnc.getText());
            double multaAtraso = Double.parseDouble(txtMulta.getText());
            int tempServ = Integer.parseInt(txtTempServ.getText());
            BancoDeDados bd = new BancoDeDados();
            Cliente cliente = new Cliente(lat, longi, pesoE, volE, dataI, dataF, valorEnc, multaAtraso, tempServ);
            bd.addClienteInF(cliente);
            bd.addCliente(cliente);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        }catch(IllegalArgumentException ex){
            JOptionPane.showMessageDialog(null, "valores digitados são inválidos!");
        }catch(DateTimeParseException ex){
            JOptionPane.showMessageDialog(null, "Horario digitado é inválido!");
        }finally{
            this.dispose();
        }
    }//GEN-LAST:event_btnCadastroClienteActionPerformed


    private void txtDataIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataIActionPerformed

    private void txtDataIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataIFocusGained
        if(txtDataI.getText().equals("dd/MM/yyyy HH:mm")){
           txtDataI.setText("");
           txtDataI.setForeground(new Color(153,153,153));
        }
        txtDataI.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_txtDataIFocusGained

    private void txtDataIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataIFocusLost
        if(txtDataI.getText().equals("")){
           txtDataI.setText("dd/MM/yyyy HH:mm");
           txtDataI.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtDataIFocusLost

    private void txtDataFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataFActionPerformed

    private void txtDataFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataFFocusGained
        if(txtDataF.getText().equals("dd/MM/yyyy HH:mm")){
           txtDataF.setText("");
           txtDataF.setForeground(new Color(153,153,153));
        }
        txtDataF.setForeground(new Color(0,0,0));
    
    }//GEN-LAST:event_txtDataFFocusGained

    private void txtDataFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataFFocusLost
       if(txtDataF.getText().equals("")){
           txtDataF.setText("dd/MM/yyyy HH:mm");
           txtDataF.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtDataFFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDataF;
    private javax.swing.JTextField txtDataI;
    private javax.swing.JTextField txtLat;
    private javax.swing.JTextField txtLong;
    private javax.swing.JTextField txtMulta;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTempServ;
    private javax.swing.JTextField txtValorEnc;
    private javax.swing.JTextField txtVolEnc;
    // End of variables declaration//GEN-END:variables
}
