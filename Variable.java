/**
 * Variable
 * 
 * Variabel adalah tempat untuk menyimpan data
 * Java adalah bahasa static type, sehingga sebuah variabel hanya bisa digunakan
 * untuk menyimpan tipe data
 * yang sama, tidak bisa berubah-ubah tipe data seperti dibahasa pemrograman PHP
 * atau Javascript
 * Untuk membuat variabel diJava kita bisa menggunakan nama tipe data lalu
 * diikuti dengan nama variabel nya
 * Nama variabel tidak boleh mengandung whitespace (spasi, enter, tab), dan
 * tidak boleh seluruhnya number
 */

/**
 * Kata Kunci Var
 * Sejak versi Java 10, java mendukung permbuatan variabel dengan kata kunci
 * var, sehingga kita tidak perlu menyebutkan tipe datanya
 * 
 * Kata kunci dengan nama var seperti bahasa pemrograman javascript yang
 * disingkat juga yaitu var
 * 
 * Namun perlu diingat, saat kita menggunakan kata kunci var untuk membuat
 * variabel, kita harus menginisiasi value / nilai dari variabel tersebut secara
 * langsung
 */

/**
 * Kata Kunci Final
 * 
 * Secara default varibel di Java bisa diubah-ubah nilainya
 * Jika kita ingin membuat sebuah variabel yang datanya tidak boleh diubah
 * setelah pertama kali dibuat, kita bisa menggunakan kata kunci final
 * Istilah variabel seperti ini, banyak juga yang menyebutnya konstan
 */

public class Variable {
    public static void main(String[] args) {

        // Dibawah ini adalah jika membuat sebuah variabel yang tidak ingin menambahkan
        // valuenya secara langsung
        String name;
        name = "Elman Nabil";

        // ini adalah hasil pertama pada name
        System.out.println(name);

        int age = 29;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        // ini bisa dilakukan dan running sebuah java akan berjalan dari atas ke bawah
        // dan ini adalah final value yang dari variable name diatas
        name = "Thomas Kucluk";
        // dan akan berubah menjadi "Thomas Kucluk"
        System.out.println(name);

        // yang tidak bisa dilakukan adalah
        // ketika name dibuat valuenya dengan angka karna persyaratan awalnya name itu
        // adalah String
        // jadi dibawah ini tidak bisa dilakukan
        // name = 100;

        // Kata kunci var seperti dibawah ini tidak bisa atau tidak boleh
        // karena tidak terbaca apakah ini String atau tipe data lainnya
        // var name;

        // dibawah ini boleh karena normalnya seperti ini
        var firstName = "Elman";
        var middleName = "Thomas";
        var lastName = "Nabil";

        // Kata Kunci Final
        final String application = "Belajar Java Dasar";
        // Dibawah ini ingin menggantikan sebuah value dari application tetap yang
        // menggunanakn variabel final
        // itu tidak bisa dilakukan karena bersifat final atau konstan
        // seperti const pada javascript
        // application = "Belajar PHP";
    }

}
