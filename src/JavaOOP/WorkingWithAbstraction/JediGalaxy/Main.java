package JavaOOP.WorkingWithAbstraction.JediGalaxy;


public class Main {
    public static void main(String[] args) {

        Game game = new Game();

        game.gameLoop();

        System.out.println(game.getPoints());

    }


}