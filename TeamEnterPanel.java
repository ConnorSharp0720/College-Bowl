import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class TeamEnterPanel extends JPanel
{
    /** serial number */
    private static final long serialVersionUID = 5777740971062336138L;
    /** description area for data display */
    private JTextArea resultDescription;
    JTextField teamName = new JTextField();
    
    public TeamEnterPanel() 
    {
        System.out.println("LIST OF TEAM HISTORY");
        
        // Final variables for the JTextArea dimensions
        final int COLUMN_FIELD_WIDTH = 3;
        final int COLUMN_FIELD_HEIGHT = 3;
        setLayout(new GridLayout(2,1));
        
        //JTextField teamName = new JTextField();
        teamName.addActionListener(new textListener());
        
        //Creates, adds and styles the Panel
        resultDescription = new JTextArea(COLUMN_FIELD_HEIGHT, COLUMN_FIELD_WIDTH);
        resultDescription.setEditable(false);
        add(teamName);
        add(resultDescription);
        setBackground(new Color(0, 128, 210));
        setBorder(BorderFactory.createTitledBorder(getBorder(), "Input a Team name and press ENTER", TitledBorder.CENTER, TitledBorder.CENTER));
    }
    
    private class textListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Team tempTeam;
            tempTeam = new Team(TeamList.getTeamList().size() + 1, teamName.getText());
            //TeamList.addTeam(tempTeam);
            String result = TeamList.addTeam(tempTeam);
            resultDescription.setText(result);
            System.out.println(result);
            teamName.setText("");
        }
    }
}
