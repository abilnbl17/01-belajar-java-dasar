/**
 * Operasi Boolean
 * Operator | Keterangan
 * && | AND
 * "||" | Atau
 * ! | Not
 * 
 * Operasi && (AND) (Kalau keduanya nilai true akan menghasilka true selain itu
 * jika ada false antara kiri atau kanannya maka hasilnya false)
 * Nilai 1 | Operator | Nilai 2 | Hasil
 * TRUE | && | TRUE | TRUE
 * TRUE | && | FALSE | FALSE
 * FALSE | && | TRUE | FALSE
 * FALSE | && | FALSE | FALSE
 * 
 * Operasi || (OR) (Kalau keduanya nilai atau yang salah satu kiri atau kanan
 * false maka hasilnya adalah true, jika keduanya false maka hasilnya adalah
 * false)
 * TRUE | || | TRUE | TRUE
 * TRUE | || | FALSE | TRUE
 * FALSE | || | TRUE | TRUE
 * FALSE | || | FALSE | FALSE
 * 
 * Operasi ! (NOT) (Kalau nilai 2 itu memiliki operator not maka hasilnya akan
 * sebaliknya atau bisa dibilang kebalikan dari nilai yang menggunakan operator
 * tersebut)
 * Operator | Nilai 2 | Hasil
 * ! | TRUE | FALSE
 * ! | FALSE | TRUE
 */

public class OperasiBoolean {
    public static void main(String[] args) {

        // case 1

        // Variable nilai yang akan digunakan
        var absen = 70;
        var nilaiAkhir = 80;

        // Kondisi yang dibuat didalam variable
        var lulusAbsen = absen >= 75; // false
        var nilaiLulus = nilaiAkhir >= 75; // true

        // Menggunakan operasi AND (&&)
        var lulus = lulusAbsen && nilaiLulus; // false && true
        System.out.println("Hasil dari Case 1 adalah " + lulus); // false

        // Case 1
        var absen2 = 75;
        var nilaiAkhir2 = 90;

        // Kondisi yang dibuat didalam variable
        var lulusAbsen2 = absen2 >= 70; // true
        var nilaiLulus2 = nilaiAkhir2 >= 80; // true

        // Menggunakan operasi AND (&&)
        var lulus2 = lulusAbsen2 && nilaiLulus2; // true && true
        System.out.println("Hasil dari Case 2 adalah " + lulus2); // true
    }
}