import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class OutputPanel extends JPanel
{
    /** serial number */
    private static final long serialVersionUID = 5777740971062336138L;
    /** description area for data display */
    private JTextArea resultDescription;
    
    public OutputPanel()
    {
        
        // Final variables for the JTextArea dimensions
        final int COLUMN_FIELD_WIDTH = 40;
        final int COLUMN_FIELD_HEIGHT = 7;
        
        //Creates, adds and styles the Panel
        resultDescription = new JTextArea(COLUMN_FIELD_HEIGHT, COLUMN_FIELD_WIDTH);
        resultDescription.setEditable(false);
        add(resultDescription);
        setBackground(new Color(0, 128, 210));
        setBorder(BorderFactory.createTitledBorder("Output"));
    }
    
    /**
     * method to update the data display
     * 
     * @param result string to display
     */
    public synchronized void updateData(String result)
    {
        resultDescription.setText(result);
    }
}
