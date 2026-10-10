import java.util.Scanner;

public class StudiKasus123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;
        System.out.println("Masukan jumlah cup  : ");
        jumlahCup = sc.nextInt();
        System.out.println("Masukan uang bayar : ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        //Diskon 10% jika total harga >= 100000
        if (totalHarga >= 100000) {
          diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total Harga      : " + totalHarga);
        System.out.println("Diskon       : " + diskon);
        System.out.println("Total Bayar      : " + totalBayar);

    if (uangBayar >= totalBayar) {
        kembalian = uangBayar - totalBayar;
        System.out.println("Kembalian      : " + kembalian);
    } else {
        kurang = totalBayar - uangBayar;
        System.out.println("Uang Anda Kurang : " + kurang);
    }

    sc.close();
        



       
    }
}