public class BinarySearchTree {
    private Node root;

    // functions

    BinarySearchTree(){
        root = null;
    }

    String about(){
        return "This class was created by Austin Beckelman on 11/7/2022 ";
    }

    void print(){
        root.print(0);
    }

    void add(Entry entry){
        if(root == null){
            root = new Node(entry);
        }
        root.add(entry);
    }

    String find(int key){
       return root.find(key);
    }


}
