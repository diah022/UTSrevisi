package com.gjava.app12141363;


import com.sun.xml.internal.fastinfoset.stax.events.Util;
import java.util.Random;
import java.util.Scanner;


public class RiddleGames {
    private String nama;
    private int tebakAngka;
    private byte level; 
    private char jawab;
    private int randomisedNumber;
    private int jumlahTebakan;
    
   // fungsi input data
    public void input(){
       // input nama pemain
        Scanner name = new Scanner(System.in);
        System.out.println("Masukkan Nama Anda untuk memulai atau tekan 'Y' untuk keluar. Kemudian tekan 'enter'");
        this.nama = name.nextLine();
        
        // input angka tebakan
        Scanner inputAngka = new Scanner(System.in);
        System.out.println("Masukkan angka tebakan : ");
        this.tebakAngka = inputAngka.nextInt();
   } 
    
    // fungsi proses data
    public void proses(){
        Random randomGenerator = new Random();
        this.randomisedNumber = randomGenerator.nextInt();
        
        // perulangan level
        for(level = 1; level <= 5; level ++){
            // perulangan tebakan
            while(jumlahTebakan <= 5){
                
            }
        }
        
    }
    
    // fungsi untuk output data
    public void output(){
        // pilihan untuk keluar atau lanjut
        System.out.println(nama);
        if(!Util.isEmptyString(nama)){
            
        }
    }
}
