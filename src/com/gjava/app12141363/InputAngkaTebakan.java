
package com.gjava.app12141363;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author D
 */
public class InputAngkaTebakan {
    private List<AngkaTebakan> angkaTebakan = new ArrayList<>();
    private AngkaTebakan angg;

    public InputAngkaTebakan() {
        
    }

    public void setAngkaTebakan(List<AngkaTebakan> angkaTebakan) {
        this.angkaTebakan = angkaTebakan;
    }

    public void setAngka(AngkaTebakan angka) {
        this.angg = angka;
    }
    
    public void InsertData(int ang){
        AngkaTebakan tebakAngka = new AngkaTebakan(ang);
        angkaTebakan.add(tebakAngka);
    }
    
    public ArrayList<AngkaTebakan> getAll(){
        return (ArrayList<AngkaTebakan>) angkaTebakan;
    } 
}
