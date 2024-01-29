// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        //
        JPanel panel = new JPanel();
        //
        JButton button = new JButton("ROLL");
        button.setPreferredSize(new Dimension(100,70));
        button.setFont(new Font("Arial", 20, 20));

        ImageIcon one = new ImageIcon("dice 1.png");
        ImageIcon two = new ImageIcon("dice 2.png");
        ImageIcon three = new ImageIcon("dice 3.png");
        ImageIcon four = new ImageIcon("dice 4.png");
        ImageIcon five = new ImageIcon("dice 5.png");
        ImageIcon six = new ImageIcon("dice 6.png");

        ArrayList<ImageIcon> sides = new ArrayList<ImageIcon>();
        sides.add(one);
        sides.add(two);
        sides.add(three);
        sides.add(four);
        sides.add(five);
        sides.add(six);


        //
        panel.add(button);

        //
        frame.add(panel);
        //
        frame.setVisible(true);


    }
}