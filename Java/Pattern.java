import java.util.Scanner;
public class Pattern{
    public static void main (String[] args) {
        Scanner obj = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
        	int limit= obj.nextInt();
            if (limit>0) {
                int num=1;
                while (num<limit+1) {
                    int i=1;
                    while (i<=num) {
                        System.out.print(i);i++;
                    }
                    if (i>num)  {
                        System.out.println();num++;
                    }
                }
                int num3= 1;
                while (num3 < limit+1) {
                    int i= 1;
                    while (i < num3+1) {
                        System.out.print("*");
                        i++;
                    }
                    System.out.println();
                    num3++;
                }
            }

            else if (limit<0) {
                int limit2= limit;
                int num=-1;
                while (limit<num) {
                    String l=" ";
                    int i=limit;
                    while (i<=num) 
                    {
                        System.out.print(" ");
                        System.out.print(i);
                        i++;
                    }
                    System.out.println();
                    limit++;l=l+" ";
                }
                while (limit2 < num+1) {
                    int j = limit2;
                    while (j < num+ 1) {
                        System.out.print("*");
                        j++;
                    }
                    System.out.println();
                    limit2++;
                }
            }

            else {
                System.out.println("Enter a integer except 0");
             }
            System.out.println();
            System.out.print("Continue? Enter y/n: ");
            String cont= obj.next();
            System.out.println();
            if (cont.equalsIgnoreCase("n")) {
            break;
            }
        }
        System.out.println("Exited");
    }
}