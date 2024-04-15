import java.util.*;

public class Switch {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Choice : ");
            int button = sc.nextInt();

            switch (button) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("AssamuAlaikum");
                    break;
                case 3:
                    System.out.println("Bonjour");
                    break;
                default:
                    System.out.println("Invalid Button");

            }
        }

    }

}
