package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Arvore;

public class TelaPrincipal extends javax.swing.JFrame {

    Arvore arvore;

    public TelaPrincipal() {
        initComponents();
        arvore = new Arvore();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIrmao8 = new javax.swing.JLabel();
        txtIrmao7 = new javax.swing.JLabel();
        txtIrmao6 = new javax.swing.JLabel();
        txtIrmao5 = new javax.swing.JLabel();
        txtIrmao4 = new javax.swing.JLabel();
        txtIrmao3 = new javax.swing.JLabel();
        txtIrmao2 = new javax.swing.JLabel();
        txtIrmao1 = new javax.swing.JLabel();
        presente8 = new javax.swing.JLabel();
        presente7 = new javax.swing.JLabel();
        presente6 = new javax.swing.JLabel();
        presente5 = new javax.swing.JLabel();
        presente4 = new javax.swing.JLabel();
        presente3 = new javax.swing.JLabel();
        presente2 = new javax.swing.JLabel();
        presente1 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtFilho4 = new javax.swing.JLabel();
        txtFilho3 = new javax.swing.JLabel();
        txtFilho2 = new javax.swing.JLabel();
        txtFilho1 = new javax.swing.JLabel();
        txtPai2 = new javax.swing.JLabel();
        txtPai1 = new javax.swing.JLabel();
        txtAvo = new javax.swing.JLabel();
        bola7 = new javax.swing.JLabel();
        bola6 = new javax.swing.JLabel();
        bola5 = new javax.swing.JLabel();
        bola4 = new javax.swing.JLabel();
        bola3 = new javax.swing.JLabel();
        bola2 = new javax.swing.JLabel();
        bola1 = new javax.swing.JLabel();
        arvoreIMG = new javax.swing.JLabel();
        btnDeletar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador de Arvore Binaria");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(820, 460));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIrmao8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtIrmao8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtIrmao8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 60, 20));

        txtIrmao7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtIrmao7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtIrmao7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 60, 20));

        txtIrmao6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtIrmao6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtIrmao6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 60, 20));

        txtIrmao5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtIrmao5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtIrmao5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 60, 20));

        txtIrmao4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtIrmao4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtIrmao4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 60, 20));

        txtIrmao3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtIrmao3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtIrmao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 60, 20));

        txtIrmao2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtIrmao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtIrmao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 60, 20));

        txtIrmao1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtIrmao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtIrmao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 60, 20));

        presente8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/presente4.png"))); // NOI18N
        getContentPane().add(presente8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        presente7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/presente4.png"))); // NOI18N
        getContentPane().add(presente7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        presente6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/presente.png"))); // NOI18N
        getContentPane().add(presente6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        presente5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/presente.png"))); // NOI18N
        getContentPane().add(presente5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        presente4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/presente4.png"))); // NOI18N
        getContentPane().add(presente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        presente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/presente4.png"))); // NOI18N
        getContentPane().add(presente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        presente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/presente.png"))); // NOI18N
        getContentPane().add(presente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        presente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/presente.png"))); // NOI18N
        getContentPane().add(presente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        lblStatus.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 330, 40));

        lblValor.setBackground(new java.awt.Color(0, 0, 0));
        lblValor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblValor.setText("     Valor:     ");
        lblValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        txtValor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValor.setToolTipText("Digite apenas números.");
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 250, 40));

        txtFilho4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtFilho4.setForeground(new java.awt.Color(0, 0, 102));
        txtFilho4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtFilho4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 60, 40));

        txtFilho3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtFilho3.setForeground(new java.awt.Color(0, 0, 51));
        txtFilho3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtFilho3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 60, 40));

        txtFilho2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtFilho2.setForeground(new java.awt.Color(0, 0, 102));
        txtFilho2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtFilho2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 60, 40));

        txtFilho1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtFilho1.setForeground(new java.awt.Color(0, 0, 51));
        txtFilho1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtFilho1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 60, 40));

        txtPai2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPai2.setForeground(new java.awt.Color(255, 255, 255));
        txtPai2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtPai2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 60, 40));

        txtPai1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPai1.setForeground(new java.awt.Color(255, 255, 255));
        txtPai1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtPai1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 60, 40));

        txtAvo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtAvo.setForeground(new java.awt.Color(255, 255, 255));
        txtAvo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtAvo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 60, 40));

        bola7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bola7.png"))); // NOI18N
        getContentPane().add(bola7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        bola6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bola6.png"))); // NOI18N
        getContentPane().add(bola6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        bola5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bola5.png"))); // NOI18N
        getContentPane().add(bola5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        bola4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bola4.png"))); // NOI18N
        getContentPane().add(bola4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        bola3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bola3.png"))); // NOI18N
        getContentPane().add(bola3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        bola2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bola2.png"))); // NOI18N
        getContentPane().add(bola2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        bola1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bola1.png"))); // NOI18N
        getContentPane().add(bola1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        arvoreIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arvore.png"))); // NOI18N
        getContentPane().add(arvoreIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnDeletar1.png"))); // NOI18N
        btnDeletar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnDeletar2.png"))); // NOI18N
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 250, 70));

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnInserir1.png"))); // NOI18N
        btnInserir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnInserir2.png"))); // NOI18N
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        getContentPane().add(btnInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 250, 70));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnBuscar1.png"))); // NOI18N
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnBuscar2.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 250, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exibirValoresArvore() {
        ArrayList<String> vetorCompletoOrganizado = arvore.getVetorCompletoOrganizado();

        for (int i = 0; i < vetorCompletoOrganizado.size(); i++) {
            String valor = vetorCompletoOrganizado.get(i);
            switch (i) {
                case 0:
                    txtAvo.setText(valor);
                    break;
                case 1:
                    txtPai1.setText(valor);
                    break;
                case 2:
                    txtPai2.setText(valor);
                    break;
                case 3:
                    txtFilho1.setText(valor);
                    break;
                case 4:
                    txtFilho2.setText(valor);
                    break;
                case 5:
                    txtFilho3.setText(valor);
                    break;
                case 6:
                    txtFilho4.setText(valor);
                    break;
                case 7:
                    txtIrmao1.setText(valor);
                    break;
                case 8:
                    txtIrmao2.setText(valor);
                    break;
                case 9:
                    txtIrmao3.setText(valor);
                    break;
                case 10:
                    txtIrmao4.setText(valor);
                    break;
                case 11:
                    txtIrmao5.setText(valor);
                    break;
                case 12:
                    txtIrmao6.setText(valor);
                    break;
                case 13:
                    txtIrmao7.setText(valor);
                    break;
                case 14:
                    txtIrmao8.setText(valor);
                    break;
            }
        }
    }

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        try {
            double valor = Double.parseDouble(txtValor.getText());

            lblStatus.setText(arvore.inserirValor(valor));
            exibirValoresArvore();
            txtValor.setText("");
        } catch (NumberFormatException erroNumero) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um valor válido.(números)");
            txtValor.setText("");
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed

        try {
            double valor = Double.parseDouble(txtValor.getText());
            boolean conseguiuDeletar = arvore.deletarValor(valor);

            if (conseguiuDeletar) {
                exibirValoresArvore();
                lblStatus.setText(valor + " Deletado com sucesso.");
                txtValor.setText("");
            } else {
                lblStatus.setText("Erro ao tentar deletar.");
                txtValor.setText("");
            }
        } catch (NumberFormatException erroNumero) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um valor válido.(números)");
            txtValor.setText("");
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            ArrayList<String> vetorCompletoOrganizado = arvore.getVetorCompletoOrganizado();
            double valor = Double.parseDouble(txtValor.getText());
            String valorConvertido = String.valueOf(valor);

            int posicao = -1;
            String mensagem = "";

            for (int i = 0; i < vetorCompletoOrganizado.size(); i++) {
                if (valorConvertido.equals(vetorCompletoOrganizado.get(i))) {
                    posicao = i;
                    break;
                }
            }

            if (posicao == 0) {
                mensagem = valor + " encontrado no nível 1(raíz) da árvore!";
            } else if (posicao > 0 && posicao <= 2) {
                mensagem = valor + " encontrado no nível 2 da árvore!";
            } else if (posicao > 2 && posicao <= 6) {
                mensagem = valor + " encontrado no nível 3 da árvore!";
            } else if (posicao > 6 && posicao <= 14) {
                mensagem = valor + " encontrado no nível 4 da árvore!";
            } else {
                mensagem = "Valor não encontrado!";
            }

            txtValor.setText("");
            JOptionPane.showMessageDialog(null, mensagem);
        } catch (NumberFormatException erroNumero) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um valor válido.(números)");
            txtValor.setText("");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arvoreIMG;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bola1;
    private javax.swing.JLabel bola2;
    private javax.swing.JLabel bola3;
    private javax.swing.JLabel bola4;
    private javax.swing.JLabel bola5;
    private javax.swing.JLabel bola6;
    private javax.swing.JLabel bola7;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel presente1;
    private javax.swing.JLabel presente2;
    private javax.swing.JLabel presente3;
    private javax.swing.JLabel presente4;
    private javax.swing.JLabel presente5;
    private javax.swing.JLabel presente6;
    private javax.swing.JLabel presente7;
    private javax.swing.JLabel presente8;
    private javax.swing.JLabel txtAvo;
    private javax.swing.JLabel txtFilho1;
    private javax.swing.JLabel txtFilho2;
    private javax.swing.JLabel txtFilho3;
    private javax.swing.JLabel txtFilho4;
    private javax.swing.JLabel txtIrmao1;
    private javax.swing.JLabel txtIrmao2;
    private javax.swing.JLabel txtIrmao3;
    private javax.swing.JLabel txtIrmao4;
    private javax.swing.JLabel txtIrmao5;
    private javax.swing.JLabel txtIrmao6;
    private javax.swing.JLabel txtIrmao7;
    private javax.swing.JLabel txtIrmao8;
    private javax.swing.JLabel txtPai1;
    private javax.swing.JLabel txtPai2;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
