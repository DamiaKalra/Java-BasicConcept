class Selectionsort 
{
public static void main(String args[]) {
	int z=0;
	    int arr[]=new int[5];
arr[0]=10; 
arr[1]=80;  
arr[2]=70;  
arr[3]=90;  
arr[4]=30; 
	for(int n=0;n<arr.length;n++){
    System.out.println(arr[n]); 
			System.out.println("\n");
}
int n=arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[i]){
					//swap
				z=arr[j];    //a=b
				arr[j]=arr[i];     //b=c   
				arr[i]=z;       //c=a
				}
			}
	}
	System.out.println("\n");
	for(int i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]);
    }
		}
}


















