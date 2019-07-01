public class Person{
  private long adarNum;
private  String name;
public Person(long adarNum, String name){
this.adarNum=adarNum;
this.name=name;
}
public void getPersonDetails(){
System.out.print("Person Details");
System.out.print(adarNum+"\n"+name);
}
}