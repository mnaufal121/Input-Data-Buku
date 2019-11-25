
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */
public class Buku {

    public static String[] infobuku = new String[100];

    public static void main(String[] args) {
        KelolaBuku[] kb = new KelolaBuku[2];
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int code;
        int data = 0;
        do {
            try {
                kb[data] = new KelolaBuku();
                System.out.println("masukkan Judul Buku : ");
                kb[data].setJudul_buku(input.nextLine());

                System.out.println("masukkan Tipe Buku : ");
                kb[data].setType_buku(input.nextLine());

                System.out.println("masukkan Jumlah Halaman : ");
                kb[data].setJumlah_halaman(input2.nextInt());

                System.out.println("Apakah masih ada buku yang ingin diinput?");
                System.out.println("jika ya 1)");
                System.out.println("jika tidak 0)");
                code = input.nextInt();
                data++;
            } catch (InputMismatchException e) {
                System.out.println("Inputan anda tidak sesuai");
                code = 1;
                input2.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Kapasitas data telah penuh");
                code = 0;
            }
        } while (code != 0);
        for (int x = 0; x < data; x++) {
            infobuku[x] = kb[x].getJudul_buku() + " | "
                    + kb[x].getType_buku() + " | "
                    + kb[x].getJumlah_halaman();
        }
        for (int x = 0; x < data; x++) {
            System.out.println(infobuku[x]);
        }
    }

}

class KelolaBuku {

    String type_buku;
    String judul_buku;
    int jumlah_halaman;

    public String getType_buku() {
        return type_buku;
    }

    public void setType_buku(String type_buku) {
        this.type_buku = type_buku;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public int getJumlah_halaman() {
        return jumlah_halaman;
    }

    public void setJumlah_halaman(int jumlah_halaman) {
        this.jumlah_halaman = jumlah_halaman;
    }

}
