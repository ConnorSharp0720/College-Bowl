import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ScoreFrame extends JFrame
{
    private JPanel buttonPanel;
    /** exit button */
    private JButton exitButton;
    /** MesonetMain panel */
    private CollegeBowlMainPanel banner;
    /** TeamEnter Panel */
    private ScoreEnterPanel Tpanel;
    
    /** serial number */
    private static final long serialVersionUID = 1L;

    public ScoreFrame()
    {
        super("Input Scores");
        // styling for frame 
        setPreferredSize(new Dimension(250,200));
        setLayout(new BorderLayout());
        setResizable(true);
        buildButtonPanel();
        banner = new CollegeBowlMainPanel();
        Tpanel = new ScoreEnterPanel();
        
        
        add(banner, BorderLayout.PAGE_START);
        add(Tpanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.PAGE_END);
        //add(inputPanel, BorderLayout.LINE_START);
        //add(outputPanel, BorderLayout.CENTER);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        
    }
    
    private void buildButtonPanel()
    {
        // Create a panel for buttons.
        System.out.println("Building Button panel");
        
        buttonPanel = new JPanel();
        exitButton = new JButton("Exit");
        // Register the action listeners
        exitButton.addActionListener(new ExitButtonListner());
        // adds the buttons
        buttonPanel.add(exitButton);
        buttonPanel.setBackground(new Color(102, 178, 210));
        
    }
    
    private class ExitButtonListner implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            // exits the frame
            dispose();
        }
    }
}
