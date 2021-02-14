import java.util.Scanner;
public class Election
{
    public static void main (String[] args)
{
    Scanner input = new Scanner(System.in);    
        String[] candidates = new String [4]; //Total candidates of 4 people.
        int[] votes = new int[4];
        int total = 0;
        double percent;
        int x = 0;
        String winner = null;
    
   for(int i = 0; i<4; i++) //Input candidate's name and total votes 4 times.
{            
     System.out.print("Enter the candidate's names: ");    
     candidates[i] = input.next();
     System.out.print("Enter the candidate's vote: ");
     votes[i] = input.nextInt();

     System.out.print("\n");

     total += votes[i];
   
        if(votes[i]>x)
        {
         x = votes[i];
         winner = candidates[i]; 
        }
}
    System.out.println("\n"); 
    System.out.println("Candidate\tVotes\tPercentage of Total Votes (%)");
  for(int i = 0; i < 4; i++)
{
   percent = (double)votes[i] * 100 / total; 
   System.out.println (candidates[i] + "\t\t" +votes[i]+ "\t\t" +percent);  
}
   System.out.println("\n");
   System.out.println("Total Votes \t" +total);
   System.out.println("The winner of this Campus Election is "+winner);
   }
}
