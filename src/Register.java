
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_grp_gender = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        R_Left = new javax.swing.JPanel();
        R_left_logo = new javax.swing.JLabel();
        R_left_name = new javax.swing.JLabel();
        R_back = new javax.swing.JButton();
        R_Up = new javax.swing.JPanel();
        R_up_text = new javax.swing.JLabel();
        R_up_exit = new javax.swing.JLabel();
        R_Down = new javax.swing.JPanel();
        R_user = new javax.swing.JLabel();
        R_user_T = new javax.swing.JTextField();
        R_pass = new javax.swing.JLabel();
        R_pass_T = new javax.swing.JTextField();
        R_cont = new javax.swing.JLabel();
        R_gender_rb1 = new javax.swing.JRadioButton();
        R_gender_rb2 = new javax.swing.JRadioButton();
        R_gender = new javax.swing.JLabel();
        R_cont_T = new javax.swing.JTextField();
        R_addr = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        R_addr_T = new javax.swing.JTextArea();
        R_age_spinfield = new com.toedter.components.JSpinField();
        R_age = new javax.swing.JLabel();
        R_confirm_b = new javax.swing.JButton();
        R_des_text = new javax.swing.JLabel();
        R_des_combo = new javax.swing.JComboBox<>();
        R_user_V = new javax.swing.JLabel();
        R_pass_V = new javax.swing.JLabel();
        R_cont_V = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(84, 84, 84));
        setUndecorated(true);

        R_Left.setBackground(new java.awt.Color(54, 54, 54));
        R_Left.setPreferredSize(new java.awt.Dimension(240, 100));

        R_left_logo.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\pictures\\REG_HONE LOGO.png")); // NOI18N

        R_left_name.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\pictures\\REGISTER LOGO DOWN.png")); // NOI18N

        R_back.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        R_back.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\pictures\\hp\\back.png")); // NOI18N
        R_back.setText("Back");
        R_back.setToolTipText("Open Home Page");
        R_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                R_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                R_backMouseExited(evt);
            }
        });
        R_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout R_LeftLayout = new javax.swing.GroupLayout(R_Left);
        R_Left.setLayout(R_LeftLayout);
        R_LeftLayout.setHorizontalGroup(
            R_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(R_LeftLayout.createSequentialGroup()
                .addGroup(R_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(R_LeftLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(R_left_name, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                    .addGroup(R_LeftLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(R_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(86, 86, 86))
                    .addGroup(R_LeftLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(R_left_logo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );
        R_LeftLayout.setVerticalGroup(
            R_LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(R_LeftLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(R_back, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(R_left_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(R_left_name, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addGap(116, 116, 116))
        );

        R_Up.setBackground(new java.awt.Color(57, 56, 56));
        R_Up.setPreferredSize(new java.awt.Dimension(580, 80));

        R_up_text.setFont(new java.awt.Font("Broadway", 0, 40)); // NOI18N
        R_up_text.setForeground(new java.awt.Color(255, 255, 255));
        R_up_text.setText("Register Form");

        R_up_exit.setFont(new java.awt.Font("Aharoni", 0, 45)); // NOI18N
        R_up_exit.setForeground(new java.awt.Color(255, 255, 255));
        R_up_exit.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\Icons\\HMS ICON\\exit_44_44.png")); // NOI18N
        R_up_exit.setToolTipText("Exit");
        R_up_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                R_up_exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout R_UpLayout = new javax.swing.GroupLayout(R_Up);
        R_Up.setLayout(R_UpLayout);
        R_UpLayout.setHorizontalGroup(
            R_UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(R_UpLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(R_up_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(122, 122, 122)
                .addComponent(R_up_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        R_UpLayout.setVerticalGroup(
            R_UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(R_UpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(R_UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(R_UpLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(R_up_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(R_up_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        R_Down.setBackground(new java.awt.Color(100, 99, 99));
        R_Down.setPreferredSize(new java.awt.Dimension(580, 420));

        R_user.setFont(new java.awt.Font("David", 0, 24)); // NOI18N
        R_user.setForeground(new java.awt.Color(255, 255, 255));
        R_user.setText("Username :");
        R_user.setPreferredSize(new java.awt.Dimension(112, 30));

        R_user_T.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        R_user_T.setToolTipText("eg: Xyz123 (length <= 10)");
        R_user_T.setPreferredSize(new java.awt.Dimension(6, 30));
        R_user_T.setVerifyInputWhenFocusTarget(false);
        R_user_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_user_TActionPerformed(evt);
            }
        });
        R_user_T.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                R_user_TKeyReleased(evt);
            }
        });

        R_pass.setFont(new java.awt.Font("David", 0, 24)); // NOI18N
        R_pass.setForeground(new java.awt.Color(255, 255, 255));
        R_pass.setText("Password :");
        R_pass.setPreferredSize(new java.awt.Dimension(105, 25));

        R_pass_T.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        R_pass_T.setToolTipText("eg: Xyz@123. ( only . @ ! _ are allowed )");
        R_pass_T.setPreferredSize(new java.awt.Dimension(6, 30));
        R_pass_T.setVerifyInputWhenFocusTarget(false);
        R_pass_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_pass_TActionPerformed(evt);
            }
        });
        R_pass_T.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                R_pass_TKeyReleased(evt);
            }
        });

        R_cont.setFont(new java.awt.Font("David", 0, 24)); // NOI18N
        R_cont.setForeground(new java.awt.Color(255, 255, 255));
        R_cont.setText("Contact :");

        R_gender_rb1.setBackground(new java.awt.Color(100, 99, 99));
        bt_grp_gender.add(R_gender_rb1);
        R_gender_rb1.setFont(new java.awt.Font("David", 0, 21)); // NOI18N
        R_gender_rb1.setForeground(new java.awt.Color(255, 255, 255));
        R_gender_rb1.setText("Male");
        R_gender_rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_gender_rb1ActionPerformed(evt);
            }
        });

        R_gender_rb2.setBackground(new java.awt.Color(100, 99, 99));
        bt_grp_gender.add(R_gender_rb2);
        R_gender_rb2.setFont(new java.awt.Font("David", 0, 21)); // NOI18N
        R_gender_rb2.setForeground(new java.awt.Color(255, 255, 255));
        R_gender_rb2.setText("Female");
        R_gender_rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_gender_rb2ActionPerformed(evt);
            }
        });

        R_gender.setFont(new java.awt.Font("David", 0, 24)); // NOI18N
        R_gender.setForeground(new java.awt.Color(255, 255, 255));
        R_gender.setText("Gender :");

        R_cont_T.setColumns(10);
        R_cont_T.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        R_cont_T.setVerifyInputWhenFocusTarget(false);
        R_cont_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_cont_TActionPerformed(evt);
            }
        });
        R_cont_T.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                R_cont_TKeyReleased(evt);
            }
        });

        R_addr.setFont(new java.awt.Font("David", 0, 24)); // NOI18N
        R_addr.setForeground(new java.awt.Color(255, 255, 255));
        R_addr.setText("Address :");

        R_addr_T.setColumns(20);
        R_addr_T.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        R_addr_T.setRows(5);
        R_addr_T.setToolTipText("Address should have Pincode");
        R_addr_T.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                R_addr_TKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(R_addr_T);

        R_age.setFont(new java.awt.Font("David", 0, 24)); // NOI18N
        R_age.setForeground(new java.awt.Color(255, 255, 255));
        R_age.setText("Age :");

        R_confirm_b.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        R_confirm_b.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\Icons\\HMS ICON\\login.png")); // NOI18N
        R_confirm_b.setText("Confirm");
        R_confirm_b.setToolTipText("Please check the details before you click..");
        R_confirm_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                R_confirm_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                R_confirm_bMouseExited(evt);
            }
        });
        R_confirm_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_confirm_bActionPerformed(evt);
            }
        });

        R_des_text.setFont(new java.awt.Font("David", 0, 24)); // NOI18N
        R_des_text.setForeground(new java.awt.Color(255, 255, 255));
        R_des_text.setText("Designation:");

        R_des_combo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        R_des_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Staff" }));
        R_des_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_des_comboActionPerformed(evt);
            }
        });

        R_user_V.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        R_user_V.setForeground(new java.awt.Color(255, 255, 255));
        R_user_V.setText("Username should not contain symbols");

        R_pass_V.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        R_pass_V.setForeground(new java.awt.Color(255, 255, 255));
        R_pass_V.setText("Password length should be <= 8");

        R_cont_V.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        R_cont_V.setForeground(new java.awt.Color(255, 255, 255));
        R_cont_V.setText("Enter 10 digit Number");

        javax.swing.GroupLayout R_DownLayout = new javax.swing.GroupLayout(R_Down);
        R_Down.setLayout(R_DownLayout);
        R_DownLayout.setHorizontalGroup(
            R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(R_DownLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(R_DownLayout.createSequentialGroup()
                        .addGroup(R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(R_DownLayout.createSequentialGroup()
                                .addGroup(R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(R_addr, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(R_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, R_DownLayout.createSequentialGroup()
                                .addGroup(R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(R_cont, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(R_gender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(R_DownLayout.createSequentialGroup()
                                .addGroup(R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(R_cont_T)
                                    .addComponent(R_pass_T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(R_pass_V, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                    .addComponent(R_cont_V, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(R_DownLayout.createSequentialGroup()
                                .addGroup(R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(R_DownLayout.createSequentialGroup()
                                        .addComponent(R_gender_rb2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(R_gender_rb1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(R_DownLayout.createSequentialGroup()
                                        .addComponent(R_confirm_b, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                        .addGap(136, 136, 136))
                                    .addComponent(jScrollPane1))
                                .addGap(125, 125, 125))))
                    .addGroup(R_DownLayout.createSequentialGroup()
                        .addGroup(R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(R_user, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_des_text, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(R_user_T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(R_des_combo, 0, 175, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(R_user_V, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(R_DownLayout.createSequentialGroup()
                        .addComponent(R_age, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R_age_spinfield, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        R_DownLayout.setVerticalGroup(
            R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, R_DownLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(R_DownLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(R_des_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(R_des_text, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_user_T, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_user_V, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(R_pass_V, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(R_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(R_pass_T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20)
                .addGroup(R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R_cont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R_cont_V, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_cont_T, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_gender_rb2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_gender_rb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R_age_spinfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(R_age, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(R_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R_addr, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(R_confirm_b, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        R_user_T.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(R_Left, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R_Up, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                    .addComponent(R_Down, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(R_Up, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R_Down, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(R_Left, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1016, 555));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void R_up_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R_up_exitMouseClicked
         System.exit(0);
    }//GEN-LAST:event_R_up_exitMouseClicked

    private void R_user_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_user_TActionPerformed
        
    }//GEN-LAST:event_R_user_TActionPerformed

    private void R_pass_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_pass_TActionPerformed
       
    }//GEN-LAST:event_R_pass_TActionPerformed

    private void R_gender_rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_gender_rb1ActionPerformed
       
    }//GEN-LAST:event_R_gender_rb1ActionPerformed

    private void R_cont_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_cont_TActionPerformed
       
    }//GEN-LAST:event_R_cont_TActionPerformed

    private void R_confirm_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_confirm_bActionPerformed
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic appointment","root","");
        if(R_des_combo.getSelectedItem()=="Doctor")
        {
            //if Designation is doctor then data will be stored in doc_register annd doc_login
            String doc = "insert into doc_register values (?,?,?,?,?,?,?)"; 
            String login="insert into doc_login values(?,?)";       
            PreparedStatement dt=con.prepareStatement (login);
            PreparedStatement am=con.prepareStatement (doc);

            String combox="";                                  //Designation-combobox
            combox= R_des_combo.getSelectedItem().toString();
            am.setString (1, combox);               

            am.setString(2,R_user_T.getText());
            dt.setString(1,R_user_T.getText());                 //Username-text field

            dt.setString(2,R_pass_T.getText());
            am.setString (3,R_pass_T.getText());                //Password-pass field

            am.setString(4,R_cont_T.getText());                 //Contact - text field

            String g="";   
                if(R_gender_rb2.isSelected())                    //gender - radio B
                 { 
                    g=R_gender_rb2.getText();
                 }
                 if(R_gender_rb1.isSelected())                       
                 {
                    g=R_gender_rb1.getText();
                 }

            am.setString(5,g);

            am.setInt(6,R_age_spinfield.getValue());       //Age-spin field

            am.setString(7,R_addr_T.getText());         //address - text area

            am.executeUpdate();                         //message box
            dt.executeUpdate();
            }//bracket of if
                else{
                        String staff = "insert into staff_register values (?,?,?,?,?,?,?)";
                        String login1="insert into staff_login values(?,?)";
                        PreparedStatement rt=con.prepareStatement (login1);
                        PreparedStatement sf=con.prepareStatement (staff);
                        String combox="";
                        combox= R_des_combo.getSelectedItem().toString();
                        sf.setString (1, combox);                           //Designation
                        
                        sf.setString(2,R_user_T.getText());
                        rt.setString(1,R_user_T.getText());                 //Username

                        rt.setString(2,R_pass_T.getText());
                        sf.setString (3,R_pass_T.getText());                //Password
                        sf.setString(4,R_cont_T.getText());                 //Contact

                        String g="";   
                        if(R_gender_rb2.isSelected())
                        { 
                            g=R_gender_rb2.getText();
                        }
                        if(R_gender_rb1.isSelected())                        //gender - radio B
                        {
                            g=R_gender_rb1.getText();
                        }

                        sf.setString(5,g);

                        sf.setInt(6,R_age_spinfield.getValue());       //Age-spin field

                        sf.setString(7,R_addr_T.getText());         //address

                        sf.executeUpdate();                         //message box
                        rt.executeUpdate();

                    }//else end
          JOptionPane. showMessageDialog(null, "Successfully Registered") ;
          R_user_T.setText("");
          R_pass_T.setText("");
          R_cont_T.setText("");
          R_addr_T.setText("");
          
          con. close();
          }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Unable to Connect..");
         }
    }//GEN-LAST:event_R_confirm_bActionPerformed

    private void R_des_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_des_comboActionPerformed
       
    }//GEN-LAST:event_R_des_comboActionPerformed

    private void R_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_backActionPerformed
        Home_Page r=new Home_Page();
            r.setVisible(true);        // Link register button to register page
            dispose(); 
    }//GEN-LAST:event_R_backActionPerformed

    private void R_confirm_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R_confirm_bMouseEntered
        R_confirm_b.setBackground(new Color(102,255,255));// Confirm enter
    }//GEN-LAST:event_R_confirm_bMouseEntered

    private void R_confirm_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R_confirm_bMouseExited
        R_confirm_b.setBackground(new Color(240,240,240));// Confirm exit
    }//GEN-LAST:event_R_confirm_bMouseExited

    private void R_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R_backMouseEntered
         R_back.setBackground(new Color(7, 255, 136));
    }//GEN-LAST:event_R_backMouseEntered

    private void R_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R_backMouseExited
        R_back.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_R_backMouseExited

    private void R_user_TKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R_user_TKeyReleased
        String PATTERN="^[a-zA-Z0-9]{0,10}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(R_user_T.getText());
        if(!match.matches())
        {
            R_user_V.setText("length <= 10 and no symbols are allowed");
        }
        else
        {
	R_user_V.setText(null);
        }

    }//GEN-LAST:event_R_user_TKeyReleased

    private void R_pass_TKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R_pass_TKeyReleased
        String PATT="^[A-Za-z0-9.@!_]{0,8}$";
        Pattern patt = Pattern.compile(PATT);
        Matcher match = patt.matcher(R_pass_T.getText());
        if(!match.matches())
        {
                R_pass_V.setText("Enter valid password");
        }
        else
        {
                R_pass_V.setText(null);
        }
    }//GEN-LAST:event_R_pass_TKeyReleased

    private void R_cont_TKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R_cont_TKeyReleased
        String PATT="^[0-9]{0,10}";
        Pattern patt = Pattern.compile(PATT);
        Matcher match = patt.matcher(R_cont_T.getText());
        if(!match.matches())
        {
                R_cont_V.setText("Length is exceeding 10");
        }
        else
        {
                R_cont_V.setText(null);
        }
    }//GEN-LAST:event_R_cont_TKeyReleased

    private void R_addr_TKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R_addr_TKeyReleased
       
    }//GEN-LAST:event_R_addr_TKeyReleased

    private void R_gender_rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_gender_rb2ActionPerformed
       
    }//GEN-LAST:event_R_gender_rb2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel R_Down;
    private javax.swing.JPanel R_Left;
    private javax.swing.JPanel R_Up;
    private javax.swing.JLabel R_addr;
    private javax.swing.JTextArea R_addr_T;
    private javax.swing.JLabel R_age;
    private com.toedter.components.JSpinField R_age_spinfield;
    private javax.swing.JButton R_back;
    private javax.swing.JButton R_confirm_b;
    private javax.swing.JLabel R_cont;
    private javax.swing.JTextField R_cont_T;
    private javax.swing.JLabel R_cont_V;
    private javax.swing.JComboBox<String> R_des_combo;
    private javax.swing.JLabel R_des_text;
    private javax.swing.JLabel R_gender;
    private javax.swing.JRadioButton R_gender_rb1;
    private javax.swing.JRadioButton R_gender_rb2;
    private javax.swing.JLabel R_left_logo;
    private javax.swing.JLabel R_left_name;
    private javax.swing.JLabel R_pass;
    private javax.swing.JTextField R_pass_T;
    private javax.swing.JLabel R_pass_V;
    private javax.swing.JLabel R_up_exit;
    private javax.swing.JLabel R_up_text;
    private javax.swing.JLabel R_user;
    private javax.swing.JTextField R_user_T;
    private javax.swing.JLabel R_user_V;
    private javax.swing.ButtonGroup bt_grp_gender;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
