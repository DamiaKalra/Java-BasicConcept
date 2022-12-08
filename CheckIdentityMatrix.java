public class CheckIdentityMatrix     
{    
    public static void main(String[] args) {    
        int rows, cols;    
        boolean x = true;        
        int a[][] = {       
                        {1, 8, 5},    
                        {6, 7, 4},    
                        {2, 3, 1}    
                    };
          rows = a.length;    
        cols = a.length;      
        if(rows != cols){    
            System.out.println("Matrix should be a square matrix");    
        }    
        else { 
            for(int i = 0; i < rows; i++){    
                for(int j = 0; j < cols; j++){    
                  if(i == j && a[i][j] != 1){    
                      x = false;    
                      break;    
                  }    
                  if(i != j && a[i][j] != 0){    
                      x = false;    
                      break;    
                  }    
                }    
            } 
            if(x)    
                System.out.println("identity matrix");    
            else    
                System.out.println(" not identity matrix");    
        }    
    }    
}   