
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class VinylTools {
    //Global Debug Checker
    static boolean debug = true;

    //Global Files
    public static File defaultDirectory = new File(System.getProperty("user.home"));
    public static File config = new File(System.getProperty("user.dir") + "/src/config.ini");
    public static File selectedFile = new File("");

    //Global Initializations
    public static JFileChooser chooser = new JFileChooser(defaultDirectory);
    public static JFrame frame = new JFrame("Vinyl Tools");
    public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static String lastKnownDirectory = "";

    //Global Variables
    static int screenHeight = screenSize.height;
    static int screenWidth = screenSize.width;
    static int fileAmount = 0;

    public static void main(String[] args) throws FileNotFoundException, IOException, NullPointerException {
        defaultFrame();
        ConfigLoad.configLoad(config);
    }

    public static void defaultFrame() throws IOException{
        //Needed Before Tings
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Music File", "mp3", "wav");
        chooser.setFileFilter(filter);

        //Cleanup
        frame.getContentPane().removeAll();
        frame.repaint();

        //Int
        JButton NUM1 = new JButton("Record Record"); // Mute
        JButton NUM2 = new JButton("Open Track"); // Choose
        JButton NUM3 = new JButton("Extras"); // Close?

        JLabel HEADING1 = new JLabel("Vinyl Tools");
        JLabel HEADING2 = new JLabel("HEADING2");
        JLabel HEADING3 = new JLabel("HEADING3");
        JLabel HEADING4 = new JLabel("HEADING4");

        //Screen Options
        int width  = 800;
        int height = 600;
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);

        //Options
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JPanel Things
        JPanel container = new JPanel();
        JPanel topPanel = new JPanel();
        JPanel middlePanel = new JPanel();
        JPanel bottomPanel = new JPanel();

        topPanel.add(HEADING1);
        middlePanel.add(HEADING2);
        bottomPanel.add(NUM1);
        bottomPanel.add(NUM2);
        bottomPanel.add(NUM3);

        container.setLayout(new GridLayout(3,1));
        container.add(topPanel);
        container.add(middlePanel);
        container.add(bottomPanel);

        //Heading Options
        HEADING1.setFont(new Font("", Font.BOLD, 20));

        //Button Options
        NUM2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = chooser.showOpenDialog(frame);
                if(result == JFileChooser.APPROVE_OPTION){
                    try{
                        FileHandler.fileHandler();
                    } catch (IOException g){

                    }
                }

            }
        });



        //Adding
        frame.add(container);

    }

    public static void chooseFile(){


        //Buttons
    }
}
