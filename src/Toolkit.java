import java.util.Scanner;

public class Toolkit {
  private static final Scanner stdIn = new Scanner(System.in);

  /* TODO
        complete the GOODBYEMESSAGE
   */
  public static final String GOODBYEMESSAGE = "Thank you for playing";

  public static String getInputForMessage(String message) {
    System.out.println(message);
    return stdIn.nextLine().trim();
  }

  public static String printArray(String[] array) {
    StringBuilder sb = new StringBuilder();
    /* TODO
        create a loop to print the numbers out once a user has inputted the BingoCard numbers, separated by commas (trim leading / trailing spaces)
        check the expected output here to ensure that it appears as it should
        return as a sb.toString()
   */

    System.out.printf("You entered%n");

    for(int bingoNumber = 0; bingoNumber < array.length; ++bingoNumber){
      if(bingoNumber == array.length - 1){
        sb.append(array[bingoNumber]);
      }
      else{
        sb.append(array[bingoNumber]);
        sb.append(", ");
      }
    }

    return sb.toString();
  }
}
