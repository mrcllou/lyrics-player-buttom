import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class simpleGUI {
    // An array to hold our song lyrics
    private static final String[] LYRICS = {
        "I know it hurts you (yeah)",
        "But I need to (need to?)", 
        "Tell you", 
        "something", 
        "My heart just can't be", 
        "faithfullllllllllll",
        "forrrr long",
        "I-iiiiiiii",
        "swear", 
        "I'll only make you cry...(mhh)",
        "         ",
        "The song describes a toxic relationship", 
        "where one partner gives more affection than", 
        "the other", 
        "which constantly leads to hurting the person", 
        "who is more", 
        "affectionate. The song is from a point of view", 
        "of the less",
        "affectionate person.",
    
    };
    
    // A tracker to know which lyric line we are on
    private static int lyricIndex = 0;

    public static void main(String[] args) {
       
        // 1. Create the Frame
        JFrame frame = new JFrame("ALL MY PAIN IN ONE");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // 2. Create the Label
        JLabel label = new JLabel("Click the button to start screaming!");
        label.setBounds(45, 30, 300, 25);
        frame.add(label);

        // 3. Create the Button
        JButton button = new JButton("more pain.");
        button.setBounds(85, 80, 150, 35);
        frame.add(button);

        // 4. Add action listener (without the @Override annotation)
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Check if we still have lyrics left to show
                if (lyricIndex < LYRICS.length) {
                    label.setText(LYRICS[lyricIndex]);
                    lyricIndex++; // Move to the next line
                } else {
                    label.setText("🎵 Song Finished! 🎵");
                    button.setEnabled(false); // Disable button when done
                }
            }
        });

        // 5. Set the frame to make it visible
        frame.setVisible(true);
    }
}

// Credit: 
// the code base is on: https://www.codedex.io/projects/set-up-a-gui-with-java 
// the music is: Cry - by Cigarettes After Sex - 2019. (Song requested by a close..friend..ig)
