package poo_semana11;
//@autor: Elkin Jenner
public class ordenamiento {
    
    static int n = 4;
    public static void main(String[] args) {
        //       int n = 3;

        int[] arreglo = {7, 5, 8, 3, 2, 9};
        int aux;
        System.out.println("arreglo antes");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + i + "]" + arreglo[i]);
        }

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j <arreglo.length; j++) {
                if (arreglo[i] < arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        System.out.println("arreglo despues");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + i + "]" + arreglo[i]);
        }

    }
    
}
