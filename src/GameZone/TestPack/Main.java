package GameZone.TestPack;

public class Main {
    public static void main(String[] args) {
        WordChainGame game = new WordChainGame();
        game.initialize();
        game.play();
        System.out.println("Game over!");
    }
}
