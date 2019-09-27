import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;


public class InputPanel extends JPanel
{
    /** serial number */
    private static final long serialVersionUID = -5778130703074619169L;
    
    /** Teams button */
    private JButton teamButton;
    /** scores button */ 
    private JButton scoreButton;
    /** button group for buttons */
    private ButtonGroup bg;
    
    public InputPanel()
    {
        // message for user
        System.out.println("Building Statistics panel");
        
        // creates a new button group
        bg = new ButtonGroup();
        setLayout(new GridLayout(2,1));
        // creates buttons 
        teamButton = new JButton("TEAM");
        teamButton.addActionListener(new TeamButtonListner());
        scoreButton = new JButton("SCORE");
        scoreButton.addActionListener(new ScoreButtonListner());
        
        bg.add(teamButton);
        bg.add(scoreButton);
        add(teamButton);
        add(scoreButton);
        
      //styles the panel
        setBackground(new Color(153, 204, 210));
        setBorder(BorderFactory.createTitledBorder("Input"));
    }
    
    private class TeamButtonListner implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new TeamFrame();
        }
    }
    
    private class ScoreButtonListner implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            new ScoreFrame();
        }
    }
}
