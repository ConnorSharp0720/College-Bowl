import java.util.ArrayList;
import java.util.Scanner;

public class Driver
{
    public static final int EXIT = 0;
    public static final int TEAMS = 1;
    public static final int SCORE = 2;
    public static final int TOPSCR = 3;
    public static final int QUIT = 4;
    
    public static Scanner input = new Scanner(System.in);
    
    public static ArrayList<Team> Teams = new ArrayList<Team>();

    public static void main(String[] args)
    {   
        int answer;
        
        System.out.println("Please choose from the following menu of choices: \n" + 
                "\n 1. Enter Teams \n 2. Enter Scores \n 3. Top Scores \n 4. Quit \n \nWhat is your choice?");
        
        answer = input.nextInt();
        input.nextLine();
        while(answer != QUIT)
        {
            if(answer == TEAMS)
            {
                teamInput();
            }
            
            if(answer == SCORE)
            {
                scoreInput();
            }
           
            if(answer == TOPSCR)
            {
                topScores();
            }
            
            System.out.println("Please choose from the following menu of choices: \n" + 
                    "\n 1. Enter Teams \n 2. Enter Scores \n 3. Top Scores \n 4. Quit \n \nWhat is your choice?");
            
            answer = input.nextInt();
            input.nextLine();
            
        }
        for(Team teamPrint: Teams)
        {
            System.out.println(teamPrint);
        }
        input.close();
    }

    public static void teamInput()
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
    
    public static void scoreInput()
    {
        System.out.println("You have selected score input");
        
        System.out.println("Enter A Team Number or 0 to quit");
        int num = input.nextInt();
        int score;
       
        while(num != EXIT)
        {
            System.out.println("enter the score");
            
            score = input.nextInt();
            Teams.get(num - 1).addScore(score);
           
            System.out.println("Enter A Team Number or enter 0 to quit");
            num = input.nextInt();
        }
    }
    
    public static void topScores()
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
}
