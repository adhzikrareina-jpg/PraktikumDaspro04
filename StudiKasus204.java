import java.util.Scanner;
public class StudiKasus204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nama mahasiswa: ");
        String nama = sc.nextLine();
        System.out.println("Jenis kegiatan (BELMAWA/ BAKORMA/ MANDIRI/ PKM/ LAINNYA): ");
        String jenis = sc.nextLine().trim();

        boolean lomba = jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA")
        || jenis.equalsIgnoreCase("MANDIRI");
        boolean pkm = jenis.equalsIgnoreCase("PKM");

        if (lomba) {
            System.out.println("Jumlah dokumen: ");
            int dokumen = sc.nextInt();
            System.out.println("Peringkat Juara: ");
            int juara = sc.nextInt();

            if (juara >= 1 && juara <= 3) {
                if (dokumen == 4) {
                    System.out.println("Status: Dookumen lengkap. Penghargaan diberikan");
                } else {
                    System.out.println("Dokumen tidak lengkap (kurang " + (4 - dokumen) + "dokumen). Penghargaan tidak diberikan. ");
                }
            } else {
                System.out.println("Status: Bukan Juara 1, 2, atau 3. Penghargaan tidak diberikan.");
            }
        }
    }
}
