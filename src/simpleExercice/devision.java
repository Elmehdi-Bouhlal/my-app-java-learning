package simpleExercice;

import java.util.Scanner;

public class devision {
    public devision(){
        Scanner scanner = new Scanner(System.in);
        int x1 , x2 ;
        float resulats ;
        try{
            System.out.print("enter le 1er nomber : ");
            x1 = Integer.parseInt(scanner.nextLine()) ;
            System.out.print("enter le 2er nomber : ");
            x2 = Integer.parseInt(scanner.nextLine()) ;
            resulats = x1 / x2 ;
            System.out.println("the results of you calculation is : " + resulats);
        }catch(NumberFormatException err){
            System.out.println("this result is not valid !");
        }catch(ArithmeticException err){
            System.out.println("you need to enter a number more than 0 !");
        }finally {
            scanner.close();
        }
    }
}
