// You should **not** update any call signatures in this file
// only modify the body of each function
import java.util.Scanner;
class Conversation implements ConversationRequirements {

  // Attributes 
  Scanner scanner = new Scanner(System.in);
  
  /**
   * Constructor 
   */
  Conversation() {
    String[] keyWords = {"I", "Me", "Am", "You", "My", "Your"};
    }
  
  /**
   * Starts and runs the conversation with the user
   */
  public void chat() {
    System.out.println("How many rounds?");
    int rounds = scanner.nextInt();
    System.out.println("You chose " + rounds + " rounds");
    System.out.println("Hello! How are you?");
    for (int i = 0; i < rounds; i++)
    {
      String inputString = scanner.nextLine();
      this.respond(inputString);
      System.out.println(this.respond(inputString));
    }
  }

  /**
   * Prints transcript of conversation
   */
  public void printTranscript() {

  }

  /**
   * Gives appropriate response (mirrored or canned) to user input
   * @param inputString the users last line of input
   * @return mirrored or canned response to user input  
   */
  public String respond(String inputString) {
    String returnString = "Interesting!"; 
    return returnString; 
  }

  public static void main(String[] arguments) {
    Conversation myConversation = new Conversation();
    myConversation.chat();
    myConversation.printTranscript();

  }
}
