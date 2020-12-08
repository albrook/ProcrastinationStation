package ConceptualCode.ConceptualView;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class ConceptualCalender {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame main = new JFrame();

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));


        JPanel panel = new JPanel();
        JPanel annotations = new JPanel();
        annotations.setPreferredSize(new Dimension(screenSize.width/2, 20));
        //annotations.setSize(screenSize.width/2, screenSize.height/8);
        annotations.setLayout(new GridLayout(0, 7));
        String text = "";
        for (int i = 0; i < 7; i++) {
            switch(i) {
                case 0: text = "Monday"; break;
                case 1: text = "Tuesday"; break;
                case 2: text = "Wednesday"; break;
                case 3: text = "Thursday"; break;
                case 4: text = "Friday"; break;
                case 5: text = "Saturday"; break;
                case 6: text = "Sunday"; break;
                default: text = "undefined";
            }
            Label textLabel = new Label(text, JLabel.CENTER);
            annotations.add(textLabel);

        }



        int daysInWeek = 7;
        int rowsToShow = 6;
        panel.setLayout(new GridLayout(rowsToShow, daysInWeek));
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int i, lower, upper;
        switch (dayOfWeek) {
            case 1: lower = dayOfYear - 13; upper = 21; break;
            case 2: lower = dayOfYear - 7; upper = 27; break;
            case 3: lower = dayOfYear - 8; upper = 26; break;
            case 4: lower = dayOfYear - 9; upper = 25; break;
            case 5: lower = dayOfYear - 10; upper = 24; break;
            case 6: lower = dayOfYear - 11; upper = 23; break;
            case 7: lower = dayOfYear - 12; upper = 22; break;
            default: lower = dayOfYear; upper = 21; break;
        }
        for (i = lower; i <= dayOfYear + upper; i++) {
            Button button;
            if (i == dayOfYear) {
                button = new Button("TODAY");
            } else {
                calendar.add(Calendar.DAY_OF_MONTH, -(dayOfYear - i));
                button = new Button(Integer.toString(calendar.get(Calendar.DAY_OF_MONTH)));
                calendar = Calendar.getInstance();
            }

            panel.add(button);
        }



        main.setSize(screenSize.width/2, screenSize.height/2);
        //main.setSize(screenSize.width, screenSize.height);
        mainPanel.add(annotations);
        mainPanel.add(panel);

        main.add(mainPanel);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setVisible(true);
    }
}
