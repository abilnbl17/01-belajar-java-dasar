/**
 * Operasi Matematika
 * " + " => Penjumlahan
 * " - " => Pengurangan
 * " * " => Perkalian
 * " / " => Pembagian
 * " % " => Sisa Pembagian atau modulus seperti dijavascript
 * 
 * Dibawah ini adalah hal yang sama dan lebih efisien atau bisa disingkat dengan
 * menggunakna augmented assignments
 * Operasi Matematika ||| Augmented Assignment
 * a = a + 10 ||| a += 10
 * a = a - 10 ||| a -= 10
 * a = a * 10 ||| a *= 10
 * a = a / 10 ||| a /= 10
 * a = a % 10 ||| a %= 10
 * 
 * Unary Operator => yang di tempatkan di depan variable dan cukup 1 variable
 * saja dan juga dapat digunakna di belaknag variable juga
 * Operator ||| Keterangan
 * ++ ||| a = a + 1
 * -- ||| a = a - 1
 * - ||| Negative value
 * + ||| Positive value
 * ! ||| Boolean kebalikan
 */

public class OperasiMatematika {
    public static void main(String[] args) {

        // Operasi matematika pada java
        int a = 100;
        int b = 20;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Augmented Assignments
        int c = 100;

        // Dibawah ini saling bersinambungan dengan hasil yang berbeda
        c += 10; // 100 + 10 = 110
        System.out.println("c += 10 = " + c); // 110

        c -= 10; // 110 - 10 = 100
        System.out.println("c -= 10 = " + c); // 100

        c *= 10; // 100 * 10 = 1000
        System.out.println("c *= 10 = " + c); // 1000

        // Unary Operator
        // jadi ada kondisi yang dimana angka itu bisa positif dan negatif
        // jadi untuk case ini adalah variable yang memiliki value itu memang selalu
        // positif
        int d = 100;

        // jadi awal variabel integer d adalah 100
        d++;
        // dibawah ini cetak hasil yang di mana menggunakan unary operator ++ akan di
        // tambahkan 1
        System.out.println("d++ = " + d); // 101

        // dibawah ini akan mengurangi sebuah variabel yang awalnya hasil dari operasi
        // tambah 1 lalu dikurang 1
        d--;
        // dibawah ini hasil dari cetakkan yang sudah dikurang 1 akan kembali ke nilai
        // awal
        System.out.println("d-- = " + d); // 100

    }

}
