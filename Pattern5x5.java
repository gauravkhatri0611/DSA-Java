import java.util.Scanner;

class boxPattern {
    public static void main(String[] args) {
        //taking user input 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        //to print a 5*5 box
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
            

    }
}