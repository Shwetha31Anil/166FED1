class VarArgDemo{
public void show(int ... a){
for(int i:a){
System.out.println(i);}
}
static  public  void  main(String  i){
System.out.print("integer method called "+i);
}
static  public  void  main(String ... args){
VarArgDemo v=new VarArgDemo();
v.show(10,78,45,56);
VarArgDemo.main("Sagar");
}
}