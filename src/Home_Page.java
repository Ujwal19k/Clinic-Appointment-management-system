
import java.awt.Color;

public class Home_Page extends javax.swing.JFrame {

    public Home_Page() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panelup = new javax.swing.JPanel();
        hp_logo = new javax.swing.JLabel();
        hp_text = new javax.swing.JLabel();
        hp_Exit = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Home = new javax.swing.JPanel();
        Home_panel = new javax.swing.JPanel();
        home_reg = new javax.swing.JLabel();
        home_login = new javax.swing.JLabel();
        home_reg_b = new javax.swing.JButton();
        home_login_b = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Our_Doctors = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        About_us = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Contact_Us = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Panelup.setBackground(new java.awt.Color(54, 53, 53));

        hp_logo.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\pictures\\hp\\hp  logo.png")); // NOI18N

        hp_text.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\pictures\\home page_text.png")); // NOI18N

        hp_Exit.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        hp_Exit.setForeground(new java.awt.Color(255, 255, 255));
        hp_Exit.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\Icons\\HMS ICON\\exit buton.png")); // NOI18N
        hp_Exit.setToolTipText("Exit");
        hp_Exit.setPreferredSize(new java.awt.Dimension(75, 75));
        hp_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hp_ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelupLayout = new javax.swing.GroupLayout(Panelup);
        Panelup.setLayout(PanelupLayout);
        PanelupLayout.setHorizontalGroup(
            PanelupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelupLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(hp_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hp_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60)
                .addComponent(hp_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        PanelupLayout.setVerticalGroup(
            PanelupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hp_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelupLayout.createSequentialGroup()
                .addGroup(PanelupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelupLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(hp_text, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(PanelupLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(hp_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(16, 16, 16)))
                .addGap(11, 11, 11))
        );

        jTabbedPane1.setBackground(new java.awt.Color(217, 217, 217));
        jTabbedPane1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        Home.setBackground(new java.awt.Color(217, 217, 217));

        Home_panel.setBackground(new java.awt.Color(66, 66, 66));

        home_reg.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\Icons\\hp _ regoister.png")); // NOI18N

        home_login.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\Icons\\login _hp.png")); // NOI18N

        home_reg_b.setBackground(new java.awt.Color(217, 217, 217));
        home_reg_b.setFont(new java.awt.Font("Comic Sans MS", 0, 17)); // NOI18N
        home_reg_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrow-20-24.png"))); // NOI18N
        home_reg_b.setText("Register Page");
        home_reg_b.setToolTipText("If you are new to the clinic, Register here");
        home_reg_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_reg_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_reg_bMouseExited(evt);
            }
        });
        home_reg_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_reg_bActionPerformed(evt);
            }
        });

        home_login_b.setBackground(new java.awt.Color(217, 217, 217));
        home_login_b.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        home_login_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        home_login_b.setText("Login Page");
        home_login_b.setToolTipText("Open the Login Page for Doctor & Staff ");
        home_login_b.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        home_login_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_login_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_login_bMouseExited(evt);
            }
        });
        home_login_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_login_bActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\Icons\\hp _down.png")); // NOI18N

        javax.swing.GroupLayout Home_panelLayout = new javax.swing.GroupLayout(Home_panel);
        Home_panel.setLayout(Home_panelLayout);
        Home_panelLayout.setHorizontalGroup(
            Home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_panelLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(Home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(home_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(home_login_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(278, 278, 278)
                .addGroup(Home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home_reg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Home_panelLayout.createSequentialGroup()
                        .addComponent(home_reg_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9)))
                .addGap(133, 133, 133))
            .addGroup(Home_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Home_panelLayout.setVerticalGroup(
            Home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_panelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(Home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(home_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(Home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(home_login_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(home_reg_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 945, Short.MAX_VALUE)
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Home", Home);

        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\pictures\\newww.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Our_DoctorsLayout = new javax.swing.GroupLayout(Our_Doctors);
        Our_Doctors.setLayout(Our_DoctorsLayout);
        Our_DoctorsLayout.setHorizontalGroup(
            Our_DoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Our_DoctorsLayout.setVerticalGroup(
            Our_DoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Our Doctors", Our_Doctors);

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\pictures\\About uis\\page_945_417.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout About_usLayout = new javax.swing.GroupLayout(About_us);
        About_us.setLayout(About_usLayout);
        About_usLayout.setHorizontalGroup(
            About_usLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        About_usLayout.setVerticalGroup(
            About_usLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("About Us", About_us);

        jLabel4.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\pictures\\abt usssss.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Contact_UsLayout = new javax.swing.GroupLayout(Contact_Us);
        Contact_Us.setLayout(Contact_UsLayout);
        Contact_UsLayout.setHorizontalGroup(
            Contact_UsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Contact_UsLayout.setVerticalGroup(
            Contact_UsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Contact Us", Contact_Us);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panelup, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        setSize(new java.awt.Dimension(950, 572));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hp_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hp_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_hp_ExitMouseClicked

    private void home_reg_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_reg_bMouseEntered
        home_reg_b.setBackground(new Color(92, 225, 230));
        
    }//GEN-LAST:event_home_reg_bMouseEntered

    private void home_reg_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_reg_bMouseExited
        home_reg_b.setBackground(new Color(240,240,240)); 
    }//GEN-LAST:event_home_reg_bMouseExited

    private void home_reg_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_reg_bActionPerformed
        Register r=new Register();
        r.setVisible(true);        // Link register button to register page
        dispose();
    }//GEN-LAST:event_home_reg_bActionPerformed

    private void home_login_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_login_bMouseEntered
       home_login_b.setBackground(new Color(92, 225, 230)); 
    }//GEN-LAST:event_home_login_bMouseEntered

    private void home_login_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_login_bMouseExited
        home_login_b.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_home_login_bMouseExited

    private void home_login_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_login_bActionPerformed
         Login r=new Login();
         r.setVisible(true);        // Link register button to register page
         dispose();
    }//GEN-LAST:event_home_login_bActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel About_us;
    private javax.swing.JPanel Contact_Us;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Home_panel;
    private javax.swing.JPanel Our_Doctors;
    private javax.swing.JPanel Panelup;
    private javax.swing.JLabel home_login;
    private javax.swing.JButton home_login_b;
    private javax.swing.JLabel home_reg;
    private javax.swing.JButton home_reg_b;
    private javax.swing.JLabel hp_Exit;
    private javax.swing.JLabel hp_logo;
    private javax.swing.JLabel hp_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
