public class Arrays {
    public static void main(String[] Args) {
        int[] aLista = {1, 3, 3, 4, 5};
        int[] aMasikLista = {2, 45, 22, 32};
        int sum = 0;
        for (int numbers : aLista) {
            sum += numbers;
        }
        System.out.println(sum);
        System.out.println(aLista[1] + aLista[2]);
        compareLength(aLista, aMasikLista);
        replacerOfaLista(aLista);
        aLista[0] =++aLista[0];
        for (int i = 0; i<aLista.length; i++){
            System.out.println(aLista[i]);
        }
        doublerOfLists(aLista);
        swapper(aLista);
    }

    public static void doublerOfLists(int doublerOf[]){
        for (int i = 0; i<doublerOf.length; i++){
            System.out.println("The doublind of aLista is: " + doublerOf[i]*2);
        }
    }

    public static void swapper(int swaps[]){
        int swap;
        swap = swaps[0];
        swaps[0] = swaps[1];
        swaps[1] = swap;
        for (int i =0; i<swaps.length; i++){
            System.out.println("This is the swap of aLista 1: " + swaps[i]);
        }
    }

    public static void compareLength(int a[], int b[]) {
        if (a.length > b.length) {
            System.out.println("a has more elements.");
        } else {
            System.out.println("b has more elements.");
        }

    }

    public static void replacerOfaLista(int c[]) {
        c[3] = 5;
    }
}