package praktek3;

public class sepeda {
  private string merk;
  private string warna;
  private double harga;
  
  void cetakinfo(){
      system.out.println("merk \t: "+merk+"\n"+
              "warna \t: "+warna+"\n"+
              "harga \t  "+harga);
      }

    public string getMerk() {
        return merk;
    }

    public string getWarna() {
        return warna;
    }

    public double getHarga() {
        return harga;
    }
  
  
}
