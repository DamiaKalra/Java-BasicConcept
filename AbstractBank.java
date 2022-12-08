abstract class Bank
{
abstract float  getRateOfInterest();
}
//1st class
class SBI extends Bank
{
public float getRateOfInterest()
{
return 5.5f;
}
}	

//2nd class
class ICICI extends Bank
{
	
public float getRateOfInterest()
{
return 6.0f;
}
//3rd class
}
class AXIS extends Bank
{
	
public float getRateOfInterest()
{
return 6.5f;
}
}
class AbstractBank{
public static void main(String args[]){
 Bank a=new ICICI();
System.out.println("Rate of Interest is: "+a.getRateOfInterest());  
// by dynamic method dispatch
Bank b= new AXIS();
System.out.println("Rate of Interest is: "+b.getRateOfInterest()); 
}
}