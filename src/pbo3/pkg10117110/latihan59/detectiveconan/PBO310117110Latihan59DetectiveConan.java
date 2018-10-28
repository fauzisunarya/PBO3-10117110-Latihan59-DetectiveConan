

/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Tokoh-Tokoh Dalam Anime Conan Dengan Menggunakan Konsep OOP inheritance,olymorphism dan constructor
 */

package pbo3.pkg10117110.latihan59.detectiveconan;


public class PBO310117110Latihan59DetectiveConan {

    public static void main(String[] args) {
       

        TokohUtama obj = new TokohUtama("","");
        obj.tampilTokohUtama();
        System.out.println("");
        TokohPendukung obj1 = new TokohPendukung("","");
        obj1.tampilTokohPendukung();
        System.out.println("");
        detective obj2 = new detective("","");
        obj2.tampilDeetective();
        
       
        
        

    }
    
}
