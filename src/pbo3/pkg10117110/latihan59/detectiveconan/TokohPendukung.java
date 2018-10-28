
package pbo3.pkg10117110.latihan59.detectiveconan;


public class TokohPendukung extends film {
    
    public TokohPendukung(String nama,String tokoh) {
        super(nama,tokoh);
    }
    
    public void tampilTokohPendukung(){
        
        TokohPendukung obj1 = new TokohPendukung("Kazuha Toyama","Pendukung");
        System.out.println("tokoh : "+obj1.tokoh);
        System.out.println("1. "+obj1.nama);
        System.out.println("2. Heiji Hatori");
        System.out.println("3. Sonoko Suzuki");
        System.out.println("4. Eri Kisaki");
        
    }
    
}
