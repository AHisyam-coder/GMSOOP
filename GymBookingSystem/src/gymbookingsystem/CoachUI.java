/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gymbookingsystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelclass.Coach;
import modelclass.ConnectionDB;

/**
 *
 * @author Hisyam
 */
public class CoachUI extends javax.swing.JFrame {

    /**
     * Creates new form Coach
     */
    public CoachUI() {
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
        //arraylist
        ArrayList<Coach> coachList = new ArrayList<>();

        try {
            String sql = "SELECT * FROM coaches";

            PreparedStatement pst = new ConnectionDB(sql).tryConn();

            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();

            i = rss.getColumnCount();

            DefaultTableModel df = (DefaultTableModel) tableCoach.getModel();
            df.setRowCount(0);

            //array
            while (rs.next()) {
                Coach coach = new Coach(rs.getInt("id"), rs.getString("name"), rs.getString("phoneNo"), rs.getString("email"), rs.getString("gender"), rs.getBoolean("isAvailable"), null);
                coachList.add(coach);
            }

            for (Coach coach : coachList) {
                Vector v = new Vector();

                v.add(coach.getCoachId());
                v.add(coach.getCoachName());
                v.add(coach.getCoachPhoneNum());
                v.add(coach.getCoachEmail());
                v.add(coach.getCoachGender());

                if (coach.isIsAvailable()) {
                    v.add("Available");
                } else {
                    v.add("Not Available");
                }
                df.addRow(v);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void filter(String filterData) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>((DefaultTableModel) tableCoach.getModel());
        tableCoach.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(filterData));
    }

    public void clearData() {
        NameTextField.setText(null);
        PhoneNumTextField.setText(null);
        EmailTextField.setText(null);
        SearchTextField.setText(null);
        btnGrpAvail.clearSelection();
        btnGrpGender.clearSelection();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpAvail = new javax.swing.ButtonGroup();
        btnGrpGender = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        BtnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        PhoneNumTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rbNo = new javax.swing.JRadioButton();
        rbYes = new javax.swing.JRadioButton();
        BtnAdd = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCoach = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        SearchTextField = new javax.swing.JTextField();
        BtnClear = new javax.swing.JButton();
        BtnBookCoach = new javax.swing.JButton();
        btnBookingList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Coach");

        BtnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnBack.setText("Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Email");

        NameTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Name");

        EmailTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Phone No");

        PhoneNumTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PhoneNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumTextFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Availability");

        btnGrpAvail.add(rbNo);
        rbNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbNo.setText("No");
        rbNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoActionPerformed(evt);
            }
        });

        btnGrpAvail.add(rbYes);
        rbYes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbYes.setText("Yes");
        rbYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbYesActionPerformed(evt);
            }
        });

        BtnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnAdd.setText("Add Coach");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnUpdate.setLabel("Update Coach");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        BtnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnDelete.setLabel("Delete Coach");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Gender");

        btnGrpGender.add(rbMale);
        rbMale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbMale.setText("Male");

        btnGrpGender.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbFemale.setText("Female");
        rbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PhoneNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(rbMale)
                                                .addComponent(rbYes))
                                            .addGap(32, 32, 32)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(rbNo)
                                                .addComponent(rbFemale)))
                                        .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(PhoneNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbMale)
                            .addComponent(rbFemale)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbYes)
                            .addComponent(rbNo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnAdd)
                    .addComponent(BtnUpdate))
                .addGap(18, 18, 18)
                .addComponent(BtnDelete)
                .addGap(31, 31, 31))
        );

        tableCoach.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableCoach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableCoach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "              Name", "       Phone Number", "              Email", "Gender", "           Availability"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCoach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCoachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCoach);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Search");

        SearchTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SearchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextFieldActionPerformed(evt);
            }
        });
        SearchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTextFieldKeyReleased(evt);
            }
        });

        BtnClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnClear.setText("Clear All");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        BtnBookCoach.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnBookCoach.setText("Book Coach");
        BtnBookCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBookCoachActionPerformed(evt);
            }
        });

        btnBookingList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBookingList.setText("Booking list");
        btnBookingList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBookingList, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnBookCoach, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBack)
                    .addComponent(BtnClear)
                    .addComponent(BtnBookCoach)
                    .addComponent(btnBookingList))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1101, 719));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void PhoneNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumTextFieldActionPerformed

    private void rbNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNoActionPerformed

    private void rbYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbYesActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        DefaultTableModel df = (DefaultTableModel) tableCoach.getModel();
        int selectedIndex = tableCoach.getSelectedRow();
        if (NameTextField.getText().isEmpty() || PhoneNumTextField.getText().isEmpty() || EmailTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please choose a coach to edit!", "Validation", JOptionPane.OK_OPTION);
        } else {
            try {
                int id = Integer.parseInt(df.getValueAt(selectedIndex, 0).toString());

                String sql = "UPDATE coaches SET name=?, phoneNo=?, email=?, gender=?, isAvailable=? WHERE id=?";

                PreparedStatement pst = new ConnectionDB(sql).tryConn();

                pst.setString(1, NameTextField.getText());
                pst.setString(2, PhoneNumTextField.getText());
                pst.setString(3, EmailTextField.getText());

                if (rbMale.isSelected()) {
                    pst.setString(4, rbMale.getText());
                } else if (rbFemale.isSelected()) {
                    pst.setString(4, rbFemale.getText());
                }

                if (rbYes.isSelected()) {
                    pst.setInt(5, 1);
                } else if (rbNo.isSelected()) {
                    pst.setInt(5, 0);
                }

                pst.setInt(6, id);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Successfully edit a coach!");
                tableUpdate();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        clearData();
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        try {
            String sql = "INSERT INTO `coaches` (`name`, `phoneNo`, `email`, `gender`, `isAvailable`) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement pst = new ConnectionDB(sql).tryConn();

            if (NameTextField.getText().isEmpty() || PhoneNumTextField.getText().isEmpty() || EmailTextField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all the details!", "Validation", JOptionPane.OK_OPTION);
            } else {
                pst.setString(1, NameTextField.getText());
                pst.setString(2, PhoneNumTextField.getText());
                pst.setString(3, EmailTextField.getText());

                if (rbMale.isSelected()) {
                    pst.setString(4, rbMale.getText());
                } else if (rbFemale.isSelected()) {
                    pst.setString(4, rbFemale.getText());
                }

                if (rbYes.isSelected()) {
                    pst.setInt(5, 1);
                } else if (rbNo.isSelected()) {
                    pst.setInt(5, 0);
                }

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Successfully add a coach!");
                tableUpdate();

                clearData();

                NameTextField.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BtnAddActionPerformed

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        Home home = new Home();
        this.dispose();
        home.setVisible(true);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void SearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextFieldActionPerformed

    }//GEN-LAST:event_SearchTextFieldActionPerformed

    private void BtnBookCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBookCoachActionPerformed
        BookCoach bookCoach = new BookCoach();
        this.dispose();
        bookCoach.setVisible(true);
    }//GEN-LAST:event_BtnBookCoachActionPerformed

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        clearData();
    }//GEN-LAST:event_BtnClearActionPerformed

    private void rbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemaleActionPerformed

    private void tableCoachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCoachMouseClicked
        DefaultTableModel df = (DefaultTableModel) tableCoach.getModel();
        int selectedIndex = tableCoach.getSelectedRow();

        NameTextField.setText(df.getValueAt(selectedIndex, 1).toString());
        PhoneNumTextField.setText(df.getValueAt(selectedIndex, 2).toString());
        EmailTextField.setText(df.getValueAt(selectedIndex, 3).toString());

        if (df.getValueAt(selectedIndex, 4).toString().equals(rbMale.getText())) {
            rbMale.setSelected(true);
        } else if (df.getValueAt(selectedIndex, 4).toString().equals(rbFemale.getText())) {
            rbFemale.setSelected(true);
        }

        if (df.getValueAt(selectedIndex, 5).toString().equals("Available")) {
            rbYes.setSelected(true);
        } else if (df.getValueAt(selectedIndex, 5).toString().equals("Not Available")) {
            rbNo.setSelected(true);
        }
    }//GEN-LAST:event_tableCoachMouseClicked

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        DefaultTableModel df = (DefaultTableModel) tableCoach.getModel();
        int selectedIndex = tableCoach.getSelectedRow();
        if (NameTextField.getText().isEmpty() || PhoneNumTextField.getText().isEmpty() || EmailTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please choose a coach to delete!", "Validation", JOptionPane.OK_OPTION);
        } else {
            try {
                int id = Integer.parseInt(df.getValueAt(selectedIndex, 0).toString());
                int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete this coach?", "Warning", JOptionPane.YES_NO_OPTION);

                if (dialogResult == JOptionPane.YES_NO_OPTION) {
                    String sql = "DELETE FROM coaches WHERE id=?";

                    PreparedStatement pst = new ConnectionDB(sql).tryConn();

                    pst.setInt(1, id);

                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Successfully delete a coach!");
                    tableUpdate();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        clearData();
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void SearchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTextFieldKeyReleased
        filter(SearchTextField.getText());
    }//GEN-LAST:event_SearchTextFieldKeyReleased

    private void btnBookingListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingListActionPerformed
        BookCoachList bookCoachList = new BookCoachList();
        this.dispose();
        bookCoachList.setVisible(true);
    }//GEN-LAST:event_btnBookingListActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnBookCoach;
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField PhoneNumTextField;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JButton btnBookingList;
    private javax.swing.ButtonGroup btnGrpAvail;
    private javax.swing.ButtonGroup btnGrpGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JRadioButton rbNo;
    private javax.swing.JRadioButton rbYes;
    private javax.swing.JTable tableCoach;
    // End of variables declaration//GEN-END:variables
}
