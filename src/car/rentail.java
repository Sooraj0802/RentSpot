
package car;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class rentail extends javax.swing.JFrame {

    public rentail() {
        initComponents();

        LoadCategory();
        txtdate.setDateFormatString("yyyy/MM/dd");
        txtdue.setDateFormatString("yyyy/MM/dd");
      

    }

    Connection con;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
    ResultSet rs;
    ResultSet rs1;

    public void LoadCategory() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/carrental", "root", "");
            pst = con.prepareStatement("SELECT * FROM car_reg");
            rs = pst.executeQuery();
            jComboBox1.removeAllItems();

            while (rs.next()) {
                jComboBox1.addItem(rs.getString(2));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

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
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_custid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtavl = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtfee = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JDateChooser();
        txtdue = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rental", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 140, 28));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Car ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 110, 30));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txt_custid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_custidActionPerformed(evt);
            }
        });
        txt_custid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_custidKeyPressed(evt);
            }
        });
        jPanel1.add(txt_custid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 140, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 140, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Due Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 255, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 21)); // NOI18N
        jButton1.setText("ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 120, 37));
        jPanel1.add(txtavl, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 420, 140, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 21)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 150, 37));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Retail fee");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));
        jPanel1.add(txtfee, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 139, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Available");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 140, -1));
        jPanel1.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 140, -1));
        jPanel1.add(txtdue, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 140, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("ENTER CUSTOMER DETAILS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 204, 204));
        jLabel9.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 21)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/WhatsApp Image 2023-05-08 at 9.17.22 PM.jpeg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 750, 670));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 490, 630));

        jLabel11.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 21)); // NOI18N
        jLabel11.setText("RENTAL DETAIL");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 250, 80));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car/czarpic4.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, -20, 1100, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try {

            String name = jComboBox1.getSelectedItem().toString();
            String custid = txt_custid.getText();
            String fee = txtfee.getText();
            SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
            String date = Date_Format.format(txtdate.getDate());
            SimpleDateFormat Date_Format1 = new SimpleDateFormat("yyyy-MM-dd");
            String date2 = Date_Format1.format(txtdue.getDate());

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/carrental", "root", "");
            pst = con.prepareStatement("insert into rental  (car_id,cust_id,fee,date,due)values(?,?,?,?,?)");

            pst.setString(1, name);
            pst.setString(2, custid);
            pst.setString(3, fee);
            pst.setString(4, date);
            pst.setString(5, date2);
            pst.executeUpdate();

            pst1 = con.prepareStatement("update car_reg set available = 'No' where car_reg = ?  ");
            pst1.setString(1, name);
            pst1.executeUpdate();
            
            

            JOptionPane.showMessageDialog(this, "Sucsessfully Saved");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(rentail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(rentail.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_custidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_custidActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txt_custidActionPerformed

    private void txt_custidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_custidKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            try {

                System.out.println("hi");
                String custid = txt_custid.getText();

                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3307/carrental", "root", "");
                pst = con.prepareStatement("select * from customer where cust_id = ? ");
                pst.setString(1, custid);
                rs = pst.executeQuery();

                if (rs.next() == false) {

                    JOptionPane.showMessageDialog(null, "Customer No not Found");
                } else {
                    String productname = rs.getString("name");

                    txtname.setText(productname.trim());

                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txt_custidKeyPressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

        try {

            String car_id = jComboBox1.getSelectedItem().toString();

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/carrental", "root", "");
            pst2 = con.prepareStatement("select * from car_reg where car_reg = ? ");
            pst2.setString(1, car_id);
            rs1 = pst2.executeQuery();

            if (rs1.next() == false) 
            {
                JOptionPane.showMessageDialog(null, "Car No not Found");
            } 
            else {            
                String available = rs1.getString("available");
                txtavl.setText(available.trim());
                
               

                if (available.equals("Yes") )
                {   
                    txt_custid.setEnabled(true);
                    txtname.setEnabled(true);
                    txtfee.setEnabled(true);
                    txtdate.setEnabled(true);
                    txtdue.setEnabled(true);
                } 
                else 
                {           
                    txt_custid.setEnabled(false);
                    txtname.setEnabled(false);
                    txtdate.setEnabled(false);
                    txtdue.setEnabled(false);
                     txtfee.setEnabled(false);
                }

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(rentail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rentail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rentail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rentail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rentail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_custid;
    private javax.swing.JTextField txtavl;
    private com.toedter.calendar.JDateChooser txtdate;
    private com.toedter.calendar.JDateChooser txtdue;
    private javax.swing.JTextField txtfee;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
