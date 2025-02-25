import java.util.Scanner;
public class MataKuliah12 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah12(String kode,String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void tambahData() {
        Scanner input12 = new Scanner (System.in);
        System.out.print("Kode         : ");
        this.kode = input12.nextLine();
        System.out.print("Nama         : ");
        this.nama = input12.nextLine();
        System.out.print("Sks          : ");
        this.sks = Integer.parseInt(input12.nextLine());
        System.out.print("Jumlah Jam   :");
        this.jumlahJam = Integer.parseInt(input12.nextLine());
        System.out.println("----------------------------");
    }
    public void cetakInfo() {
        System.out.println("Kode         : " + this.kode);
        System.out.println("Nama         : " + this.nama);
        System.out.println("Sks          : " + this.sks);
        System.out.println("Jumlah Jam   : " + this.jumlahJam);
        System.out.println("---------------------------------");
    }
}
