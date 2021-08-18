public class Answer {
    private int klausimas;
    private String atsakymas;

    public Answer() {
    }

    public Answer(int klausimas, String atsakymas) {
        this.klausimas = klausimas;
        this.atsakymas = atsakymas;
    }

    public int getKlausimas() {
        return klausimas;
    }

    public void setKlausimas(int klausimas) {
        this.klausimas = klausimas;
    }

    public String getAtsakymas() {
        return atsakymas;
    }

    public void setAtsakymas(String atsakymas) {
        this.atsakymas = atsakymas;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "klausimas='" + klausimas + '\'' +
                ", atsakymas='" + atsakymas + '\'' +
                '}';
    }
}
