import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ReadDemo{
public static void main(String args[])throws Exception{
try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){	
   String st=br.readLine();
	System.out.println(st);
}}}