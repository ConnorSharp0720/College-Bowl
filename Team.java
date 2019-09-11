import java.util.ArrayList;

public class Team
{
    private int score = 0;
    private ArrayList<Integer> questions = new ArrayList<Integer>();
    private int teamNumber = 0;
    private String name;
    
    public Team(int teamNumber, String name)
    {
        this.teamNumber = teamNumber;
        this.name = name;
    }
    
    public void addScore(int score)
    {
        questions.add(score);
        this.score = this.score + score;
    }

    /**
     * @return the score
     */
    public int getScore()
    {
        return score;
    }
    
    /**
     * @return the team Number
     */
    public int getTeamNumber()
    {
        return teamNumber;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @return the question
     */
    public int getQuestionNum(int index)
    {
        return questions.get(index - 1);
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score)
    {
        this.score = score;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * @param score the score to set
     */
    public void setTeamNumber(int score)
    {
        this.score = score;
    }
    
    /**
     * @return the question
     */
    public int setQuestionNum(int index, int score)
    {
        return questions.set(index, score);
    }
    
    public String toString()
    {
        String output = "Team Number: "+ teamNumber + " Team Name: " + name + " Team Score: " + score;
        return output;
    }
}
