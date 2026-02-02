import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        
       
        try(Scanner sc = new Scanner(System.in)){
             System.out.print( "Enter First Name: ");
                sb.append("First Name: ");
                     sb.append(sc.nextLine());
                        sb.append("\n");

             System.out.print( "Enter Last Name: ");
                sb.append("Last name: ");
                     sb.append(sc.nextLine());
                         sb.append("\n");
             
              System.out.print( "Enter Age: ");
               sb.append("Age: ");
                    sb.append(sc.nextLine());
                         sb.append("\n");

               System.out.print( "Enter Email: ");
                    sb.append("Email: ");
                        sb.append(sc.nextLine());
                             sb.append("\n");

                System.out.print( "Enter Phone Num: ");
                     sb.append("Phone: ");
                        sb.append(sc.nextLine());
                             sb.append("\n");


        }catch(InputMismatchException e){
            System.out.println("Invalid input");
        }


        //try-with-resource 
        try(FileWriter fw = new FileWriter("data.txt")){
            fw.write(sb.toString());
            System.out.println("Data is saved...");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}