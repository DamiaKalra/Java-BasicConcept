class Input2dthenadd 
{
public static void main(String args[]) {
	int n1[][]={{10,20},
	       {40,50}
		};   
int n2[][]={{80,90},
	       {30,60}
};
int a[][]=new int[2][2];
int i,j;
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
		System.out.print(n1[i][j]+"  ");
			}
			
            System.out.println();
		}
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
		System.out.print(n2[i][j]+"  ");
			}
			
            System.out.println();
		}
	    	for( i=0;i<2;i++){
					for(j=0;j<2;j++){
		a[i][j]=n1[i][j]+n2[i][j];
    		System.out.print(a[i][j]+"  ");
    }
	  System.out.println();
		}
		}
}