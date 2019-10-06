/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan19.saldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * @author 
 * NAMA      : Bagus Syibro Malisi
 * KELAS     : PBO2
 * NIM       : 10118052
 * Deskripsi Program : Program ini bertujuan untuk mengethaui saldo tabungan
 * untuk tiap bulannya 
 * 
 */
public class PBO210118052Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double saldo = 2500000.0;
        
        for(Integer i = 1; i<=6; i++) {
            Double bunga = saldo * 0.15;
            saldo += bunga;
            System.out.println("Saldo di bulan ke-" + i
                    + " Rp." + PBO210118052Latihan19SaldoTabungan.formatter(saldo));
        }
    }
    
    public static String formatter(Double saldo) {
        DecimalFormat kursIDR = (DecimalFormat) DecimalFormat
                .getIntegerInstance();
        DecimalFormatSymbols formatIDR = new DecimalFormatSymbols();
        
        formatIDR.setGroupingSeparator('.');
        
        kursIDR.setDecimalFormatSymbols(formatIDR);
        
        return kursIDR.format(saldo);
    }
    
}