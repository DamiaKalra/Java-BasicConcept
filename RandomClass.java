import java.util.Random;
//import java.util.*;
public class RandomClass {
        public static void main(String[] args)
        {
            int numTests=20;
            Random random = new Random();
            for(int i=0; i<numTests; i++)
            {
                int randomInt= random.nextInt(100);
                System.out.format("test %2d, randomInt = %d\n", i+1 , randomInt);
            }
        }
    }

