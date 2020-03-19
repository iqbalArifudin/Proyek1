/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

import backend.*;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IQBAL
 */
public class frm_menu_makanan extends javax.swing.JFrame {
    public Connection con;
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel model; 

    /**
     * Creates new form menu_makanan
     */
    public frm_menu_makanan() {
        initComponents();
    }
    
     public void tampilmakanan1(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='ayam crispy'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namamakanan1.setText(nama_menu);
                    hargamakanan1.setText(hrg);
                    gambarmakanan1.setIcon(tampilkan);
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
     
    public void tampilmakanan2(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='ayam goreng'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    
                    namamakanan2.setText(nama_menu);
                    hargamakanan2.setText(hrg);
                    gambarmakanan2.setIcon(tampilkan);
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    
    public void tampilmakanan3(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='bebek bakar'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namamakanan3.setText(nama_menu);
                    hargamakanan3.setText(hrg);
                    gambarmakanan3.setIcon(tampilkan);
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    public void tampilmakanan4(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='bebek goreng'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    
                    namamakanan4.setText(nama_menu);
                    hargamakanan4.setText(hrg);
                    gambarmakanan4.setIcon(tampilkan);
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    public void tampilmakanan5(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='lele bakar'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    
                    namamakanan5.setText(nama_menu);
                    hargamakanan5.setText(hrg);
                    gambarmakanan5.setIcon(tampilkan);
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    public void tampilmakanan6(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='lele goreng'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    
                    namamakanan6.setText(nama_menu);
                    hargamakanan6.setText(hrg);
                    gambarmakanan6.setIcon(tampilkan);
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    public void tampilmakanan7(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='nila bakar'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namamakanan7.setText(nama_menu);
                    hargamakanan7.setText(hrg);
                    gambarmakanan7.setIcon(tampilkan);
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    public void tampilmakanan8(){
           try {
               String url = "jdbc:mysql://localhost:3306/proyek1";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
                
                Statement st = con.createStatement();
                String sql = "SELECT * FROM menu WHERE nama_menu='nila goreng'";
                ResultSet rs=st.executeQuery(sql);
                
                while(rs.next()){
                    String nama_menu=rs.getString("nama_menu");
                    int harga=rs.getInt("harga");
                    String hrg=Integer.toString(harga);
                    Blob image= (Blob) rs.getBlob("image");
                    int ukuran = (int) (image.length());
                    ImageIcon tampilkan = new ImageIcon(image.getBytes(1, ukuran));
                    
                    namamakanan8.setText(nama_menu);
                    hargamakanan8.setText(hrg);
                    gambarmakanan8.setIcon(tampilkan);
                }
           } catch (SQLException err){
               System.out.println(err.getMessage());
           }
    }
    
    public void tampilkanData() {
        String[] kolom = {"Menu", "Harga", "Jumlah", "Total"};
        ArrayList<Pesanan> list = new Pesanan().getAll();
        Object rowData[] = new Object[7];
        
        tbl_psn.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).getMenu().getNama_menu();
            rowData[1] = list.get(i).getMenu().getHarga();
            rowData[2] = list.get(i).getJumlah();
            rowData[3] = list.get(i).getTotal();
            
            ((DefaultTableModel)tbl_psn.getModel()).addRow(rowData);
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

        xPesanan = new javax.swing.JButton();
        xTambahan = new javax.swing.JButton();
        xMinuman = new javax.swing.JButton();
        xMakanan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel_pesanan = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_psn = new javax.swing.JTable();
        btn_selesai = new javax.swing.JButton();
        gambarmakanan3 = new javax.swing.JLabel();
        gambarmakanan1 = new javax.swing.JLabel();
        gambarmakanan2 = new javax.swing.JLabel();
        gambarmakanan4 = new javax.swing.JLabel();
        namamakanan1 = new javax.swing.JLabel();
        namamakanan2 = new javax.swing.JLabel();
        namamakanan3 = new javax.swing.JLabel();
        namamakanan4 = new javax.swing.JLabel();
        hargamakanan1 = new javax.swing.JLabel();
        hargamakanan2 = new javax.swing.JLabel();
        hargamakanan3 = new javax.swing.JLabel();
        hargamakanan4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        gambarmakanan7 = new javax.swing.JLabel();
        gambarmakanan5 = new javax.swing.JLabel();
        gambarmakanan6 = new javax.swing.JLabel();
        gambarmakanan8 = new javax.swing.JLabel();
        namamakanan5 = new javax.swing.JLabel();
        namamakanan6 = new javax.swing.JLabel();
        namamakanan7 = new javax.swing.JLabel();
        namamakanan8 = new javax.swing.JLabel();
        hargamakanan5 = new javax.swing.JLabel();
        hargamakanan6 = new javax.swing.JLabel();
        hargamakanan7 = new javax.swing.JLabel();
        hargamakanan8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField_jml = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        xPesanan.setText("Pesanan");
        xPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xPesananActionPerformed(evt);
            }
        });

        xTambahan.setText("Tambahan");
        xTambahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xTambahanActionPerformed(evt);
            }
        });

        xMinuman.setText("Minuman");
        xMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMinumanActionPerformed(evt);
            }
        });

        xMakanan.setText("Makanan");
        xMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMakananActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel_pesanan.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel_pesanan.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_pesanan.setText("PESANAN");

        tbl_psn.setBackground(new java.awt.Color(102, 102, 255));
        tbl_psn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Menu", "Harga", "Jumlah", "Total"
            }
        ));
        tbl_psn.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tbl_psn);

        btn_selesai.setText("Selesai");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel_pesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(btn_selesai, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_pesanan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btn_selesai)
                .addGap(28, 28, 28))
        );

        namamakanan1.setText("     nama makanan");

        namamakanan2.setText("     nama makanan");

        namamakanan3.setText("     nama makanan");

        namamakanan4.setText("     nama makanan");

        hargamakanan1.setText("     harga makanan");

        hargamakanan2.setText("     harga makanan");

        hargamakanan3.setText("     harga makanan");

        hargamakanan4.setText("     harga makanan");

        jButton1.setText("tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("tambah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("tambah");

        jButton4.setText("tambah");

        namamakanan5.setText("     nama makanan");

        namamakanan6.setText("     nama makanan");

        namamakanan7.setText("     nama makanan");

        namamakanan8.setText("     nama makanan");

        hargamakanan5.setText("     harga makanan");

        hargamakanan6.setText("     harga makanan");

        hargamakanan7.setText("     harga makanan");

        hargamakanan8.setText("     harga makanan");

        jButton5.setText("tambah");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("tambah");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("tambah");

        jButton8.setText("tambah");

        jTextField_jml.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("jumlah");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gambarmakanan5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namamakanan5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargamakanan5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gambarmakanan6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namamakanan6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargamakanan6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namamakanan7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargamakanan7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(gambarmakanan7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namamakanan8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargamakanan8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(gambarmakanan8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xMakanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gambarmakanan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namamakanan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargamakanan1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_jml, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(xMinuman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gambarmakanan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(namamakanan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hargamakanan2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(gambarmakanan3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(xTambahan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(namamakanan3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hargamakanan3, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(xPesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gambarmakanan4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(namamakanan4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(hargamakanan4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xTambahan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gambarmakanan1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(gambarmakanan2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gambarmakanan3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gambarmakanan4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namamakanan1)
                            .addComponent(namamakanan2)
                            .addComponent(namamakanan3)
                            .addComponent(namamakanan4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hargamakanan1)
                            .addComponent(hargamakanan2)
                            .addComponent(hargamakanan3)
                            .addComponent(hargamakanan4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_jml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton3)
                                .addComponent(jButton4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gambarmakanan8, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(gambarmakanan7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gambarmakanan6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gambarmakanan5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namamakanan5)
                            .addComponent(namamakanan6)
                            .addComponent(namamakanan7)
                            .addComponent(namamakanan8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hargamakanan5)
                            .addComponent(hargamakanan6)
                            .addComponent(hargamakanan8)
                            .addComponent(hargamakanan7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6)
                            .addComponent(jButton7)
                            .addComponent(jButton8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xPesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xPesananActionPerformed

    private void xTambahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xTambahanActionPerformed
        // TODO add your handling code here:
//        frm_menu_tambahan tambahan = new frm_menu_tambahan();
//        tambahan.tampiltambahan1();
//        tambahan.tampiltambahan2();
//        tambahan.tampiltambahan3();
//        tambahan.tampiltambahan4();
//        tambahan.tampiltambahan5();
//        tambahan.tampiltambahan6();
//        tambahan.tampiltambahan7();
//        tambahan.tampiltambahan8();
//        tambahan.setVisible(true);
//        dispose();
    }//GEN-LAST:event_xTambahanActionPerformed

    private void xMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xMinumanActionPerformed
        // TODO add your handling code here:
//        frm_menu_minuman minuman = new frm_menu_minuman();
//        minuman.tampilminuman1();
//        minuman.tampilminuman2();
//        minuman.tampilminuman3();
//        minuman.tampilminuman4();
//        minuman.tampilminuman5();
//        minuman.tampilminuman6();
//        minuman.tampilminuman7();
//        minuman.tampilminuman8();
//        minuman.setVisible(true);
//        dispose();
    }//GEN-LAST:event_xMinumanActionPerformed

    private void xMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xMakananActionPerformed
        // TODO add your handling code here:
        frm_menu_makanan makanan = new frm_menu_makanan();
        makanan.tampilmakanan1();
        makanan.tampilmakanan2();
        makanan.tampilmakanan3();
        makanan.tampilmakanan4();
        makanan.tampilmakanan5();
        makanan.tampilmakanan6();
        makanan.tampilmakanan7();
        makanan.tampilmakanan8();
        makanan.setVisible(true);
        dispose();
    }//GEN-LAST:event_xMakananActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Pesanan p= new Pesanan();
        p.setJumlah(Integer.parseInt(jTextField_jml.getText()));
        p.setTotal();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(frm_menu_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_menu_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_menu_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_menu_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_menu_makanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_selesai;
    private javax.swing.JLabel gambarmakanan1;
    private javax.swing.JLabel gambarmakanan2;
    private javax.swing.JLabel gambarmakanan3;
    private javax.swing.JLabel gambarmakanan4;
    private javax.swing.JLabel gambarmakanan5;
    private javax.swing.JLabel gambarmakanan6;
    private javax.swing.JLabel gambarmakanan7;
    private javax.swing.JLabel gambarmakanan8;
    private javax.swing.JLabel hargamakanan1;
    private javax.swing.JLabel hargamakanan2;
    private javax.swing.JLabel hargamakanan3;
    private javax.swing.JLabel hargamakanan4;
    private javax.swing.JLabel hargamakanan5;
    private javax.swing.JLabel hargamakanan6;
    private javax.swing.JLabel hargamakanan7;
    private javax.swing.JLabel hargamakanan8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_pesanan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField_jml;
    private javax.swing.JLabel namamakanan1;
    private javax.swing.JLabel namamakanan2;
    private javax.swing.JLabel namamakanan3;
    private javax.swing.JLabel namamakanan4;
    private javax.swing.JLabel namamakanan5;
    private javax.swing.JLabel namamakanan6;
    private javax.swing.JLabel namamakanan7;
    private javax.swing.JLabel namamakanan8;
    private javax.swing.JTable tbl_psn;
    private javax.swing.JButton xMakanan;
    private javax.swing.JButton xMinuman;
    private javax.swing.JButton xPesanan;
    private javax.swing.JButton xTambahan;
    // End of variables declaration//GEN-END:variables


}
