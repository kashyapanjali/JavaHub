
import java.util.*;
import java.util.LinkedList;

public class SumofOrder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static int sumAtKthLevel(Node root, int k) {
        if (root == null || k < 1) {
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int currentLevel = 1;
        int levelSum = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node currNode = q.remove();

                if (currentLevel == k) {
                    levelSum += currNode.data;
                }

                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }

            currentLevel++;

            if (currentLevel > k) {
                break; // Stop processing further levels once kth level is reached
            }
        }
        return levelSum;
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        int k = 2; // Replace with the desired level (k)
        int levelSum = sumAtKthLevel(root, k);

        System.out.println("Sum of nodes at level " + k + ": " + levelSum);
    }
}

    

