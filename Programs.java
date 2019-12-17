import java.util.Scanner;

public class Programs {
    public static void fibNoRec(int n){
        Scanner sc=new Scanner(System.in);
    	int first = 0;
        int next = 1;
        System.out.println("Enter the number for Fibo\n");
        n=sc.nextInt();
        System.out.print(first+" ");
        System.out.print(next+" ");
        
        for(int i=2;i<n;i++){
            int temp = first+next;
            System.out.print(temp+" ");
            first = next;
            next = temp;
        }

    }

    public static int fiboRec(int n){
        if (n < 2)
            return n;
        else
            return fiboRec(n-1)+fiboRec(n-2);
    }

    public static boolean checkPrime(){
        int c=0,num,i;
        System.out.println("\nEnter a number\n");
        num = new Scanner(System.in).nextInt();
        for(i=2;i<=num;i++)
        {
            if(num%i == 0)
                c++;
        }
        if(c==1)
            System.out.print("It is a prime number\n");
        else
            System.out.print("It is not a prime number\n");
		return false;

            }

        public static void bubbleSort(){
    	int n,i,j,temp;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the size of array ");
        n=sc.nextInt();
        int A[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the number");
            A[i]=sc.nextInt();
        }
        System.out.println("Before sorting :");
        for(i=0;i<n;i++)
            System.out.print(A[i]+" ");
        for(i=0;i<n-1;i++)
        {
            for (j=0;j<n-1-i;j++)
            {
                if (A[j] > A[j + 1])
                {
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        System.out.println("\nAfter sorting (ascending order) :\n");
        for(i=0;i<n;i++)
            System.out.print(A[i]+" ");

    }
}

