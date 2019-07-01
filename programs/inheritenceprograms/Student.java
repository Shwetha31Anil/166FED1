class Student{
  int stid;
  String name;
 static String schoolname="XYZ";
Student(int stid,String name){this.stid=stid;
this.name=name;}
void display(){System.out.println(stid+" "+name+" "+schoolname);}
public static void main(String args[]){
Student st1=new Student(32,"Supragna");
st1.display();
Student st2=new Student(33,"Komal");
st2.display();
Student st3=new Student(34,"Haripriya");
st3.display();
}

}