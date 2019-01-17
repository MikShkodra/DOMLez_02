package domlez_02;

public class Array_2 {

    public static void main(String[] args) {
        
        //FORMA ABBREVIATA
        int[] numeri = new int[100];

        //carica array
        int valore = 1;
        for (int i = 0; i < 100; i++) {
            numeri[i] = valore;
            valore = valore + 1;
        }

        System.out.println("-----------------------------------------------");

        //stampa Array incrementato
        for (int i = 0; i < 100; i++) {
            int elemento = numeri[i];
            System.out.println(String.format("Array[%s]=%s", i, elemento));
        }
    }
    
    // function java   
    public static void stampa(int[] array) {
        for (int i = 0; i < 10; i++) {
            int el = array[i];
            System.out.println(String.format("array[%s] = %s", i, el));            
        }
        
    }
}
