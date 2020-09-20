public class Artikel {
    enum BTW {
        GEEN(0), LAAG(6), HOOG(21);

        private final int percent;

        BTW(int percent) {
            this.percent = percent;
        }

        public int getPercent() {
            return percent;
        }
    }

    private String naam;
    private double prijs;
    private BTW btw;

    public Artikel(String naam, double prijs, BTW btw) {
        this.naam = naam;
        this.prijs = prijs;
        this.btw = btw;
    }

    public Prijs getPrijs() {
        return new Prijs();
    }

    public String getNaam() {
        return naam;
    }

    class Prijs {
        public double inclusief() {
            return prijs + btwDeel();
        }

        public double exclusief() {
            return prijs;
        }

        private double btwDeel() {
            return prijs * (btw.getPercent() / 100d);
        }
    }
}
