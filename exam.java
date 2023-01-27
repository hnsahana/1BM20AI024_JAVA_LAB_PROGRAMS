import java.util.*;
import java.io.*;

class MarksOutOfRange extends Exception{
 MarksOutOfRange(String msg){
 super(msg);
 }
}
class exam{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
String name;
int m1,m2,m3,m4,m5,m6;
System.out.println("Enter the name:");
name=scan.nextLine();
System.out.println("Enter marks for six subjects:");
name=scan.nextLine();
m1=scan.nextInt();
m2=scan.nextInt();
m3=scan.nextInt();
m4=scan.nextInt();
m5=scan.nextInt();
m6=scan.nextInt();
try{
if(m1>=0 && m1<=50 && m2>=0 && m2<=50 && m3>=0 && m3<=50 && m4>=0 && m4<=50 && m5>=0 && m5<=50 && m6>=0 && m6<=50){
System.out.println("Total marks="+(m1+m2+m3+m4+m5+m6));
System.out.println("Percentage="+((m1+m2+m3+m4+m5+m6)/6));
}else{
throw new  MarksOutOfRange("Out of range");
}
}
catch(MarksOutOfRange e){
System.out.println("few marks are out of range (0 to 50)");
}
}
}
