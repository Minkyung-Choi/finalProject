import java.util.Scanner;
public class PrintStar {
    /**
     *the main method that gets and answers accordingly to user input
     */
    public static void main(String[] args){ //requirement 1: main method to run the program
        Scanner in = new Scanner(System.in);
        int column =0;
        int row = 0;
        System.out.println("Do you want to print stars? (yes or no): ");
        String response = in.nextLine(); //requirement 6: user input
        if(response.equals("no")){
            System.out.print("Bye!");
        }else{
            System.out.print("How many columns of stars?: ");
            column = in.nextInt();
            System.out.print("How many rows of stars?: ");
            row = in.nextInt();
            Star project = new Star(row, column);
            boolean existance =false;
            if(row >1){
                System.out.print("Would you like a line between each row of stars? (yes or no): ");
                String lines = in.next();
                if(lines.equals("yes")){
                    existance = true;
                }
            }
            project.printStar(existance);
        }

    }
}
