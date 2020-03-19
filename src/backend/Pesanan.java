/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Pesanan {
    private int id_pesanan;
    private menu_makanan menu=new menu_makanan();
    private int jumlah;
    private int total;

    public Pesanan(menu_makanan menu, int id_pesanan, int jumlah, int total) {
        this.id_pesanan = id_pesanan;
        this.jumlah = jumlah;
        this.total = total;
        this.menu=menu;
    }

    public Pesanan() {
    }

    public int getId_pesanan() {
        return id_pesanan;
    }

    public void setId_pesanan(int id_pesanan) {
        this.id_pesanan = id_pesanan;
    }

    public menu_makanan getMenu() {
        return menu;
    }

    public void setMenu(menu_makanan menu) {
        this.menu = menu;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal() {
        total = (getMenu().getHarga()*getJumlah());
    }
    
    public Pesanan getById(int id){
       Pesanan pesan=new Pesanan();
     ResultSet rs=DBHelper.selectQuery("SELECT "
                                        +"  p.id_pesanan AS id_pesanan, "
                                        +"  p.jumlah AS jumlah, "
                                        +"  p.total AS total, "
                                        +"  mkn.id_menu AS id_menu, "
                                        +"  mkn.nama_menu AS nama_menu, "
                                        +"  mkn.harga AS harga "
                                        +"  FROM pesanan p "
                                        +"  LEFT JOIN menu mkn ON mkn.id_menu = mkn.id_menu "
                                        +"  WHERE p.id_pesanan = '" + id + "'");  
       try{
           while(rs.next()){
               pesan = new Pesanan();
               pesan.getMenu().setNama_menu(rs.getString("nama_menu"));
               pesan.getMenu().setHarga(rs.getInt("harga"));
               pesan.setJumlah(rs.getInt("jumlah"));
//               pesan.setTotal(rs.getInt("total"));
           }
       }
       catch (Exception e){
           e.printStackTrace();
       }
       return pesan;
    }
    
      public ArrayList<Pesanan> getAll(){
        ArrayList<Pesanan> ListBuku = new ArrayList();
        ResultSet rs=DBHelper.selectQuery("SELECT "
                                        +"  p.id_pesanan AS id_pesanan, "
                                        +"  p.jumlah AS jumlah, "
                                        +"  p.total AS total, "
                                        +"  mkn.id_menu AS id_menu, "
                                        +"  mkn.nama_menu AS nama_menu, "
                                        +"  mkn.harga AS harga "
                                        +"  FROM pesanan p "
                                        +"  LEFT JOIN menu mkn ON mkn.id_menu = mkn.id_menu " );
        try{
            while(rs.next()){
               Pesanan pesan = new Pesanan();
               pesan.getMenu().setNama_menu(rs.getString("nama_menu"));
               pesan.getMenu().setHarga(rs.getInt("harga"));
               pesan.setJumlah(rs.getInt("jumlah"));
//               pesan.setTotal(rs.getInt("total"));
               
               ListBuku.add(pesan);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListBuku;
    }  
}
