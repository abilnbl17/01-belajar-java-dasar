/*
 * Konversi Tipe Data Number
 * 
 * Ketika konversi otomatis harus mengikuti konversi ini
 * Widening Casting (Otomatis): byte -> short -> int -> long -> float -> double
 * 
 * Pada Narrowing Casting ini konversinya secara manual
 * Narrowing Casting (Manual): double -> float -> long -> int -> char -> short
 * 
 */
public class KonversiNumber {
    public static void main(String[] args) {

        // Dibawah ini secara otomatis
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        // dibawah ini secara manual
        int iniInt2 = 1000;
        // dan ini dipaksa menggunakan int
        byte iniByte2 = (byte) iniInt2;
    }
}
