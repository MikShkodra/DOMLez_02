package domlez_02;

public class Array {

    public static void main(String[] args) {
        //dichiarazione ARRAY di interi
        int[] numeri;
        //creazione di un ARRAY di n→ 100 numeri
        numeri = new int[100];

        //FORMA ABBREVIATA
        int[] numeri1 = new int[100];

        //stampa Array
        stampa(numeri);

        //carica array
        int valore = 1;
        for (int i = 0; i < 100; i++) {
            numeri[i] = valore;
            valore = valore + 1;
        }

        System.out.println("-----------------------------------------------");

        //stampa Array incrementato
        stampa(numeri);
    }

    // function java   
    public static void stampa(int[] array) {
        for (int i = 0; i < 100; i++) {
            int el = array[i];
            System.out.println(String.format("array[%s] = %s", i, el));
        }
    }
    //FACCIO FUNZIONI GENERICHE →→ da poterle rendere RI-utilizzabili

    public static void Stampa(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int el = array[i];
            System.out.println(String.format("array[%s] = %s", i, el));
        }
    }
}

            //così nella modifica futura, modifico in un unico punto
