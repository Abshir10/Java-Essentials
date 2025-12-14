import java.util.ArrayList;
import java.util.List;

public class ForLoop {

    static List<Integer> ids = new ArrayList<>();

    public static void main(String[] args) {
        addValueToList();
        displayIds();

    }
    public  static  void addValueToList() {
        ids.add(221);
        ids.add(343);
        ids.add(454);
    }
    public static void displayIds() {
        for (int i = 0; i < ids.size() ; i++) {
            System.out.println(ids.get(i));
        }
    }

}
