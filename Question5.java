import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int highest = 0;
    int num = 0;
    System.out.println("Enter an integer:");
    int number = in.nextInt();
    int[] narr = new int[number];
    for(int i = 0; i < number; i++){
      System.out.println("Enter a number:");
      int val = in.nextInt();
      narr[i] = val;      
    } 
    for(int n = 0; n < number; n++){
      int count = 0;
      for(int m = 0; m < number; m++){
        if(narr[n] == narr[m]){
          ++count;  
        }
      }
      if(count > highest){
        highest = count;
        num = narr[n];
      }
    }
    System.out.println(num);
    
  }
}
