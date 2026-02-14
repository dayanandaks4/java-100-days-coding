// Find the Watch is there or Not There in a Showcase....


public class SerechingThing {
    public static void main(String[] args) {
        String[] list = {"Pen", "Book", "Bag", "Watch", "Mobile", "lamp"};
        String myThingIs = "Watch";
        for (String item: list) {
            if (item.equals(myThingIs)) {
                System.out.println("Yes The Watch is There in a Showcase...");
                return;
            }
        }System.out.println("No The Watch is  Not There in a Showcase...");
    }
}


//  OUTPUT : Yes The Watch is There in a Showcase...
