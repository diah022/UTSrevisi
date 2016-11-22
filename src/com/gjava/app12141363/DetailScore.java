
package com.gjava.app12141363;

/**
 *
 * @author D
 */
public class DetailScore {
//    private AngkaTebakan angkaTebakan;
    private int level;
    private int jumlahTebakan;

    public DetailScore(int level, int jumlahTebakan) {
        this.level = level;
        this.jumlahTebakan = jumlahTebakan;
    }

    public int getLevel() {
        return level;
    }

    public int getJumlahTebakan() {
        return jumlahTebakan;
    }
    
    public int skor(){
        int totalSkor = 0;
        int levelGame = this.level;
               
        switch (this.jumlahTebakan) {
            case 1:
                totalSkor = levelGame * 100;
                break;
            case 2:
                totalSkor = levelGame * 70;
                break;
            case 3:
                totalSkor = levelGame * 50;
                break;
            case 4:
                totalSkor = levelGame * 30;
                break;
            default:
                break;
        }
        
        return totalSkor;
    }
}
