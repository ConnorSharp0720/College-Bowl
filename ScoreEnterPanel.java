import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class ScoreEnterPanel extends JPanel
{
    /** serial number */
    private static final long serialVersionUID = 5777740971062336138L;
    /** description area for data display */
    private JTextField teamNumber;
    private JTextField teamScore;
    
    /** enter button */
    private JButton enterButton;
    
    public ScoreEnterPanel() 
    {
        System.out.println("Building Team Enter panel");
        
        setLayout(new GridLayout(3,1));
        
        JLabel numLabel = new JLabel("  Team Number: ");
        teamNumber = new JTextField();
        JPanel numPanel = new JPanel(new BorderLayout());
        numPanel.setBackground(new Color(150, 200, 255));
        numPanel.add(numLabel,BorderLayout.WEST);
        numPanel.add(teamNumber,BorderLayout.CENTER);
        
        
        JLabel scoreLabel = new JLabel("  Score Number: ");
        teamScore = new JTextField();
        JPanel scorePanel = new JPanel(new BorderLayout());
        scorePanel.setBackground(new Color(150, 200, 255));
        scorePanel.add(scoreLabel,BorderLayout.WEST);
        scorePanel.add(teamScore,BorderLayout.CENTER);
        
        JPanel buttonPanel = new JPanel();
        enterButton = new JButton("ENTER");
        enterButton.addActionListener(new textListener());
        buttonPanel.setBackground(new Color(150, 200, 255));
        buttonPanel.add(enterButton);
        
        //JTextField teamName = new JTextField();
        teamScore.addActionListener(new textListener());
        
        //Creates, adds and styles the Panel

        add(numPanel);
        add(scorePanel);
        add(buttonPanel);
        setBackground(new Color(0, 128, 210));
        setBorder(BorderFactory.createTitledBorder(getBorder(), "Input Team Number and Score", TitledBorder.CENTER, TitledBorder.CENTER));
    }
    
    private class textListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            int teamNUM = Integer.parseInt(teamNumber.getText());
            int teamSCORE = Integer.parseInt(teamScore.getText());
            TeamList.getTeam(teamNUM).addScore(teamSCORE);
            teamNumber.setText("");
            teamScore.setText("");
        }
    }
}
