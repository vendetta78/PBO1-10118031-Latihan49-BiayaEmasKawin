/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118031.latihan49.biayaemaskawin;

/**
 *
 * @author Vendetta
 */
public class Emas {
  public int hargaGram;
   public double beratEmas;

    public int getHargaGram() {
        return hargaGram;
    }

    public void setHargaGram(int hargaGram) {
        this.hargaGram = hargaGram;
    }

    public double getBeratEmas() {
        return beratEmas;
    }

    public void setBeratEmas(double beratEmas) {
        this.beratEmas = beratEmas;
    }
   
    public double perhitungan(int hargaGram, double beratEmas) {
       
       return hargaGram * beratEmas ;
    }
    
}

