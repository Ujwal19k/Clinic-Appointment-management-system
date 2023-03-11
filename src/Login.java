
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        L_Uname_text = new javax.swing.JTextField();
        L_Ureg_b = new javax.swing.JLabel();
        L_Uname_b = new javax.swing.JLabel();
        L_Ureg_text = new javax.swing.JPasswordField();
        L_hp_b = new javax.swing.JButton();
        L_user_doc_b = new javax.swing.JButton();
        R_pass_check = new javax.swing.JCheckBox();
        L_user_b = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(275, 400));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\Final_MP\\src\\Images\\login_275_179_text.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 270, 400);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 275, 400);

        jPanel3.setBackground(new java.awt.Color(84, 84, 84));
        jPanel3.setPreferredSize(new java.awt.Dimension(475, 325));

        L_Uname_text.setBackground(new java.awt.Color(217, 217, 217));
        L_Uname_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        L_Uname_text.setToolTipText("Username should not contain symbols");
        L_Uname_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_Uname_textActionPerformed(evt);
            }
        });

        L_Ureg_b.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\pictures\\pass.png")); // NOI18N

        L_Uname_b.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\pictures\\40_40.png")); // NOI18N

        L_Ureg_text.setBackground(new java.awt.Color(217, 217, 217));
        L_Ureg_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        L_Ureg_text.setToolTipText("Password length should be <= 8");

        L_hp_b.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        L_hp_b.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\pictures\\home_icon_242_4.png")); // NOI18N
        L_hp_b.setText("Home Page");
        L_hp_b.setToolTipText("Open Home Page");
        L_hp_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L_hp_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L_hp_bMouseExited(evt);
            }
        });
        L_hp_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_hp_bActionPerformed(evt);
            }
        });

        L_user_doc_b.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        L_user_doc_b.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\Icons\\HMS ICON\\login.png")); // NOI18N
        L_user_doc_b.setText("Doctor Login");
        L_user_doc_b.setToolTipText("Only a Doctor can Login");
        L_user_doc_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L_user_doc_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L_user_doc_bMouseExited(evt);
            }
        });
        L_user_doc_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_user_doc_bActionPerformed(evt);
            }
        });

        R_pass_check.setBackground(new java.awt.Color(84, 84, 84));
        R_pass_check.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        R_pass_check.setForeground(new java.awt.Color(255, 255, 255));
        R_pass_check.setText("Show Password\n");
        R_pass_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_pass_checkActionPerformed(evt);
            }
        });

        L_user_b.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        L_user_b.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\Icons\\HMS ICON\\login.png")); // NOI18N
        L_user_b.setText("Staff Login");
        L_user_b.setToolTipText("Only a Staff Member can Login");
        L_user_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L_user_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L_user_bMouseExited(evt);
            }
        });
        L_user_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_user_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(L_Uname_b, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(L_Ureg_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_Uname_text)
                    .addComponent(L_Ureg_text)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(R_pass_check, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 162, Short.MAX_VALUE)))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(L_hp_b)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(L_user_b)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(L_user_doc_b)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(L_Uname_text))
                    .addComponent(L_Uname_b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(L_Ureg_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(L_Ureg_text)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(R_pass_check, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_hp_b, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_user_doc_b, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_user_b, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        L_Uname_text.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel3);
        jPanel3.setBounds(270, 70, 475, 330);

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\pictures\\up_475_75_text.png")); // NOI18N

        Exit.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\Icons\\exit_46_69.png")); // NOI18N
        Exit.setToolTipText("Exit");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(54, 54, 54));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Exit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(260, 0, 490, 70);

        setSize(new java.awt.Dimension(745, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void L_Uname_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_Uname_textActionPerformed
       
    }//GEN-LAST:event_L_Uname_textActionPerformed

    private void L_user_doc_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_user_doc_bMouseExited
        L_user_doc_b.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_L_user_doc_bMouseExited

    private void L_user_doc_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_user_doc_bMouseEntered
        L_user_doc_b.setBackground(new Color(126,217,87));
    }//GEN-LAST:event_L_user_doc_bMouseEntered

    private void L_hp_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_hp_bMouseEntered
        L_hp_b.setBackground(new Color(92, 225, 230));
    }//GEN-LAST:event_L_hp_bMouseEntered

    private void L_hp_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_hp_bMouseExited
        L_hp_b.setBackground(new Color(240,240,240));     
    }//GEN-LAST:event_L_hp_bMouseExited

    private void L_user_doc_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_user_doc_bActionPerformed
    String doc="select * from doc_login where Username= ? and Password= ?";
     try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic appointment","root","");
         PreparedStatement pt1=con.prepareStatement(doc);
         pt1.setString(1,L_Uname_text.getText());
         pt1.setString(2,new String(L_Ureg_text.getPassword()));
         ResultSet rs=pt1.executeQuery();
         if(rs.next())
         {  JOptionPane.showMessageDialog(null,"Welcome Dr. " + L_Uname_text.getText(),"Successful Login",JOptionPane.PLAIN_MESSAGE);
             Doctors_window d=new Doctors_window();
            d.setVisible(true);                          
            dispose();
         }
         else
         {
            JOptionPane.showMessageDialog(null,"Invalid Username or Password","Unsuccessful login",JOptionPane.ERROR_MESSAGE);
         }
         con.close();
      }
        catch(Exception ex){
         JOptionPane.showMessageDialog(null,"Unable to Connect Database..");
        }
    }//GEN-LAST:event_L_user_doc_bActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);// Exit
    }//GEN-LAST:event_ExitMouseClicked

    private void L_hp_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_hp_bActionPerformed
            Home_Page r=new Home_Page();
            r.setVisible(true);        // Link register button to register page
            dispose();
    }//GEN-LAST:event_L_hp_bActionPerformed

    private void R_pass_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_pass_checkActionPerformed
        if( R_pass_check.isSelected())
        { L_Ureg_text.setEchoChar((char)0);
        }
        else
        { L_Ureg_text.setEchoChar('*');
        }  
    }//GEN-LAST:event_R_pass_checkActionPerformed

    private void L_user_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_user_bMouseEntered
        L_user_b.setBackground(new Color(126,217,87));
    }//GEN-LAST:event_L_user_bMouseEntered

    private void L_user_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_user_bMouseExited
       L_user_b.setBackground(new Color(240,240,240)); 
    }//GEN-LAST:event_L_user_bMouseExited

    private void L_user_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_user_bActionPerformed
    String q="select * from staff_login where Username= ? and Password= ?";
     try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic appointment","root","");
         PreparedStatement pt=con.prepareStatement(q);
         
         pt.setString(1,L_Uname_text.getText());
         
         pt.setString(2,new String(L_Ureg_text.getPassword()));
         
         ResultSet rs=pt.executeQuery();
         if(rs.next())
         {  JOptionPane.showMessageDialog(null,"Welcome Staff Member: " + L_Uname_text.getText(),"Successful Login",JOptionPane.PLAIN_MESSAGE);
             Appointment_s a=new Appointment_s();
                a.setVisible(true);
                dispose();
         }
         else
         {
            JOptionPane.showMessageDialog(null,"Invalid Username or Password for Staff","Unsuccessful login",JOptionPane.ERROR_MESSAGE);
         }
         con.close();
      }
        catch(Exception ex){
         JOptionPane.showMessageDialog(null,"Unable to Connect Database..");
        }
    }//GEN-LAST:event_L_user_bActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel L_Uname_b;
    private javax.swing.JTextField L_Uname_text;
    private javax.swing.JLabel L_Ureg_b;
    private javax.swing.JPasswordField L_Ureg_text;
    private javax.swing.JButton L_hp_b;
    private javax.swing.JButton L_user_b;
    private javax.swing.JButton L_user_doc_b;
    private javax.swing.JCheckBox R_pass_check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
