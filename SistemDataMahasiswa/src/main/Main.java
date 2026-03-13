package main;

import java.util.ArrayList;
import java.util.Scanner;
import service.MahasiswaService;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<String> logData = new ArrayList<>();
        MahasiswaService service = new MahasiswaService();

        int pilih;

        do{

            System.out.println("\n=== SISTEM DATA MAHASISWA ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Keluar");

            System.out.print("Pilih: ");
            pilih = input.nextInt();

            if(pilih == 1){
                service.tambah();
            }
            else if(pilih == 2){
                service.tampil();
            }
            else if(pilih == 3){
                service.hapus();
            }
            else if(pilih == 4){
                System.out.println("Program selesai. Terima kasih.");
            }
            else{
                System.out.println("Pilihan tidak tersedia.");
            }

        }while(pilih != 4);

    }

}