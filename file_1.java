import java.util.*;
import java.io.*;

class file_1
{
public static void main(String[] args) throws Exception
{
FileInputStream fin=new FileInputStream("/home/s3csd48/e1.txt");
int i=0;
while((i=fin.read())!=-1)
{
System.out.print((char)i);
}
fin.close();
}
}
