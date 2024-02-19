
public class Buildtree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    //time complexity of all traversal T=O(n);
    static class BinaryTree{
        static int idx=-1;
        public Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildtree(nodes);
            newNode.right=buildtree(nodes);
            return newNode;
        }
    }
    //preorder traversal
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data+"");
        preorder(root.left);
        preorder(root.right);
    }
    //postorder traversal
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+"");
    }
    //inorder traversal
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+"");
        inorder(root.right);
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildtree(nodes);

        System.out.println("data of the root node:"+root.data);

        System.out.println("preorder traversal:");
        preorder(root);

        System.out.println("postorder traversal:");
        postorder(root);

        System.out.println("inorder traversal:");
        inorder(root);
    }
}
