
package pbo3.pkg10117110.latihan59.detectiveconan;


public class detective extends film {
    
    public detective(String nama,String tokoh) {
        super(nama,tokoh);
        
    }
    
    public void tampilDeetective(){
        
        detective obj2 = new detective("Hirosi Agasa","Detektif Cilik");
        System.out.println("Tokoh : "+obj2.tokoh);
        System.out.println("1. "+obj2.nama);
        System.out.println("2. Genta Kojima");
        System.out.println("3. Mitsuhiko Tsuburaya");
        System.out.println("4. Ai Haibara");
        System.out.println("5. Conan edogawa");
        System.out.println("6. Ayumi Yoshida");
        
        
    }
    
    
}
