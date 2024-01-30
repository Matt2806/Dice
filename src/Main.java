// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        //
        JPanel panel = new JPanel();
        //


        ImageIcon a = new ImageIcon("dice 1.png");
        a.setImage(a.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT));
        JLabel one = new JLabel(a);

        ImageIcon b = new ImageIcon("dice 2.png");

        ImageIcon three = new ImageIcon("dice 3.png");
        ImageIcon four = new ImageIcon("dice 4.png");
        ImageIcon five = new ImageIcon("dice 5.png");
        ImageIcon six = new ImageIcon("dice 6.png");

        ArrayList<JLabel> sides = new ArrayList<JLabel>();
        sides.add(one);
        sides.add(two);
        sides.add(three);
        sides.add(four);
        sides.add(five);
        sides.add(six);



        JButton button = new JButton("roll");
        button.setPreferredSize(new Dimension(100,70));
        button.setFont(new Font("Arial", 20, 20));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        int r = (int)(Math.random()*6+1);
        for(int i = 0; i < sides.size(); i++){
          sides.get(i).setVisible(false);
        }


            }
        });


        //
        panel.add(button);

        //
        frame.add(panel);
        //
        frame.setVisible(true);


    }
}