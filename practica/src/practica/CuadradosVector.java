
package practica;


public class CuadradosVector {
    public static void main(String[] args) {
        int cantidadNumeros = 500;
        int[] vectorOriginal = new int[cantidadNumeros];
        int[] vectorResultante = new int[cantidadNumeros];

        // Llenar el vectorOriginal con números aleatorios (puedes modificar esta parte según tus necesidades)
        for (int i = 0; i < cantidadNumeros; i++) {
            vectorOriginal[i] = (int) (Math.random() * 100); // Números aleatorios entre 0 y 99
        }

        // Calcular los cuadrados y almacenar en el vectorResultante
        for (int i = 0; i < cantidadNumeros; i++) {
            vectorResultante[i] = vectorOriginal[i] * vectorOriginal[i];
        }

        // Imprimir el vectorOriginal
        System.out.println("Vector Original:");
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print(vectorOriginal[i] + " ");
        }
        System.out.println();

        // Imprimir el vectorResultante
        System.out.println("Vector Resultante (Cuadrados):");
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print(vectorResultante[i] + " ");
        }
        System.out.println();
        
        int valor = 66*55;
        System.out.println(valor);
    }
}

