class Test{
boolean nearHundred(int n){
if ((Math.abs(100-n)<=10) || (Math.abs(200-n)<=10))
	return true;
else
	return false;
}
public static void main(String args[]){
Test t1=new Test();
System.out.println(t1.nearHundred(94));
System.out.println(t1.nearHundred(84));
System.out.print(t1.nearHundred(194));
}
}