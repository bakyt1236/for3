
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int eee=0;
        for (int i = a; i <b ; i++) {
            if (a%2==2);{
                eee+=i;
            }
        }
        System.out.println(eee);
    }
}