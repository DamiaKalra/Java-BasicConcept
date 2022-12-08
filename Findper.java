class Findper  
{  
public static void main(String args[])  
{
    float average=0;
    float percentage=0;
	float total = 0;
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
int d=Integer.parseInt(args[3]);
int e=Integer.parseInt(args[4]);
total=a+b+c+d+e;
average=total/5;
percentage=(total/500)*100;

System.out.println("total of sub is "+ total); 
System.out.println("average of 5 subj "+ average); 
System.out.println("percenatge of 5 sub "+ percentage); 
}
}