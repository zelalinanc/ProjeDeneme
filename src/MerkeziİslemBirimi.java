public class Merkezi─░slemBirimi implements IMerkezi─░slemBirimi{

    private IEyleyici eyleyici;
    private ISicaklikAlgilayici sicaklikAlgilayici;

   public Merkezi─░slemBirimi(){
       eyleyici=new Eyleyici();
       sicaklikAlgilayici=new SicaklikAlgilayici();



   }

   public void EyleyiciSogutucuAc(){
       eyleyici.SogutucuAc();
   }

    public void EyleyiciSogutucuKapat(){
        eyleyici.SogutucuKapat();
    }

  public void SicaklikAlgilayiciOku(){

      sicaklikAlgilayici.SicaklikOku();


  }
  public void abone(){
      sicaklikAlgilayici.ekle(new Subscriber());
  }



}
