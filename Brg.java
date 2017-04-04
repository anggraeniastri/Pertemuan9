public class Brg{
   String Merk;
   String Status_Barang;

  public void data(){
     System.out.println("Merk :"+Merk);
     System.out.println("Status Barang :"+Status_Barang);
     

 }
}

public class Tas extends Brg{

}

public class Aksi{
 public static void main(String[] args) {
  Tas tas = new Tas() ;
  tas.data();
 }
}

public class Tas extends Brg {

 public void data() {
    String Merk;
    String Status_Barang;
  System.out.println("Merk :"+Merk);
  System.out.println("Status Barang :"+Status_Barang);
  
 }
}

class tampil{
 public static void main(String[]asdasd){
  Brg a = new Brg("Roxy","Baru");
  a.infoBrg();
  
  Tas b = new Tas("Eiger","baru");
  b.infoTas();
  
  
  System.out.println("-----------------------------------");
 }
}

