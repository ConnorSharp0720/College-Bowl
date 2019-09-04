import java.util.ArrayList;
import java.util.Scanner;

public class Driver
{

    public static void main(String[] args)
    {
        ArrayList<Team> Teams = new ArrayList<Team>();
        Scanner input = new Scanner(System.in);
        
        int answer;
        
        System.out.println("Please choose from the following menu of choices: \n" + 
                "\n 1. Enter Teams \n 2. Enter Scores \n 3. Top Scores \n 3. Quit \n What is your choice?");
        
        answer = input.nextInt();
        input.nextLine();
        while(answer != 4)
        {
            if(answer == 1)
            {
                Team tempTeam;
                System.out.println("You have selected team input");
               
                System.out.println("Enter A Team Name or enter 0 to quit");
                String check = input.nextLine();
               
                while(!check.equals("0"))
                {
                    tempTeam = new Team(Teams.size() + 1, check);
                    Teams.add(tempTeam);
                    System.out.println(check + " is team Number: " + Teams.size());
                   
                    System.out.println("Enter A Team Name or enter 0 to quit");
                    check = input.nextLine();
                }
            }
            
            if(answer == 2)
            {
                System.out.println("You have selected score input");
               
                System.out.println("Enter A Team Number or 0 to quit");
                int num = input.nextInt();
                int score;
               
                while(num != 0)
                {
                    System.out.println("enter the score");
                    
                    score = input.nextInt();
                    Teams.get(num - 1).addScore(score);
                   
                    System.out.println("Enter A Team Number or enter 0 to quit");
                    num = input.nextInt();
                }
            }
           
            if(answer == 3)
            {
                Team top1 = new Team(0, "random");
                Team top2 = new Team(0, "random");
                Team top3 = new Team(0, "random");
                
                System.out.println("The Top 3 Teams are:");
                
                for(Team teamCompare: Teams)
                {
                    if(teamCompare.getScore() > top1.getScore())
                    {
                        top3 = top2;
                        top2 = top1;
                        top1 = teamCompare;
                        
                    }
                }
                
                System.out.println(top1 + "\n" + top2 + "\n" + top3 + "\n");
            }
            
            System.out.println("Please choose from the following menu of choices: \n" + 
                    "\n 1. Enter Teams \n 2. Enter Scores \n 3. Top Scores \n 3. Quit \n What is your choice?");
            
            answer = input.nextInt();
            input.nextLine();
            
        }
        for(Team teamPrint: Teams)
        {
            System.out.println(teamPrint);
        }
        input.close();
    }

}
