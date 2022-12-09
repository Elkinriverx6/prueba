package poo_semana11;
//@autor: Elkin Jenner
public class ejercicio1 {
     static int n = 4;
        public static void main(String[] args) {
        //       int n = 3;
//        int[] a = new int[n];
        int[] a = {1, 2, 3, 4, 5};
        int suma = 0;
        int buscado = 3;
        int posicion = -1;
        for (int i = 0; (i < a.length && posicion == -1); i++) 
        {
            if (a[i] == buscado) {
                posicion = i;
            }
        }
        System.out.println("la posicion de el numero " + buscado + " es: " + posicion);
//  llega aqui cuando ya no se vuelve a llamar
    }
}
