
package pbo3.pkg10117110.latihan59.detectiveconan;

public class TokohUtama extends film {
    
    public TokohUtama(String nama,String tokoh) {
        super(nama,tokoh);
    }
    
    public void tampilTokohUtama(){
        
        TokohUtama obj = new TokohUtama("Shinichi Kudo","Utama");
        System.out.println("======Film Detective Conan======");
        System.out.println("Tokoh : "+obj.tokoh);
        System.out.println("1. "+obj.nama);
        System.out.println("2. Ran Mouri");
        System.out.println("3. Kogoro Mouri");
    }
    
}
