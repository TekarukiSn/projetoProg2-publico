package projetoprog;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class TelaDistancias extends javax.swing.JInternalFrame {

    
    public TelaDistancias() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGerar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtADistancias = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtATempos = new javax.swing.JTextArea();

        BtnGerar.setText("Gerar");
        BtnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGerarActionPerformed(evt);
            }
        });

        jLabel1.setText("Distâncias");

        txtADistancias.setColumns(20);
        txtADistancias.setRows(5);
        jScrollPane1.setViewportView(txtADistancias);

        jLabel2.setText("Tempos de viagem(horas)");

        txtATempos.setColumns(20);
        txtATempos.setRows(5);
        jScrollPane2.setViewportView(txtATempos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(BtnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(60, 60, 60)
                .addComponent(BtnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGerarActionPerformed
        BancoDeDados bd = new BancoDeDados();
        ArrayList<Veiculo> listV = bd.getListaVeiculos();
        ArrayList<Cliente> listC = bd.getListaClientes();
        
        double matD[][] = new double[listC.size() + 1 ][listC.size() + 1];
        double matTV[][] = new double[listC.size() + 1][listC.size() + 1];
        for(int i = 0; i<listC.size(); i++){
            for(int j = 0; j<listC.size(); j++){
                
                    
                
                    double d = sqrt(pow((listC.get(i).getLat() - listC.get(j).getLat()), 2) + pow((listC.get(i).getLongi() - listC.get(j).getLongi()), 2));
                    matD[i][j] = d;
                
            }
        }
        double vm = listV.get(0).getVelMedia();
        for(int i = 0; i<listC.size(); i++){
            for(int j = 0; j<listC.size(); j++){
                double aux = matD[i][j];
                matTV[i][j] = aux/vm;
            }
        }
        DecimalFormat deci = new DecimalFormat("00.00");
        for(int i = 0; i<listC.size(); i++){
            for(int j = 0; j<listC.size(); j++){
                String aux = deci.format(matD[i][j]) + "";
                txtADistancias.append(aux + "; ");
            }
            txtADistancias.append("\n");
        }
        
        
        for(int i = 0; i<listC.size(); i++){
            for(int j = 0; j<listC.size(); j++){
                String aux = deci.format(matTV[i][j]) + "";
                txtATempos.append(aux + "; ");
            }
            txtATempos.append("\n");
        }
        for(int i = 0; i<listC.size(); i++){
            for(int j = 0; j<listC.size(); j++){
               double distancia = matD[i][j];
               double tempo = matTV[i][j];
               bd.addDistancia(distancia);
               bd.addTempos(tempo);
            }
         
        }
        bd.addDistanciasInF();
        bd.addTemposInF();
    }//GEN-LAST:event_BtnGerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtADistancias;
    private javax.swing.JTextArea txtATempos;
    // End of variables declaration//GEN-END:variables
}
