
import java.awt.Color;
import static java.lang.Math.E;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Appointment_s extends javax.swing.JFrame {

    public Appointment_s() {
        initComponents();
        //setDetails();
        //show_user();
    }
    
    public void setDetails()
    {
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic appointment","root","");      
            Statement st=con.createStatement();
            String s=("select * from book");
            ResultSet rs= st.executeQuery(s); 
            //if(Ap_table.getRowCount()==0)
            
            while(rs.next()){
            String pn=rs.getString("patient_name");
            String gender = rs.getString("gender");
            String age = rs.getString("age");
            String date = rs.getString("ap_date");
            String time = rs.getString("ap_time");
            String pd = rs.getString("ap_doc");
            String description=rs.getString("ap_des");

            //storing array for store data into jtable
            String tbData[] = {pn,gender,age,date,time,pd,description};
            DefaultTableModel tblModel = (DefaultTableModel)Ap_table.getModel();
            tblModel.addRow(tbData);           
            } con.close();
        }
        catch(Exception e)
            {
            JOptionPane.showMessageDialog(null,"Try Again");
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Ap_left = new javax.swing.JPanel();
        AP_Logo = new javax.swing.JLabel();
        AP_logoname = new javax.swing.JLabel();
        Ap_logout = new javax.swing.JButton();
        Ap_up = new javax.swing.JPanel();
        AP_Heading = new javax.swing.JLabel();
        AP_Exit = new javax.swing.JLabel();
        Ap_down = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Ap_table = new javax.swing.JTable();
        Ap_middle = new javax.swing.JPanel();
        AP_Pname = new javax.swing.JLabel();
        AP_Pname_T = new javax.swing.JTextField();
        AP_Age = new javax.swing.JLabel();
        AP_gender_rb2 = new javax.swing.JRadioButton();
        AP_gender_rb1 = new javax.swing.JRadioButton();
        AP_gender = new javax.swing.JLabel();
        AP_Age_Sfield = new com.toedter.components.JSpinField();
        AP_adate_jc = new com.toedter.calendar.JDateChooser();
        AP_adate = new javax.swing.JLabel();
        AP_atime_cb = new javax.swing.JComboBox<>();
        AP_atime = new javax.swing.JLabel();
        AP_doctor_cb = new javax.swing.JComboBox<>();
        AP_ades = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AP_ades_ta = new javax.swing.JTextArea();
        AP_book_b = new javax.swing.JButton();
        AP_Update_b = new javax.swing.JButton();
        AP_Delete_b = new javax.swing.JButton();
        AP_Clear_b = new javax.swing.JButton();
        AP_doctor = new javax.swing.JLabel();
        AP_view_b = new javax.swing.JButton();
        Pname_v = new javax.swing.JLabel();
        search_lable = new javax.swing.JLabel();
        search_textf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(54, 53, 53));
        setUndecorated(true);

        Ap_left.setBackground(new java.awt.Color(54, 54, 54));
        Ap_left.setPreferredSize(new java.awt.Dimension(160, 400));

        AP_Logo.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\pictures\\app_logo.png")); // NOI18N

        AP_logoname.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\pictures\\REGISTER LOGO DOWN.png")); // NOI18N

        Ap_logout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ap_logout.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\Icons\\HMS ICON\\Close.png")); // NOI18N
        Ap_logout.setText("Logout");
        Ap_logout.setToolTipText("Open Home Page");
        Ap_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ap_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ap_logoutMouseExited(evt);
            }
        });
        Ap_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ap_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Ap_leftLayout = new javax.swing.GroupLayout(Ap_left);
        Ap_left.setLayout(Ap_leftLayout);
        Ap_leftLayout.setHorizontalGroup(
            Ap_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ap_leftLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(AP_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ap_leftLayout.createSequentialGroup()
                .addComponent(AP_logoname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Ap_leftLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Ap_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(78, 78, 78))
        );
        Ap_leftLayout.setVerticalGroup(
            Ap_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ap_leftLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(AP_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AP_logoname, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(Ap_logout, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        Ap_up.setBackground(new java.awt.Color(54, 53, 53));

        AP_Heading.setFont(new java.awt.Font("Broadway", 0, 40)); // NOI18N
        AP_Heading.setForeground(new java.awt.Color(255, 255, 255));
        AP_Heading.setText("APPOINTMENT WINDOW");

        AP_Exit.setFont(new java.awt.Font("Aharoni", 0, 45)); // NOI18N
        AP_Exit.setForeground(new java.awt.Color(255, 255, 255));
        AP_Exit.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\pictures\\exit_appp.png")); // NOI18N
        AP_Exit.setToolTipText("Exit");
        AP_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AP_ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Ap_upLayout = new javax.swing.GroupLayout(Ap_up);
        Ap_up.setLayout(Ap_upLayout);
        Ap_upLayout.setHorizontalGroup(
            Ap_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ap_upLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(AP_Heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(91, 91, 91)
                .addComponent(AP_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(336, 336, 336))
        );
        Ap_upLayout.setVerticalGroup(
            Ap_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ap_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(AP_Exit, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addComponent(AP_Heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Ap_down.setBackground(new java.awt.Color(100, 99, 99));

        Ap_table.setAutoCreateRowSorter(true);
        Ap_table.setBackground(new java.awt.Color(217, 217, 217));
        Ap_table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Ap_table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ap_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Gender", "Age", "Appointment Date", "Appointment Time", "Preffered Doctor", "App. Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Ap_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Ap_table.setGridColor(new java.awt.Color(0, 0, 0));
        Ap_table.setInheritsPopupMenu(true);
        Ap_table.setName(""); // NOI18N
        Ap_table.setSelectionBackground(new java.awt.Color(255, 255, 204));
        Ap_table.setSelectionForeground(new java.awt.Color(255, 51, 51));
        Ap_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ap_tableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ap_tableMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(Ap_table);
        Ap_table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (Ap_table.getColumnModel().getColumnCount() > 0) {
            Ap_table.getColumnModel().getColumn(0).setPreferredWidth(120);
            Ap_table.getColumnModel().getColumn(1).setPreferredWidth(80);
            Ap_table.getColumnModel().getColumn(2).setPreferredWidth(50);
            Ap_table.getColumnModel().getColumn(3).setPreferredWidth(150);
            Ap_table.getColumnModel().getColumn(4).setPreferredWidth(150);
            Ap_table.getColumnModel().getColumn(5).setPreferredWidth(200);
            Ap_table.getColumnModel().getColumn(6).setPreferredWidth(250);
        }

        javax.swing.GroupLayout Ap_downLayout = new javax.swing.GroupLayout(Ap_down);
        Ap_down.setLayout(Ap_downLayout);
        Ap_downLayout.setHorizontalGroup(
            Ap_downLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ap_downLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Ap_downLayout.setVerticalGroup(
            Ap_downLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ap_downLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Ap_middle.setBackground(new java.awt.Color(100, 99, 99));

        AP_Pname.setFont(new java.awt.Font("David", 0, 24)); // NOI18N
        AP_Pname.setForeground(new java.awt.Color(255, 255, 255));
        AP_Pname.setText("Patient Name :");

        AP_Pname_T.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AP_Pname_T.setPreferredSize(new java.awt.Dimension(6, 25));
        AP_Pname_T.setVerifyInputWhenFocusTarget(false);
        AP_Pname_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AP_Pname_TActionPerformed(evt);
            }
        });
        AP_Pname_T.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AP_Pname_TKeyReleased(evt);
            }
        });

        AP_Age.setFont(new java.awt.Font("David", 0, 24)); // NOI18N
        AP_Age.setForeground(new java.awt.Color(255, 255, 255));
        AP_Age.setText("Age:");

        AP_gender_rb2.setBackground(new java.awt.Color(100, 99, 99));
        buttonGroup1.add(AP_gender_rb2);
        AP_gender_rb2.setFont(new java.awt.Font("David", 1, 17)); // NOI18N
        AP_gender_rb2.setForeground(new java.awt.Color(255, 255, 255));
        AP_gender_rb2.setText("Female");

        AP_gender_rb1.setBackground(new java.awt.Color(100, 99, 99));
        buttonGroup1.add(AP_gender_rb1);
        AP_gender_rb1.setFont(new java.awt.Font("David", 1, 17)); // NOI18N
        AP_gender_rb1.setForeground(new java.awt.Color(255, 255, 255));
        AP_gender_rb1.setText("Male");
        AP_gender_rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AP_gender_rb1ActionPerformed(evt);
            }
        });

        AP_gender.setFont(new java.awt.Font("David", 0, 24)); // NOI18N
        AP_gender.setForeground(new java.awt.Color(255, 255, 255));
        AP_gender.setText("Gender:");

        AP_adate_jc.setDateFormatString("dd-MM-yyyy");
        AP_adate_jc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        AP_adate.setFont(new java.awt.Font("David", 0, 24)); // NOI18N
        AP_adate.setForeground(new java.awt.Color(255, 255, 255));
        AP_adate.setText("Appointment Date :");

        AP_atime_cb.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        AP_atime_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10am", "12pm", "4pm", "5pm", "6pm" }));
        AP_atime_cb.setPreferredSize(new java.awt.Dimension(120, 26));
        AP_atime_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AP_atime_cbActionPerformed(evt);
            }
        });

        AP_atime.setFont(new java.awt.Font("David", 0, 24)); // NOI18N
        AP_atime.setForeground(new java.awt.Color(255, 255, 255));
        AP_atime.setText("Appointment Time :");

        AP_doctor_cb.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        AP_doctor_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Swayam Mahajan - ENT", "Abhishek S. - Dermatologist", "Rohit Verma - Cardiologist", "Abhi Sawant - Regular" }));

        AP_ades.setFont(new java.awt.Font("David", 0, 24)); // NOI18N
        AP_ades.setForeground(new java.awt.Color(255, 255, 255));
        AP_ades.setText("Appointment Description/Allergies:");

        AP_ades_ta.setColumns(20);
        AP_ades_ta.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        AP_ades_ta.setRows(5);
        jScrollPane1.setViewportView(AP_ades_ta);

        AP_book_b.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AP_book_b.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\Icons\\HMS ICON\\ick 24_24.png")); // NOI18N
        AP_book_b.setText("Book");
        AP_book_b.setToolTipText("Book appointmennt");
        AP_book_b.setPreferredSize(new java.awt.Dimension(73, 40));
        AP_book_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AP_book_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AP_book_bMouseExited(evt);
            }
        });
        AP_book_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AP_book_bActionPerformed(evt);
            }
        });

        AP_Update_b.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AP_Update_b.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\Icons\\HMS ICON\\save-icon--1.png")); // NOI18N
        AP_Update_b.setText("Update");
        AP_Update_b.setToolTipText("Update details");
        AP_Update_b.setPreferredSize(new java.awt.Dimension(89, 40));
        AP_Update_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AP_Update_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AP_Update_bMouseExited(evt);
            }
        });
        AP_Update_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AP_Update_bActionPerformed(evt);
            }
        });

        AP_Delete_b.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AP_Delete_b.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\Icons\\HMS ICON\\Close.png")); // NOI18N
        AP_Delete_b.setText("Delete");
        AP_Delete_b.setToolTipText("Delete Appointment");
        AP_Delete_b.setPreferredSize(new java.awt.Dimension(115, 40));
        AP_Delete_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AP_Delete_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AP_Delete_bMouseExited(evt);
            }
        });
        AP_Delete_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AP_Delete_bActionPerformed(evt);
            }
        });

        AP_Clear_b.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AP_Clear_b.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\pictures\\hp\\clear_hpo.png")); // NOI18N
        AP_Clear_b.setText("Clear");
        AP_Clear_b.setToolTipText("Clear typed details");
        AP_Clear_b.setPreferredSize(new java.awt.Dimension(115, 40));
        AP_Clear_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AP_Clear_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AP_Clear_bMouseExited(evt);
            }
        });
        AP_Clear_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AP_Clear_bActionPerformed(evt);
            }
        });

        AP_doctor.setFont(new java.awt.Font("David", 0, 24)); // NOI18N
        AP_doctor.setForeground(new java.awt.Color(255, 255, 255));
        AP_doctor.setText("Preffered Doctor :");

        AP_view_b.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AP_view_b.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\Icons\\HMS ICON\\search.png")); // NOI18N
        AP_view_b.setText("View Appointments");
        AP_view_b.setToolTipText("Click to View Table Contents");
        AP_view_b.setPreferredSize(new java.awt.Dimension(73, 40));
        AP_view_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AP_view_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AP_view_bMouseExited(evt);
            }
        });
        AP_view_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AP_view_bActionPerformed(evt);
            }
        });

        Pname_v.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pname_v.setForeground(new java.awt.Color(255, 255, 255));

        search_lable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        search_lable.setForeground(new java.awt.Color(102, 255, 255));
        search_lable.setText("Search Appointments:");

        search_textf.setToolTipText("Enter any detail to search");
        search_textf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search_textf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_textfKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout Ap_middleLayout = new javax.swing.GroupLayout(Ap_middle);
        Ap_middle.setLayout(Ap_middleLayout);
        Ap_middleLayout.setHorizontalGroup(
            Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ap_middleLayout.createSequentialGroup()
                .addGroup(Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ap_middleLayout.createSequentialGroup()
                        .addGroup(Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ap_middleLayout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(AP_Age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ap_middleLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ap_middleLayout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(AP_Pname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ap_middleLayout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(AP_gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(AP_adate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(Ap_middleLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(AP_atime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ap_middleLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(AP_doctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addGroup(Ap_middleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AP_view_b, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ap_middleLayout.createSequentialGroup()
                        .addGroup(Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Ap_middleLayout.createSequentialGroup()
                                .addGroup(Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AP_Age_Sfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AP_gender_rb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AP_gender_rb2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(AP_adate_jc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AP_atime_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Ap_middleLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(AP_ades))
                            .addGroup(Ap_middleLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(346, 346, 346))
                    .addGroup(Ap_middleLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(AP_book_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(AP_Update_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(AP_Delete_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(484, 484, 484))
                    .addGroup(Ap_middleLayout.createSequentialGroup()
                        .addComponent(AP_Pname_T, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Pname_v, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ap_middleLayout.createSequentialGroup()
                        .addGroup(Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Ap_middleLayout.createSequentialGroup()
                                .addGap(393, 393, 393)
                                .addComponent(AP_Clear_b, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Ap_middleLayout.createSequentialGroup()
                                .addComponent(AP_doctor_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addGroup(Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Ap_middleLayout.createSequentialGroup()
                                        .addComponent(search_lable)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(search_textf))))
                        .addGap(355, 355, 355))))
        );
        Ap_middleLayout.setVerticalGroup(
            Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ap_middleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pname_v, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(AP_Pname)
                    .addComponent(AP_Pname_T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Ap_middleLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AP_ades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(Ap_middleLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AP_gender_rb2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AP_gender_rb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AP_gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AP_Age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AP_Age_Sfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AP_adate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AP_adate_jc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AP_atime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AP_atime_cb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(search_lable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ap_middleLayout.createSequentialGroup()
                        .addComponent(AP_doctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28))
                    .addGroup(Ap_middleLayout.createSequentialGroup()
                        .addGroup(Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(search_textf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AP_doctor_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(Ap_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AP_book_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AP_Update_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AP_Delete_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AP_view_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AP_Clear_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Ap_left, javax.swing.GroupLayout.PREFERRED_SIZE, 241, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ap_up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Ap_middle, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(326, 326, 326))))
                    .addComponent(Ap_down, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Ap_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ap_middle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Ap_left, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addComponent(Ap_down, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1000, 606));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AP_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AP_ExitMouseClicked
        System.exit(0);// TODO add your handling code here:
      
    }//GEN-LAST:event_AP_ExitMouseClicked

    private void AP_gender_rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AP_gender_rb1ActionPerformed
        
    }//GEN-LAST:event_AP_gender_rb1ActionPerformed

    private void AP_Pname_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AP_Pname_TActionPerformed
    
    }//GEN-LAST:event_AP_Pname_TActionPerformed

    private void AP_Delete_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AP_Delete_bActionPerformed
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic appointment","root","");
        String selectQuery = "DELETE from book where patient_name = ?";
        PreparedStatement ps=con.prepareStatement(selectQuery);
        
        String name = AP_Pname_T.getText();               
        ps.setString(1,name);
        JOptionPane.showMessageDialog(this,"Apppointent Deleted"); 
        ps.executeUpdate();
        
        clearTable();
        setDetails();
        con.close();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(this,"Unable to Delete"); 
        }

        /*DefaultTableModel tblModel = (DefaultTableModel)Ap_table.getModel();
        if(Ap_table.getSelectedRowCount()==1){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic appointment","root","");
        Statement stat = con.createStatement();        
        String ptname;
        ptname = (String) tblModel.getValueAt(Ap_table.getSelectedColumn(),0);
       
        String selectQuery = "DELETE from book where patient_name = '"  +ptname+"'";
        boolean rst = stat.execute(selectQuery);
        
        JOptionPane.showMessageDialog(null,"Record deleted successfully");
        clearTable();
        setDetails();
        tblModel.removeRow(Ap_table.getSelectedRow());
        }catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,e);
        } 
        }else{
        if(Ap_table.getRowCount()==0){
        JOptionPane.showMessageDialog(this,"Table is empty");
        }else{
        JOptionPane.showMessageDialog(this,"Please Select Single row for delete.");
        
        }}*/
    }//GEN-LAST:event_AP_Delete_bActionPerformed

    private void AP_book_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AP_book_bMouseEntered
         AP_book_b.setBackground(new Color(126,217,87));// book entered
    }//GEN-LAST:event_AP_book_bMouseEntered

    private void AP_Update_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AP_Update_bMouseEntered
        AP_Update_b.setBackground(new Color(102,255,255));// update enter
    }//GEN-LAST:event_AP_Update_bMouseEntered

    private void AP_Update_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AP_Update_bMouseExited
       AP_Update_b.setBackground(new Color(240,240,240)); // update exited
    }//GEN-LAST:event_AP_Update_bMouseExited

    private void AP_Delete_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AP_Delete_bMouseEntered
        AP_Delete_b.setBackground(new Color(102,255,255));// delete enter
    }//GEN-LAST:event_AP_Delete_bMouseEntered

    private void AP_Delete_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AP_Delete_bMouseExited
        AP_Delete_b.setBackground(new Color(240,240,240));// delete exit
    }//GEN-LAST:event_AP_Delete_bMouseExited

    private void AP_Clear_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AP_Clear_bMouseEntered
       AP_Clear_b.setBackground(new Color(255,87,87)); // clear enter
    }//GEN-LAST:event_AP_Clear_bMouseEntered

    private void AP_Clear_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AP_Clear_bMouseExited
       AP_Clear_b.setBackground(new Color(240,240,240)); // clear exit
    }//GEN-LAST:event_AP_Clear_bMouseExited

    private void Ap_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ap_logoutActionPerformed
       JOptionPane.showMessageDialog(null, "You have been Logged off");
       Home_Page l=new Home_Page();
       l.setVisible(true);        // Link register button to register page
       
       dispose();
    }//GEN-LAST:event_Ap_logoutActionPerformed

    private void AP_Update_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AP_Update_bActionPerformed
       try
        {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic appointment","root","");    
                PreparedStatement ps=con.prepareStatement("UPDATE book SET age=?, ap_date=?, ap_time=?, ap_doc=?,ap_des=? WHERE patient_name=?");

                /*String g="";                             //gender - radio B
                if(AP_gender_rb1.isSelected())
                { 
                g=AP_gender_rb1.getText();
                }
                if(AP_gender_rb2.isSelected())                       
                {
                g=AP_gender_rb2.getText();
                }
                ps.setString(1,g);
                */
                             
                ps.setInt(1,AP_Age_Sfield.getValue());
                
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");    //Jdatechooser- date
                String date=sdf.format(AP_adate_jc.getDate());
                ps.setString(2,date);                
                
                String combox1="";
                combox1= AP_atime_cb.getSelectedItem().toString();
                ps.setString (3, combox1);                           //appoitnment time- combo box
 
                
                
                String combox2="";
                combox2= AP_doctor_cb.getSelectedItem().toString();
                ps.setString (4, combox2);                           //preferred doctor-combo box                
                
                ps.setString(5,AP_ades_ta.getText());
                
                
                String name = AP_Pname_T.getText();               
                ps.setString(6,name);
                
                //ps.setString(4, AP_adate_jc);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Updated Successfully"); 
                clearTable();
                setDetails();
                con.close();
        }
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,"Unable to Update");

}
    }//GEN-LAST:event_AP_Update_bActionPerformed

    private void Ap_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ap_logoutMouseEntered
        Ap_logout.setBackground(new Color(7, 255, 136));// logout enter
    }//GEN-LAST:event_Ap_logoutMouseEntered

    private void Ap_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ap_logoutMouseExited
        Ap_logout.setBackground(new Color(240,240,240));// logout exit
    }//GEN-LAST:event_Ap_logoutMouseExited

    public void clearTable()    //to clear the jTable
    {
        DefaultTableModel tblModel = (DefaultTableModel)Ap_table.getModel();
        tblModel.setRowCount(0);
    }
            
            
    private void AP_book_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AP_book_bActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic appointment","root","");
            
            String ap="insert into book values (?,?,?,?,?,?,?)";   
            PreparedStatement bk=con.prepareStatement (ap);   
            
            bk.setString(1,AP_Pname_T.getText());     //patient name-textfield
            
            String g="";                             //gender - radio B
            if(AP_gender_rb1.isSelected())
            { 
            g=AP_gender_rb1.getText();
            }
            if(AP_gender_rb2.isSelected())                       
            {
            g=AP_gender_rb2.getText();
            }
            bk.setString(2,g);

            bk.setInt(3,AP_Age_Sfield.getValue());       //Age-spin field
           
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");    //Jdatechooser- date
            String date=sdf.format(AP_adate_jc.getDate());
            bk.setString(4,date);
            
            
            //AP_adate_jc = new com.toedter.calendar.JDateChooser();
            //AP_adate_jc.setDateFormatString("dd-MM-yyyy");
            
            String combox1="";
            combox1= AP_atime_cb.getSelectedItem().toString();
            bk.setString (5, combox1);                           //appoitnment time

            String combox2="";
            combox2= AP_doctor_cb.getSelectedItem().toString();
            bk.setString (6, combox2);                           //preferred doctor 
            
            bk.setString(7,AP_ades_ta.getText());         //allergies

            bk.executeUpdate();                         //message box
            //ppt.executeUpdate(); 
            
           
            JOptionPane.showMessageDialog(null, "Appointment Booked");
            
            clearTable();
            setDetails();

            con.close();
            }
            catch(Exception e)
            {
            JOptionPane.showMessageDialog(null,"Inappropriate data");
            }
    }//GEN-LAST:event_AP_book_bActionPerformed

    private void Ap_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ap_tableMouseClicked

     int i = Ap_table.getSelectedRow();
    TableModel model = Ap_table.getModel();
    
    AP_Pname_T.setText(model.getValueAt(i,0).toString());
    
    String gender = model.getValueAt(i,1).toString();
    if(gender.equals("Male")){
        AP_gender_rb1.setSelected(true);
    }else{
        AP_gender_rb2.setSelected(true);
    }
    
   // AP_Age_Sfield.setValue((int) model.getValueAt(Myindex,2));
   //AP_adate_jc.setText(model.getValueAt(Myindex,3).toString());
    try
       {
          Date date=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(i,3));
          AP_adate_jc.setDate(date);                     
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
       }
 
    String time = model.getValueAt(i,4).toString();
    switch(time)
    {
        case "10am":
            AP_atime_cb.setSelectedIndex(0);
            break;
        case "12pm":
            AP_atime_cb.setSelectedIndex(1);
            break;
        case "4pm":
            AP_atime_cb.setSelectedIndex(2);
            break;
        case "5pm":
            AP_atime_cb.setSelectedIndex(3);
            break;
        case "6pm":
            AP_atime_cb.setSelectedIndex(4);
            break;
    }
    
    String doctr = model.getValueAt(i,5).toString();
    switch(doctr)
    {
        case "Swayam Mahajan - ENT":
            AP_doctor_cb.setSelectedIndex(0);
            break;
        case "Abhishek S. - Dermatologist":
            AP_doctor_cb.setSelectedIndex(1);
            break;
        case "Rohit Verma - Cardiologist":
            AP_doctor_cb.setSelectedIndex(2);
            break;
        case "Abhi Sawant - Regular":
            AP_doctor_cb.setSelectedIndex(3);
            break;
    }

    AP_ades_ta.setText(model.getValueAt(i,6).toString());
    
    }//GEN-LAST:event_Ap_tableMouseClicked

    private void AP_Clear_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AP_Clear_bActionPerformed
    //Ap_table.setModel(new DefaultTableModel(null,new String[]{"patient_name","gender","age","ap_date","ap_time","ap_doc","ap_des"}));  
    // table will be cleared
    AP_Pname_T.setText("");
    //AP_gender_rb1.setText("");
    //AP_Age_Sfield.setText("");
    //AP_adate_jc.setText("");
    //AP_atime_cb.setText("");
    //AP_doctor_cb.setText("");
    AP_ades_ta.setText("");
    
    

