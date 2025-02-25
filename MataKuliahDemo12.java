import java.util.Scanner;
public class MataKuliahDemo12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner (System.in);
        MataKuliah12[] arrayOfMatakuliah = new MataKuliah12[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i = 0; i < 3; i++){
            System.out.println("Masukkan Data MataKuliah ke- " + (i + 1));
            System.out.print("Kode         :");
            kode = input12.nextLine();
            System.out.print("Nama         :");
            nama = input12.nextLine();
            System.out.print("Sks          :");
            dummy = input12.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam   :");
            dummy = input12.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------------");

            arrayOfMatakuliah[i] = new MataKuliah12(kode, nama, sks, jumlahJam);
        }

    }
    
}
