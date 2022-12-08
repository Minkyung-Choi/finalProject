import java.util.Scanner;
public class PrintStar {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int column =0;
        int row = 0;
        System.out.println("Do you want to print stars? (yes or no): ");
        String response = in.nextLine();
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
