package activities;

public class Activity2 {
     int sum=0;
    public static void main(String args[])
    {
        int a[]={10,77,10,54,-11,10};
        Activity2 ac=new Activity2();
        System.out.println("Solution is: " + ac.sumofarray(a)+ "\nsum is: "+ac.sum);
         }

         public boolean sumofarray(int[] ar)
            {

                int max=30;
                for(int i=0; i<ar.length;i++)
                {
                    if(ar[i]==10)
                        sum=ar[i]+sum;
                    if(sum>max)
                    break;
                }
                if(sum==max)
                    return true;
                else
                    return false;
            }
}
