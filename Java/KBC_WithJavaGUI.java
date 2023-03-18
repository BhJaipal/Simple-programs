import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KBC_WithJavaGUI extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    int currentQuestion = 0;
    String[][] options = { 
            { "A. Dr. Rajendra Prasad", "B. Mr. Radha Krishna", "C. Dr. APJ Abdul Kalam", "D. Mr. Jawahar Lal Nehru" },
            { "A. Ohio", "B. London", "C. Paris", "D. New York" },
            { "A. Amazon", "B. Nile", "C. Brahmaputra", "D. Sutlaj" },
            { "A. Laika", "B. Kalpana Chawla", "C. Buzz Aldrin", "D. Neil Armstrong" },
            { "A. Ufotable", "B. Mappa", "C. Pierrot", "D. Madhouse" },
            { "A. Garuda", "B. Mushaka", "C. Peacock", "D. Arawata" },
            { "A. Javascript", "B. Java", "C. C++", "D. Python" } 
    };
    String[] correctOption = { "A", "C", "B", "D", "A", "A", "D" };
    String[] questionNo = { "Pahala", "Dusra", "Tesra", "Chautha", "Panchva", "Chatta", "Satva" };
    String[] rewards = { "2,000", "5,000", "10,000", "20,000", "40,000", "80,000", "1,50,000" };
    String[] questions = { "Who was the first president of India?", "What is the capital of France?",
            "Which is the longest river on earth?", "Who was the first person to step on moon?",
            "Which company has taken the responsibility to animate Demon Slayer?", "What is the vahan of Lord Krishna?",
            "Which one of the following Programming Language does not use 'this' in constructors?" };

    JLabel question;
    JButton option1, option2, option3, option4;

    public KBC_WithJavaGUI() {
        super("Kaun Banega Karorpati");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(500, 500);
        setVisible(true);

        question = new JLabel();
        question.setText(questions[0]);
        question.setHorizontalTextPosition(JLabel.CENTER);
        question.setVerticalTextPosition(JLabel.BOTTOM);
        question.setForeground(new Color(0x30AA00));
        question.setBackground(new Color(0x8000FF));
        question.setVerticalAlignment(JLabel.CENTER);
        question.setHorizontalAlignment(JLabel.CENTER);
        question.setFont(new Font("Arial", Font.BOLD, 16));
        question.setBounds(25, 50, 450, 75);
        add(question);

        option1 = new JButton(options[0][0]);
        option1.setBounds(50, 325, 175, 50);
        option1.setForeground(new Color(0x30AA00));
        option1.setBackground(new Color(0x8000FF));
        option1.setFocusable(false);
        option1.addActionListener(this);
        add(option1);

        option2 = new JButton(options[0][1]);
        option2.setBounds(225, 325, 175, 50);
        option2.setForeground(new Color(0x30AA00));
        option2.setBackground(new Color(0x8000FF));
        option2.setFocusable(false);
        option2.addActionListener(this);
        add(option2);

        option3 = new JButton(options[0][2]);
        option3.setBounds(50, 400, 175, 50);
        option3.setForeground(new Color(0x30AA00));
        option3.setBackground(new Color(0x8000FF));
        option3.setFocusable(false);
        option3.addActionListener(this);
        add(option3);

        option4 = new JButton(options[0][3]);
        option4.setBounds(225, 400, 175, 50);
        option4.setForeground(new Color(0x30AA00));
        option4.setBackground(new Color(0x8000FF));
        option4.setFocusable(false);
        option4.addActionListener(this);
        add(option4);

        setVisible(true);
    }

    public static void main(String[] args) {
        new KBC_WithJavaGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == option1) {
            checkAnswer("A");
        } else if (e.getSource() == option2) {
            checkAnswer("B");
        } else if (e.getSource() == option3) {
            checkAnswer("C");
        } else if (e.getSource() == option4) {
            checkAnswer("D");
        }
    }

    public void checkAnswer(String selectedOption) {
        if (selectedOption.equals(correctOption[currentQuestion])) {
            currentQuestion++;
            if (currentQuestion == questions.length) {
                // Game over, show reward
                JLabel rewardLabel = new JLabel("You won Rs. " + rewards[currentQuestion - 1] + "!");
                rewardLabel.setHorizontalTextPosition(JLabel.CENTER);
                rewardLabel.setVerticalTextPosition(JLabel.BOTTOM);
                rewardLabel.setForeground(new Color(0x30AA00));
                rewardLabel.setBackground(new Color(0x8000FF));
                rewardLabel.setVerticalAlignment(JLabel.CENTER);
                rewardLabel.setHorizontalAlignment(JLabel.CENTER);
                rewardLabel.setFont(new Font("Arial", Font.BOLD, 16));
                rewardLabel.setBounds(25, 50, 450, 75);
                getContentPane().removeAll();
                getContentPane().add(rewardLabel);
                getContentPane().repaint();
            } else {
                // Move to next question
                question.setText(questions[currentQuestion]);
                option1.setText(options[currentQuestion][0]);
                option2.setText(options[currentQuestion][1]);
                option3.setText(options[currentQuestion][2]);
                option4.setText(options[currentQuestion][3]);
            }
        } else {
            // Wrong answer, game over
            JLabel endLabel = new JLabel("Game Over");
            endLabel.setHorizontalTextPosition(JLabel.CENTER);
            endLabel.setVerticalTextPosition(JLabel.BOTTOM);
            endLabel.setForeground(new Color(0x30AA00));
            endLabel.setBackground(new Color(0x8000FF));
            endLabel.setVerticalAlignment(JLabel.CENTER);
            endLabel.setHorizontalAlignment(JLabel.CENTER);
            endLabel.setFont(new Font("Arial", Font.BOLD, 16));
            endLabel.setBounds(25, 50, 450, 75);
            getContentPane().removeAll();
            getContentPane().add(endLabel);
            getContentPane().repaint();
        }
    }
}
