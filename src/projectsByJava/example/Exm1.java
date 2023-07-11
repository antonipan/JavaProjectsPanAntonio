package projectsByJava.example;

import java.util.LinkedList;
import java.util.Scanner;

public class Exm1 {

    public static void main(String[] args) {
        Exm1 ex1 = new Exm1();
        ex1.repeat();
    }

    private Scanner scan = new Scanner(System.in);
    // алгоритм поиска максимума неповторяющихся символов в строке
    public void repeat () {

        System.out.println("Enter the string");
        String input = scan.nextLine();
        int maxLength = 0;
        int count = 0;
        LinkedList <Character> same_list = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
//            System.out.println(input.toCharArray()[i]);
//            System.out.println(input.charAt(i));

            if (same_list.contains(input.charAt(i))) {
                i--;
                /*
                System.out.println(same_list);
                 */
                count = same_list.size();
                if (count > maxLength) {
                    maxLength = count;
                    same_list.clear();
                } else {
                    same_list.clear();
                }
            } else {
                same_list.add(input.charAt(i));
            }
        }
        System.out.println(maxLength);
    }

}
