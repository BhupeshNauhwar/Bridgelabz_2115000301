import java.util.ArrayList;

class WarningSuppressor {
    @SuppressWarnings("unchecked")
    void addElements() {
        ArrayList list = new ArrayList(); 
        list.add("Hello");
        list.add(100); 
        System.out.println("List elements: " + list);
    }
}

public class SuppressWarningExample {
    public static void main(String[] args) {
        WarningSuppressor ws = new WarningSuppressor();
        ws.addElements();
    }
}
