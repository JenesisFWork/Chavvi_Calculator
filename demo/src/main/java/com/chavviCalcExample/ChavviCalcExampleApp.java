package com.chavviCalcExample;

import java.util.*;

/* Programmer: Jenesis Fabia
 * Making a 
 * chavvi calc calculator
 * using Prof. Solomon's code
 * as a starting point
 */
public class ChavviCalcExampleApp {

  // from a tutor from Net Tutor
public static double A = 0.000,B=0.000;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Character command = '_';

    // loop until user quits
    while (command != 'q') {
      printMenu();
      System.out.print("Enter a command: ");
      command = menuGetCommand(scan);

      executeCommand(scan, command);
    }

    scan.close();
  }

  //
  // menu functions
  //
  private static void printMenuLine() {
    System.out.println(
      "----------------------------------------------------------"
    );
  }

  private static void printMenuCommand(Character command, String desc) {
    System.out.printf("%s\t%s\n", command, desc);
  }

  // prints the menu
  public static void printMenu() {
    printMenuLine();
    System.out.println("Chavvi Calc");
    printMenuLine();

    printMenuCommand("A="+A, "B="+B); //display A & B

    printMenuLine();
    printMenuCommand('a', "Enter a Value for A");
    printMenuCommand('b', "Enter a Value for B");
    printMenuCommand('+', "Add");
    printMenuCommand('-', "Subtract");
    printMenuCommand('*', "Multiply");
    printMenuCommand('/', "Divide");
    printMenuCommand('c', "Clear");
    printMenuCommand('q', "Quit");

    printMenuLine();
  }

  //got help from a tutor from Net Tutor
  private static void printMenuCommand(String string, String desc) {
      
      System.out.println(string+" ");
      System.out.println(desc);
  }

  // get first character from input
  private static Character menuGetCommand(Scanner scan) {
    Character command = '_';

    String rawInput = scan.nextLine();

    if (rawInput.length() > 0) {
      rawInput = rawInput.toLowerCase();
      command = rawInput.charAt(0);
    }

    return command;
  }

  // calculator functions
  private static Boolean executeCommand(Scanner scan, Character command) {
    Boolean success = true;
    //from a tutor from Net Tutor
    double result;
    switch (command) {
      case 'a':
        System.out.println("Enter a Value for A: ");
        A = scan.nextDouble();
        break;
      case 'b':
        System.out.println("Enter a Value for B: ");
        B = scan.nextDouble();
        break;
      case '+':
        result = A + B;  
        System.out.println("Values of A and B added and the result is "+result);
        break;
      case '-':
        result = A - B;  
        System.out.println("Values of A and B subtraced and the result is "+result);
        break;
        case '/':
        result = A / B;  
        System.out.println("Values of A and B divided and the result is "+result);
        break;
      case '*':
        result = A * B;  
        System.out.println("Values of A and B multiplied and the result is "+result);
        break;  
      case 'c':
        A = 0.00;
        B = 0.00;
        System.out.println("Values of A and B set back to default(0.00)");
        break;    
      case 'q':
        System.out.println("Thank you for using Chavvi Calc");
        break;
      default:
        System.out.println("ERROR: Unknown commmand");
        success = false;
    }

    return success;
  }
}
