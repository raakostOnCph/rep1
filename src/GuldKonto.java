public class GuldKonto extends Konto {

    int overtræk = 1000;

    public GuldKonto(String s, int i) {
    super(s,i);
    }

    @Override
    public int hæv(int i) {

        setSaldo(getSaldo() - i);
        return i;
    }



}
