public class MerkeziİslemBirimi implements IMerkeziİslemBirimi{

    private IEyleyici eyleyici;
    private ISicaklikAlgilayici sicaklikAlgilayici;

   public MerkeziİslemBirimi(){
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
