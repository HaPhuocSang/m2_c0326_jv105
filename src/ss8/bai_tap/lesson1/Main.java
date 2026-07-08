package ss8.bai_tap.lesson1;

public class Main {
    public static void main(String[] args) {
        TennisGame game = new TennisGame("Player 1", "Player 2");
        game.wonPoint("Player 1");
        System.out.println(game.getScore());
        game.wonPoint("Player 1");
        System.out.println(game.getScore());
        game.wonPoint("Player 2");
        System.out.println(game.getScore());
        game.wonPoint("Player 2");
        System.out.println(game.getScore());
        game.wonPoint("Player 1");
        System.out.println(game.getScore());
        game.wonPoint("Player 2");
        System.out.println(game.getScore());
        game.wonPoint("Player 1");
        System.out.println(game.getScore());
        game.wonPoint("Player 1");
        System.out.println(game.getScore());
    }
}
