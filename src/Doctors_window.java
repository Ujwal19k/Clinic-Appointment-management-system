
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Doctors_window extends javax.swing.JFrame {

    public Doctors_window() {
        initComponents();
        //setDetails();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Dc_left = new javax.swing.JPanel();
        Dc_Logo = new javax.swing.JLabel();
        Dc_logoname = new javax.swing.JLabel();
        Dc_up = new javax.swing.JPanel();
        Dc_Heading = new javax.swing.JLabel();
        Dc_Exit = new javax.swing.JLabel();
        Dc_down = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Dc_table = new javax.swing.JTable();
        Dc_middle = new javax.swing.JPanel();
        Dc_data_b = new javax.swing.JButton();
        Doc_Logout = new javax.swing.JButton();
        search_textf = new javax.swing.JTextField();
        search_lable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(54, 53, 53));
        setUndecorated(true);

        Dc_left.setBackground(new java.awt.Color(54, 54, 54));
        Dc_left.setPreferredSize(new java.awt.Dimension(160, 400));

        Dc_Logo.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\pictures\\app_logo.png")); // NOI18N

        Dc_logoname.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\pictures\\REGISTER LOGO DOWN.png")); // NOI18N

        javax.swing.GroupLayout Dc_leftLayout = new javax.swing.GroupLayout(Dc_left);
        Dc_left.setLayout(Dc_leftLayout);
        Dc_leftLayout.setHorizontalGroup(
            Dc_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dc_leftLayout.createSequentialGroup()
                .addComponent(Dc_logoname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dc_leftLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Dc_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );
        Dc_leftLayout.setVerticalGroup(
            Dc_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dc_leftLayout.createSequentialGroup()
                .addComponent(Dc_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dc_logoname, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        Dc_up.setBackground(new java.awt.Color(54, 53, 53));

        Dc_Heading.setFont(new java.awt.Font("Broadway", 0, 40)); // NOI18N
        Dc_Heading.setForeground(new java.awt.Color(255, 255, 255));
        Dc_Heading.setText("DOCTORS WINDOW");

        Dc_Exit.setFont(new java.awt.Font("Aharoni", 0, 45)); // NOI18N
        Dc_Exit.setForeground(new java.awt.Color(255, 255, 255));
        Dc_Exit.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\pictures\\exit_appp.png")); // NOI18N
        Dc_Exit.setToolTipText("Exit");
        Dc_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dc_ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Dc_upLayout = new javax.swing.GroupLayout(Dc_up);
        Dc_up.setLayout(Dc_upLayout);
        Dc_upLayout.setHorizontalGroup(
            Dc_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dc_upLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(Dc_Heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(186, 186, 186)
                .addComponent(Dc_Exit)
                .addGap(219, 219, 219))
        );
        Dc_upLayout.setVerticalGroup(
            Dc_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dc_Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Dc_upLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dc_Heading)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Dc_down.setBackground(new java.awt.Color(100, 99, 99));

        Dc_table.setAutoCreateRowSorter(true);
        Dc_table.setBackground(new java.awt.Color(217, 217, 217));
        Dc_table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Dc_table.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Dc_table.setModel(new javax.swing.table.DefaultTableModel(
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
        Dc_table.setCellSelectionEnabled(false);
        Dc_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Dc_table.setGridColor(new java.awt.Color(0, 0, 0));
        Dc_table.setInheritsPopupMenu(true);
        Dc_table.setName(""); // NOI18N
        Dc_table.setRowSelectionAllowed(true);
        Dc_table.setSelectionBackground(new java.awt.Color(255, 255, 204));
        Dc_table.setSelectionForeground(new java.awt.Color(255, 51, 51));
        jScrollPane2.setViewportView(Dc_table);
        Dc_table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (Dc_table.getColumnModel().getColumnCount() > 0) {
            Dc_table.getColumnModel().getColumn(0).setPreferredWidth(120);
            Dc_table.getColumnModel().getColumn(1).setPreferredWidth(80);
            Dc_table.getColumnModel().getColumn(2).setPreferredWidth(50);
            Dc_table.getColumnModel().getColumn(3).setPreferredWidth(150);
            Dc_table.getColumnModel().getColumn(4).setPreferredWidth(150);
            Dc_table.getColumnModel().getColumn(5).setPreferredWidth(200);
            Dc_table.getColumnModel().getColumn(6).setPreferredWidth(250);
        }

        javax.swing.GroupLayout Dc_downLayout = new javax.swing.GroupLayout(Dc_down);
        Dc_down.setLayout(Dc_downLayout);
        Dc_downLayout.setHorizontalGroup(
            Dc_downLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dc_downLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Dc_downLayout.setVerticalGroup(
            Dc_downLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );

        Dc_middle.setBackground(new java.awt.Color(100, 99, 99));

        Dc_data_b.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Dc_data_b.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\Icons\\HMS ICON\\search.png")); // NOI18N
        Dc_data_b.setText("View Data");
        Dc_data_b.setToolTipText("View Appointments");
        Dc_data_b.setPreferredSize(new java.awt.Dimension(89, 40));
        Dc_data_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Dc_data_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Dc_data_bMouseExited(evt);
            }
        });
        Dc_data_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dc_data_bActionPerformed(evt);
            }
        });

        Doc_Logout.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Doc_Logout.setIcon(new javax.swing.ImageIcon("F:\\Study M\\Experiments\\JPL\\Project\\Icons\\HMS ICON\\Close.png")); // NOI18N
        Doc_Logout.setText("Logout");
        Doc_Logout.setToolTipText("Open Home Page");
        Doc_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Doc_LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Doc_LogoutMouseExited(evt);
            }
        });
        Doc_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Doc_LogoutActionPerformed(evt);
            }
        });

        search_textf.setToolTipText("Enter any detail to search");
        search_textf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_textfKeyReleased(evt);
            }
        });

        search_lable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        search_lable.setForeground(new java.awt.Color(255, 255, 255));
        search_lable.setText("Search Appointments:");

        javax.swing.GroupLayout Dc_middleLayout = new javax.swing.GroupLayout(Dc_middle);
        Dc_middle.setLayout(Dc_middleLayout);
        Dc_middleLayout.setHorizontalGroup(
            Dc_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dc_middleLayout.createSequentialGroup()
                .addGroup(Dc_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Dc_middleLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(search_lable)
                        .addGap(18, 18, 18)
                        .addComponent(search_textf, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Dc_middleLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(Doc_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Dc_data_b, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Dc_middleLayout.setVerticalGroup(
            Dc_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dc_middleLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(Dc_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Doc_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dc_data_b, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(Dc_middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_textf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_lable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Dc_left, javax.swing.GroupLayout.PREFERRED_SIZE, 241, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dc_up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Dc_middle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(210, 210, 210))))
                    .addComponent(Dc_down, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Dc_up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dc_middle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Dc_left, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dc_down, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1000, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setDetails()    //to view the table
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
            DefaultTableModel tblModel = (DefaultTableModel)Dc_table.getModel();
            tblModel.addRow(tbData);           
            } con.close();
        }
        catch(Exception e)
            {
            JOptionPane.showMessageDialog(null,"Try Again");
            }
    }
    private void Dc_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dc_ExitMouseClicked
    System.exit(0);
    }//GEN-LAST:event_Dc_ExitMouseClicked

    private void Dc_data_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dc_data_bMouseEntered
        Dc_data_b.setBackground(new Color(102,255,255));// update enter
    }//GEN-LAST:event_Dc_data_bMouseEntered

    private void Dc_data_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dc_data_bMouseExited
       Dc_data_b.setBackground(new Color(240,240,240)); // update exited
    }//GEN-LAST:event_Dc_data_bMouseExited

    private void Doc_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Doc_LogoutActionPerformed
       JOptionPane.showMessageDialog(null, "You have been Logged off");
       Home_Page l=new Home_Page();
       l.setVisible(true);        // Link register button to register page 
       dispose(); 
    }//GEN-LAST:event_Doc_LogoutActionPerformed

    private void Doc_LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Doc_LogoutMouseExited
        Doc_Logout.setBackground(new Color(240,240,240)); //Hover exit
    }//GEN-LAST:event_Doc_LogoutMouseExited

    private void Doc_LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Doc_LogoutMouseEntered
        Doc_Logout.setBackground(new Color(7, 255, 136));
    }//GEN-LAST:event_Doc_LogoutMouseEntered

    public void clearTable()    //to clear the table
    {
        DefaultTableModel tblModel = (DefaultTableModel)Dc_table.getModel();
        tblModel.setRowCount(0);
    }
    private void Dc_data_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dc_data_bActionPerformed
        clearTable();
        setDetails();    
    }//GEN-LAST:event_Dc_data_bActionPerformed
    
    public void search(String str)
    {
        DefaultTableModel model = (DefaultTableModel) Dc_table.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        Dc_table.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
        
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
    private javax.swing.JLabel Dc_Exit;
    private javax.swing.JLabel Dc_Heading;
    private javax.swing.JLabel Dc_Logo;
    private javax.swing.JButton Dc_data_b;
    private javax.swing.JPanel Dc_down;
    private javax.swing.JPanel Dc_left;
    private javax.swing.JLabel Dc_logoname;
    private javax.swing.JPanel Dc_middle;
    private javax.swing.JTable Dc_table;
    private javax.swing.JPanel Dc_up;
    private javax.swing.JButton Doc_Logout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel search_lable;
    private javax.swing.JTextField search_textf;
    // End of variables declaration//GEN-END:variables
}
