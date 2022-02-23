package kasir;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
/**
 *
 * @author Ihsan / @Ihsan Maulana X-RPL
 */
public class Kasir {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        int jum = 0, i = 0;
        double total_bayar=0;
        
        int [] kode = new int[5];
        int [] qty = new int[5];
        int [] harga = new int[5];
        double [] sub_total = new double[5];
        double [] diskon = new double[5];
        String [] barang = new String[5];
        
        System.out.println("Selamat Datang Di Toko Medkom");
        
        System.out.print("Masukkan Jumlah Pembelian : ");
        jum=input.nextInt();
        System.out.println(" ");
        // Ihsan Maulana X-RPL
        for (i=0; i<jum;i++){
             System.out.print("Masukkan Kode Barang Ke-" +(i+1)+" : ");
             kode[i]=input.nextInt();
             System.out.print("Masukkan Qty Ke-" +(i+1)+" : ");
             qty[i]=input.nextInt();
             
             switch (kode[i]){
                 case 1 : 
                          barang[i]="SSD Eksternal";
                          harga[i]=1300000;
                          diskon[i]=0.2;
                          break;
                 case 2 :
                          barang[i]="HDD Eksternal";
                          harga[i]=800000;
                          diskon[i]=0.1;
                          break;
                 case 3 :
                          barang[i]="Flasdisk 64GB";
                          harga[i]=200000;
                          diskon[i]=0.05;
                          break;
                 case 4 :
                          barang[i]="Keyboard Gaming";
                          harga[i]=400000;
                          diskon[i]=0.5;
                          break;
                 case 5 :
                          barang[i]="Headset Gaming";
                          harga[i]=700000;
                          diskon[i]=0.05;
                 default :
                          System.out.println("Kode Barang Tidak Tersedia");
                          
             }
                        // Ihsan Maulana X-RPL
    }
          formatRp.setCurrencySymbol("Rp. ");
          formatRp.setMonetaryDecimalSeparator('.');
          formatRp.setGroupingSeparator('.');
          kursIndonesia.setDecimalFormatSymbols(formatRp);
          
          System.out.println(" ");
          System.out.println("Nota Pembelian");
          System.out.println("=================");
          System.out.println("No Nama Barang        Harga           QTY   Diskon   Sub Total");
          
          for (i=0; i<jum;i++){
              sub_total[i]=((qty[i]*harga[i])-(qty[i]*harga[i]*diskon[i]));
              total_bayar+=sub_total[i];
               System.out.println(i+1+"  "+barang[i]+"     "+kursIndonesia.format(harga[i])+"    "+qty[i]+"     "+(int)(diskon[i]*100)+"%"+"       "+kursIndonesia.format(sub_total[i]));
          }
          System.out.println(" ");
          
          System.out.println("Total Bayar : "+kursIndonesia.format(total_bayar));
                      
          }
}
