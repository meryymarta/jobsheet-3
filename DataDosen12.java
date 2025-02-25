public class DataDosen12 {
    
    public void dataSemuaDosen(Dosen12[] arrayOfDosen) {
        System.out.println("Daftar Semua Dosen:");
        for (Dosen12 dosen : arrayOfDosen) {
            dosen.cetakInfo();
        }
    }
    public void jumlahDosenPerJenisKelamin(Dosen12[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria  : " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
    }

    
    public void rerataUsiaDosenPerJenisKelamin(Dosen12[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }

        System.out.println("Rata-rata Usia Dosen Pria  : " + (countPria > 0 ? (totalUsiaPria / countPria) : 0));
        System.out.println("Rata-rata Usia Dosen Wanita: " + (countWanita > 0 ? (totalUsiaWanita / countWanita) : 0));
    }

   
    public void infoDosenPalingTua(Dosen12[] arrayOfDosen) {
        Dosen12 tertua = arrayOfDosen[0];
        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        tertua.cetakInfo();
    }

   
    public void infoDosenPalingMuda(Dosen12[] arrayOfDosen) {
        Dosen12 termuda = arrayOfDosen[0];
        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        termuda.cetakInfo();
    }
}