// TODO add your handling code here:
    }//GEN-LAST:event_AP_Clear_bActionPerformed

    private void AP_view_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AP_view_bActionPerformed
        clearTable();
        setDetails();    
    }//GEN-LAST:event_AP_view_bActionPerformed

    private void AP_book_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AP_book_bMouseExited
        AP_book_b.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_AP_book_bMouseExited

    private void AP_view_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AP_view_bMouseExited
        AP_view_b.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_AP_view_bMouseExited

    private void AP_view_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AP_view_bMouseEntered
        AP_view_b.setBackground(new Color(255,174,69));
    }//GEN-LAST:event_AP_view_bMouseEntered

    private void AP_atime_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AP_atime_cbActionPerformed
       
    }//GEN-LAST:event_AP_atime_cbActionPerformed

    private void Ap_tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ap_tableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Ap_tableMouseEntered

    private void AP_Pname_TKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AP_Pname_TKeyReleased
        String PATTERN="^[a-zA-Z ]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(AP_Pname_T.getText());
        if(!match.matches())
        {
            Pname_v.setText("no numbers are allowed");
        }
        else
        {
	Pname_v.setText(null);
        }
    }//GEN-LAST:event_AP_Pname_TKeyReleased

    public void search(String str)
    {
        DefaultTableModel model = (DefaultTableModel) Ap_table.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        Ap_table.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
        //DefaultTableModel tblModel = (DefaultTableModel)Ap_table.getModel();
    }
    private void search_textfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_textfKeyReleased
        String search_S = search_textf.getText();
        search(search_S);
    }//GEN-LAST:event_search_textfKeyReleased

    public static void main(String args[]) {   
        java.awt.EventQueue.invokeLater(() -> {
            new Appointment_s().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AP_Age;
    private com.toedter.components.JSpinField AP_Age_Sfield;
    private javax.swing.JButton AP_Clear_b;
    private javax.swing.JButton AP_Delete_b;
    private javax.swing.JLabel AP_Exit;
    private javax.swing.JLabel AP_Heading;
    private javax.swing.JLabel AP_Logo;
    private javax.swing.JLabel AP_Pname;
    private javax.swing.JTextField AP_Pname_T;
    private javax.swing.JButton AP_Update_b;
    private javax.swing.JLabel AP_adate;
    private com.toedter.calendar.JDateChooser AP_adate_jc;
    private javax.swing.JLabel AP_ades;
    private javax.swing.JTextArea AP_ades_ta;
    private javax.swing.JLabel AP_atime;
    private javax.swing.JComboBox<String> AP_atime_cb;
    private javax.swing.JButton AP_book_b;
    private javax.swing.JLabel AP_doctor;
    private javax.swing.JComboBox<String> AP_doctor_cb;
    private javax.swing.JLabel AP_gender;
    private javax.swing.JRadioButton AP_gender_rb1;
    private javax.swing.JRadioButton AP_gender_rb2;
    private javax.swing.JLabel AP_logoname;
    private javax.swing.JButton AP_view_b;
    private javax.swing.JPanel Ap_down;
    private javax.swing.JPanel Ap_left;
    private javax.swing.JButton Ap_logout;
    private javax.swing.JPanel Ap_middle;
    private javax.swing.JTable Ap_table;
    private javax.swing.JPanel Ap_up;
    private javax.swing.JLabel Pname_v;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel search_lable;
    private javax.swing.JTextField search_textf;
    // End of variables declaration//GEN-END:variables
}


