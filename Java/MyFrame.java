import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton; 
import java.awt.Color;
import java.awt.Font;

// I am currently working on it, I am not taking ChatGPT's support and copy pasting it 

class MyFrame extends JFrame{
    JPanel questionPanel;
    JLabel questionLabel;

    JPanel resultPanel;
    JLabel resultLabel;

    JPanel OptionPanel;
    JButton option1;
    JButton option2; 
    JButton option3; 
    JButton option4; 

    String[] question= {
        "Who was the first president of India?", 
        "What is the capital of France?",
        "Which is the longest river on earth?", 
        "Who was the first person to step on moon?",
        "Which company has taken the responsibility to animate Demon Slayer?", 
        "What is the vahan of Lord Krishna?",
        "Which one of the following Programming Language does not use 'this' in constructors?"
    };

    String[][] options= { 
                            { "A. Dr. Rajendra Prasad", "B. Mr. Radha Krishna", "C. Dr. APJ Abdul Kalam", "D. Mr. Jawahar Lal Nehru" },
                            { "A. Ohio", "B. London", "C. Paris", "D. New York" },
                            { "A. Amazon", "B. Nile", "C. Brahmaputra", "D. Sutlaj" },
                            { "A. Laika", "B. Kalpana Chawla", "C. Buzz Aldrin", "D. Neil Armstrong" },
                            { "A. Ufotable", "B. Mappa", "C. Pierrot", "D. Madhouse" },
                            { "A. Garuda", "B. Mushaka", "C. Peacock", "D. Arawata" },
                            { "A. Javascript", "B. Java", "C. C++", "D. Python" } 
    };

    MyFrame() {
        // Frame settings 
        this.setTitle("New Frame, new Start");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        // Question panel 
        questionPanel= new JPanel();
        questionPanel.setBounds(0, 0, 500, 150);
        questionLabel= new JLabel(question[0]);
        questionLabel.setForeground(Color.ORANGE);
        questionLabel.setBackground(Color.LIGHTBLUE);
        questionLabel.setBounds(25, 25, 450, 50);
        questionPanel.add(questionLabel);

        // result panel 
        resultPanel= new JPanel();
        resultPanel.setBounds(0, 150, 500, 150);
        resultLabel= new JLabel("Congratulations, you have won Rs. 2000");
        resultLabel.setBackground (Color.LIGHTGREEN);
        result.setForeground(new Color(0x007ACC));
        resultLabel.setBounds(25, 175, 450, 100);
        resultPanel.add(rewardLabel);

        // option panel 
        optionPanel= new JPanel();
        optionPanel.setBounds(0, 300, 500, 200);

        option1= new JButton(options[0][0]);
        option1.setBounds(50, 225, 175, 50);
        option1.setBackground(new Color(0x3F3F8F));
        option1.setForeground(new Color(0x12b889));
        option1.setFont("Monospaced", Font.BOLD, 25);
        option1.addEventListenter(() -> option1.setBackground(Color.GREEN));

        option2= new JButton(options[0][1]);
        option2.setBounds(225, 225, 175, 50);
        option2.setBackground(new Color(0x3F3F8F));
        option2.setForeground(new Color(0x12b889));
        option2.setFont("Monospaced", Font.BOLD, 25);
        option2.addEventListenter(() -> option2.setBackground(Color.RED));

        option3= new JButton(options[0][2]);
        option3.setBounds(50, 325, 175, 50);
        option3.setBackground(new Color(0x3F3F8F));
        option3.setForeground(new Color(0x12b889));
        option3.setFont("Monospaced", Font.BOLD, 25);
        option3.addEventListenter(() -> option3.setBackground(Color.RED));
        
        option4= new JButton(options[0][3]);
        option4.setBounds(225, 325, 175, 50);
        option4.setBackground(new Color(0x3F3F8F));
        option4.setForeground(new Color(0x12b889));
        option4.setFont("Monospaced", Font.BOLD, 25);
        option4.addEventListenter(() -> option4.setBackground(Color.RED));
        
        optionPanel.add(option1);
        optionPanel.add(option2);
        optionPanel.add(option3);
        optionPanel.add(option4);

        this.add(questionPanel);
        this.add(resultPanel);
        this.add(optionPanel);
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}