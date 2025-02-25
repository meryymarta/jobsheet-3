import java.util.Scanner;

public class DosenDemo12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner (System.in);

        Dosen12[] arrayOfDosen = new Dosen12[3];
  
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = input12.nextLine();
            System.out.print("Nama          : ");
            String nama = input12.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jenisKelaminStr = input12.nextLine();
            boolean jenisKelamin = jenisKelaminStr.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            int usia = input12.nextInt();
            input12.nextLine();
            
            arrayOfDosen[i] = new Dosen12(kode, nama, jenisKelamin, usia);
            System.out.println("-----------------------------------");
        }

        DataDosen12 dataDosen = new DataDosen12();

        System.out.println("\n===== Data Dosen =====");
        dataDosen.dataSemuaDosen(arrayOfDosen);
        
        System.out.println("\nJumlah Dosen Berdasarkan Jenis Kelamin: ");
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        
        System.out.println("\nRata-rata Usia Dosen Berdasarkan Jenis Kelamin: ");
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        
        System.out.println("\nDosen Paling Tua: ");
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        
        System.out.println("\nDosen Paling Muda: ");
        dataDosen.infoDosenPalingMuda(arrayOfDosen);

        //  //foreach
        // System.out.println("Data Dosen:");
        // for (Dosen12 dosen : arrayOfDosen) {
        //     dosen.cetakInfo();
        }
    }
 
    
