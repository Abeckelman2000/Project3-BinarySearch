public class BinarySearchTree {
    private Node root;

    // functions

    BinarySearchTree(Entry entry){
        root = new Node(entry);
    }

    String about(){
        return "This class was created by Austin Beckelman on 11/7/2022 ";
    }

    void print(){
        root.print(0);
    }

    void add(Entry entry){
        root.add(entry);
    }

    String find(int key){
       return root.find(key);
    }


}
