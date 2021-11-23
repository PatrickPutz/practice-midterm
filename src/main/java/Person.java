public class Person {

    private String vorname;
    private String nachname;
    private int koerpergroesse;
    private byte aktivitaetslevel;

    public Person(String vorname, String nachname, int koerpergroesse, byte aktivitaetslevel) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.koerpergroesse = koerpergroesse;
        this.aktivitaetslevel = aktivitaetslevel;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getKoerpergroesse() {
        return koerpergroesse;
    }

    public byte getAktivitaetslevel() {
        return aktivitaetslevel;
    }

    public void setKoerpergroesse(int koerpergroesse) {
        this.koerpergroesse = koerpergroesse;
    }

    public void setAktivitaetslevel(byte aktivitaetslevel) {
        this.aktivitaetslevel = aktivitaetslevel;
    }
}
