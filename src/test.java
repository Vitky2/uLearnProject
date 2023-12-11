import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String str1 = "2411,Monster Strike 3DS,3DS,2015,Action,\"mixi, Inc\",0,0,0.86,0,0.86";
        ArrayList<String> row = new ArrayList<>(Arrays.asList(str1.split(",")));
        printList(row);
        System.out.println("\n" + row.size());
        if (row.size() > 11) {
            for (int i = 0; i < row.size(); i++) {
                if (row.get(i).contains("\"")) {
                    while (countK(row.get(i)) != 2) {
                        row.set(i, row.get(i) + row.get(i + 1));
                        row.remove(i + 1);
                    }
                }
            }
        }
        printList(row);
        System.out.println("\n" + row.size());
    }
    public static int countK(String s) {
        return s.length() - s.replace("\"", "").length();
    }
    public static void printList(ArrayList<String> list) {
        for (String el: list) {
            System.out.print(list.indexOf(el) + " : " + el + " | ");
        }
    }

}
