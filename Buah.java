
package Pertemuan07;

/**
 *
 * 
 */
public class buah {
    private String NAMA, WARNA;
    private double Harga;
    
    public void setNAMA(String N){
    this.NAMA = N;
    }
    public String getNAMA(){
        return this.NAMA;
        }
    public void setWARNA(String color){
        this.WARNA = color;
    }
    public String getWARNA(){
        return this.WARNA;
    }
    public void setHARGA(double H){
        this.Harga = H;
    }
    public double getHARGA(){
    return this.Harga;
    
    }
    public void TampilInfo(){
    System.out.println("=================================");
    System.out.println("INFORMASI DATA HARGA BUAH");
    System.out.println("NAMA BUAH   :"+this.NAMA);
    System.out.println("HARGA       :"+this.Harga);
    System.out.println("WARNA       :"+this.WARNA);
    }
}
    