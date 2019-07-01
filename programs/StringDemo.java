class StringDemo{
public static void main(String args[]){
String s1=new String("shwetha");
String s2=new String("sphasis");

System.out.print("string compare to method "+s1.compareTo(s2));

System.out.println("string index to method "+s1.indexOf("h"));

System.out.println("string charat "+s1.charAt(3));
System.out.println("string charat "+s1.codePointAt(3));
System.out.println("string replace"+s1.replace('h','m'));
System.out.println(s1);

if(s1.equalsIgnoreCase(s2))
System.out.print("Strings are equal");
else
System.out.print("Strings are not equal");
}
}