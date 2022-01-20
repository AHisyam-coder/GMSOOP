/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gymbookingsystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelclass.ConnectionDB;

/**
 *
 * @author Hisyam
 */
public class Member extends javax.swing.JFrame {

    /**
     * Creates new form Member
     */
    public Member() {
        initComponents();
        tableUpdate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    private void tableUpdate() {
        int i;

        try {
            String sql = "SELECT * FROM members";

            PreparedStatement pst = new ConnectionDB(sql).tryConn();

            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();

            i = rss.getColumnCount();

            DefaultTableModel df = (DefaultTableModel) tableMember.getModel();
            df.setRowCount(0);

            int no = 0;

            while (rs.next()) {
                Vector v = new Vector();
                no++;

                for (int x = 1; x <= i; x++) {
                    v.add(no);
                    v.add(rs.getString("name"));
                    v.add(rs.getString("phoneNo"));
                    v.add(rs.getString("icNo"));
                    v.add(rs.getString("age"));
                    v.add(rs.getString("type"));
                    v.add(rs.getString("gender"));
                }

                df.addRow(v);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void clearData() {
        etName.setText(null);
        etPhoneNo.setText(null);
        etIcNo.setText(null);
        etAge.setText(null);
        rbMale.setSelected(false);
        rbFemale.setSelected(false);
        rbVIP.setSelected(false);
        rbNormal.setSelected(false);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpGender = new javax.swing.ButtonGroup();
        btnGrpType = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMember = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        etIcNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        etPhoneNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        etAge = new javax.swing.JTextField();
        rbFemale = new javax.swing.JRadioButton();
        rbMale = new javax.swing.JRadioButton();
        btnAddMember = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        rbVIP = new javax.swing.JRadioButton();
        rbNormal = new javax.swing.JRadioButton();
        btnEditMember = new javax.swing.JButton();
        btnDeleteMember = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableMember.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Name", "Phone No", "Identity Card No", "Age", "Type", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMemberMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMember);
        if (tableMember.getColumnModel().getColumnCount() > 0) {
            tableMember.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("IC No");

        etName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name");

        etIcNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etIcNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etIcNoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Phone No");

        etPhoneNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etPhoneNoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Age");

        etAge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etAgeActionPerformed(evt);
            }
        });

        btnGrpGender.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbFemale.setText("Female");
        rbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemaleActionPerformed(evt);
            }
        });

