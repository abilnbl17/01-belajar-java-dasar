/**
 * Tipe Data String
 * 
 * Tipe data string adalah tipe data yang berisikan data kumpulan karakter atau
 * sederhananya adalah teks
 * Di java, tipe data Strign direpresentasikan dengan kata kunci String
 * Untuk membuat String di Java, kita menggunakan karakter "(petik dua) sebelum
 * dan setelah teksnya
 * Default value untuk String adalah null
 * 
 */
public class TipeDataString {
    public static void main(String[] args) {
        String firstName = "Elman";
        String lastName = "Nabil";
        // Jika ingin menambahkan atau membuat value dari 2 variable bisa menggunakan
        // operator "+" (tambah)
        String fullName = firstName + " " + lastName;

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(fullName);
    }

}
