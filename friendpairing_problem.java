public class friendpairing_problem {

    //choice
    //single
    public static int friendpairing(int n)
    {
       /* int fnm1=friendpairing(n-1);
        //pair
        int fnm2=friendpairing(n-2);
        int pairways=(n-1)*fnm2;
        //totalways
        int totalways=fnm1*pairways;
        return totalways;*/
        if(n==1||n==2){
            return n;
        }
        return friendpairing(n-1)+(n-1)*friendpairing(n-2);
    }
    public static void main(String args[])
    {
        System.out.println(friendpairing(3));
    }
}

