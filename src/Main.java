public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenciler[] = {
                new Ogrenci("null", "null", 2020, 107, 828, 0.0),
                new Ogrenci("Gökhan", "Bilgisayar Mühendisliği", 2002, 101, 149, 0.0),
                new Ogrenci("Ayşe", "Makine Mühendisliği", 2000, 101, 528, 0.0),
                new Ogrenci("Elif", "Makine Mühendisliği", 2001, 102, 512, 1.98),
        };

        double gano = 0;
        if (gano < 0 && gano < 4) {
            throw new IllegalArgumentException("gano 0 ile 4 arasında olmalıdır");
        }

        for (Ogrenci o : ogrenciler) {


            System.out.println("ÖĞR-" +" " + o.getAd() + " " + o.getBölüm() + " " + o.getOgrno() + " " + o.getGano());


        }

        System.out.println("3. Öğrencinin ödeyeceği harç: " + ogrenciler[2].HarcHesapla(7));
        System.out.println("4. Öğrencinin ödeyeceği harç: " + ogrenciler[3].HarcHesapla(5, 3));

    }
}


