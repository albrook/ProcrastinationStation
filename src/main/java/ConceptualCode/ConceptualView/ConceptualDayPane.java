package ConceptualCode.ConceptualView;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class ConceptualDayPane {

    public static void main(String[] args) {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame main = new JFrame();

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));

        JPanel eventPanel = new JPanel();
        eventPanel.setLayout(new BoxLayout(eventPanel, BoxLayout.Y_AXIS));
        double number = Math.random() * 10;
        Button button;
        for (int i = 0; i < number; i++) {
            button = new Button("Event " + Integer.toString(i));
            eventPanel.add(button);
        }

        JPanel datePanel = new JPanel();
        datePanel.setPreferredSize(new Dimension(screenSize.width/4, screenSize.height/4));
        Calendar calendar = Calendar.getInstance();
        Label textLabel = new Label(Integer.toString(calendar.get(Calendar.DAY_OF_MONTH)) + "/" + Integer.toString(calendar.get(Calendar.MONTH) + 1), JLabel.CENTER);
        datePanel.add(textLabel);

        mainPanel.add(eventPanel);
        mainPanel.add(datePanel);

        main.add(mainPanel);

        main.setSize(screenSize.width/2, screenSize.height/2);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setVisible(true);
    }
}
