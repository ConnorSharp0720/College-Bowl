import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;





public class CollegeBowlFrame extends JFrame
{
    private JPanel buttonPanel;
    /** Calculate button */
    private JButton topButton;
    /** exit button */
    private JButton exitButton;
    /** MesonetMain panel */
    private CollegeBowlMainPanel banner;
    /** input panel */
    private InputPanel inputPanel;
    /** output panel */
    private OutputPanel outputPanel;
    
    
    /** serial number */
    private static final long serialVersionUID = 1L;
    
    public CollegeBowlFrame()
    {
        super("College Bowl Calculator");
        // styling for frame 
        setLayout(new BorderLayout());
        setResizable(true);
        buildButtonPanel();
        banner = new CollegeBowlMainPanel();
        inputPanel = new InputPanel();
        outputPanel = new OutputPanel();
        
        
        add(banner, BorderLayout.PAGE_START);
        add(buttonPanel, BorderLayout.PAGE_END);
        add(inputPanel, BorderLayout.LINE_START);
        add(outputPanel, BorderLayout.CENTER);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        
    }
    
    private void buildButtonPanel()
    {   
        buttonPanel = new JPanel();
        topButton = new JButton("Top Scores");
        exitButton = new JButton("Exit");
        // Register the action listeners
        exitButton.addActionListener(new ExitButtonListner());
        topButton.addActionListener(new TopButtonListner());
        // adds the buttons
        buttonPanel.add(topButton);
        buttonPanel.add(exitButton);
        buttonPanel.setBackground(new Color(102, 178, 210));
    }
    
    private class ExitButtonListner implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            // exits the frame
            System.exit(0);
        }
    }
    
    private class TopButtonListner implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Team top1 = new Team(0, "random");
            Team top2 = new Team(0, "random");
            Team top3 = new Team(0, "random");
            
            System.out.println("The Top 3 Teams are:");
            
            for(Team teamCompare: TeamList.getTeamList())
            {
                if(teamCompare.getScore() > top1.getScore())
                {
                    top3 = top2;
                    top2 = top1;
                    top1 = teamCompare;
                }
                else if(teamCompare.getScore() > top2.getScore())
                {
                    top3 = top2;
                    top2 = teamCompare;
                }
                else if(teamCompare.getScore() > top3.getScore())
                {
                    top3 = teamCompare;
                }
            }
            outputPanel.updateData(top1 + "\n" + top2 + "\n" + top3 + "\n");
        }
    }
}
