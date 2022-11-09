public class Node {
    Entry value;
    Node left;
    Node right;


    // funcs
    Node(Entry entry){
        value = entry;
    }

    // fix print
    void print(int indent){
        // print indents
        for(int i = 0; i < indent; i++){
            System.out.print(" ");
        }

        // print branch
        System.out.print("+---");

        // Print value and newline
        System.out.print(this.value.key + ": " + this.value.value + "\n");

        // print children
        if(left != null){
            left.print(indent + 1);
        }
        if(right != null){
            right.print(indent + 1);
        }
    }

    void add(Entry entry){
        // go left
        if (entry.key < this.value.key){
            if (this.left != null){
                left.add(entry);
            }
            else{
                Node newChild = new Node(entry);    // instantiate the new node
                this.left = newChild;               // assign it to be the left child
            }
        }

        // go right
        if(entry.key > this.value.key){
            if(right != null){
                right.add(entry);
            }
            else{
                Node newChild = new Node(entry);    // instantiate the new node
                this.right = newChild;              // assign it to be the right child
            }
        }
    }

    String find(int key){
        // did we find it?
        if(key == this.value.key){
            return this.value.value;
        }
        // go left
        if(key <= this.value.key){
            return this.left.find(key);
        }
        // go right
        else{
            return this.right.find(key);
        }
    }


}
