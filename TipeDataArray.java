/**
 * Tipe Data Array
 * 
 * Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
 * Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat
 * 
 * -> Cara Kerja Array
 * Saat membuat sebuah array, kita harus menentukan jumlah data atau panjang
 * arraynya
 * Sebagai casenya menggunakan panjang array 10
 * Anggap ada 10 kotak yang berjejer dari 0 sampai dengan 9 kotak
 * Setiap kotak bisa diisi dengan data sesuai tipe data arraynya
 * Sebagai case ketika kotak tersebut diisi dengan tipe data integer semua kotak
 * hanya bisa diisi dengan data integer saja
 * Identias setiap kotaknya diarray disebut dengan sebuah angka dan bisa disebut
 * dengan index
 * 
 * => Case special dan beberapa analogi tentang array yang digantikan valuenya
 * Jadi ketika awal value index yang diisi dengan string contoh "Elman"
 * lalu diindex yang sama diisi dengan "James"
 * maka value index tersebut akan tergantikan jadi sekarang index tersebut
 * adalah dengan value "james"
 * akan tetapi pada terminal masih menampilkan value "Elman" sebelum digantikan
 * 
 * => CONTOH CASE ketika papan tulis yang di tullis 1 nama "Elman" lalu
 * difoto akan menampilkan "Elman" lalu dihapus nama "Elman" itu dan gantikan
 * dengan nama "James"
 * lalu di foto kembali dengan nama "james" berarti hasil foto tersebut seperti
 * terminal aka tersimpan sebelum berubah dan sesudah berubahnya value akan
 * tetapi aslinya sudah tergantikan dengan value yang baru
 * 
 * => Operasi di Array
 * array[index] => Mengambil data di array
 * array[index] = value => Mengubah data di array
 * array.length => Mengambil panjang array
 * 
 * => INFO
 * pada java tidak ada penghapusan data array, yang ada hanya penggantian data
 * pada index tersebut
 * Jadi tidak ada penghapusan perihal array karna total array yang sudah dibuat
 * adalah sudah fix jadi hanya bisa menggantikannya dengan by defaultnya saja
 * Tidak bisa menghapus indexnya pada array
 */
public class TipeDataArray {
    public static void main(String[] args) {
        // Dibawah ini "String[]" adalah sebuah kontrak tipe data array yang akan
        // digunakan
        // Dan "stringArray" adalah nama variabel arraynya ini bersifat bebas karna nama
        // variabel
        String[] stringArray;
        // Dibawah ini adalah inisialisasai sebuah array dengan panjang 3
        // yang diawali dengan nama variabel array lalu diikuti dengan kata kunci "new"
        // lalu diikuti dengan tipe data arraynya "String[]" dan diikuti dengan panjang
        // arraynya "[3]"
        // case dibawah ini harus menentukan nilai atau jumlah array yang ingin
        // digunakan
        stringArray = new String[3];
        // Dibawah ini adalah pengisian data ke dalam array
        // "stringArrray[0]" adalah mengakses index ke 0 dari variabel array stringArray

        stringArray[0] = "Elman";
        stringArray[1] = "Thomas";
        stringArray[2] = "Nabil";
        // Diatas ini adalah 3 pengisian data ke dalam array stringArray

        // Dibawah ini adalah mencetak data arraynya yang sudah diisi tadis
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        // Dibawah ini adalah mencoba menggantikan sebuah value di index ke 0
        stringArray[0] = "James";
        System.out.println(stringArray[0]);

        // Dibawah ini akan menggunakan opsi lainnya cara membuat sebuah kontrak tipe
        // data arraynya
        // => CONTOH NYA INI "String[] stringArray = new String[3];" adalah cara singkat
        // membuat sebuah
        // array

        // Dibawah ini adalah cara lainnya ketika membuat sebuah array
        String[] namaNama = { "Elman", "Thomas", "Nabil" }; // 1
        // kalau ini karna bukan data yang primitif maka bisa langsung diisi
        // tanpa harus menentukan panjang arraynya
        namaNama[0] = null;

        int[] arrayInt = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 2

        long[] arrayLong = { 10L, 20L, 30L }; // 3

        // Contoh penghapusan atau penggantian data arrayLong
        // Jika set dengan integer harus dikosongkan dengan by default nya
        arrayLong[1] = 0;

        // OPERASI DI ARRAY
        // Mengambil data variabel dari arrayLong
        System.out.println(arrayLong.length); // Mengambil panjang dari variable arrayLong

    }

}
