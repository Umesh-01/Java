package cse_pblj;

import java.util.Scanner;

public class VideoStoreLauncher {

    public static void main(String[] args) {

        VideoStore vs = new VideoStore();
        Scanner sc = new Scanner(System.in);
        int ch;

        System.out.println("1. Add Videos");
        System.out.println("2. Check Out Video");
        System.out.println("3. Return Video");
        System.out.println("4. Receive Rating");
        System.out.println("5. List Inventory");
        System.out.println("6. Exit");

        do {

            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch) {
                case 1:
                    System.out.println("Enter names for the videos that you want to add: ");
                    vs.addVideo(sc.next(), sc.next(), sc.next());
                    break;

                case 2:
                    System.out.println("Enter the name of the video you want to check out: ");
                    vs.doCheckout(sc.next());
                    break;

                case 3:
                    System.out.println("Enter the name of the video you want to Return:");
                    vs.doReturn(sc.next());;
                    break;

                case 4:
                    System.out.println("Enter the name of the video you want to Rate and then rating: ");
                    vs.receiveRating(sc.next(), sc.nextInt());
                    break;

                case 5:
                    vs.listInventory();
                    break;

                case 6:
                    System.exit(1);
                    break;

                default:
                    System.out.println("Enter the correct choice from the above options.");
            }
        } while(ch!=6);

    }

}
