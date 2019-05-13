public class Main {

    public static void main(String[] args) {
	// write your code here

        // eks på overloading.
//        Konto konto = new Konto("nik");
//
//        Konto konto1 = new Konto("eva", 500);
//
//
//
        Konto konto3 = new Konto(200);
//
//        konto.getAntal();

//        System.out.println(konto1.hæv(600));

//        GuldKonto guldKonto = new GuldKonto("Eva",100);
//
//        System.out.println(guldKonto.hæv(2500));


       // System.out.println(getinput("skriv dit navn").toUpperCase());


        GuldKonto guldKonto = new GuldKonto("eva",2000);

        guldKonto.overtræk = 66;

        System.out.println(((GuldKonto)  ( ((Konto)guldKonto))).overtræk ) ;



    }


}
