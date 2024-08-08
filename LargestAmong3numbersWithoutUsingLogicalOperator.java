public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter Numbers");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        int res= a>b?(a>c?a:c):(b>c?b:c);
        System.out.println(res);
    }
}
