import java.util.Scanner;
	public class Hadiah3terori2 {
		public static void main (String[] args) {
			Scanner masukan = new Scanner(System.in);
			String nama;
			String alamat;
			int umur;
			
			System.out.print("Masukkan nama anda :");
			nama = masukan.nextLine();
			System.out.print("Masukkan alamat anda :");
			alamat = masukan.nextLine();
			System.out.print("Masukkan umur anda :");
			umur = masukan.nextInt();
			
			System.out.println();
			System.out.println("Saudara :   " +nama);
			System.out.println("Tinggal di :   " +alamat);
			System.out.println("Berumur :   " +umur);
			
		}
	}