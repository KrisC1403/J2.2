/*
 * Chris Chi 30039599
 * 04/08/2021
 * AT 2.2
 */
package binarysearchtree;

import java.util.*;

public class BinaryTree {

    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();

        bt.Add("Abi");
        bt.Add("Brand");
        bt.Add("Cait");
        bt.Add("Diana");
        bt.Add("Emma");
        bt.Add("Felix");
        bt.Add("Gabe");
        bt.Add("Helen");
        bt.Add("Ian");
        bt.Add("Jack");

        System.out.println(bt.Display());
        System.out.println(bt.getRoot());

        int pointer = 0; //pointer for while loop, increase if each loop is ran successfully (all fields entered correctly)
        int maxLoop = 3; //chnage this to determine how many times this should be ran

        while (pointer != maxLoop) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Select the following action to continue: ");
            System.out.println("A - for adding a new part");
            System.out.println("S - for searching a existing part");
            System.out.println("D - for deleting a existing part");
            String select = sc.next();

            if (select.equalsIgnoreCase("A")) {
                System.out.println("Enter a new part to the list");
                String newItem = sc.next();
                System.out.println(newItem + " Added");
                bt.Add(newItem);

                System.out.println(bt.Display());
                System.out.println(bt.getRoot());
                pointer++;
            } else if (select.equalsIgnoreCase("S")) {

                System.out.println("Enter a part to search");
                String item = sc.next();
                System.out.println(item + " Searching...");
                if (bt.Find(item) == true) {
                    System.out.println("Found");
                    System.out.println(bt.Display());
                    System.out.println(bt.getRoot());
                    pointer++;
                } else if (bt.Find(item) == false) {
                    System.out.println("Not Found");
                }
            } else if (select.equalsIgnoreCase("D")) {
                System.out.println("Enter a part to delete");
                String item = sc.next();
                System.out.println(item + " Delecting...");
                if (bt.Find(item) == true) {
                    System.out.println("Delected");
                    bt.Delete(item);
                    System.out.println(bt.Display());
                    System.out.println(bt.getRoot());
                    pointer++;
                } else if (bt.Find(item) == false) {
                    System.out.println("Not Found");
                    System.out.println("Deletion Failed");
                }
            } else {
                System.out.println("Try Again... Please Enter the correct letter to continue");
            }
        }
    }

}
