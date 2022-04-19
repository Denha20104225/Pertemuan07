
package Pertemuan07;

/**
 *
 * 
 */
public class Apel extends buah {
     @Override
      public void TampilInfo(){
          System.out.println("==============================");
    System.out.println("INFORMASI DATA BUAH SEMANGKA");
    System.out.println("NAMA BUAH  :"+this.getNAMA());
    System.out.println("HARGA       :"+this.getHARGA());
    System.out.println("WARNA       :"+this.getWARNA());
}
}