/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting.project;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ebad
 */
public class Trial_balance extends javax.swing.JFrame {

    /**
     * Creates new form Trial_balance
     */
    public Trial_balance() {
        initComponents();
        this.setLocationRelativeTo(null);

        menu m = new menu();
        String company = m.company_name;
        String date = m.date;

        jLabel_company.setText(company);
        jLabel_date.setText(date);

        GeneralJournal journal = new GeneralJournal();

        Double total_debit = 0.0;
        Double total_credit = 0.0;

        DefaultTableModel model = (DefaultTableModel) jTable_trial_balance.getModel();

        //  FOR ASSETS
        model.addRow(new Object[]{"Cash", "                 " + journal.cash_balance, ""});
        model.addRow(new Object[]{"Account Recievable", "                 " + journal.account_recievable_balance, ""});
        model.addRow(new Object[]{"Equipment", "                 " + journal.equipement_balance, ""});
        model.addRow(new Object[]{"Supplies", "                 " + journal.supplies_balance, ""});
        model.addRow(new Object[]{"Prepaid Insurance", "                 " + journal.prepaid_insurance_balance, ""});

        total_debit += journal.cash_balance;
        total_debit += journal.account_recievable_balance;
        total_debit += journal.equipement_balance;
        total_debit += journal.supplies_balance;
        total_debit += journal.prepaid_insurance_balance;

        //  FOR LIABLILTES
        model.addRow(new Object[]{"Account Payable", "", "                 " + journal.account_payable_balance * -1});
        model.addRow(new Object[]{"Notes Payable", "", "                 " + journal.notes_payable_balance * -1});
        model.addRow(new Object[]{"Salaries Payable", "", "                 " + journal.salaries_payable_balance * -1});
        model.addRow(new Object[]{"Interset Payable", "", "                 " + journal.interest_payable_balance * -1});
        model.addRow(new Object[]{"Accumalated Depreciation Equipment", "", "                 " + journal.accumalate_depreciation_balance * -1});
        model.addRow(new Object[]{"Unearned Revenue", "", "                 " + journal.unearned_revenue_balance * -1});

        //  FOR CAPITAL AND DRAWING
        model.addRow(new Object[]{"Owner's Capital", "", "                 " + journal.owners_capital_balance * -1});
        model.addRow(new Object[]{"Owner's Drawing", "", "                 " + journal.owners_drawing_balance * -1});

        // FOR REVENUE ACCOUNT
        model.addRow(new Object[]{"Service Revenue", "", "                 " + journal.servie_revenue_balance * -1});
        model.addRow(new Object[]{"Rent Revenue", "", "                 " + journal.rent_revenue_balance * -1});
        model.addRow(new Object[]{"Advertising Revenue", "", "                 " + journal.advertising_revenue_balance * -1});
        model.addRow(new Object[]{"Other Revenue", "", "                 " + journal.other_revenue_balance * -1});

        total_credit += journal.account_payable_balance * -1;
        total_credit += journal.notes_payable_balance * -1;
        total_credit += journal.salaries_payable_balance * -1;
        total_credit += journal.interest_payable_balance * -1;
        total_credit += journal.accumalate_depreciation_balance * -1;
        total_credit += journal.unearned_revenue_balance * -1;
        total_credit += journal.owners_capital_balance * -1;
        total_credit += journal.owners_drawing_balance * -1;
        total_credit += journal.servie_revenue_balance * -1;
        total_credit += journal.rent_revenue_balance * -1;
        total_credit += journal.advertising_revenue_balance * -1;
        total_credit += journal.other_revenue_balance * -1;

        // FOR EXPENSE ACCOUNT
        model.addRow(new Object[]{"Salaries Expense", "                 " + journal.salaries_expense_balance, ""});
        model.addRow(new Object[]{"Rent Expense", "                 " + journal.rent_expense_balance, ""});
        model.addRow(new Object[]{"Insurance Expense", "                 " + journal.insurance_expense_balance, ""});
        model.addRow(new Object[]{"Depreciation Expense", "                 " + journal.depreciation_expense_balance, ""});
        model.addRow(new Object[]{"Supplies Expense", "                 " + journal.supplies_expense_balance, ""});
        model.addRow(new Object[]{"Advertising Expense", "                 " + journal.advertising_expense_balance, ""});
        model.addRow(new Object[]{"Interset Expense", "                 " + journal.interest_expense_balance, ""});

        total_debit += journal.salaries_expense_balance;
        total_debit += journal.rent_expense_balance;
        total_debit += journal.insurance_expense_balance;
        total_debit += journal.depreciation_expense_balance;
        total_debit += journal.supplies_expense_balance;
        total_debit += journal.interest_expense_balance;
        total_debit += journal.advertising_expense_balance;

        jTextField_trial_debit.setText("" + total_debit);
        jTextField_trial_credit.setText("" + total_credit);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel_company = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_date = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_trial_balance = new javax.swing.JTable();
        jTextField_trial_debit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_trial_credit = new javax.swing.JTextField();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        jLabel_company.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_company.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_company.setText("COMPANY");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TRIAL BALANCE");

        jLabel_date.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jLabel_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_date.setText("For the month ended september 10,2012");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(jLabel_company, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(jLabel_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_company, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_date, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        jTable_trial_balance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "               Account Title", "               Debit", "                Credit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_trial_balance);
        if (jTable_trial_balance.getColumnModel().getColumnCount() > 0) {
            jTable_trial_balance.getColumnModel().getColumn(0).setResizable(false);
            jTable_trial_balance.getColumnModel().getColumn(1).setResizable(false);
            jTable_trial_balance.getColumnModel().getColumn(2).setResizable(false);
        }

        jTextField_trial_debit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_trial_debitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Debit");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Credit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_trial_debit, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_trial_credit, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_trial_debit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_trial_credit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_trial_debitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_trial_debitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_trial_debitActionPerformed

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
            java.util.logging.Logger.getLogger(Trial_balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trial_balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trial_balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trial_balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trial_balance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_company;
    private javax.swing.JLabel jLabel_date;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_trial_balance;
    private javax.swing.JTextField jTextField_trial_credit;
    private javax.swing.JTextField jTextField_trial_debit;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
