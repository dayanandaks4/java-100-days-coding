public class Count{
    public static void main(String[] args){

        int[] name = {1,2,3,7,1,5,5};

        for(int i = 0; i < name.length; i++){
            for(int j = i + 1; j < name.length; j++){
                if(name[i] == name[j]){
                    System.out.println("Duplicate: " + name[i]);
                }
            }
        }
    }
}
