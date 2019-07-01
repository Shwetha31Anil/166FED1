class MethodApproach{
int add(int num1,int num2){
	return num1+num2;
}
double div(int num1,int num2){
	return num1/num2;
}
public static void main(String args[]){
MethodApproach m1=new MethodApproach();
System.out.println("Sum of two values "
+m1.add(53,545));
System.out.println("Sum of two values "
+m1.div(23,55));
}
}
