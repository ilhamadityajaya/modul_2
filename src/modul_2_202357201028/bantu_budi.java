package modul_2_202357201028;
import javax.swing.JOptionPane;

public class bantu_budi {
    
    public static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
    
    public static double luasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
    
    public static double luasLingkaran(double jariJari) {
        return Math.PI * Math.pow(jariJari, 2);
    }
    
    public static void main(String[] args) {
        
        double panjangPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang persegi panjang : "));
        double lebarPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar persegi panjang : "));
        double luasPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan luas persegi panjang :"));
        JOptionPane.showInputDialog(panjangPersegiPanjang, lebarPersegiPanjang);
        System.out.println("Luas Persegi Panjang : " + luasPersegiPanjang);
        
        double alasSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas segitiga : "));
        double tinggiSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga : "));
        double luasSegitiga = luasSegitiga(alasSegitiga, tinggiSegitiga);
        JOptionPane.showInputDialog(panjangPersegiPanjang, lebarPersegiPanjang);
        System.out.println("Luas Segitiga : " + luasSegitiga);
        
        double jarijariLingkaran = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari jari lingkaran : "));
        double luasLingkaran = luasLingkaran(jarijariLingkaran);
        JOptionPane.showInputDialog(null, "Luas Lingkaran : " + luasLingkaran);
        System.out.println("Luas Lingkaran : " + luasLingkaran);
    }
}
