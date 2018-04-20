public class MainWindow extends javax.swing.JFrame {


    public MainWindow() {
        initComponents();
        // https://stackoverflow.com/questions/479523/jframe-maximize-window, code to set maximised window in properties
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelMenu = new javax.swing.JPanel();
        BtnCreate = new javax.swing.JButton();
        BtnLoad = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnQuit = new javax.swing.JButton();
        BtnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MenuFrame");
        setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
        setResizable(false);

        jpanelMenu.setBackground(new java.awt.Color(80, 120, 1));
        jpanelMenu.setPreferredSize(new java.awt.Dimension(1920, 1080));

        BtnCreate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        BtnCreate.setText("Create Profile");
        BtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateActionPerformed(evt);
            }
        });

        BtnLoad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        BtnLoad.setText("Load Profile");
        BtnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoadActionPerformed(evt);
            }
        });

        BtnDelete.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        BtnDelete.setText("Delete Profile");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        BtnQuit.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        BtnQuit.setText("Quit");
        BtnQuit.setToolTipText("");
        BtnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnQuitActionPerformed(evt);
            }
        });

        BtnHelp.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        BtnHelp.setText("Help and Information");
        BtnHelp.setToolTipText("");
        BtnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelMenuLayout = new javax.swing.GroupLayout(jpanelMenu);
        jpanelMenu.setLayout(jpanelMenuLayout);
        jpanelMenuLayout.setHorizontalGroup(
            jpanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelMenuLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(BtnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272)
                .addComponent(BtnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(302, 302, 302)
                .addComponent(BtnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(411, 411, 411))
        );
        jpanelMenuLayout.setVerticalGroup(
            jpanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelMenuLayout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addGroup(jpanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(192, 192, 192)
                .addGroup(jpanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1930, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        new DeleteProfile().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void BtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateActionPerformed
        new CreateProfile().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnCreateActionPerformed

    private void BtnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnQuitActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_BtnQuitActionPerformed

    private void BtnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoadActionPerformed
        
        new LoadProfile().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnLoadActionPerformed

    private void BtnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHelpActionPerformed
        new Help().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnHelpActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCreate;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnHelp;
    private javax.swing.JButton BtnLoad;
    private javax.swing.JButton BtnQuit;
    private javax.swing.JPanel jpanelMenu;
    // End of variables declaration//GEN-END:variables
}
