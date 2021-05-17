import java.util.Random;



public class SicaklikAlgilayici implements ISicaklikAlgilayici{



    private int derece;
    private int kritikDerece;



    private ISubject publisher;

    public void SicaklikAlgilayici(){
        publisher = new Publisher();

    }


    @Override
    public int SicaklikOku() {
        Random random = new Random();
        int derece = random.nextInt(100);
        int kritikDerece=50;
        System.out.println("Sıcaklık Değeri: " + derece);


        if(derece>kritikDerece)
        {

            System.out.println("Sıcaklık Değeri cihaz için çok yüksek.Lütfen soğutucuyu açınız!");
        }


        return derece;
    }

    @Override
    public void ekle(Subscriber subscriber) {
        publisher.attach(subscriber);
    }




}
