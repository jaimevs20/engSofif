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
public class TelaGestao extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaGestao() {
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

        jPanelCentro = new javax.swing.JPanel();
        labelBemVindo = new javax.swing.JLabel();
        jPanelTopo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelLateral = new javax.swing.JPanel();
        labelSecretarios = new javax.swing.JLabel();
        labelPersonalTrainers = new javax.swing.JLabel();
        labelEquipamentos = new javax.swing.JLabel();
        labelAlunos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelCentro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCentro.setLayout(null);

        labelBemVindo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelBemVindo.setText("Bem Vindo!");
        jPanelCentro.add(labelBemVindo);
        labelBemVindo.setBounds(70, 90, 260, 40);

        getContentPane().add(jPanelCentro, java.awt.BorderLayout.CENTER);

        jPanelTopo.setBackground(new java.awt.Color(0, 255, 0));
        jPanelTopo.setPreferredSize(new java.awt.Dimension(694, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SoFiT");

        javax.swing.GroupLayout jPanelTopoLayout = new javax.swing.GroupLayout(jPanelTopo);
        jPanelTopo.setLayout(jPanelTopoLayout);
        jPanelTopoLayout.setHorizontalGroup(
            jPanelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(738, Short.MAX_VALUE))
        );
        jPanelTopoLayout.setVerticalGroup(
            jPanelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopoLayout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        getContentPane().add(jPanelTopo, java.awt.BorderLayout.PAGE_START);

        jPanelLateral.setBackground(new java.awt.Color(103, 152, 104));
        jPanelLateral.setPreferredSize(new java.awt.Dimension(200, 570));

        labelSecretarios.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        labelSecretarios.setForeground(new java.awt.Color(255, 255, 255));
        labelSecretarios.setText("Secretários");

        labelPersonalTrainers.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        labelPersonalTrainers.setForeground(new java.awt.Color(255, 255, 255));
        labelPersonalTrainers.setText("Personal Trainers");

        labelEquipamentos.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        labelEquipamentos.setForeground(new java.awt.Color(255, 255, 255));
        labelEquipamentos.setText("Equipamentos");

        labelAlunos.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        labelAlunos.setForeground(new java.awt.Color(255, 255, 255));
        labelAlunos.setText("Alunos");

        javax.swing.GroupLayout jPanelLateralLayout = new javax.swing.GroupLayout(jPanelLateral);
        jPanelLateral.setLayout(jPanelLateralLayout);
        jPanelLateralLayout.setHorizontalGroup(
            jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPersonalTrainers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addGroup(jPanelLateralLayout.createSequentialGroup()
                        .addGroup(jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSecretarios, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEquipamentos))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelLateralLayout.setVerticalGroup(
            jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLateralLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(labelAlunos)
                .addGap(18, 18, 18)
                .addComponent(labelSecretarios)
                .addGap(18, 18, 18)
                .addComponent(labelPersonalTrainers)
                .addGap(18, 18, 18)
                .addComponent(labelEquipamentos)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelLateral, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGestao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelCentro;
    private javax.swing.JPanel jPanelLateral;
    private javax.swing.JPanel jPanelTopo;
    private javax.swing.JLabel labelAlunos;
    private javax.swing.JLabel labelBemVindo;
    private javax.swing.JLabel labelEquipamentos;
    private javax.swing.JLabel labelPersonalTrainers;
    private javax.swing.JLabel labelSecretarios;
    // End of variables declaration//GEN-END:variables
}