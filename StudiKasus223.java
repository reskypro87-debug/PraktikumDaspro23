import java.util.Scanner;

public class StudiKasus223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenis;
        int jumlahDokumen, peringkat, statusPKM;

        System.out.print("Nama Mahasiswa : ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenis = sc.nextLine();

        if(jenis.equalsIgnoreCase("BELMAWA")
            || jenis.equalsIgnoreCase("BAKORMA")
            || jenis.equalsIgnoreCase("MANDIRI")) {

          System.out.print("Jumlah Dokumen : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Peringkat juara (0 jika bukan juara) : ");
            peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dokumen lengkap dan juara " + peringkat + ", Dana penghargaan diberikan");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana pernghargaan diberikan.");
                }
            } else {
                System.out.println("Status : Bukan juara 1, 2 ,3. Dana pengharaan tidak diberikan.");
            }

            } else if (jenis.equalsIgnoreCase("PKM")) {
                System.out.println("Jumlah Dokumen : ");
                jumlahDokumen = sc.nextInt();
                System.out.println("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
                statusPKM = sc.nextInt();

                if (statusPKM == 1) {
                    if (jumlahDokumen == 4) {
                        System.out.println("Status : Dokumen lengkap dan lolos pendanaan PKM. " + "Dana penghargaan diberikan.");                  
                    } else {
                        System.out.println("Status : Dokumen tidak lengkap (kuran " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                    }
                } else {
                    System.out.println("Status : tidak lolos pendaftaran PKM. Dana penghargaan tidak diberikan.");
                }

            } else {
                System.out.println("Status : Kegiatan di luar ketentuan. Dana penghargaan tidak diberikan. ");
                sc.close();

            }
        
    
    }

       
   
   
    
}