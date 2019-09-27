import java.util.ArrayList;

public class TeamList
{
    public static ArrayList<Team> Teams = new ArrayList<Team>();
    
    public static ArrayList<Team> getTeamList()
    {
        return Teams;
    }
    
    public static String addTeam(Team team)
    {
        Teams.add(team);
        return team.getName() + " is team Number: " + Teams.size();
    }
    
    public static Team getTeam(int teamNum)
    {
        return Teams.get(teamNum -1);
    }
}
