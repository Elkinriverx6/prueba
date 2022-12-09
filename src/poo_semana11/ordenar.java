package poo_semana11;
//@autor: Elkin Jenner
public class ordenar {
    int[] arreglo = {7, 5, 8, 3, 2, 9};
    int aux;
     void desordenado() {
        
        System.out.println("arreglo antes");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + i + "]" + arreglo[i]);
        }
  }
     void ordenado() {
         
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
      public static void main(String[] args) {
          ordenar enumerado = new ordenar();
          enumerado.desordenado();
          enumerado.ordenado();
    }

}
