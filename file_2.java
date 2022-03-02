import java.util.*;
import java.io.*;

class file_2
{
public static void main(String[] args) throws Exception
{

Scanner obj=new Scanner(System.in);
FileWriter fw=new FileWriter("/home/s3csd48/e2.txt");
System.out.println("Name: ");
String name=obj.next();
System.out.println("Address: ");
String address=obj.next();
fw.write(name+"\n");
fw.write(address+"\n\n");
fw.close();
FileReader fr=new FileReader("/home/s3csd48/e2.txt");
int i;
while((i=fr.read())!=-1)
{
System.out.print((char)i);
}
fr.close();
}


}
