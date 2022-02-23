/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertamaku;
import java.util.Scanner;
/**
 *
 * @author Ihsan Maulana
 */
public class Pertamaku {

    String Nopol, J_Kendaraan, Merk, No_Stnk, Nm_Stnk, Ket_Kendaraan;
    public static void main(String[] args) {
        Pertamaku mobilku = new Pertamaku();
        mobilku.Tambah();
        mobilku.Tambah2();
        mobilku.View();
    }

    void Tambah() {
        Nopol = "D108KW";
        Merk = "Yamaha";
        J_Kendaraan = "Motor";
        No_Stnk = "AD100010AA";
        Nm_Stnk = "ALIYUDIN";
        Ket_Kendaraan = "Baik";
    }

    void Tambah2() {
        Scanner data2 = new Scanner(System.in);
        System.out.println("Masukan Nopol");
        Nopol = data2.nextLine();
    }

    void View() {
        System.out.println(Nopol);
        System.out.println("Jenis Kendaraan : "+J_Kendaraan);
        System.out.println("Merk : "+Merk);
        System.out.println("No STNK : "+No_Stnk);
        System.out.println("Nama STNK : "+Nm_Stnk);
        System.out.println("Keterangan : "+Ket_Kendaraan);
    }
}
