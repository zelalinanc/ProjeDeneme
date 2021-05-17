

import java.util.Scanner;



public class AraYuz implements IAraYuz{
    private Scanner scan=new Scanner(System.in);
    private IMerkeziİslemBirimi merkeziİslemBirimi;


    public AraYuz() {
        merkeziİslemBirimi=new MerkeziİslemBirimi();

    }



    public void mesajGoruntule(String mesaj) {

        System.out.println(mesaj);
    }
    public String kullaniciAdi(){

        return scan.next();

    }


    public String veriAl() {
        return scan.next();
    }

    public int secilen(){
        Scanner input=new Scanner(System.in);
        return input.nextInt();
    }

    @Override
    public void sicaklikGoruntulemeSecildi() {
        merkeziİslemBirimi.SicaklikAlgilayiciOku();
    }

    @Override
    public void sogutucuAcSecildi() {
      merkeziİslemBirimi.EyleyiciSogutucuAc();
    }






    @Override
    public void sogutucukapatSecildi() {
       merkeziİslemBirimi.EyleyiciSogutucuKapat();

    }


}
