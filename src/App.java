import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jc302404 on 4/05/15.
 */
public class App {
    private static JFrame mainFrame;
    private static int tally;
    public static void main(String[] args) {
        tally = 0;
        mainFrame = new JFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JLabel display = new JLabel("tally: 0");
        final JButton one = new JButton("1");
        final JButton clear = new JButton("clear");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tally = 0;
                display.setText("tally is equal to"+ tally);
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tally+= 1;
                display.setText("tally is equal to"+ tally);
            }
        });


        mainFrame.add(display, BorderLayout.NORTH);
        mainFrame.add(one, BorderLayout.CENTER);
        mainFrame.add(clear, BorderLayout.SOUTH);
        mainFrame.pack();




        mainFrame.pack();
        mainFrame.setVisible(true);

    }
}
