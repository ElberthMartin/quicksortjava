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
    }
