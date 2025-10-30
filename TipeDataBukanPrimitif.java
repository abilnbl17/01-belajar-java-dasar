/**
 * Tipe Data Bukan Primitif
 * 
 * Tipe data primitif adalah tipe bawaan didalam bahasa pemrograman. Tipe data
 * primitif tidak bisa diubah lagi
 * Tipe data number, char, boolean adalah tipe data primitif. Tipe data primitif
 * selalu memiliki default value
 * Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak
 * memiliki default value, dan bisa bernilai null
 * Tipe data bukan primitif bisa memiliki method/function (yang akan dibahas
 * nanti)
 * Di Java, semua tipe data primitif memiliki representasi tipe data bukan
 * primitifnya
 * 
 * Representasi Tipe Data Primitif (1)
 * Tipe Data Primitif :
 * byte
 * Short
 * int
 * long
 * float
 * double
 * 
 * Tipe Data Bukan Primitif :
 * Byte
 * Short
 * Integer
 * Long
 * Float
 * Double
 * 
 * Representasi Tipe Data Primitif (2)
 * Tipe Data Primitif:
 * char
 * boolean
 * 
 * Tipe Data Bukan Primitif:
 * Character
 * Boolean
 */

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 1000L;

        // Jika melakukan ini akan terjadi error pada println
        // Byte iniByte; // null
        // Error pada variabel non primitif karena iniByte belum di inisialisasi
        // System.out.println(iniByte);

        // Jika melakukan ini akan berhasil
        Byte iniByte; // null
        iniByte = 100; // ini sudah di inisialisasi
        // Tidak terjadi error pada println ini karena sudah di inisialisasi
        System.out.println(iniByte);

        // Jika melakukan ini akan berhasil
        Byte iniByte2 = null; // karna ini termasuk sudah diinisialisasi atau diberikan sebuah value
        System.out.println(iniByte2);

        // Dibawah ini adalah dari primitif konversi menjadi bukan primitif
        // Dan ini konversi secara manual
        int iniInt = 100; // ini primitif
        Integer iniInteger2 = iniInt; // ini bukan primitif
    }

}
