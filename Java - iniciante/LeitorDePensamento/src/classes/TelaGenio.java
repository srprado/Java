
package classes;

import java.awt.Font;

public class TelaGenio extends javax.swing.JFrame {

    public TelaGenio() {
        initComponents();
        lblFraseGenio.setText("<html>Vou pensar em um valor entre 1 e 10. Tente advinhar!!</html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFraseGenio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spnValorEscolhido = new javax.swing.JSpinner();
        btnPalpite = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFraseGenio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblFraseGenio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFraseGenio.setText("Frase");
        getContentPane().add(lblFraseGenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 130, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Genio1.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, 450, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Adivinhe o número");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 150, 20));

        spnValorEscolhido.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        getContentPane().add(spnValorEscolhido, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        btnPalpite.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPalpite.setText("PALPITE");
        btnPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balaoFalaGenio.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpiteActionPerformed
       int vlrAleatorio = (int)(1*Math.random()*(11-1));
        System.out.println(vlrAleatorio);
        
        int numUsuario = Integer.parseInt(spnValorEscolhido.getValue().toString());
        
        String ac = "ACERTOU!!";
        String er = "<html>ERROU! EU PENSEI NO VALOR "+vlrAleatorio+"</html>";
        
        String resultado = (vlrAleatorio == numUsuario)?ac:er;
        
        lblFraseGenio.setFont(new Font("Arial Black", Font.PLAIN, 16));
        lblFraseGenio.setText(resultado);
    }//GEN-LAST:event_btnPalpiteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPalpite;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblFraseGenio;
    private javax.swing.JSpinner spnValorEscolhido;
    // End of variables declaration//GEN-END:variables
}
