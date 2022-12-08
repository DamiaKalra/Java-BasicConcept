class Bubblesort 
{
public static void main(String args[]) {
	int i,j,p,z=0;
	    int a[]=new int[5];
a[0]=10; 
a[1]=80;  
a[2]=70;  
a[3]=90;  
a[4]=30; 
	for(int n=0;n<a.length;n++){
    System.out.println(a[n]); 
			System.out.println("\n");
}
		for(i=0;i<a.length;i++){
			for(j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
				z=a[j];    //a=b
				a[j]=a[j+1];     //b=c   
				a[j+1]=z;       //c=a
				}
			}
	}
	System.out.println("\n");
	for(i=0;i<a.length;i++)
	{
	System.out.println(a[i]);
    }
		}
}
