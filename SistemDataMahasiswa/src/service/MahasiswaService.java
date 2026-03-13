package service;

import java.util.*;
import java.sql.*;
import interfacepkg.CrudOperation;
import database.Database;

public class MahasiswaService implements CrudOperation {

    Scanner input = new Scanner(System.in);

    public void tambah(){

        try{

            Connection conn = Database.connect();

            System.out.print("NIM: ");
            String nim=input.next();

            System.out.print("Nama: ");
            String nama=input.next();

            System.out.print("Jurusan: ");
            String jurusan=input.next();

            System.out.print("Semester: ");
            int semester=input.nextInt();

            String sql="INSERT INTO mahasiswa VALUES (?,?,?,?)";

            PreparedStatement ps=conn.prepareStatement(sql);

            ps.setString(1,nim);
            ps.setString(2,nama);
            ps.setString(3,jurusan);
            ps.setInt(4,semester);

            ps.executeUpdate();

            System.out.println("Data tersimpan");

        }catch(Exception e){
            System.out.println("Gagal tambah data");
        }

    }

    public void tampil(){

        try{

            Connection conn=Database.connect();

            Statement st=conn.createStatement();

            ResultSet rs=st.executeQuery("SELECT * FROM mahasiswa");

            while(rs.next()){

                System.out.println(
                rs.getString("nim")+" "+
                rs.getString("nama")+" "+
                rs.getString("jurusan")+" "+
                rs.getInt("semester")
                );

            }

        }catch(Exception e){
            System.out.println("Gagal tampil data");
        }

    }

    public void hapus(){

        try{

            Connection conn=Database.connect();

            System.out.print("Masukkan NIM: ");
            String nim=input.next();

            String sql="DELETE FROM mahasiswa WHERE nim=?";

            PreparedStatement ps=conn.prepareStatement(sql);

            ps.setString(1,nim);

            ps.executeUpdate();

            System.out.println("Data dihapus");

        }catch(Exception e){
            System.out.println("Gagal hapus");
        }

    }

}