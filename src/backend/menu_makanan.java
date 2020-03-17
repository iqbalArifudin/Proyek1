package backend;

import java.util.ArrayList;
import java.sql.*;

public class menu_makanan {
    private int id_menu;
    private String nama_menu;
    private int harga;
    private String image;

    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public String getNama_menu() {
        return nama_menu;
    }

    public void setNama_menu(String nama_menu) {
        this.nama_menu = nama_menu;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
    
    public menu_makanan(){
        
    }
    
    public menu_makanan(String nama_menu, String image, int harga){
        this.nama_menu = nama_menu;
        this.image = image;
        this.harga = harga;
    }
    
    public menu_makanan getById(int id){
        menu_makanan makanan = new menu_makanan();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM menu "
                                            + " WHERE id_menu = '"  + id +"'");
        
        try
        {
            while(rs.next())
            {
                makanan = new menu_makanan();
                makanan.setId_menu(rs.getInt("id_menu"));
                makanan.setNama_menu(rs.getString("nama_menu"));
                makanan.setHarga(rs.getInt("harga"));
                makanan.setImage(rs.getString("image"));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return makanan;
    }
    
    public ArrayList<menu_makanan> getAll() 
    {
        ArrayList<menu_makanan> ListMenu_makanan = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM menu");

        try
        {
            while(rs.next())
            {
                menu_makanan makanan = new menu_makanan();
                makanan.setId_menu(rs.getInt("id_menu"));
                makanan.setNama_menu(rs.getString("nama_menu"));
                makanan.setHarga(rs.getInt("harga"));
                makanan.setImage(rs.getString("image"));

                ListMenu_makanan.add(makanan);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return ListMenu_makanan;
    }
    
//    public void save()
//    {
//        if(getById(id_menu).getId_menu() == 0)
//        {
//            String SQL = "INSERT INTO menu (nama_menu, harga, image) VALUES("
//                    +"      '" + this.nama_menu +"', "
//                    +"      '" + this.image +"',"
//                    +"      '" + this.harga +"' "
//                    +"      )";
//            this.id_menu = DBHelper.insertQueryGetId(SQL);
//        }
//        else
//        {
//            String SQL = "UPDATE menu SET "
//                    + "     nama = '" + this.nama_menu + "', "
//                    + "     image = '" + this.image + "', "
//                    + "     harga = '" +this.harga + "' "
//                    + "     WHERE id_menu '" + this.id_menu + "'";
//            DBHelper.executeQuery(SQL);
//        }
//    }
//    
//    public void delete()
//    {
//        String SQL ="DELETE FROM menu_makanan WHERE id_menu = '" + this.id_menu + "'";
//        DBHelper.executeQuery(SQL);
//    }
}
