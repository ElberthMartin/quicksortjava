/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quicksort;
//importar
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Quicksort {
public static void main(String[] args) {
    // Solicitamos la  entrada de números separados por comas al usuario
    String input = JOptionPane.showInputDialog("Ingrese los números separados por comas:");
    // Dividimos la entrada en un array de strings utilizando unas coma como delimitador
    // Un array es una manera de poder guardar datos del mismo tipo o clase
    String[] inputArray = input.split(",");
  // Creamos otro array de enteros para almacenar los números
    int[] array = new int[inputArray.length];

    // Ahora convertimos los strings a enteros y almacenarlos en el array
    for (int i = 0; i < inputArray.length; i++) {
        array[i] = Integer.parseInt(inputArray[i].trim());
    }
    // Ordenamo el array utilizando el algoritmo quicksort
    quickSort(array, 0, array.length - 1);
    //en seguida creamos la representacion del array ordenado
    StringBuilder sortedArray = new StringBuilder("Array ordenado: ");
    //StringBuilder es una clase que proporciona una forma eficiente 
    //de construir y manipular cadenas de caracteres (strings) en memoria 
    for (int num : array) {
        sortedArray.append(num).append(" ");
    }
        // Mostramos el array ordenado en una ventana emergente
    JOptionPane.showMessageDialog(null, sortedArray.toString());
}
//funcion quickSort
//
public static void quickSort(int[] array, int low, int high) {
    if (low < high) {
        // Encontramos el índice del pivote
        //un pivot formar parte de un algoritmo de ordenamiento,
        //probablemente el algoritmo QuickSort
        int pivotIndex = partition(array, low, high);
        // Ordenamos recursivamente las dos mitades antes y después del pivote
        quickSort(array, low, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, high);
    }
}
public static int partition(int[] array, int low, int high) {
    
    // Aquí seleccionamos el pivote como el elemento en la posición high.
    int pivot = array[high]; 
    // Inicializamos  el índice i para los elementos menores que el pivote.
    int i = low - 1; 
    
    // Iterar a través del subarreglo
     for (int j = low; j < high; j++) { 
         
     // Comparar el elemento actual con el pivote
        if (array[j] < pivot) { 
// Incrementacion del "i" para hacer espacio para un nuevo elemento menor
            i++;
            // Intercambiamos el elemento menor a la posición correcta
            swap(array, i, j); 
        }
        }
     // Intercambiamos el pivote con el elemento en la posición i + 1.
        swap(array, i + 1, high);
        // retornamos la posición del pivote después de la partición.
        return i + 1;
    }
 public static void swap(int[] array, int i, int j) {
      // Almacenar el valor del elemento en la posición i
        int temp = array[i];
// Colocamos el valor del elemento en la posición j en la posición i
        array[i] = array[j];
// Coloca el valor almacenado en -temp- en la posición j
        array[j] = temp;
    
 }
}



  
    
    