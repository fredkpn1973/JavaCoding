public class Game {

    public static void main(String args[]) {

        ScoreBoard board = new ScoreBoard(5);
        GameEntry game1 = new GameEntry("Jan", 100);
        GameEntry game2 = new GameEntry("Piet", 200);
        GameEntry game3 = new GameEntry("Kees", 100);
        GameEntry game4 = new GameEntry("Klaas", 50);
        GameEntry game5 = new GameEntry("Kees", 100);
        GameEntry game6 = new GameEntry("Klaas", 5000);
        board.add(game1);
        board.add(game2);
        board.add(game3);
        board.add(game4);
        board.add(game5);
        board.add(game6);
        System.out.println(board.printBoard());
        board.remove(1);
        System.out.println(board.printBoard()); 

    }

}
