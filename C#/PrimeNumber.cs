using System;

class PrimeNumber{
    static void Main(String[] args) {
        Console.WriteLine("Enter limit: ");
        primeNums(int.Parse(Console.ReadLine()));
	}
    public void primeNums(int num) {
        int zeros; 
        for (int i= 2; i<= num; i++) {
            zeros= 0;
            for (int j= 2; j<= i/2; j++) {
                if (i%j == 0) {
                    zeros++;
                }
            }
           Console.WriteLine(i);
        }
    }
}
