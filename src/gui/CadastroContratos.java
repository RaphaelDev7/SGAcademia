/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author JAMILIA
 */
public class CadastroContratos extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroContratos
     */
    public CadastroContratos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        campoNomeAluno = new javax.swing.JTextField();
        labelNomeAluno = new javax.swing.JLabel();
        campoNomeAcademia = new javax.swing.JTextField();
        labelNomeAcademia = new javax.swing.JLabel();
        campoDataInicialContrato = new javax.swing.JTextField();
        labelDataInicialContrato = new javax.swing.JLabel();
        campoDataFinalContrato = new javax.swing.JTextField();
        labelDataFinalContrato = new javax.swing.JLabel();
        campoNomePlanoContratado = new javax.swing.JTextField();
        labelNomePlanoContratado = new javax.swing.JLabel();
        labelObservacoesGerais = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        labelNomePlano = new javax.swing.JLabel();
        campoNomePlano = new javax.swing.JTextField();
        botaoImprimir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaObservacoesGerais = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setTitle("Cadastro de Contratos");

        campoNomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeAlunoActionPerformed(evt);
            }
        });

        labelNomeAluno.setText("Nome do Aluno:");

        campoNomeAcademia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeAcademiaActionPerformed(evt);
            }
        });

        labelNomeAcademia.setText("Nome da Academia:");

        campoDataInicialContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataInicialContratoActionPerformed(evt);
            }
        });

        labelDataInicialContrato.setText("Data Inicial do Contrato:");

        campoDataFinalContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataFinalContratoActionPerformed(evt);
            }
        });

        labelDataFinalContrato.setText("Data Final do Contrato:");

        campoNomePlanoContratado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomePlanoContratadoActionPerformed(evt);
            }
        });

        labelNomePlanoContratado.setText("Nome do Plano Contratado:");

        labelObservacoesGerais.setText("Observações Gerais:");

        botaoCadastrar.setText("Cadastrar");

        labelNomePlano.setText("Nome Plano:");

        campoNomePlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomePlanoActionPerformed(evt);
            }
        });

        botaoImprimir.setText("Imprimir");

        textAreaObservacoesGerais.setColumns(20);
        textAreaObservacoesGerais.setRows(5);
        jScrollPane2.setViewportView(textAreaObservacoesGerais);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelNomeAcademia)
                        .addComponent(labelDataInicialContrato)
                        .addComponent(labelDataFinalContrato)
                        .addComponent(labelNomePlanoContratado)
                        .addComponent(labelObservacoesGerais)
                        .addComponent(labelNomeAluno))
                    .addComponent(labelNomePlano, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(campoNomePlano)
                    .addComponent(campoNomeAluno)
                    .addComponent(campoNomeAcademia)
                    .addComponent(campoDataInicialContrato)
                    .addComponent(campoDataFinalContrato)
                    .addComponent(campoNomePlanoContratado))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(botaoImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomePlano)
                    .addComponent(campoNomePlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeAluno)
                    .addComponent(campoNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeAcademia)
                    .addComponent(campoNomeAcademia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataInicialContrato)
                    .addComponent(campoDataInicialContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataFinalContrato)
                    .addComponent(campoDataFinalContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomePlanoContratado)
                    .addComponent(campoNomePlanoContratado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(labelObservacoesGerais)
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoImprimir)
                    .addComponent(botaoCadastrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeAlunoActionPerformed

    private void campoNomeAcademiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeAcademiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeAcademiaActionPerformed

    private void campoDataInicialContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataInicialContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataInicialContratoActionPerformed

    private void campoDataFinalContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataFinalContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataFinalContratoActionPerformed

    private void campoNomePlanoContratadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomePlanoContratadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomePlanoContratadoActionPerformed

    private void campoNomePlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomePlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomePlanoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoImprimir;
    private javax.swing.JTextField campoDataFinalContrato;
    private javax.swing.JTextField campoDataInicialContrato;
    private javax.swing.JTextField campoNomeAcademia;
    private javax.swing.JTextField campoNomeAluno;
    private javax.swing.JTextField campoNomePlano;
    private javax.swing.JTextField campoNomePlanoContratado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelDataFinalContrato;
    private javax.swing.JLabel labelDataInicialContrato;
    private javax.swing.JLabel labelNomeAcademia;
    private javax.swing.JLabel labelNomeAluno;
    private javax.swing.JLabel labelNomePlano;
    private javax.swing.JLabel labelNomePlanoContratado;
    private javax.swing.JLabel labelObservacoesGerais;
    private javax.swing.JTextArea textAreaObservacoesGerais;
    // End of variables declaration//GEN-END:variables
}
