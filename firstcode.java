//  Hello Jee, First Program in Java.

// class HelloWorld {
//     public static void main(String args[]) 
//     {
//         System.out.println("Hello Jee, My Name is Md gufran");
//     }
// }

// class HelloWorld {
//     public static void main(String[] args) {
//        int a=10;
//        int b=5;
//        int result = (a*b)/(a-b);
//        System.out.println(result);
//     }
// }

// import java.util.Scanner;

// class HelloWorld {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter First Number : ");
//         int a = sc.nextInt();
//         System.out.print("Enter Second Number : ");
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println("Sum of Both Numbers : " +sum);

//     }
// }


import java.util.*;

class HelloWorld {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Your Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Your Roll No. ");
            int roll = sc.nextInt();

            System.out.print("Enter your Marks : ");
            float marks = sc.nextFloat();

            System.out.println("Name : " + name);
            System.out.println("Roll No. : " + roll);
            System.out.println("marks : " + marks);
        }
    }
}