import java.util.Scanner;
/**
 *Shows dot product for vectors
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner
    Scanner input = new Scanner(System.in);
    //create variable array for first vector
    int [] vector = new int[3];
    //create variable for second vector
    int [] vector2 = new int[3];
    //ask user for first vector values
    System.out.println("Please enter the 3 values for the first vector");
    //put integers into array into for loop
    for(int i = 0; i < 3; i++){
      vector[i] = input.nextInt();
    } 
    //ask user for second vector values
    System.out.println("Please enter the 3 values for the second vector");
    //put integer into array into for loop
     for(int i = 0; i < 3; i++){
      vector2[i] = input.nextInt();
     }
     //create variable for total 
     int total = 0;
     //create a for dot product
     for(int i = 0; i < vector.length; i++){
       int sum = vector[i] * vector2[i];
       total = total + sum;
     } 
      //let user know their dot product
     System.out.println("The dot product is " + total);
  }
}
