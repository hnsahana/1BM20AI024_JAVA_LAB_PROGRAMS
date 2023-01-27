import java.util.*;
import java.io.*;

class tempZero extends Exception{
tempZero(String msg){
super(msg);
}
}

class temperature{
public static void main(String args[]){
float temp;
Scanner scan = new Scanner(System.in);
System.out.println("Enter temperature:");
temp=scan.nextFloat();
try{
if(temp==0){
throw new tempZero("Temperature=0");
}else{
System.out.println("Temperature="+temp);
}
}
catch(tempZero e){
System.out.println(" Caught Temperature="+temp);
System.out.println(e);
System.out.println(e.getMessage());
}
}
