
import java.util.Scanner;


public class RiddleGames {
    private String nama;
    private int tebakAngka;
    private byte level;
    
   // fungsi input data
    public void input(){
       // input nama pemain
        Scanner name = new Scanner(System.in);
        System.out.println("Masukkan Nama : ");
        nama = name.nextLine();
        
        // input angka tebakan
        Scanner inputAngka = new Scanner(System.in);
        System.out.println("Masukkan angka tebakan : ");
        tebakAngka = inputAngka.nextInt();
   } 
    
    // fungsi proses data
    public void proses(){
        
    }
    
    // fungsi untuk output data
    public void output(){
        // pilihan untuk keluar atau lanjut
        
    }
}
