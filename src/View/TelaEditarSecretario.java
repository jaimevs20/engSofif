/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author iMurilo Cruz
 */
public class TelaEditarSecretario extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaEditarSecretario() {
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

        jPanel1 = new javax.swing.JPanel();
        campoInicioContrato = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        labelSenha = new javax.swing.JLabel();
        buttonCancelar = new javax.swing.JButton();
        labelInicioContrato = new javax.swing.JLabel();
        campoTerminoContrato = new javax.swing.JTextField();
        labelTerminoContrato = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        labelConfirmacaoSenha = new javax.swing.JLabel();
        campoConfirmacaoSenha = new javax.swing.JPasswordField();
        campoNumContrato = new javax.swing.JTextField();
        labelNumContrato = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        labelCEP = new javax.swing.JLabel();
        campoCEP = new javax.swing.JTextField();
        labelRG = new javax.swing.JLabel();
        campoRG = new javax.swing.JTextField();
        campoCPF = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoDataNasc = new javax.swing.JTextField();
        labelUsuario9 = new javax.swing.JLabel();
        buttonSalvar = new javax.swing.JButton();
        labelDataNasc = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        campoInicioContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoInicioContratoActionPerformed(evt);
            }
        });
        jPanel1.add(campoInicioContrato);
        campoInicioContrato.setBounds(170, 340, 200, 33);

        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(campoSenha);
        campoSenha.setBounds(170, 410, 200, 31);

        labelSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelSenha.setText("Senha:");
        jPanel1.add(labelSenha);
        labelSenha.setBounds(170, 390, 50, 17);

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCancelar);
        buttonCancelar.setBounds(440, 470, 133, 23);

        labelInicioContrato.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelInicioContrato.setText("Inicio de contrato:");
        jPanel1.add(labelInicioContrato);
        labelInicioContrato.setBounds(170, 320, 140, 17);

        campoTerminoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTerminoContratoActionPerformed(evt);
            }
        });
        jPanel1.add(campoTerminoContrato);
        campoTerminoContrato.setBounds(400, 340, 200, 33);

        labelTerminoContrato.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTerminoContrato.setText("Termino de contrato:");
        jPanel1.add(labelTerminoContrato);
        labelTerminoContrato.setBounds(400, 320, 150, 17);

        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        jPanel1.add(campoEmail);
        campoEmail.setBounds(170, 280, 250, 33);

        labelEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelEmail.setText("Email:");
        jPanel1.add(labelEmail);
        labelEmail.setBounds(170, 260, 41, 17);

        labelConfirmacaoSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelConfirmacaoSenha.setText("Confirmação de Senha:");
        jPanel1.add(labelConfirmacaoSenha);
        labelConfirmacaoSenha.setBounds(400, 390, 170, 17);

        campoConfirmacaoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoConfirmacaoSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(campoConfirmacaoSenha);
        campoConfirmacaoSenha.setBounds(400, 410, 200, 31);

        campoNumContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumContratoActionPerformed(evt);
            }
        });
        jPanel1.add(campoNumContrato);
        campoNumContrato.setBounds(440, 280, 160, 33);

        labelNumContrato.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNumContrato.setText("Nº de contrato:");
        jPanel1.add(labelNumContrato);
        labelNumContrato.setBounds(440, 260, 120, 17);

        labelEndereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelEndereco.setText("Endereço:");
        jPanel1.add(labelEndereco);
        labelEndereco.setBounds(170, 200, 90, 17);

        campoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEnderecoActionPerformed(evt);
            }
        });
        jPanel1.add(campoEndereco);
        campoEndereco.setBounds(170, 220, 290, 33);

        labelCEP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCEP.setText("CEP:");
        jPanel1.add(labelCEP);
        labelCEP.setBounds(480, 200, 120, 17);

        campoCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCEPActionPerformed(evt);
            }
        });
        jPanel1.add(campoCEP);
        campoCEP.setBounds(480, 220, 120, 33);

        labelRG.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelRG.setText("RG:");
        jPanel1.add(labelRG);
        labelRG.setBounds(170, 140, 140, 17);

        campoRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRGActionPerformed(evt);
            }
        });
        jPanel1.add(campoRG);
        campoRG.setBounds(170, 160, 200, 33);

        campoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCPFActionPerformed(evt);
            }
        });
        jPanel1.add(campoCPF);
        campoCPF.setBounds(400, 160, 200, 33);

        labelCPF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCPF.setText("CPF:");
        jPanel1.add(labelCPF);
        labelCPF.setBounds(400, 140, 150, 17);

        labelNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNome.setText("Nome:");
        jPanel1.add(labelNome);
        labelNome.setBounds(170, 80, 140, 17);

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        jPanel1.add(campoNome);
        campoNome.setBounds(170, 100, 200, 33);

        campoDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataNascActionPerformed(evt);
            }
        });
        jPanel1.add(campoDataNasc);
        campoDataNasc.setBounds(400, 100, 200, 33);

        labelUsuario9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelUsuario9.setText("Editar Secretário");
        jPanel1.add(labelUsuario9);
        labelUsuario9.setBounds(120, 20, 220, 40);

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSalvar);
        buttonSalvar.setBounds(580, 470, 133, 23);

        labelDataNasc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDataNasc.setText("Data de nascimento:");
        jPanel1.add(labelDataNasc);
        labelDataNasc.setBounds(400, 80, 150, 17);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(0, 255, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(694, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SoFiT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(738, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoInicioContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoInicioContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoInicioContratoActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void campoTerminoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTerminoContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTerminoContratoActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void campoConfirmacaoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoConfirmacaoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoConfirmacaoSenhaActionPerformed

    private void campoNumContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNumContratoActionPerformed

    private void campoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEnderecoActionPerformed

    private void campoCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCEPActionPerformed

    private void campoRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRGActionPerformed

    private void campoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCPFActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataNascActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditarSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarSecretario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarSecretario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JTextField campoCEP;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JPasswordField campoConfirmacaoSenha;
    private javax.swing.JTextField campoDataNasc;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoInicioContrato;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNumContrato;
    private javax.swing.JTextField campoRG;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoTerminoContrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCEP;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelConfirmacaoSenha;
    private javax.swing.JLabel labelDataNasc;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelInicioContrato;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumContrato;
    private javax.swing.JLabel labelRG;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTerminoContrato;
    private javax.swing.JLabel labelUsuario9;
    // End of variables declaration//GEN-END:variables
}
