public class recursionprintinc {
    public static void printinc(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        printinc(n-1);
        System.out.println(n);

    }
public static void main(String[] args) {
    int n=5;
    printinc(5);
}
}
