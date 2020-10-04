import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class NoDuplicates {
    public static void main(String[] args) {
        Set<String> myset = new HashSet<String>();
        Boolean mybool = null;
        Scanner scanner = new Scanner(System.in);
        String[] phrase = scanner.nextLine().split(" ");
        for(int i = 0; i < phrase.length; i++) {
            if(myset.contains(phrase[i])) {
                mybool = true;
                break;
            } else {
                mybool = false;
                myset.add(phrase[i]);
            }
        }
        if(mybool) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
