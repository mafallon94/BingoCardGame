public class BingoRunner {
  public static void main(String[] args) {
    /* TODO
          create and execute a new BingoController that starts the game
          invoke run()
          include the Thank you for playing once the game exits (GOODBYEMESSAGE)
     */

    BingoController nuGame = new BingoController();

    nuGame.run();

    System.out.printf("%s%n", Toolkit.GOODBYEMESSAGE);

  }
}
