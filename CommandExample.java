public class CommandExample{
public static void main(String args[]){
try{
int  num1=Integer.parseInt(args[0]);
int num2=Integer.parseInt(args[1]);
int div1=num1/num2;
   System.out.println(div1);
}catch(ArrayIndexOutOfBoundsException |ArithmeticException  e){
	 System.out.println(e.getMessage());
	//e.printStackTrace();
}
int a=98,b=10;
//defensive Approach
if(b>0){
int div=a/b;
System.out.println("the div is"+div);
}
//Exception Approach
/*try{
int div=a/b;
System.out.println("the div is"+div);
}catch(ArithmeticException e){
	e.printStackTrace();
}finally{
System.out.println("finally called");
}*/
System.out.println("End of the program");
}
}