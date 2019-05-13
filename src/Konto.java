public class Konto {

    private String navn;
    private int saldo;
    private static int antal=0;





    public Konto(String navn) {
        this.navn = navn;
        this.saldo = 0;
        this.antal++;
    }

    public Konto(String navn, int saldo) {
        this.navn = navn;
        this.saldo = saldo;
        this.antal++;
    }

    public Konto(int i) {
        this.saldo = i;
    }


    public String getNavn() {
        return navn;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int hæv(int i) {

        if (i <= saldo) {
            saldo = saldo - i;
            return i;
        }
    return 0;
    }

    public int getAntal() {
        return antal;
    }
}
