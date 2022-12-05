import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Elements_In_Out {
            /*
            Question01-1.Assignment
             /* - Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.

  */

    public static void main(String[] args) {
        List<Integer> userList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please choose your action ==> \n To add  the element please enter :1 " +
                    "\n To remove the element please enter :2\n To update the element please enter:3 \n To quit plese enter:4 ");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Please enter integer elements ");

                    userList.add(input.nextInt());
                    break;
                case 2:
                    System.out.println("Please enter the element which one dou yıu want to remove ");
                    int silEleman = input.nextInt();
                    System.out.println(userList);
                    for (Integer w : userList) {
                        if (w.equals(silEleman)) {
                            userList.remove(w);
                        }

                    }
                    break;
                case 3:
                    System.out.println("Please enter the element which one dou you want to update");
                    System.out.println(userList);
                    int guncellenecekSayi = input.nextInt();
                    System.out.println("PLease enter new Integer");
                    int yeniSayi = input.nextInt();
                    userList.set(userList.indexOf(guncellenecekSayi), yeniSayi);

                    break;
                default:
                    System.out.println("Please enter your selection");
                    break;
            }

            System.out.println(userList);
            System.out.println("Devam etmek icin bir tusa basınız Cıkmak icin '4' basınız ");
        } while (input.nextInt()!=4) ;
    }
}