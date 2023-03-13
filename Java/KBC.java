
import java.util.Scanner;
public class KBC{
    public static void main(String[] args) {
        System.out.println("To bhaiyo aur beheno Kaun Banega Karorpati mai apka Swagat hai");
        System.out.println("Mai Amitabh Bachan ...");
        String[] Questions= {
            "Who was the first president of India?",
            "What is the capital of France?",
            "Which is the longest river on earth?",
            "Who was the first person to step on moon?",
            "Which company has taken the responsibility to animate Demon Slayer?",
            "What is the vahan of Lord Krishna?",
            "Which one of the following Programming Language does notuse 'this' in constructors?"
        };
        String[] QuestionNo = {
            "Pahala", "Dusra", "Tesra", "Chautha", "Panchva", "Chatta", "Satva"
        };
        String[] Reward= {"2,000", "5,000", "10,000", "20,000", "40,0000", "80,0000", "1,50,0000"};
        String[][] Option= {
            {"A. Dr. Rajendra Prasad","B. Mr. Radha Krishna ", "C. Dr. APJ Abdul Kalam", "D. Mr. Jawahar Lal Nehru"},
            {"A. Ohio","B. London", "C. Paris", "D. New York"},
            {"A. Amazon","B. Nile", "C. Brahmaputra", "D. Sutlaj"},
            {"A. Laika","B. Kalpana Chawla", "C. Buzz Aldrin", "D. Neil Armstrong"},
            {"A. Ufotable","B. Mappa", "C. Pierrot", "D. Madhouse"},
            {"A. Garuda","B. Mushaka", "C. Peacock", "D. Arawata"},
            {"A. Javascript","B. Java", "C. C++", "D. Python"}
        };
        String[] correctOption= {
            "A", "C", "B", "D", "A", "A", "D"
        };
        Scanner scan = new Scanner(System.in);
        for (int i= 0; i<7; i++) {
            System.out.println(QuestionNo[i] + " prasna/question, for ₹" + Reward[i]);
            System.out.println(Questions[i]);
            System.out.println();
            System.out.println(Option[i][0]);
            System.out.println(Option[i][1]);
            System.out.println(Option[i][2]);
            System.out.println(Option[i][3]);
            System.out.println("E. Exit");
            System.out.print("Enter your option in Upper case: ");
            String userChoice= scan.nextLine();
            System.out.println();
            if (userChoice.equals("E")) {
                System.out.println("Player wants to exit");
                System.out.println("You have won ₹"+ Reward[i-1] + " till now");
                System.out.println("Answer of present question is " + correctOption[i]);
                break;
            }
            else if (userChoice.equals(correctOption[i])) {
                System.out.println("You Option is correct");
                System.out.println("You won ₹"+ Reward[i]);
            }
            else {
                System.out.println("Oh, you got it wrong");
                System.out.println("Game terminates here, you have won ₹"+ Reward[i-1] + " till now");
                break; 
            }
        }
        System.out.println("Thank you for playing with us");
        scan.close();
    }
}
