package databasemanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class view extends javax.swing.JFrame {

    public Statement statement;
    public static int id;
    public static String name;
    public static String address;
    public DefaultTableModel listModel;
    public String Quert;
    public ResultSet rs;
    public String state = "Add";
    public String click;

    public view() {
        initComponents();
        try {
            String url = "jdbc:derby://localhost:1527/students";
            String username = "root";
            String password = "1234";

            Connection con;

            con = DriverManager.getConnection(url, username, password);
            statement = con.createStatement();

            DefaultTableModel list = (DefaultTableModel) this.listoFStudents.getModel();
        } catch (SQLException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }

        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        
       
        txt_Address.setEnabled(false);
        txt_first_name.setEnabled(false);
        txt_last_name.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listoFStudents = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txt_Address = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_last_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_first_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 51, 51));
        setMaximumSize(new java.awt.Dimension(2147483647, 1000000000));

        jPanel3.setBackground(new java.awt.Color(185, 171, 73));

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        listoFStudents.setBackground(new java.awt.Color(255, 255, 153));
        listoFStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fullname", "ADDRESS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listoFStudents.setColumnSelectionAllowed(true);
        listoFStudents.setGridColor(new java.awt.Color(255, 255, 153));
        listoFStudents.setSelectionBackground(new java.awt.Color(255, 255, 153));
        listoFStudents.setSelectionForeground(new java.awt.Color(255, 255, 153));
        listoFStudents.getTableHeader().setReorderingAllowed(false);
        listoFStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listoFStudentsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listoFStudents);
        listoFStudents.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (listoFStudents.getColumnModel().getColumnCount() > 0) {
            listoFStudents.getColumnModel().getColumn(0).setResizable(false);
        }

        btnAdd.setBackground(new java.awt.Color(255, 204, 102));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 204, 102));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnSearch)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(186, 186, 186))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel2.setText("นามสกุล :");

        jLabel1.setText("ชื่อ :");

        jLabel3.setText("ที่อยู่ :");

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(8, 8, 8)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_last_name)
                    .addComponent(txt_Address)
                    .addComponent(txt_first_name))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(txt_first_name)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DATABASE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        try {
            
            //เช็ค state เป็น Add หรือ Update
            switch (state) {
                case "Add":
                    Quert = "INSERT INTO STUDENTS(FIRST_NAME , LAST_NAME , "
                            + "ADDRESS) VALUES ('" + txt_first_name.getText() + "' , '" + txt_last_name.getText() + ""
                            + "','" + txt_Address.getText() + "')";

                    statement.execute(Quert);

                    listoFStudents.setModel(new javax.swing.table.DefaultTableModel(
                            new Object[][]{},
                            new String[]{
                                "ID", "FullName", "Address"
                            }
                    ));
                    
                    //340-352 เป็นการเรียกข้อมูลใน Database อีกรอบหลังจากมีการเพิ่ม
                    Quert = "SELECT*FROM STUDENTS ";

                    rs = statement.executeQuery(Quert);

                    listModel = (DefaultTableModel) this.listoFStudents.getModel();

                    while (rs.next()) {

                        listModel.addRow(new Object[]{rs.getInt("ID"), rs.getString("FIRST_NAME") + "   " + rs.getString("LAST_NAME"), rs.getString("ADDRESS")});

                    }

                    listoFStudents.setModel(listModel);
                    
                    
                    txt_first_name.setText("");
                    txt_last_name.setText("");
                    txt_Address.setText("");

                    break;

                // สถานะ Update    
                case "Update":
                    Quert = "UPDATE STUDENTS set FIRST_NAME='" + txt_first_name.getText() + "',"
                            + "LAST_NAME='" + txt_last_name.getText() + "',ADDRESS='" + txt_Address.getText() + "'"
                            + " where id=" + click + "";

                    statement.execute(Quert);

                    txt_first_name.setText("");
                    txt_last_name.setText("");
                    txt_Address.setText("");

                    //ให้แสดงลิสใหม่โดยการล้างอันเดิมออกแล้วสร้างอันใหม่แทน
                    listoFStudents.setModel(new javax.swing.table.DefaultTableModel(
                            new Object[][]{},
                            new String[]{
                                "ID", "FullName", "Address"
                            }
                    ));
                    
                     //382-394 เป็นการเรียกข้อมูลใน Database อีกรอบหลังจากมีการ Update
                    Quert = "SELECT*FROM STUDENTS ";

                    rs = statement.executeQuery(Quert);

                    listModel = (DefaultTableModel) this.listoFStudents.getModel();

                    while (rs.next()) {

                        listModel.addRow(new Object[]{rs.getInt("ID"), rs.getString("FIRST_NAME") + "   " + rs.getString("LAST_NAME"), rs.getString("ADDRESS")});

                    }

                    listoFStudents.setModel(listModel);
                    state = "Add";
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Plese Check State", "State Dialog", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        //เซท list ใหม่ทุกครั้งเมื่อ ค้นหา เพื่อไม่ให้ได้ชุดข้อมูลซ้ำ
        listoFStudents.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID", "FullName", "Address"
                }
        ));
        try {
            //Like %ข้อความ% คือ ช้อความอยู่ตำแหน่งไหนก็ได้ %แทนตำแหน่ง
            Quert = "SELECT*FROM STUDENTS WHERE FIRST_NAME LIKE '%" + txt_search.getText() + "%'";

            rs = statement.executeQuery(Quert);

            listModel = (DefaultTableModel) this.listoFStudents.getModel();

            while (rs.next()) {

                listModel.addRow(new Object[]{rs.getInt("ID"), rs.getString("FIRST_NAME") + "   " + rs.getString("LAST_NAME"), rs.getString("ADDRESS")});

            }
            
            listoFStudents.setModel(listModel);
            
        } catch (SQLException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void listoFStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listoFStudentsMouseClicked

        click = "";
        try {
            
            //ให้ row เก็บ record ที่เลือก รูปแบบ Object
            int row = listoFStudents.getSelectedRow();
            //ให้ click แปลงค่า row เป็น String 
            click = (listoFStudents.getModel().getValueAt(row, 0).toString());

            Quert = "select * from STUDENTS WHERE ID=" + click + " ";
            rs = statement.executeQuery(Quert);

            if (rs.next()) {
                String first_name = rs.getString("FIRST_NAME");
                txt_first_name.setText(first_name);
                txt_last_name.setText(rs.getString("LAST_NAME"));
                txt_Address.setText(rs.getString("ADDRESS"));
            }
            state = "Update";
            txt_Address.setEnabled(true);
            txt_first_name.setEnabled(true);
            txt_last_name.setEnabled(true);

            btnDelete.setEnabled(true);
            btnDelete.setBackground(new java.awt.Color(255, 204, 102));
            btnUpdate.setEnabled(true);
            btnUpdate.setBackground(new java.awt.Color(255, 204, 102));
            btnSave.setEnabled(true);
            btnSave.setBackground(new java.awt.Color(255, 204, 102));
            btnCancel.setEnabled(true);
            btnCancel.setBackground(new java.awt.Color(255, 204, 102));

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_listoFStudentsMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        state = "Update";
        txt_Address.setEnabled(true);
        txt_first_name.setEnabled(true);
        txt_last_name.setEnabled(true);

        btnUpdate.setEnabled(true);
        btnUpdate.setBackground(new java.awt.Color(255, 204, 102));
        btnSave.setEnabled(true);
        btnSave.setBackground(new java.awt.Color(255, 204, 102));
        btnCancel.setEnabled(true);
        btnCancel.setBackground(new java.awt.Color(255, 204, 102));

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        state = "Add";
        txt_Address.setEnabled(true);
        txt_first_name.setEnabled(true);
        txt_last_name.setEnabled(true);
        btnSave.setEnabled(true);
        btnSave.setBackground(new java.awt.Color(255, 204, 102));
        btnCancel.setEnabled(true);
        btnCancel.setBackground(new java.awt.Color(255, 204, 102));

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        try {

            Quert = "DELETE FROM STUDENTS WHERE ID=" + click + "";

            statement.execute(Quert);

            listoFStudents.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "ID", "FullName", "Address"
                    }
            ));

            Quert = "SELECT*FROM STUDENTS WHERE FIRST_NAME LIKE '%" + txt_search.getText() + "%'";

            rs = statement.executeQuery(Quert);

            listModel = (DefaultTableModel) this.listoFStudents.getModel();

            while (rs.next()) {

                listModel.addRow(new Object[]{rs.getInt("ID"), rs.getString("FIRST_NAME") + "   " + rs.getString("LAST_NAME"), rs.getString("ADDRESS")});

            }

            listoFStudents.setModel(listModel);

            txt_Address.setText("");
            txt_first_name.setText("");
            txt_last_name.setText("");
            state= "Add";
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        txt_Address.setText("");
        txt_first_name.setText("");
        txt_last_name.setText("");

    }//GEN-LAST:event_btnCancelActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable listoFStudents;
    private javax.swing.JTextField txt_Address;
    private javax.swing.JTextField txt_first_name;
    private javax.swing.JTextField txt_last_name;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
