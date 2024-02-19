public class Subtree {
    public class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    class Solution {
        public boolean isIdentical(Node root, Node subroot) {
            if (root == null && subroot == null) {
                return true;
            }
            if (root == null || subroot == null) {
                return false;
            }
            if (root.data == subroot.data) {
                return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
            }
            return false;
        }

        public boolean isSubtree(Node root, Node subroot) {
            if (subroot == null) {
                return true;
            }
            if (root == null) {
                return false;
            }
            if (root.data == subroot.data) {
                if (isIdentical(root, subroot)) {
                    return true;
                }
            }
            return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
        }
    }

    public static void main(String args[]) {
        Subtree st = new Subtree();
        Subtree.Node root = st.new Node(3);
        root.left = st.new Node(4);
        root.right = st.new Node(5);
        root.left.left = st.new Node(1);
        root.left.right = st.new Node(2);

        Subtree.Node subroot = st.new Node(4);
        subroot.left = st.new Node(1);
        subroot.right = st.new Node(2);

        Solution solution = st.new Solution();
        if (solution.isSubtree(root, subroot)) {
            System.out.println("Subtree found!");
        } else {
            System.out.println("Subtree not found!");
        }
    }
}
