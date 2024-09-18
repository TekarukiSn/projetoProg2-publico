package projetoprog;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Windows
 */
public class TelaRelatorio extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaRelatorio
     */
    public TelaRelatorio() {
        initComponents();
    }
    
 
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ARelatorioV = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ARelatorioC = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbEsc = new javax.swing.JComboBox<>();

        ARelatorioV.setColumns(20);
        ARelatorioV.setRows(5);
        jScrollPane1.setViewportView(ARelatorioV);

        jButton1.setText("Gerar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Gerador de Relatório");

        ARelatorioC.setColumns(20);
        ARelatorioC.setRows(5);
        jScrollPane2.setViewportView(ARelatorioC);

        jLabel1.setText("Clientes");

        jLabel3.setText("Veiculos");

        cmbEsc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "By List", "By File" }));
        cmbEsc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEscItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmbEsc, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(355, 355, 355)
                .addComponent(jLabel1)
                .addGap(211, 211, 211))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(cmbEsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BancoDeDados bd = new BancoDeDados();
        ArrayList<Cliente> listaClientes = new ArrayList<>();
            ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
            ArrayList<Double> listaDistancias = new ArrayList<>();
            ArrayList<Double> listaTempos = new ArrayList<>();
        DecimalFormat deci = new DecimalFormat("00.00");
        String op = (String)cmbEsc.getSelectedItem();
        if(op.equals("By List")){
            listaClientes = bd.getListaClientes();
            listaVeiculos = bd.getListaVeiculos();
            listaDistancias = bd.getListaDistancias();
            listaTempos = bd.getListaTempos();
        } else{
            listaClientes = bd.getClientesInF();
            listaVeiculos = bd.getVeiculoInF();
            listaDistancias = bd.getDistanciasInF();
            listaTempos = bd.getTemposInF();
        }
        
        
        
        
        ARelatorioV.append("Num. Cadastros de Veiculos: " + listaVeiculos.size());
        for(int i = 0; i<listaVeiculos.size(); i++){
            ARelatorioV.append("Num. Veiculos: " + listaVeiculos.get(i).getNumVeiculos() + " \n");
            ARelatorioV.append("Capacidade Veiuclos: " + listaVeiculos.get(i).getCapacVeiculos() + " \n");
            ARelatorioV.append("Volume Carroceria: " + listaVeiculos.get(i).getVolumCarroceria() + " \n");
            ARelatorioV.append("Duracao max. Rota: " + listaVeiculos.get(i).getMaxDuracRota() + " \n");
            ARelatorioV.append("Consumo por km: " + listaVeiculos.get(i).getConsumoPorKm() + " \n");
            ARelatorioV.append("Preco por litro: " + listaVeiculos.get(i).getPrecoPorL() + " \n");
            ARelatorioV.append("Vel. Media frota: " + listaVeiculos.get(i).getVelMedia() + " \n");
            ARelatorioV.append("Latitude Deposito: " + listaVeiculos.get(i).getLatDeposito() + " \n");
            ARelatorioV.append("Longitude Deposito: " + listaVeiculos.get(i).getLongDeposito() + " \n");
            ARelatorioV.append(" -------------------------- \n");
        }
        
        ARelatorioC.append("Num. Cadastros de Clientes: " + listaClientes.size());
        for(int i = 0; i<listaClientes.size(); i++){
            int a = i;
            int c = 1;
            int b = a + 1;
            ARelatorioC.append("Cliente iD: " + c + " \n");
            ARelatorioC.append("Latitude: " + listaClientes.get(i).getLat() + " \n");
            ARelatorioC.append("Longitude: " + listaClientes.get(i).getLongi() + " \n");
            ARelatorioC.append("Data inicial: " + listaClientes.get(i).getDataI() + " \n");
            ARelatorioC.append("Data Final: " + listaClientes.get(i).getDataF() + " \n");
            ARelatorioC.append("Peso Encomenda: " + listaClientes.get(i).getPesoE() + " \n");
            ARelatorioC.append("Volume Encomenda: " + listaClientes.get(i).getVolumeE() + " \n");
            ARelatorioC.append("Valor Encomenda: " + listaClientes.get(i).getValorE() + " \n");
            ARelatorioC.append("Tempo de Servico: " + listaClientes.get(i).getHorasServ() + " \n");
            ARelatorioC.append("Multa por Atraso: " + listaClientes.get(i).getMultaAtraso() + " \n");
            
            if(i == 0){
                ARelatorioC.append("--------------------------- \n");
            }
            else{
                ARelatorioC.append("Distancia entre Cliente n" + a + " e Cliente n " + b + ": " + deci.format(listaDistancias.get(i)) + " \n");
                ARelatorioC.append("Tempo de viagem entre Cliente n" + a + " e Cliente n " + b + ": " + deci.format(listaTempos.get(i)) + " \n");
                ARelatorioC.append("--------------------------- \n");
            }
            c++;
        }
        
        bd.saveReport(listaVeiculos, listaClientes, listaDistancias, listaTempos);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbEscItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEscItemStateChanged
        
    }//GEN-LAST:event_cmbEscItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ARelatorioC;
    private javax.swing.JTextArea ARelatorioV;
    private javax.swing.JComboBox<String> cmbEsc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