        btnGrpGender.add(rbMale);
        rbMale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbMale.setText("Male");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });

        btnAddMember.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddMember.setText("Add Member");
        btnAddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMemberActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Type");

        btnGrpType.add(rbVIP);
        rbVIP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbVIP.setText("VIP");
        rbVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVIPActionPerformed(evt);
            }
        });

        btnGrpType.add(rbNormal);
        rbNormal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbNormal.setText("Normal");
        rbNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNormalActionPerformed(evt);
            }
        });

        btnEditMember.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditMember.setText("Update Member");
        btnEditMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditMemberActionPerformed(evt);
            }
        });

        btnDeleteMember.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDeleteMember.setText("Delete Member");
        btnDeleteMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(rbVIP)
                        .addGap(27, 27, 27)
                        .addComponent(rbNormal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(etPhoneNo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbMale)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbFemale)
                                        .addGap(0, 106, Short.MAX_VALUE))
                                    .addComponent(etName)
                                    .addComponent(etAge)
                                    .addComponent(etIcNo)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeleteMember)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAddMember, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btnEditMember)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(etPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etIcNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbMale)
                    .addComponent(rbFemale))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(etAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rbVIP)
                    .addComponent(rbNormal))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditMember, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddMember, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeleteMember)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(btnBack)
                .addGap(25, 25, 25))
        );

        setSize(new java.awt.Dimension(1101, 719));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void etIcNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etIcNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etIcNoActionPerformed

    private void etNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etNameActionPerformed

    private void etPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etPhoneNoActionPerformed

    private void etAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etAgeActionPerformed

    private void rbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemaleActionPerformed

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMaleActionPerformed

    private void rbVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbVIPActionPerformed

    private void rbNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNormalActionPerformed

    private void btnEditMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditMemberActionPerformed
        DefaultTableModel df = (DefaultTableModel) tableMember.getModel();
        int selectedIndex = tableMember.getSelectedRow();
        if (etName.getText().isEmpty() || etPhoneNo.getText().isEmpty() || etIcNo.getText().isEmpty() || etAge.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please choose a member to edit!", "Validation", JOptionPane.OK_OPTION);
        } else {
            try {
                int id = Integer.parseInt(df.getValueAt(selectedIndex, 0).toString());

                String sql = "UPDATE members SET name=?, phoneNo=?, icNo=?, gender=?, age=?, type=? WHERE id=?";

                PreparedStatement pst = new ConnectionDB(sql).tryConn();

                pst.setString(1, etName.getText());
                pst.setString(2, etPhoneNo.getText());
                pst.setString(3, etIcNo.getText());

                if (rbMale.isSelected()) {
                    pst.setString(4, rbMale.getText());
                } else if (rbFemale.isSelected()) {
                    pst.setString(4, rbFemale.getText());
                }

                pst.setString(5, etAge.getText());

                if (rbVIP.isSelected()) {
                    pst.setString(6, rbVIP.getText());
                } else if (rbNormal.isSelected()) {
                    pst.setString(6, rbNormal.getText());
                }

                pst.setInt(7, id);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Successfully edit a member!");
                tableUpdate();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        clearData();
    }//GEN-LAST:event_btnEditMemberActionPerformed

    private void btnDeleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMemberActionPerformed
        DefaultTableModel df = (DefaultTableModel) tableMember.getModel();
        int selectedIndex = tableMember.getSelectedRow();
        if (etName.getText().isEmpty() || etPhoneNo.getText().isEmpty() || etIcNo.getText().isEmpty() || etAge.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please choose a member to delete!", "Validation", JOptionPane.OK_OPTION);
        } else {
            try {
                int id = Integer.parseInt(df.getValueAt(selectedIndex, 0).toString());
                int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete this member?", "Warning", JOptionPane.YES_NO_OPTION);

                if (dialogResult == JOptionPane.YES_NO_OPTION) {
                    String sql = "DELETE FROM members WHERE id=?";

                    PreparedStatement pst = new ConnectionDB(sql).tryConn();

                    pst.setInt(1, id);

                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Successfully delete a member!");
                    tableUpdate();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        clearData();
    }//GEN-LAST:event_btnDeleteMemberActionPerformed

    private void btnAddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMemberActionPerformed
        try {
            String sql = "INSERT INTO `members` (`name`, `phoneNo`, `icNo`, `gender`, `age`, `type`) VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement pst = new ConnectionDB(sql).tryConn();

            if (etName.getText().isEmpty() || etPhoneNo.getText().isEmpty() || etIcNo.getText().isEmpty() || etAge.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all the details!", "Validation", JOptionPane.OK_OPTION);
            } else {
                pst.setString(1, etName.getText());
                pst.setString(2, etPhoneNo.getText());
                pst.setString(3, etIcNo.getText());

                if (rbMale.isSelected()) {
                    pst.setString(4, rbMale.getText());
                } else if (rbFemale.isSelected()) {
                    pst.setString(4, rbFemale.getText());
                }

                pst.setString(5, etAge.getText());

                if (rbVIP.isSelected()) {
                    pst.setString(6, rbVIP.getText());
                } else if (rbNormal.isSelected()) {
                    pst.setString(6, rbNormal.getText());
                }

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Successfully add a member!");
                tableUpdate();

                clearData();

                etName.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnAddMemberActionPerformed

    private void tableMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMemberMouseClicked
        DefaultTableModel df = (DefaultTableModel) tableMember.getModel();
        int selectedIndex = tableMember.getSelectedRow();

        etName.setText(df.getValueAt(selectedIndex, 1).toString());
        etPhoneNo.setText(df.getValueAt(selectedIndex, 2).toString());
        etIcNo.setText(df.getValueAt(selectedIndex, 3).toString());
        etAge.setText(df.getValueAt(selectedIndex, 4).toString());
                
        if (df.getValueAt(selectedIndex, 5).toString().equals(rbVIP.getText())) {
            rbVIP.setSelected(true);
        } else if (df.getValueAt(selectedIndex, 5).toString().equals(rbNormal.getText())) {
            rbNormal.setSelected(true);
        }

        if (df.getValueAt(selectedIndex, 6).toString().equals(rbMale.getText())) {
            rbMale.setSelected(true);
        } else if (df.getValueAt(selectedIndex, 6).toString().equals(rbFemale.getText())) {
            rbFemale.setSelected(true);
        }
    }//GEN-LAST:event_tableMemberMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Home home = new Home();
        this.dispose();
        home.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMember;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteMember;
    private javax.swing.JButton btnEditMember;
    private javax.swing.ButtonGroup btnGrpGender;
    private javax.swing.ButtonGroup btnGrpType;
    private javax.swing.JTextField etAge;
    private javax.swing.JTextField etIcNo;
    private javax.swing.JTextField etName;
    private javax.swing.JTextField etPhoneNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JRadioButton rbNormal;
    private javax.swing.JRadioButton rbVIP;
    private javax.swing.JTable tableMember;
    // End of variables declaration//GEN-END:variables
}
