import java.util.Random;
import java.util.Scanner;

public class P09_TasKagıtMakas {
    public static void main(String[] args) {
       //rockpaperscissors_game- TAS_KAGIT_MAKAS OYUNU
                Scanner scn = new Scanner(System.in);
                Random random = new Random();

                while (true) {
                    // User Selection
                    System.out.println("Please set '0' for ROCK");
                    System.out.println("Please set '1' for PAPER");
                    System.out.println("Please set '2' for SCISSOR");

                    int selection = scn.nextInt();
                    System.out.println("User selection: " + (selection == 0 ? "ROCK" : selection == 1 ? "PAPER" : "SCISSOR"));
                    // User selection control
                    if (selection < 0 || selection > 2) {
                        System.out.println("Invalid selection. Please enter 0, 1, or 2.");
                        continue; // invalid selection return
                    }

                    // random computer select
                    int comselection = random.nextInt(3);
                    System.out.println("Computer's selection: " + (comselection == 0 ? "ROCK" : comselection == 1 ? "PAPER" : "SCISSOR"));

                    // result control
                    if (selection == comselection) {
                        System.out.println("Draw");
                    } else if ((selection == 0 && comselection == 2) || (selection == 1 && comselection == 0) || (selection == 2 && comselection == 1)) {
                        System.out.println("Win");
                    } else {
                        System.out.println("Lose");
                    }

                    // continue game or finish
                    System.out.println("Would you like to continue? (Yes/No)");
                    String answer = scn.next().trim().toLowerCase();

                    if (answer.equals("yes")) {
                        continue;  // continue game
                    } else if (answer.equals("no")) {
                        System.out.println("EXIT");
                        break;  //EXIT
                    } else {
                        System.out.println("Please enter 'yes' or 'no'.");
                    }
                }

                scn.close();

            }




        }


