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
public class CadastroAvaliacoes extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroAvaliacoes
     */
    public CadastroAvaliacoes() {
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

        campoDataAvaliacao = new javax.swing.JTextField();
        labelDataAvaliacao = new javax.swing.JLabel();
        campoBracoEsquerdo = new javax.swing.JTextField();
        labelBracoEsquerdo = new javax.swing.JLabel();
        campoBracoDireito = new javax.swing.JTextField();
        labelBracoDireito = new javax.swing.JLabel();
        campoPernaEsquerda = new javax.swing.JTextField();
        labelPernaEsquerda = new javax.swing.JLabel();
        campoPernaDireita = new javax.swing.JTextField();
        labelPernaDireita = new javax.swing.JLabel();
        labelAbdomen = new javax.swing.JLabel();
        campoAbdomen = new javax.swing.JTextField();
        labelPeito = new javax.swing.JLabel();
        campoPeito = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        labelNomeAluno = new javax.swing.JLabel();
        campoNomeAluno = new javax.swing.JTextField();

        setTitle("Cadastro de Avaliações");

        campoDataAvaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataAvaliacaoActionPerformed(evt);
            }
        });

        labelDataAvaliacao.setText("Data avaliação:");

        campoBracoEsquerdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBracoEsquerdoActionPerformed(evt);
            }
        });

        labelBracoEsquerdo.setText("Braço esquerdo:");

        campoBracoDireito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBracoDireitoActionPerformed(evt);
            }
        });

        labelBracoDireito.setText("Braço direito:");

        campoPernaEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPernaEsquerdaActionPerformed(evt);
            }
        });

        labelPernaEsquerda.setText("Perna esquerda:");

        campoPernaDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPernaDireitaActionPerformed(evt);
            }
        });

        labelPernaDireita.setText("Perna direita:");

        labelAbdomen.setText("Abdomem:");

        campoAbdomen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAbdomenActionPerformed(evt);
            }
        });

        labelPeito.setText("Peito:");

        campoPeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPeitoActionPerformed(evt);
            }
        });

        botaoCadastrar.setText("Cadastrar");

        labelNomeAluno.setText("Nome aluno:");

        campoNomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelBracoEsquerdo)
                            .addComponent(labelBracoDireito)
                            .addComponent(labelPernaEsquerda)
                            .addComponent(labelPernaDireita)
                            .addComponent(labelAbdomen)
                            .addComponent(labelDataAvaliacao)
                            .addComponent(labelPeito))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDataAvaliacao)
                            .addComponent(campoBracoEsquerdo)
                            .addComponent(campoBracoDireito)
                            .addComponent(campoPernaEsquerda)
                            .addComponent(campoPernaDireita)
                            .addComponent(campoAbdomen)
                            .addComponent(campoPeito)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addComponent(labelNomeAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeAluno)
                    .addComponent(campoNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataAvaliacao)
                    .addComponent(campoDataAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBracoEsquerdo)
                    .addComponent(campoBracoEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBracoDireito)
                    .addComponent(campoBracoDireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPernaEsquerda)
                    .addComponent(campoPernaEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPernaDireita)
                    .addComponent(campoPernaDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAbdomen)
                    .addComponent(campoAbdomen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPeito)
                    .addComponent(campoPeito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(botaoCadastrar)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoDataAvaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataAvaliacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataAvaliacaoActionPerformed

    private void campoBracoEsquerdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBracoEsquerdoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBracoEsquerdoActionPerformed

    private void campoBracoDireitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBracoDireitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBracoDireitoActionPerformed

    private void campoPernaEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPernaEsquerdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPernaEsquerdaActionPerformed

    private void campoPernaDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPernaDireitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPernaDireitaActionPerformed

    private void campoAbdomenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAbdomenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAbdomenActionPerformed

    private void campoPeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPeitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPeitoActionPerformed

    private void campoNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeAlunoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JTextField campoAbdomen;
    private javax.swing.JTextField campoBracoDireito;
    private javax.swing.JTextField campoBracoEsquerdo;
    private javax.swing.JTextField campoDataAvaliacao;
    private javax.swing.JTextField campoNomeAluno;
    private javax.swing.JTextField campoPeito;
    private javax.swing.JTextField campoPernaDireita;
    private javax.swing.JTextField campoPernaEsquerda;
    private javax.swing.JLabel labelAbdomen;
    private javax.swing.JLabel labelBracoDireito;
    private javax.swing.JLabel labelBracoEsquerdo;
    private javax.swing.JLabel labelDataAvaliacao;
    private javax.swing.JLabel labelNomeAluno;
    private javax.swing.JLabel labelPeito;
    private javax.swing.JLabel labelPernaDireita;
    private javax.swing.JLabel labelPernaEsquerda;
    // End of variables declaration//GEN-END:variables
}