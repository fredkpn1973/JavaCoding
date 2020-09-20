class ArtikelApp {
    public static void main(String args[]) {
        Artikel a = new Artikel("appels", 2.5, Artikel.BTW.LAAG);
        System.out.println(a.getPrijs().inclusief());
    }
}