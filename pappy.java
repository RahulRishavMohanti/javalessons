import java.util.*;
class pappy{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
StringBuffer st=new StringBuffer(3);
String a=new String(sc.next());
a=a.substring(0,5);
int ctr=0;
int an=0,b=0,c=0;
StringBuffer[] Store=new StringBuffer[10];
while(ctr<10)
{
	an=(int)(Math.random()*(2+1));
	b=(int)(Math.random()*(2+1));
	c=(int)(Math.random()*(2+1));
	st=st.append(a.charAt(an)).append(a.charAt(b)).append(a.charAt(c));
	String word=new String(st);
	//System.out.println(word);
	if(ctr==0);
	{Store[ctr].append(word);
	ctr++;
	}
for(int i=0;i<ctr;i++)
	{System.out.println("hey");
	if(!(word.equals(Store[i])))
		Store[ctr].append(word);
		System.out.println(Store);		
ctr++;
}}
System.out.println(Store);
}}
