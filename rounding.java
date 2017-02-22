import java.util.*;
import java.io.*;
class rounding{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int ctr=0,intcount=0,floatcount=0,intsum=0;
while(true)
{
sc.next();
if(sc.hasNextInt()){
intcount++;intsum=intsum+sc.nextInt();}
else if(sc.hasNextFloat())
floatcount++;
else
ctr++;
if(ctr==3)
{System.out.println("Terminating");
System.out.println((float)intsum/intcount);
System.out.println(floatcount);
break;}
}}
}
