
import com.gjava.app12141363.*;
import java.util.Random;
import java.util.Scanner;


public class MainRiddle {
    public static void main(String[] args) {
//        char jawab;
        String nama;
        int tebakAngka;
        int level = 1; 
        int randomisedNumber;
        int jumlahTebakan;
        int kesempatan;
        int cekGameOver = 0;
        
       do{
           Scanner name = new Scanner(System.in);
           System.out.println("Masukkan Nama Anda untuk memulai atau tekan 'Y' untuk keluar. Kemudian tekan 'enter'");
           nama = name.nextLine();
           
           InputPemain entrypemain = new InputPemain();
           entrypemain.InsertData(nama);
           
           if(!"Y".equals(nama)){
               Object nextLevel;
               do{
                   
               }while(!"exit".equals(nextLevel));
               
           }
           
       }while(!"Y".equals(nama));
        
        
        
    }
}
