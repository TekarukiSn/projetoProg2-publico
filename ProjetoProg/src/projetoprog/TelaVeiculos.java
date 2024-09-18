package projetoprog;

import javax.swing.JOptionPane;


public class TelaVeiculos extends javax.swing.JInternalFrame {

    public TelaVeiculos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumVeiculos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCapacidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtVolMax = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTempMaxRotas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtLat = new javax.swing.JTextField();
        txtLong = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtConsumo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtVelMedia = new javax.swing.JTextField();
        btnCadastroVeiculos = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Cadastrar Veiculos");

        jLabel2.setText("Num. Veiculos:");

        txtNumVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumVeiculosActionPerformed(evt);
            }
        });

        jLabel3.setText("Capacidade (kg):");

        jLabel4.setText("Vol. Máx:");

        jLabel5.setText("Temp. Máx. Rotas:");

        jLabel6.setText("Local. Depósito:");

        jLabel7.setText("Latitude (graus) :");

        jLabel8.setText("Longitude (graus):");

        jLabel9.setText("Consumo L/Km:");

        jLabel10.setText("Preço/L:");

        jLabel11.setText("Vel. Média Frota:");

        btnCadastroVeiculos.setText("Cadastrar");
        btnCadastroVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroVeiculosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(277, 277, 277)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNumVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTempMaxRotas))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(txtVolMax, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtLong, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                            .addComponent(txtLat))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtConsumo)
                            .addComponent(txtPreco)
                            .addComponent(txtVelMedia, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(btnCadastroVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtVolMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtVelMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTempMaxRotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtLong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnCadastroVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumVeiculosActionPerformed
        
    }//GEN-LAST:event_txtNumVeiculosActionPerformed

    private void btnCadastroVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroVeiculosActionPerformed
        try{
            int numVeiculos = Integer.parseInt(txtNumVeiculos.getText());
            double capacidadeVeiculos = Double.parseDouble(txtCapacidade.getText());
            double volMax = Double.parseDouble(txtVolMax.getText());
            int tempRota = Integer.parseInt(txtTempMaxRotas.getText());
            double lat = Double.parseDouble(txtLat.getText());
            double longi = Double.parseDouble(txtLong.getText());
            double consumoPorKm = Double.parseDouble(txtConsumo.getText());
            double precoPorL = Double.parseDouble(txtPreco.getText());
            double velMedia = Double.parseDouble(txtVelMedia.getText());
            BancoDeDados bd = new BancoDeDados();
            Veiculo veiculo = new Veiculo(numVeiculos, capacidadeVeiculos, volMax, tempRota, lat, longi, consumoPorKm, precoPorL, velMedia);
            bd.addVeiculosInF(veiculo);
            bd.addVeiculo(veiculo);
            JOptionPane.showMessageDialog(null, "Veiculo cadastrado com sucesso!");
        }catch(IllegalArgumentException ex){
            JOptionPane.showMessageDialog(null, "Valores digitados são inválidos: ");
        }finally{
            this.dispose();
        }
        
    }//GEN-LAST:event_btnCadastroVeiculosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroVeiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCapacidade;
    private javax.swing.JTextField txtConsumo;
    private javax.swing.JTextField txtLat;
    private javax.swing.JTextField txtLong;
    private javax.swing.JTextField txtNumVeiculos;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtTempMaxRotas;
    private javax.swing.JTextField txtVelMedia;
    private javax.swing.JTextField txtVolMax;
    // End of variables declaration//GEN-END:variables
}
