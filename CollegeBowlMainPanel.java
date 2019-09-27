import javax.swing.JLabel;
import javax.swing.JPanel;

public class CollegeBowlMainPanel extends JPanel
{
    /** serial number */
    private static final long serialVersionUID = 6224309422787783370L;

    /**
     * Constructor for MesonetMainPanel that initializes it functionality
     */
    public CollegeBowlMainPanel() 
    {   
        JLabel greetingLabel = new JLabel("College Bowl Calculator");
        
        // Add greeting to this panel
        add(greetingLabel);
    }
}
