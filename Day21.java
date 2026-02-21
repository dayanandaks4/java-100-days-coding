// This is the one of the problem of star pattern printing.
// This will helps to build a strong logic in loops. 


public class StarPrinting {
    public static void main(String[] args){
        int height = 5;
        for(int i = 1; i <= height; i++){
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
