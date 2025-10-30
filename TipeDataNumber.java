// ada 4 tipe data number di java
// byte, short, int, long (tipe data bilangan bulat)
// by default dari tipe data number adalah int yaitu 0

public class TipeDataNumber {
    public static void main(String[] args) {
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000000;
        long iniLong = 1000000000;
        // pada long terakhir ini memberikan nilai yang lebih panjang dan ditambahkan L
        // diakhir number valuenya
        long iniLong2 = 1000000000L;

        // floating point number
        // float, double (tipe data desimal)
        // by default dari tipe data yaitu 0.0

        // format luar negeri menggunakan titik bukan koma
        // untuk tipe data float menggunakan huruf F/f(bisa digunakan huruf besar dan
        // kecil) diakhir value
        float iniFloat = 10.10F;
        // untuk valuenya sama tetapi tipe data berbeda jadi tidak menjadi masalah
        double iniDouble = 10.10;

        // Literals
        int decimalInt = 34;
        // Hexadecimal ini harus berikan 0x diawal value dan untuk valuenya menggunakan
        // A sampai F untuk nilai 10 sampai 15
        int HexaDecimal = 0xFFFFF;
        int binaryInt = 0b01010101; // untuk binary harus diawali denagn 0b dan valuenya hanya boleh mengguankan 0
                                    // dan 1

        Long amount = 1_000_000_000L;
    }

}
