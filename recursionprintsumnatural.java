public class recursionprintsumnatural {
public static int printsum(int n)
{
if(n==1)
{
    return 1;
}
int snm=printsum(n-1);
int sn=n+printsum(n-1);
return sn;
}
public static void main(String args[])
{
    int n=5;
    System.out.println(printsum(n));
}
}


