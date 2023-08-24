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
    for (int num : array) {
        sortedArray.append(num).append(" ");
    }
        // Mostramos el array ordenado en una ventana emergente
    JOptionPane.showMessageDialog(null, sortedArray.toString());
}
//funcion quickSort
public static void quickSort(int[] array, int low, int high) {
    if (low < high) {
        // Encontramos el índice del pivote
        int pivotIndex = partition(array, low, high);
        // Ordenamos recursivamente las dos mitades antes y después del pivote
        quickSort(array, low, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, high);
    }
}

    }
