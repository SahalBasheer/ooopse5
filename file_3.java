import java.util.*;
import java.io.*;

class file_3
{
public static void main(String[] args) throws Exception
{

Scanner obj=new Scanner(System.in);
FileInputStream fin=new FileInputStream("/home/s3csd48/e3.txt");
int i,sum=0;
String a;
System.out.println("the no.s in the file are:");
while((i=fin.read())!=-1)
{
String s=Character.toString((char)i);

StringTokenizer str = new StringTokenizer(s);
while(str.hasMoreTokens())
{
a=str.nextToken();
int b= Integer.parseInt(a);
System.out.print(b);
System.out.print("\n");
sum=sum+b;
}
}
System.out.print("the sum is : "+sum);
fin.close();
}


}
