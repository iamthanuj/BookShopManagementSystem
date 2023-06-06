/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIPackage;

import ClassPackage.Cashier;
import ClassPackage.Manager;
import ClassPackage.User;
import javax.swing.JOptionPane;

/**
 *
 * @author Thanuja
 */
public class CashierOptions extends javax.swing.JFrame {

    /**
     * Creates new form ManagerOptions
     */
    public CashierOptions() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainJpanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        searchBookBtn = new javax.swing.JButton();
        viewBookBtn = new javax.swing.JButton();
        searchStockBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookDetailsTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        searchStockTitle = new javax.swing.JTextField();
        searchBookStockBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        stockResultTable = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        searchBookTitle = new javax.swing.JTextField();
        searchBookTitleBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        searchBookTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        mainJpanel.setBackground(new java.awt.Color(51, 153, 255));
        mainJpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        searchBookBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchBookBtn.setText("Search book");
        searchBookBtn.setBorder(null);
        searchBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookBtnActionPerformed(evt);
            }
        });

        viewBookBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        viewBookBtn.setText("View book details");
        viewBookBtn.setBorder(null);
        viewBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBookBtnActionPerformed(evt);
            }
        });

        searchStockBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchStockBtn.setText("Search book stock");
        searchStockBtn.setBorder(null);
        searchStockBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStockBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cashier Control Panel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jButton1)
                    .addComponent(searchStockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel15)
                .addGap(129, 129, 129)
                .addComponent(viewBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(searchStockBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(searchBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(41, 41, 41))
        );

        mainJpanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 720));

        jTabbedPane1.setBackground(new java.awt.Color(51, 153, 255));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        bookDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Author", "Category", "Price", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookDetailsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(bookDetailsTable);
        if (bookDetailsTable.getColumnModel().getColumnCount() > 0) {
            bookDetailsTable.getColumnModel().getColumn(0).setResizable(false);
            bookDetailsTable.getColumnModel().getColumn(1).setResizable(false);
            bookDetailsTable.getColumnModel().getColumn(2).setResizable(false);
            bookDetailsTable.getColumnModel().getColumn(3).setResizable(false);
            bookDetailsTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("All Book Infomation");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jLabel5)
                .addContainerGap(328, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );

        jTabbedPane1.addTab("tab3", jPanel4);

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Search Stock by Book Title");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Book Title");

        searchBookStockBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchBookStockBtn.setText("Search");
        searchBookStockBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookStockBtnActionPerformed(evt);
            }
        });

        stockResultTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stockResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stockResultTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(stockResultTable);
        if (stockResultTable.getColumnModel().getColumnCount() > 0) {
            stockResultTable.getColumnModel().getColumn(0).setResizable(false);
            stockResultTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searchBook.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(33, 33, 33)
                                .addComponent(searchStockTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchBookStockBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchStockTitle)
                    .addComponent(searchBookStockBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))))
        );

        jTabbedPane1.addTab("tab4", jPanel5);

        jPanel6.setBackground(new java.awt.Color(51, 153, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search Book");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Book Title");

        searchBookTitleBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchBookTitleBtn.setForeground(new java.awt.Color(51, 51, 51));
        searchBookTitleBtn.setText("Search");
        searchBookTitleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookTitleBtnActionPerformed(evt);
            }
        });

        searchBookTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Author", "Category", "Price", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchBookTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(searchBookTable);
        if (searchBookTable.getColumnModel().getColumnCount() > 0) {
            searchBookTable.getColumnModel().getColumn(0).setResizable(false);
            searchBookTable.getColumnModel().getColumn(1).setResizable(false);
            searchBookTable.getColumnModel().getColumn(2).setResizable(false);
            searchBookTable.getColumnModel().getColumn(3).setResizable(false);
            searchBookTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBookTitleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchBookTitleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchBookTitle))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", jPanel6);

        mainJpanel.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, -50, 1000, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchStockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStockBtnActionPerformed
        jTabbedPane1.setSelectedIndex(1);

    }//GEN-LAST:event_searchStockBtnActionPerformed

    private void viewBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBookBtnActionPerformed
        jTabbedPane1.setSelectedIndex(0);
        User ch = new Cashier();
        ch.viewBook(bookDetailsTable);


    }//GEN-LAST:event_viewBookBtnActionPerformed

    private void searchBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookBtnActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_searchBookBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int response = JOptionPane.showConfirmDialog(rootPane, "Do you want to logout?");
        if (response == JOptionPane.YES_OPTION) {
            this.toBack();
            setVisible(false);
            new UserMainMenu().toFront();
            new UserMainMenu().setState(java.awt.Frame.NORMAL);
            new UserMainMenu().setVisible(true);
            dispose();
        } else if (response == JOptionPane.NO_OPTION) {

        } 


    }//GEN-LAST:event_jButton1ActionPerformed


    private void searchBookStockBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookStockBtnActionPerformed

        User ch = new Cashier();
        if (searchStockTitle.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Text field cannot be empty!");
        } else {
            if (ch.searchBookStock(searchStockTitle.getText(), stockResultTable)) {

            } else {
                JOptionPane.showMessageDialog(null, "Result not found", "Search Stock", JOptionPane.INFORMATION_MESSAGE);
            }
        }


    }//GEN-LAST:event_searchBookStockBtnActionPerformed

    private void searchBookTitleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookTitleBtnActionPerformed
        Manager mngr = new Manager();

        if (searchBookTitle.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Text field cannot be empty!");
        } else {
            if (mngr.searchBook(searchBookTitle.getText(), searchBookTable)) {

            } else {
                JOptionPane.showMessageDialog(null, "Result not found", "Search Book", JOptionPane.INFORMATION_MESSAGE);
            }
        }


    }//GEN-LAST:event_searchBookTitleBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CashierOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierOptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookDetailsTable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel mainJpanel;
    private javax.swing.JButton searchBookBtn;
    private javax.swing.JButton searchBookStockBtn;
    private javax.swing.JTable searchBookTable;
    private javax.swing.JTextField searchBookTitle;
    private javax.swing.JButton searchBookTitleBtn;
    private javax.swing.JButton searchStockBtn;
    private javax.swing.JTextField searchStockTitle;
    private javax.swing.JTable stockResultTable;
    private javax.swing.JButton viewBookBtn;
    // End of variables declaration//GEN-END:variables
}
