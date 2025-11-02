import java.util.Date;

/**
 * => Expression
 * > Exporession adalah kontruksi dari variabel, operator dan pemanggulan method
 * yang mnengevaluasi menjadi sebuah single value
 * > Expression adalah core component dari statement
 * 
 * => Statement
 * > Statement bisa dibilang adalah kalimat lengkap dalam bahasa
 * > Sebuah statement berisikan execution komplit, biasanya diakhiri dengan
 * titik koma
 * > Ada bebrapa jenis statement :
 * >> Assignment Statement
 * >> Penggunaan ++ dan --
 * >> Method Invocation
 * >> Object Creation statement
 * 
 * => Block
 * > Block adalah kumpulan statement yang terdiri dari nol atau lebih statement
 * > Kumpulan expression yang membentuk sebuah statement
 * > Kumpulan statement dalam 1 block disebut dengan block
 * > Block diawali dan diakhiri dengan kurung kurawal {}
 * > Membuat block didalam block juga diperbolehkan
 */

// 3. Block == Kumpulan dari statement dalam 1 block
// contoh block yang dimaksud ada ini function main yang biasa digunakan
public class Block {
    public static void main(String[] args) {

        // 1. Expression == single value
        int value; // Expression // juga bisa dibilang statement karena mendeklarasi
        value = 10; // Expression // juga bisa dibilang statement karena mengassign sebuah variable

        // value = 100 ini termasuk single value
        // System.out.println adalah Statement karena memanggil sebuah method
        System.out.println(value = 100);

        // 2. Statement == execution komplit
        // assignment statement
        double aValue = 8933.234;
        // increment statement
        aValue++;
        // method invocation statement
        System.out.println("Hello World!");
        // Object creation statement
        Date date = new Date(); // import sebuah java util date
    }
}
