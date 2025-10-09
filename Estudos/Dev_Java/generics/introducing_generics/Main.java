import java.util.List;
import java.util.ArrayList;


void main() {
//    List list = new ArrayList();
//
//    list.add("hello");
//
//    String s = (String) list.get(0);

    // Or generic

    List<String> list = new ArrayList<String>();

    list.add("hello");

    String s = list.get(0);
}
