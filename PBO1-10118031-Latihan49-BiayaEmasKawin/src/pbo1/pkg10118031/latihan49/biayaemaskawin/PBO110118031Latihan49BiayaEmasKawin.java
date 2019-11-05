package pbo1.pkg10118031.latihan49.biayaemaskawin;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk Menghitung Biaya Emas Kawin
 */
public class PBO110118031Latihan49BiayaEmasKawin {

    public static void main(String[] args) {

        DecimalFormat mataUangIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRP = new DecimalFormatSymbols();

        formatRP.setCurrencySymbol("Rp.");
        formatRP.setMonetaryDecimalSeparator(',');
        formatRP.setGroupingSeparator('.');

        mataUangIndonesia.setDecimalFormatSymbols(formatRP);

        Emas objEmas = new Emas();
        objEmas.setHargaGram(570000);
        objEmas.setBeratEmas(15.7);
        System.out.println("====Aplikasi Hitung Harga Emas====");
        System.out.printf("Total Bayar Emas : %s %n ",
                mataUangIndonesia.format(
                        objEmas.perhitungan(objEmas.getHargaGram(),
                                objEmas.getBeratEmas())));

    }

}
