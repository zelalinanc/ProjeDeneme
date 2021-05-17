

public class Cihaz {
    private IAraYuz arayuz;
    private String isim;
    private String sifre;
    private Cihaz(CihazBuilder builder){
        this.isim = builder.isim;
        this.sifre = builder.sifre;

    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getIsim(){
        return isim;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getSifre() {
        return sifre;
    }

    public static class CihazBuilder{
        private String isim;
        private String sifre;

        public CihazBuilder(String isim, String sifre) {
            this.isim = isim;
            this.sifre = sifre;
        }
        public Cihaz build() {

            return new Cihaz(this);
        }





    }




    // ana menu seçenekleri
    private static final int SICAKLIK_GORUNTULE = 1;
    private static final int SOGUTUCU_AC = 2;
    private static final int SOGUTUCU_KAPAT = 3;
    private static final int CIKIS = 4;

    public  Cihaz() {
        arayuz=new AraYuz();

    }




    public void basla(){

           arayuz.mesajGoruntule("Lütfen kullanıcı adınızı ve şifrenizi giriniz!");


            arayuz.mesajGoruntule("Kullanici adinizi giriniz:");
            String isim= arayuz.kullaniciAdi();
            arayuz.mesajGoruntule("Şifrenizi giriniz:");
            String sifre= arayuz.veriAl();
            IVeriTabani veritabani=new VeriTabani();
        if (veritabani.kullaniciDogrula(isim,sifre))
        {
            islemSecimi();
        }
        else{
          System.out.println("Hatalı Giriş! Kullanıcı Dogrulanmadı!");
        }



    }

    private void islemSecimi(){
        int secim;
        do{
            secim=anaMenuyuGoster();
            switch (secim) {
                case SICAKLIK_GORUNTULE:
                    arayuz.sicaklikGoruntulemeSecildi();
                    break;
                case SOGUTUCU_AC :
                    arayuz.sogutucuAcSecildi();

                    break;

                case SOGUTUCU_KAPAT:
                    arayuz.sogutucukapatSecildi();
                    break;


                case CIKIS:
                    arayuz.mesajGoruntule("Çıkış yapıldı!");
                    break;
                default:
                    arayuz.mesajGoruntule("1-4 arasında bir sayı girmelisiniz");
            }
        }while(secim!=4);
    }


    private int anaMenuyuGoster()
    {
        arayuz.mesajGoruntule("******************************************");
        arayuz.mesajGoruntule("Ana Menu");
        arayuz.mesajGoruntule("1-Sıcaklık Görüntüle");
        arayuz.mesajGoruntule("2-Sogutucuyu ac");
        arayuz.mesajGoruntule("3-Sogutucuyu kapat");
        arayuz.mesajGoruntule("4-Cikis");
        arayuz.mesajGoruntule("Seciminiz:");
        arayuz.mesajGoruntule("******************************************");

        return arayuz.secilen();
    }







}
