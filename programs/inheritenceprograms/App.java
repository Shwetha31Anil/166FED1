class Super{
 int v;
Super(int v){this.v=v;}
void display(){System.out.print(v);}}
class Sub extends Super{
int s;
Sub(int v,int s){super(v); this.s=s;}
@Override
void display(){
System.out.print(s);}
}
public class App{
public static void main(String args[]){
Sub s1=new Sub(10,23);
s1.display();// 23 s

Super s2=new Super(12);
s2.display();//12   v

}
}