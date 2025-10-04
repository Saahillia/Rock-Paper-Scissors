package RockPaperScissor;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                // Instantiate the correct GUI object
                RockPaperScissorGUI gui = new RockPaperScissorGUI();

                // Display the GUI
                gui.setVisible(true);

            }
        });   
    }
}
