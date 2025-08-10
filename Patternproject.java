import java.util.Scanner;
public class Patternproject {

    public static void main(String[] args) {
        showPatternMenu(); 
    }

    static void showPatternMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nChoose a Pattern:");
            System.out.println("1. Pattern 1 \t\t 2. Pattern 2");
            System.out.println("3. Pattern 3 \t\t 4. Pattern 4");
            System.out.println("5. Pattern 5 \t\t 6. Pattern 6");
            System.out.println("7. Pattern 7 \t\t 8. Pattern 8");
            System.out.println("9. Pattern 9 \t\t 10. Pattern 10");
            System.out.println("11. Pattern 11 \t\t 12. Pattern 12");
            System.out.println("13. Pattern 13 \t\t 14. Pattern 14");
            System.out.println("15. Pattern 15 \t\t 16. Pattern 16");
            System.out.println("17. Pattern 17");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    pattern1();
                    break;
                case 2:
                    pattern2();
                    break;
                case 3:
                    pattern3();
                    break;
                case 4:
                    pattern4();
                    break;
                case 5:
                    pattern5();
                    break;
                case 6:
                    pattern6();
                    break;
                case 7:
                    pattern7();
                    break;
                case 8:
                    pattern8();
                    break;
                case 9:
                    pattern9();
                    break;
                case 10:
                    pattern10();
                    break;
                case 11:
                    pattern11();
                    break;
                case 12:
                    pattern12();
                    break;
                case 13:
                    pattern13();
                    break;
                case 14:
                    pattern14();
                    break;
                case 15:
                    pattern15();
                    break;
                case 16:
                    pattern16();
                    break;
                case 17:
                    pattern17();
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 15.");
            }

            System.out.print("\nDo you want to continue? (Press 1 for Yes, any other number to exit): ");
            int repeat = sc.nextInt();

            if (repeat != 1) {
                System.out.println("\nThank you! Program ended.");
                break;
            }
        }
    }

    static void pattern1() {
        System.out.println("==============");
        System.out.println("Pattern 1:");
        System.out.println("==============");
        System.out.println();
        // Add your pattern logic here
        int i,j,n=5;
        for(i=1; i<=n; i++){
            for(j=1; j<=(n+n-1); j++){
                System.out.print((j<=i || j>=n+n-i)?"X ": "  ");
            }System.out.println();
        }
    }

    static void pattern2() {
        System.out.println("==============");
        System.out.println("Pattern 2:");
        System.out.println("==============");
        System.out.println();
        // Add your pattern logic here
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=5; j++){
                System.out.print( ( i==1 || i==5 || j==1 || j==5)? "X " : "  " );
            }
            System.out.println();
        }
    }

    static void pattern3() {
        System.out.println("==============");
        System.out.println("Pattern 3:");
        System.out.println("==============");
        System.out.println();
        // Add your pattern logic here
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=5; j++){
                System.out.print( ( i==j ||i==1 || i==5 || j==1 || j==5)? "X " : "O " );
            }
            System.out.println();
        }
    }

    static void pattern4() {
        System.out.println("==============");
        System.out.println("Pattern 4:");
        System.out.println("==============");
        System.out.println();
        // Add your pattern logic here
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=5; j++){
                System.out.print( ( i==j || (5-i+1)==j ||i==1 || i==5 || j==1 || j==5)? "X " : "O " );
            }
            System.out.println();
        }
    }

    static void pattern5() {
        System.out.println("==============");
        System.out.println("Pattern 5:");
        System.out.println("==============");
        System.out.println();
        // Add your pattern logic here
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=5; j++){
                System.out.print((i==j && (i==1 || i==5) && (j==1 || j==5))? "X " : "O ");
            }
            System.out.println();
        }
    }

    static void pattern6() {
        System.out.println("==============");
        System.out.println("Pattern 6:");
        System.out.println("==============");
        System.out.println();
        // Add your pattern logic here
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=5; j++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }

    static void pattern7() {
        System.out.println("==============");
        System.out.println("Pattern 7:");
        System.out.println("==============");
        System.out.println();
        // Add your pattern logic here
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=5; j++){
                System.out.print((i==j)?"X ":"O ");
            }System.out.println();
        }
    }

    static void pattern8() {
        System.out.println("==============");
        System.out.println("Pattern 8:");
        System.out.println("==============");
        System.out.println();
        // Add your pattern logic here
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=i; j++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }

    static void pattern9() {
        System.out.println("==============");
        System.out.println("Pattern 9:");
        System.out.println("==============");
        System.out.println();
        // Add your pattern logic here
        int i,j;
        for(i=1; i<=5; i++){
            for(j=i; j<=5; j++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }

    static void pattern10() {
        System.out.println("==============");
        System.out.println("Pattern 10:");
        System.out.println("==============");
        System.out.println();
        // Add your pattern logic here
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=5; j++){
                System.out.print("1 ");
            }
            System.out.println();
        }
    }

    static void pattern11() {
        System.out.println("==============");
        System.out.println("Pattern 11:");
        System.out.println("==============");
        System.out.println();
        // Add your pattern logic here
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=5; j++){
                System.out.print((i==j)?"0 ":"1 ");
            }System.out.println();
        }
    }

    static void pattern12() {
        System.out.println("==============");
        System.out.println("Pattern 12:");
        System.out.println("==============");
        System.out.println();
        // Add your pattern logic here
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=5; j++){
                System.out.print( ( i==1 || i==5 || i==3 || j==1)? "X " : "  ");
            }
            System.out.println();
        }
    }

    static void pattern13() {
        System.out.println("==============");
        System.out.println("Pattern 13:");
        System.out.println("==============");
        System.out.println();
        // Add your pattern logic here
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=5; j++){
                System.out.print(( i==1 || i==3 || j==1)? "X " : "  ");
            }
            System.out.println();
        }
    }

    static void pattern14() {
        System.out.println("==============");
        System.out.println("Pattern 14:");
        System.out.println("==============");
        System.out.println();
        // Add your pattern logic here
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1; j<=5; j++){
                System.out.print(( i==1 || i==5 || j==1)? "X " : "  ");
            }
            System.out.println();
        }
    }

    static void pattern15() {
        System.out.println("==============");
        System.out.println("Pattern 15:");
        System.out.println("==============");
        System.out.println();
        // Add your pattern logic here
        int i,j,n=5;
        for(i=1; i<=n; i++){
            for(j=1; j<=(n+n-1); j++){
                System.out.print((j<=i || j>=n+n-i)?"X ": "  ");
            }System.out.println();
        }
        for(i=n-1; i>=1; i--){
            for(j=(n+n-1); j>=1; j--){
                System.out.print((j<=i || j>=n+n-i)?"X ": "  ");
            }System.out.println();
        }
    }

    static void pattern16() {
        System.out.println("==============");
        System.out.println("Pattern 16:");
        System.out.println("==============");
        System.out.println();
        // Add your pattern logic here
        int i,j,n=5;
        for(i=1; i<=5; i++){
            for(j=1; j<=5; j++){
                System.out.print((i==j) || (j==(n+1-i))?"X ":"  ");
            }
            System.out.println();
        }
    }

    static void pattern17() {
        System.out.println("==============");
        System.out.println("Pattern 17:");
        System.out.println("==============");
        System.out.println();
        // Add your pattern logic here
        int i,j,n=5;
        for(i=1; i<=5; i++){
            for(j=1; j<=5; j++){
                System.out.print((i==1) || (i==n) || (j==(n+1-i))?"X ":"  ");
            }
            System.out.println();
        }
    }
}