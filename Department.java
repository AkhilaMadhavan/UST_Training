import java.util.Scanner;

class Department

{

    public static void main(String args[])

    {

        int[] array= new int[10];

        Scanner sc=new Scanner(System.in);

        int i;

       int flag=0;

        System.out.println("enter the array size");

        int size=sc.nextInt();

         System.out.println("enter the Emp Id");

        for(i=0;i<size;i++)

        {

            array[i]=sc.nextInt();




        }

         for(i=0;i<size;i++)

        {

           if(array[i]==array[i+1])

           {

                flag=1;

           

           break;

         

           }

           else

            flag=0;

           

        }

        if(flag==1)

        {

        System.out.println("false") ;

        }

        else

        {

            System.out.println("true");

        }

    }

}