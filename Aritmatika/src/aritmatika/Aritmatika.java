package aritmatika;

import java.util.Scanner;
 
public class Aritmatika {
    public static String penyebut = "Pilihan Rumus : 1. Persegi Panjang 2. Segitiga";
    public static String penyebut2 = "Masukkan Pilihan = ";
    public static String penyebut3 = "Hasil rumus persegi panjang, dengan panjang 2 dan lebar 4 adalah = ";
    public static String penyebut4 = "Hasil rumus segitiga, dengan alas 5 dan tinggi 5 adalah = ";
    public static String getPenyebut(){
        return penyebut;
    }    //Ihsan Maulana X-RPL //
    public static String pembilang1 = "Masukkan Panjang = ";
    public static String pembilang2 = "Masukkan Lebar = ";
    public static String pembilang3 = "Masukkan Alas = ";
    public static String pembilang4 = "Masukkan Tinggi = ";
    public static String getPembilang1(){
        return pembilang1;
    }
    public static void main(String[] args) {
        int pilih;
        Scanner x = new Scanner(System.in);
        do {
        System.out.println("" +penyebut);
        System.out.print("" +penyebut2);
        pilih=x.nextInt();
        if(pilih==1)
        {
        Aritmatika A=new Aritmatika();
        A.Proses1();
        }
        else if (pilih==2)
        {
        Aritmatika B=new Aritmatika();
        B.Proses2();
        }      
            } while (pilih>0 && pilih<2);
    }  // Ihsan Maulana X-RPL //
    public void Proses1() {
        Scanner input1 = new Scanner(System.in);
        double panjang, lebar, luaspersegi;
        System.out.print("" +pembilang1);
        panjang = input1.nextDouble();
        System.out.print("" +pembilang2);
        lebar = input1.nextDouble();
        luaspersegi = panjang * lebar;
        System.out.println(""+penyebut3 +luaspersegi);
    }  // Ihsan Maulana X-RPL
    public void Proses2() {
        Scanner input2 = new Scanner(System.in);
        double alas, tinggi, luassegitiga;
        System.out.print(""+pembilang3);
        alas = input2.nextDouble();
        System.out.print(""+pembilang4);
        tinggi = input2.nextDouble();
        luassegitiga = (alas * 0.5)*tinggi;
        System.out.println(""+penyebut4 +luassegitiga);
    }
}         // Ihsan Maulana X-RPL //


