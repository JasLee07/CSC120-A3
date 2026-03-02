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
      String s = respond(input);
      System.out.println(s);
      this.transcript.add(s);
    }
    System.out.println("See you next time!");
    this.transcript.add("See you next time!");
    System.out.println();
    userInput.close();
  }

  /**
   * Prints transcript of conversation
   */
  public void printTranscript() {
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
    String returnString = "";
    String regex = "[,\\.\\s\\?\\!]";
    String[] inputWords = inputString.split(regex);
    for(int i =0; i<inputWords.length;i++){
      if(inputWords[i].equalsIgnoreCase("I")){
        inputWords[i] = "you";
      }
      else if(inputWords[i].equalsIgnoreCase("Me")){
        inputWords[i] = "you";
      }
      else if(inputWords[i].equalsIgnoreCase("Am")){
        inputWords[i] = "are";
      }
      else if(inputWords[i].equalsIgnoreCase("Are")){
        inputWords[i] = "am";
      }
      else if(inputWords[i].equalsIgnoreCase("You")){
        inputWords[i] = "I";
      }
      else if(inputWords[i].equalsIgnoreCase("My")){
        inputWords[i] = "your";
      }
      else if(inputWords[i].equalsIgnoreCase("Your")){
        inputWords[i] = "my";
      }
    }
    // // Array of default/canned responses
    // String [] chatResponse = {"Oh nice!", "Interesting!", "Hm..", "I see!", "Right"};
    // // Picks a random response from the array
    // int index = (int) (Math.random() * chatResponse.length);
    returnString = String.join(" ", inputWords);
    return returnString;
  }

  public static void main(String[] arguments) {
    Conversation myConversation = new Conversation();
    myConversation.chat();
    myConversation.printTranscript();

  }
}
