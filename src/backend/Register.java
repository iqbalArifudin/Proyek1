/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class Register {
    private int id_kasir;
    private String nama;
    private String username;
    private String password;
    private String email;
    private String no_hp;
    private String alamat;


    public int getId_kasir() {
        return id_kasir;
    }

    public void setId_kasir(int id_kasir) {
        this.id_kasir = id_kasir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public Register() {
    }

    public Register(String nama, String username, String password, String email, String no_hp, String alamat) {
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.email = email;
        this.no_hp = no_hp;
        this.alamat = alamat;
    }

    
    
    public Register getById(int id){
        Register reg=new Register();
        ResultSet rs= DBHelper.selectQuery("SELECT * FROM kasir " + " WHERE id_kasir = '" + id + "'");
        
        try {
            while(rs.next()){
                reg = new Register();
                reg.setNama(rs.getString("nama"));
                reg.setUsername(rs.getString("username"));
                reg.setPassword(rs.getString("password"));
                reg.setEmail(rs.getString("email"));
                reg.setNo_hp(rs.getString("no_hp"));
                reg.setAlamat(rs.getString("alamat"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return reg;
    }
    
        public ArrayList<Register> getAll(){
        ArrayList<Register> ListKategori = new ArrayList();
        
        ResultSet rs=DBHelper.selectQuery("SELECT * FROM kasir");
        
        try{
            while(rs.next()){
                Register reg = new Register();
                reg.setId_kasir(rs.getInt("id_kasir"));
                reg.setNama(rs.getString("nama"));
                reg.setUsername(rs.getString("username"));
                reg.setPassword(rs.getString("password"));
                reg.setEmail(rs.getString("email"));
                reg.setNo_hp(rs.getString("no_hp"));
                reg.setAlamat(rs.getString("alamat"));
                
                ListKategori.add(reg);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListKategori;
    }
        
    public void save(){
        if (getById(id_kasir).getId_kasir()== 0) {
            String SQL = "INSERT INTO kasir (nama, username, password, email, no_hp, alamat) VALUES (" + " '"+ this.nama + "', " +" '"+this.username + "' "+ "," + " '"+ this.password + "', " +" '"+this.email + "' "+ "," + " '"+ this.no_hp + "', " +" '"+this.alamat + "' "+ ")";
            this.id_kasir=DBHelper.insertQueryGetId(SQL);
        }
        else
        {
            String SQL = "UPDATE kasir SET "
                    +"      nama = '" + this.nama + "', "
                    + "     username = '"+ this.username + "' "
                    +"      password = '" + this.password + "', "
                    + "     email = '"+ this.email + "' "
                    +"      no_hp = '" + this.no_hp + "', "
                    + "     alamat = '"+ this.alamat + "' "
                    + "     WHERE id_kasir = '" +this.id_kasir + "'";
            DBHelper.executeQuery(SQL);
        }
    }
}
