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

    public String rechneBMI(int gewicht){
        double bmi = (double) gewicht / (((double) this.koerpergroesse / 100) * ((double) this.koerpergroesse / 100));

        if(bmi < 18.5)
            return "Untergewicht";
        else if(bmi <= 25)
            return "Normalgewicht";
        else if(bmi <= 30)
            return "Übergewicht";
        else
            return "Adipositas";
    }

    public void printPerson(int gewicht){
        String activitylevel;
        if(this.aktivitaetslevel == 1)
            activitylevel = "Couch Potato";
        else if(this.aktivitaetslevel == 2)
            activitylevel = "Gelegenheitssportler";
        else if(this.aktivitaetslevel == 3)
            activitylevel = "Sportler";
        else if(this.aktivitaetslevel == 4)
            activitylevel = "Profisportler";
        else
            activitylevel = "";

        System.out.println(this.vorname + " " + this.nachname + ", " + activitylevel + ", " + this.rechneBMI(gewicht));
    }

}
