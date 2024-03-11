public class Ogrenci {
    private String ad;
    private String bölüm;
    private String ogrno;
    private double gano;
    private double harcHesapla;
    private int girisYili;
    private int bolumKodu;
    private int girisSira;


    public Ogrenci(String ad, String bölüm, int girisYili, int bolumKodu, int girisSira,double gano) {
        this.ad = ad;
        this.bölüm = bölüm;
        this.bolumKodu = bolumKodu;
        this.gano = gano;
        this.girisYili = girisYili;
        this.girisSira = girisSira;
        this.ogrno = noHesapla(this.girisYili, this.bolumKodu, this.girisSira);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBölüm() {
        return bölüm;
    }

    public void setBölüm(String bölüm) {
        this.bölüm = bölüm;
    }


    public String getOgrno() {
        return ogrno;
    }

    public void setOgrno(String ogrno) {
        this.ogrno = ogrno;
    }

    public double getHarcHesapla() {
        return harcHesapla;
    }

    public void setHarcHesapla(double harcHesapla) {
        this.harcHesapla = harcHesapla;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public int getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(int bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    public int getGirisSira() {
        return girisSira;
    }

    public void setGirisSira(int girisSira) {
        this.girisSira = girisSira;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public String noHesapla(int girisYili, int bolumKodu, int girisSira) {
        return "" + girisYili + "" + bolumKodu + "" + girisSira;
    }
    public static double HarcHesapla(int dersSayisi) {
        return (dersSayisi*12.4d);

    }
    public static double HarcHesapla(int dersSayisi, int uzatılanYil){
        return (dersSayisi*uzatılanYil*12.4d);
    }

}
