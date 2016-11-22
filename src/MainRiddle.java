
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
                   System.out.println("# Level "+ level);
                    System.out.println("Selamat Datang "+ nama);
                    
                    jumlahTebakan = level * 100;
                    System.out.println("Silakan tebak angka antara 1 s/d "+ jumlahTebakan);
                    System.out.println("Anda mempunyai kesempatan menebak 5 kali");
                    
                    // random angka tebakan
                    Random randomGenerator = new Random();
                    randomisedNumber = randomGenerator.nextInt(jumlahTebakan);
                    
                    // input angka tebakan
                    Scanner inputAngka = new Scanner(System.in);
                    tebakAngka = inputAngka.nextInt();
                    
                    AngkaTebakan angka = new AngkaTebakan(tebakAngka);
                    InputAngkaTebakan entryTebakan = new InputAngkaTebakan();
                    entryTebakan.InsertData(tebakAngka);
                    System.out.println("Tebakan Anda ?"+ angka.getAngka());
                        
                    for(kesempatan = 1; kesempatan <= 5; kesempatan++){
                        int minus = 5 - kesempatan;
                        
//                        System.out.println(randomisedNumber);
                        if(kesempatan ==5){ // Jika Loop ke 6, maka dipastikan GameOver
                            System.out.println("GAMEOVER! Anda Gagal");
                            cekGameOver++; // Memberikan nilai ++ (1), untuk memunculkan game Over
                        }
                        else {
                            // cek apakah angka tebakan sesuai dengan angka random
                            if(angka.getAngka() == randomisedNumber){
                                System.out.println("Tebakan Anda Benar!");
                                DetailScore detailScore = new DetailScore(level, kesempatan);
                                detailScore.skor(); 
                                break;
                            }
                            
                        }
                        // Jika GameOver, game over dideteksi dari looping ke-6 yang tidak memunculkan input
                        // jawaban, tetapi langsung memberikan nilai ke CekGameOver,
                        if(cekGameOver>0){
                            break;
                        }
                        // Level 5 adalah Level Maksimal
                        if(level==5){ // Jika sudah Mencapai Level 5, langsung di break/otomatis Exit
                            break;
                        }
                        else{
                            Pemain pemain = new Pemain(nama);
                            Score skore = new Score(pemain);
                            skore.getDetailScore();
                        }

                    }
                    
                    System.out.println("Ketik 'next' dan tekan enter untuk lanjut ke Level berikutnya atau 'exit' untuk keluar : ");
                    Scanner input = new Scanner(System.in);
                    nextLevel=input.nextLine();
                    level++;
               }while(!"exit".equals(nextLevel));
               
           }
           
       }while(!"Y".equals(nama));
        
        
        
    }
}
