package activities;

public class Activity4 {
    public static void main(String args[]) {
        int a[] = {22, 3, 8, 1,55,10};
        int temp=0;
        int i=0;
        for (i = 0; i < a.length; i++) {
            for(int j=i;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);
        }

    }
}