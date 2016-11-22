
package com.gjava.app12141363;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author D
 */
public class Score {
    private Pemain pemain;
    private List<DetailScore> detailScore = new ArrayList<>();

    public Score(Pemain pemain) {
        this.pemain = pemain;
    }

    public Pemain getPemain() {
        return pemain;
    }

    public List<DetailScore> getDetailScore() {
        return detailScore;
    }
   
}
