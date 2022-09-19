import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        HashMap<String, String> orszagok = new HashMap<>();
        orszagok.put("Belgium", "Brüsszel");
        orszagok.put("Ausztria", "Bécs");
        orszagok.put("Dánia", "Koppenhága");
        orszagok.put("Szlovákia", "Pozsony");

        System.out.println(orszagok.size());
        System.out.println(orszagok.get("Dánia"));
    }
}
