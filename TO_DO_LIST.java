package Data_Types;

import java.util.ArrayList;
import java.util.Scanner;

public class TO_DO_LIST {



	    public static void main(String[] args) {

	        System.out.println("\t *** TO-DO-LIST *** ");

	        ArrayList<String> al = new ArrayList<>();

	        Scanner sc = new Scanner(System.in);

	        while (true) {

	            System.out.println("\t  *** TO-DO-LIST OPERATIONS ***  ");
	            System.out.println(" 1 : ADD THE TASK");
	            System.out.println(" 2 : VIEW THE TASKS");
	            System.out.println(" 3 : UPDATE THE TASK");
	            System.out.println(" 4 : DELETE THE TASK");
	            System.out.println(" 5 : EXIT!");
	            System.out.println();

	            int choice = sc.nextInt();
	            sc.nextLine(); // consume leftover newline

	            switch (choice) {

	                case 1:
	                    System.out.print("\t ENTER THE POSITION : ");
	                    int addPos = sc.nextInt();
	                    sc.nextLine(); // consume leftover newline
	                    System.out.print("\t ENTER THE TASK : ");
	                    String task = sc.nextLine();
	                    if (addPos < 1 || addPos > al.size() + 1) {
	                        System.out.println("\t INVALID POSITION!");
	                    } else {
	                        al.add(addPos - 1, task);
	                        System.out.println("\t TASK ADDED!");
	                    }
	                    System.out.println();
	                    break;

	                case 2:
	                    System.out.println("\t THE TASKS IN THE LIST:");
	                    if (al.isEmpty()) {
	                        System.out.println("\t NO TASKS FOUND.");
	                    } else {
	                        for (int i = 0; i < al.size(); i++) {
	                            System.out.println("\t" + (i + 1) + " : " + al.get(i));
	                        }
	                    }
	                    System.out.println();
	                    break;

	                case 3:
	                    System.out.print("\t ENTER THE TASK POSITION : ");
	                    int updatePos = sc.nextInt();
	                    sc.nextLine();
	                    if (updatePos < 1 || updatePos > al.size()) {
	                        System.out.println("\t INVALID POSITION!");
	                    } else {
	                        System.out.print("\t ENTER THE NEW COMMENT : ");
	                        String newTask = sc.nextLine();
	                        al.set(updatePos - 1, newTask);
	                        System.out.println("\t THE LIST UPDATED!");
	                    }
	                    System.out.println();
	                    break;

	                case 4:
	                    System.out.print("\t ENTER THE TASK POSITION : ");
	                    int deletePos = sc.nextInt();
	                    sc.nextLine();
	                    if (deletePos < 1 || deletePos > al.size()) {
	                        System.out.println("\t INVALID POSITION!");
	                    } else {
	                        al.remove(deletePos - 1);
	                        System.out.println("\t THE TASK DELETED!");
	                    }
	                    System.out.println();
	                    break;

	                case 5:
	                    System.out.println("\t EXITING!");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("\t INVALID CHOICE. TRY AGAIN.");
	                    System.out.println();
	            }

	        }

	    }
	}


