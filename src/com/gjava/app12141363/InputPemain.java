
package com.gjava.app12141363;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author D
 */
public class InputPemain {
    private List<Pemain> pemain = new ArrayList<>();
    private Pemain gamers;

    public InputPemain() {
    }

    public void setPemain(List<Pemain> pemain) {
        this.pemain = pemain;
    }

    public void setGamers(Pemain gamers) {
        this.gamers = gamers;
    }

    
    public void InsertData(String nama){
        Pemain gamer = new Pemain(nama);
        pemain.add(gamer);
    }
    
    public ArrayList<Pemain> getAll(){
        return (ArrayList<Pemain>) pemain;
    } 
}
