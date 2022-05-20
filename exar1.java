/*
a[]={ 10,30,40,50,70}

b[]={40,50,60,70,80}


display

40
50
70

for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
a[i]==b[j] sou()
}
}

*/

import java.util.Scanner;
class exar1
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
int b[]=new int[5];

System.out.println("Enter Array Elements");
for(int i=0;i<5;i++)
{
a[i]=sc.nextInt();
}

System.out.println("Enter Array Elements");
for(int j=0;j<5;j++)
{
b[j]=sc.nextInt();
}


System.out.println("A  Array Elements");
for(int i=0;i<5;i++)
{
System.out.print(a[i]+"\t");
}

System.out.println(" \n B Array Elements");
for(int i=0;i<5;i++)
{
System.out.print(b[i]+"\t");
}


System.out.println(" \n Common elements ");
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
if(a[i]==b[j])
{
System.out.print(a[i]+"\t");
}

}
}



}
}




