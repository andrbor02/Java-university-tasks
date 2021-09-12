import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LabExample extends JFrame {
    int milanScore = 0;
    int madridScore = 0;

    JLabel result = new JLabel("Result: 0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    JLabel southCont = new JLabel();
    Label winner = new Label("   Winner: DRAW   ", Label.CENTER);

    JButton milanButton = new JButton("AC Milan");
    JButton madridButton = new JButton("Real Madrid");
    JButton timeOverButton = new JButton("Time Over!");

    Font winnerFnt = new Font("Times new roman", Font.BOLD, 30);
    Font timeOverFnt2 = new Font("Times new roman", Font.ITALIC, 25);

    LabExample() {
        super("Football match");
        setLayout(new BorderLayout());
        setSize(600, 300);

        southCont.setLayout(new FlowLayout());
        southCont.setSize(600, 75);
        southCont.add(winner);
        southCont.add(timeOverButton);

        winner.setFont(winnerFnt);
        timeOverButton.setFont(timeOverFnt2);

        result.setHorizontalAlignment(SwingConstants.HORIZONTAL);
        lastScorer.setHorizontalAlignment(SwingConstants.HORIZONTAL);

        add(result, BorderLayout.SOUTH);
        add(lastScorer, BorderLayout.NORTH);
        add(southCont, BorderLayout.CENTER);
        add(madridButton, BorderLayout.EAST);
        add(milanButton, BorderLayout.WEST);

        milanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String score = result.getText();

                String newScore = score.replace(milanScore + " X", (milanScore + 1) + " X");
                milanScore++;

                result.setText(newScore);
                lastScorer.setText("Last Scorer: AC Milan");
            }
        });

        madridButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String score = result.getText();

                String newScore = score.replace("X " + madridScore, "X " + (madridScore + 1));
                madridScore++;

                result.setText(newScore);
                lastScorer.setText("Last Scorer: Real Madrid");
            }
        });

        timeOverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (madridScore > milanScore) {
                    winner.setText("   Winner: Real Madrid   ");
                } else if (milanScore > madridScore) {
                    winner.setText("   Winner: AC Milan   ");
                } else {
                    winner.setText("   Winner: DRAW   ");
                }
            }
        });

        setVisible(true);
    }
}