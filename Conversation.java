// You should **not** update any call signatures in this file
// only modify the body of each function
import java.util.ArrayList;
import java.util.Scanner;
class Conversation implements ConversationRequirements {

  // Attributes
  ArrayList<String> transcript;
  Scanner userInput = new Scanner(System.in);
  /**
   * Constructor 
   */
  Conversation() {
    transcript = new ArrayList<>();
    
    }
  
  /**
   * Starts and runs the conversation with the user
   */
  public void chat() {
    Scanner userInput = new Scanner(System.in);
    System.out.println("How many rounds?");
    int rounds = userInput.nextInt();
    userInput.nextLine();
    System.out.println("You chose " + rounds + " rounds");
    System.out.println("Hello! How are you?");
    this.transcript.add("Hello! How are you?");
    for (int i = 0; i < rounds; i++)
    {
      String input = userInput.nextLine();
      this.transcript.add(input);
      System.out.println(respond(input));
      this.transcript.add(respond(input));
    }
  }

  /**
   * Prints transcript of conversation
   */
  public void printTranscript() {
    userInput.nextLine();
    System.out.println("TRANSCRIPT: ");
    for (int i = 0; i < this.transcript.size(); i++) {
    System.out.println(this.transcript.get(i));
    }
    System.out.println("```");
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
