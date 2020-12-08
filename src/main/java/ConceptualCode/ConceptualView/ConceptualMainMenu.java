package ConceptualCode.ConceptualView;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class ConceptualMainMenu {

    public static void main(String[] args) {
        JFrame main = new JFrame();
        JPanel panel = new JPanel();
        panel.setBounds(0,0,200,200);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton quit = new JButton("Quit");
        quit.setBounds(0,0,100,50);
        quit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                main.dispatchEvent(new WindowEvent(main, WindowEvent.WINDOW_CLOSING));
            }
        });
        panel.add(quit);

        main.add(panel);
        main.setSize(200, 200);
        main.setVisible(true);


    }
}
