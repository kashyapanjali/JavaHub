
public class PrefixProblem {
    static class Node{
        Node[]children=new Node[26];
        boolean eow=false;
        int freq;

        public Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
            freq=1;
        }
    }

    static Node root=new Node();

    public static void insert(String words){
        Node curr=root;
        for(int i=0;i<words.length();i++){
            int idx=words.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }else{
                curr.children[idx].freq++;
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }

    public static void findPrefix(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                System.out.println("No words with the given prefix exist.");
                return;
            }
            curr = curr.children[idx];
        }
        // Now curr points to the node representing the last character of the prefix
        // Perform a DFS to print all words with the given prefix
        dfs(curr, prefix);
    }

    private static void dfs(Node node, String prefix) {
        if (node == null)
            return;

        if (node.eow) {
            System.out.println(prefix);
        }

        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                char ch = (char) ('a' + i);
                dfs(node.children[i], prefix + ch);
            }
        }
    }
    public static void main(String args[]){
        String arr[] = { "zebra", "dog", "duck", "dove" };
        for (String word : arr) {
            insert(word);
        }

        // Finding words with prefix "do"
        System.out.println("Words with prefix 'do':");
        findPrefix("do");

        // Finding words with prefix "ze"
        System.out.println("Words with prefix 'ze':");
        findPrefix("ze");


    }
}
