/**
 * Operasi Perbandingan
 * 
 * Operasi perbandingan adalah operasi untuk membandingkan dua buah data
 * Operasi perbandingan adalah operasi yang menghasilkan nilai boolean (true /
 * false)
 * Jika hasil operasinya adalah benar, maka nilainya adalah true
 * Jika hasil operasinya adalah salah, maka nilainya adalah false
 * 
 * Operator ||| Keterangan
 * > ||| Lebih dari
 * < ||| Kurang dari
 * >= ||| Lebih dari sama dengan
 * <= ||| Kurang dari sama dengan
 * == ||| Sama dengan
 * != ||| Tidak sama dengan
 * 
 * => INFO
 * Tidak hanya tipe data number atau int tetapi bisa juga tipe data lainnya
 */

public class OperasiPerbandingan {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;

        System.out.println(a > b); // lebih dari => FALSE karena nilainya sama
        System.out.println(a < b); // kurang dari => FALSE karena nilainya sama
        System.out.println(a >= b); // lebih dari sama dengan => TRUE karena nilainya lebih sama dengan
        System.out.println(a <= b); // kurang dari sama dengan => TRUE karena nilainnya kurang sama dengan
        System.out.println(a == b); // sama dengan => TRUE karena nilainya sama
        System.out.println(a != b); // tidak sama dengan => FALSE karena nilainya sama

    }

}
