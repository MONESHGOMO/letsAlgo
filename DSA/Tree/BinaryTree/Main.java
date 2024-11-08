package BinaryTree;
import java.util.Scanner;
public class Main {

    private static  class Node{
        int value;
        Node left;
        Node right;

        public Node(int a){
            this.value=a;
        }

}
private Node root;
// insert elements

public void insert (int value){
    Scanner input = new Scanner(System.in);
     value = input.nextInt();
     root=new Node(value);
     

}

}
