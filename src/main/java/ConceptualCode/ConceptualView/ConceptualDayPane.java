package ConceptualCode.ConceptualView;

import javax.swing.*;
import java.awt.*;

public class ConeceptualDayPane {

    public static void main(String[] args) {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame main = new JFrame();

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));

        JPanel eventPanel = new JPanel();
        JPanel datePanel = new JPanel();

        mainPanel.add(eventPanel);
        mainPanel.add(datePanel);

        main.add(mainPanel);

        main.setSize(screenSize.width/2, screenSize.height/2);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setVisible(true);
    }
}
