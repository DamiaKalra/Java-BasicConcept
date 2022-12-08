class Identitymatrix
{
public static void main(String args[]) {
 	int a[][]=new int[5][5];
    int row, col;
     
    for (row = 0; row < 5; row++)
    {
        for (col = 0; col < 5; col++)
        {
            if (row == col)
               System.out.print("1"+" ");
            else
                System.out.print("0"+" ");
        }
        System.out.println(" ");
    }
}
}