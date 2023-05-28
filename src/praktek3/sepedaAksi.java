package praktek3;
public class sepedaAksi {
    public static void main(String[] args) {
        sepeda s = new sepeda();
 
        s.setmerk("butterfly");
        s.setwarna("merah");
        s.setharga(1000);
        
        s.cetakinfo();
        system.out.print("merknya \t: ");
        system.out.println(s.getmerk());
        system.out.print("warnanya \t: ");
        system.out.println(s.getwarna());
        system.out.print("harganya \t: ");
        system.out.println(s.getharga());
    }
}
