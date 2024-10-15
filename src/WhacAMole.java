import java.awt.*;
import java.util.Random;
import javax.swing.*;


public class WhacAMole {
    int  boardWidth = 600;
    int boardHeight = 650;

    JFrame frame = new JFrame("Mario:Whac A Mole");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel boardPanel = new JPanel();

    JButton[] button = new JButton[9];
    ImageIcon moleIcon;
    ImageIcon plantIcon;


    WhacAMole(){
        frame.setVisible(true);
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());


        textLabel.setFont(new Font("Arial",Font.PLAIN,50));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Score:0");
        textLabel.setOpaque(true);
        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel,BorderLayout.NORTH);

        boardPanel.setLayout(new GridLayout(3,3));
        boardPanel.setBackground(Color.black);
        frame.add(boardPanel);

        plantIcon = new ImageIcon(getClass().getResource("./pirana.png"));

        for(int i=0; i<9; i++){
            JButton tile = new JButton();
            button[i] = tile;
            boardPanel.add(tile);
            tile.setIcon(plantIcon);


        }

        
    }

}
