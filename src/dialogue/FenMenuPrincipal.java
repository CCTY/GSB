/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogue;

import dialogue.FenTableClient;
import dialogue.FenMenuPrincipal;
import dialogue.FenFacture;

/**
 *
 * @author Poste8
 */
public class FenMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FenMenuPrincipal
     */
    public FenMenuPrincipal() {
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

        jLab_Marcheur = new javax.swing.JLabel();
        jLab_parametre = new javax.swing.JLabel();
        jLab_Ibook = new javax.swing.JLabel();
        jLab_classeur = new javax.swing.JLabel();
        jLab_Cam = new javax.swing.JLabel();
        jLab_SARL = new javax.swing.JLabel();
        jLab_Fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLab_Marcheur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accueil/marcheur1.png"))); // NOI18N
        jLab_Marcheur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_MarcheurMouseClicked(evt);
            }
        });
        jLab_Marcheur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLab_MarcheurKeyPressed(evt);
            }
        });
        getContentPane().add(jLab_Marcheur, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jLab_parametre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accueil/parametre1.png"))); // NOI18N
        getContentPane().add(jLab_parametre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        jLab_Ibook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accueil/iBook.png"))); // NOI18N
        getContentPane().add(jLab_Ibook, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        jLab_classeur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accueil/classeur1.png"))); // NOI18N
        jLab_classeur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_classeurMouseClicked(evt);
            }
        });
        jLab_classeur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLab_classeurKeyPressed(evt);
            }
        });
        getContentPane().add(jLab_classeur, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, -1, -1));

        jLab_Cam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accueil/camembert.png"))); // NOI18N
        getContentPane().add(jLab_Cam, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 130, 120));

        jLab_SARL.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLab_SARL.setForeground(new java.awt.Color(224, 224, 224));
        jLab_SARL.setText("SARL");
        getContentPane().add(jLab_SARL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 21, 100, 40));

        jLab_Fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fond/fondGeneral.jpg"))); // NOI18N
        getContentPane().add(jLab_Fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLab_MarcheurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_MarcheurMouseClicked
        // TODO add your handling code here:
        FenTableClient laFenetre = new FenTableClient();
        laFenetre.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLab_MarcheurMouseClicked

    private void jLab_MarcheurKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLab_MarcheurKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            FenMenuPrincipal laFenetre = new FenMenuPrincipal();
            laFenetre.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLab_MarcheurKeyPressed

    private void jLab_classeurKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLab_classeurKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            FenFacture laFenetre = new FenFacture();
            laFenetre.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLab_classeurKeyPressed

    private void jLab_classeurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_classeurMouseClicked
        // TODO add your handling code here:
        FenFacture laFenetre = new FenFacture();
        laFenetre.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLab_classeurMouseClicked

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
            java.util.logging.Logger.getLogger(FenMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLab_Cam;
    private javax.swing.JLabel jLab_Fond;
    private javax.swing.JLabel jLab_Ibook;
    private javax.swing.JLabel jLab_Marcheur;
    private javax.swing.JLabel jLab_SARL;
    private javax.swing.JLabel jLab_classeur;
    private javax.swing.JLabel jLab_parametre;
    // End of variables declaration//GEN-END:variables
}
