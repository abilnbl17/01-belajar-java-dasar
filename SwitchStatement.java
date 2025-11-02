/**
 * => Switch Statement
 * > Kadang kita hanya butuh menggunakan kondisi sederhana di if statement,
 * seperti hanya menggunakan perbandingan ==
 * > Switch adalah statement percabangan yang sama dengan if, namun lebih
 * sederhana cara pembuatannya
 * > Kondisi di Switch statement hanya untuk perbandingan ==
 * 
 * => Switch Lambda
 * > Di java versi 14, diperkenalkan switch expression dengan lambda
 * > Ini lebih mempermudah saat penggunaan switch expression karena kita tidak
 * perlu lagi menggunakan kata kunci break
 * 
 * => Kata Kunci yield
 * > Di java 14, ada kata kunci baru yaitu yield, dimana kita menggunakan kata
 * kunci yield untuk mengembalikan nilai pada switch statement
 * > Ini sangat memperudah kita ketika butuh membuat data berdasarkan kondisi
 * switch statement
 */

public class SwitchStatement {
    public static void main(String[] args) {

        // Case 1
        // variable sudah ditentukan dengan nilainya
        var nilai = "A";

        switch (nilai) {
            // ini ada bagian kondisinya
            case "A":
                System.out.println("Wow, Anda lulus Dengan Baik");
                break;
            // Dibawah ini switch condition bisa digabung untuk casenya yang lain
            case "B":
            case "C":
                System.out.println("Nilai anda cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Anda Salah jurusan");
        }

        // Case 2
        // Switch Lambda
        var nilai2 = "E";

        switch (nilai2) {

            case "A" -> System.out.println("Wow Anda lulus nilai2");
            // Kondisi switch ini jika menggunakan 2 case hanya menggunakan 1 statement
            case "B", "C" -> System.out.println("Nilai anda cukup nilai2");
            case "D" -> System.out.println("Anda kurang beruntung");
            default -> {
                System.out.println("Anda salah jurusan nilai2");
                System.out.println("Anda harus urus penilaian terlebih dahulu nilai2");
            }
        }

        // Case 3
        // Tanpa Yield
        // pada menggunakan Tanpa yield harus menggunakan sout di akhir didalam block
        // switch
        // dan memanggil variable String ucapan
        var nilai3 = "A";
        String ucapan;

        switch (nilai3) {
            case "A" -> ucapan = "Wow anda lulus nilai3";
            case "B", "C" -> ucapan = "Nilai anda cukup nilai3";
            case "D" -> ucapan = "Anda kurang beruntung";
            default -> {
                ucapan = "Anda salah jurusan nilai3";
                ucapan = "Anda harus urus terlebih dahulu nilai3";
            }
        }

        System.out.println(ucapan);

        // Case 4
        // Menggunakan yield
        // yaitu dengan code lebih singkat dan mudah dibaca untuk mengembalikan
        // hanya perlu 1 variable ucapan2 lalu menggunakan yield tidak perlu banyak
        // variable pada String
        var nilai4 = "B";
        String ucapan2;

        ucapan2 = switch (nilai4) {
            case "A":
                yield "Wow anda lulus nilai4";
            case "B", "C":
                yield "Nilai anda cukup nilai4";
            case "D":
                yield "anda kurang beruntung nilai4";
            default:
                yield "Mungkin salah jurusan";

        };
        System.out.println(ucapan2);
    }

}
