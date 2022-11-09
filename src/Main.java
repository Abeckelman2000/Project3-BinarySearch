import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static Entry parseKeyVal(String fileInput){
        // split the string in two by the comma
        String[] arrOfStr = fileInput.split(",", 2);

        // store into an Entry object
        Entry returnObj = new Entry();
        returnObj.key = Integer.valueOf(arrOfStr[0]);
        returnObj.value = arrOfStr[1];

        return returnObj;
    }
    public static void main(String[] args) throws FileNotFoundException {
        // variables
        int keyDigits;
        BinarySearchTree tree = new BinarySearchTree();
        String fileInput;
        File file= new File("pokemon.txt");
        Scanner scan = new Scanner(file);

        // read input from the file
        fileInput = scan.nextLine();                                // first scan will hold number of digits in the key
        keyDigits = Integer.valueOf(fileInput);

        while(scan.hasNext()){                                      // Scan each line
            fileInput = scan.nextLine();

            if(!fileInput.equals("END")){                           // if the line is "END", we are finished, otherwise add the Entry to the tree
                tree.add(parseKeyVal(fileInput));
            }
        }
        // print the tree
        tree.print();


    }
}