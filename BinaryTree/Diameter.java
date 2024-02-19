public class Diameter {
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
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int rh=height(root.left);
        int lh=height(root.right);

        return Math.max(lh,rh)+1;
    }
        //Approach1 -O(n^2)
        public static int diameter1(Node root){
            if(root==null){
                return 0;
            }
            int leftdia=diameter1(root.left);
            int rightdia=diameter1(root.right);
            int lh=height(root.left);
            int rh=height(root.right);
            int selfdia=rh+lh+1;
            return Math.max(selfdia,Math.max(leftdia,rightdia));
        }
     //Approach2-O(n)
     static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
     }
     public static TreeInfo diameter2(Node root){
        if(root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);
        int myheight=Math.max(left.ht,right.ht)+1;
        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.ht+right.ht+1;
        int mydiam=Math.max(Math.max(diam1,diam2),diam3);
        TreeInfo myInfo=new TreeInfo(myheight,mydiam);
        return myInfo;

     }
    public static void main(String args[]){
        /*
               1
              / \
             2   3
            / \ / \
           4  5 6  7
         */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(diameter1(root));
        System.out.println(diameter2(root).diam);
    }
    
}
