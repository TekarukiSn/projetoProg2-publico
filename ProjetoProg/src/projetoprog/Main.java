package projetoprog;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCadastro = new javax.swing.JMenu();
        cadastroVeiculos = new javax.swing.JMenuItem();
        cadastroClientes = new javax.swing.JMenuItem();
        cadastroDistancias = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        GerarRelatorio = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Otimização = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        mnuCadastro.setText("Cadastro");

        cadastroVeiculos.setText("Veiculos");
        cadastroVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroVeiculosActionPerformed(evt);
            }
        });
        mnuCadastro.add(cadastroVeiculos);

        cadastroClientes.setText("Clientes");
        cadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroClientesActionPerformed(evt);
            }
        });
        mnuCadastro.add(cadastroClientes);

        cadastroDistancias.setText("Distancias");
        cadastroDistancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroDistanciasActionPerformed(evt);
            }
        });
        mnuCadastro.add(cadastroDistancias);

        jMenuBar1.add(mnuCadastro);

        jMenu2.setText("Relatorio");

        GerarRelatorio.setText("Gerar");
        GerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarRelatorioActionPerformed(evt);
            }
        });
        jMenu2.add(GerarRelatorio);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Entrega");

        Otimização.setText("Otimização");
        Otimização.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtimizaçãoActionPerformed(evt);
            }
        });
        jMenu1.add(Otimização);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroVeiculosActionPerformed
        TelaVeiculos telaInterna = new TelaVeiculos();
        desktop.add(telaInterna);
        telaInterna.setVisible(true);
        telaInterna.setClosable(true);
    }//GEN-LAST:event_cadastroVeiculosActionPerformed

    private void cadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroClientesActionPerformed
        TelaClientes telaInterna = new TelaClientes();
        desktop.add(telaInterna);
        telaInterna.setVisible(true);
        telaInterna.setClosable(true);
    }//GEN-LAST:event_cadastroClientesActionPerformed

    private void cadastroDistanciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroDistanciasActionPerformed
        TelaDistancias telaInterna = new TelaDistancias();
        desktop.add(telaInterna);
        telaInterna.setVisible(true);
        telaInterna.setClosable(true);
    }//GEN-LAST:event_cadastroDistanciasActionPerformed

    private void GerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarRelatorioActionPerformed
        TelaRelatorio telaInterna = new TelaRelatorio();
        desktop.add(telaInterna);
        telaInterna.setVisible(true);
        telaInterna.setClosable(true);
        
        
    }//GEN-LAST:event_GerarRelatorioActionPerformed

    private void OtimizaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtimizaçãoActionPerformed
        OtimizacaoEntrega telaInterna = new OtimizacaoEntrega();
        desktop.add(telaInterna);
        telaInterna.setVisible(true);
        telaInterna.setClosable(true);
    }//GEN-LAST:event_OtimizaçãoActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem GerarRelatorio;
    private javax.swing.JMenuItem Otimização;
    private javax.swing.JMenuItem cadastroClientes;
    private javax.swing.JMenuItem cadastroDistancias;
    private javax.swing.JMenuItem cadastroVeiculos;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuCadastro;
    // End of variables declaration//GEN-END:variables
}
