/**
 * => If Statement
 * > Dalam Java, if adalah salah satu kata kunci yang digunakan untuk
 * percabangan
 * > Percabangan artinya kita bisa mengeksekusi kode program teretntu ketika
 * suatu kondisi terpenuhi
 * > Hampir di semua bahasa pemrograman mendukung if statement
 * 
 * => Else Statement
 * > Block if akan dieksekusi ketika kondisi if bernilai true
 * > Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if
 * bernilai false
 * > Hal ini bisa dilakukan menggunakan else statement
 * 
 * => Else If Statement
 * > Kadang dalam If, kita butuh membuat beberapa kondisi
 * > Kasus seperti ini, di Java kita bisa menggunakan else If Statement
 * > Else If di Java bisa lebih dari satu
 */

public class IfStatement {
    public static void main(String[] args) {

        // Case 1 = True
        var nilai = 80;
        var absen = 90;

        // Harus Boolean yang menghasilkan true atau false
        // Ini kondisi jika true
        if (nilai >= 75 && absen >= 75) {
            System.out.println("Selamat Anda Lulus!");
        } else {
            System.out.println("Maaf Anda Tidak Lulus!");
        }

        // Case 2 = false
        var nilai2 = 60;
        var absen2 = 80;

        // Harus Boolean yang menghasilkan true atau false
        // ini Kondisi jika false
        if (nilai2 > 75 && absen2 >= 75) {
            System.out.println("Selamat Anda Lulus 2!");
        } else {
            System.out.println("Maaf anda tidak Lulus 2!");
        }

        // Case 3 = else if statement
        var nilai3 = 82;
        var absen3 = 80;

        // Percabangan lebih dari 2 kondisi bisa menggunakan else if statement
        if (nilai3 >= 90 && absen3 >= 90) {
            System.out.println("Nilai A");
        } else if (nilai3 >= 80 && absen3 >= 80) {
            System.out.println("Nilai B");
        } else if (nilai3 >= 70 && absen3 >= 70) {
            System.out.println("Nilai C");
        } else if (nilai3 >= 60 && absen3 >= 60) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai E");
        }

    }

}
