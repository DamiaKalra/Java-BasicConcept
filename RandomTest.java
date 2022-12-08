import java.util.ArrayList;
import java.util.Random; 
import java.util.Scanner;
import java.util.*;
public class RandomTest {
    public static void countGuess(){
        //code in which 5 numbers are randomly input
        ArrayList<Integer> list=new ArrayList<Integer>();  
        //array to store all these 5 numbers
        Random random = new Random();
        for(int i=0; i<5; i++)
        {
             int randomInt= random.nextInt(100);
             list.add(randomInt);
            System.out.format("test %2d, randomInt = %d\n", i+1 , randomInt);
        //ArrayList
            for (int v : list) {
                System.out.println(v);
             }  
        }
// code to guess those 5 numbers by hit and trial
Scanner sc = new Scanner(System.in);
int K = 5;
int  guess=0;
//int randomInt=0;
//int number;
int m=0;
for (int i = 0; i < K; i++) {

    System.out.println(
        "Guess the number:");
    // Take input for guessing
    guess = sc.nextInt();
    for (int v : list) {
        
        if(v==guess)
        {
            System.out.println( " You guessed the number.");
            m++;
        break;
        }
        
    }
}
//code to count the number of guesses
    System.out.println("You got it right in " + m+ " guesses!");
}
public static void main(String arg[])
{
    countGuess();
}
}




