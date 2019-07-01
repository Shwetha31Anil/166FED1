public class CloningDemo{
public static void main(String args[])throws CloneNotSupportedException{
   Abc obj1=new Abc();
   obj1.i=10;
   obj1.j=12;
	
 Abc obj2=(Abc)obj1.clone();
// obj2.i=67;
System.out.println(obj1);
System.out.println(obj2);
}
}

class Abc implements Cloneable{
int i,j;
public String toString(){
return "i= "+ i+" j="+j;
}
@Override
public Object clone() throws CloneNotSupportedException{
return super.clone();
}
}