/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoflyod;


/**
 *
 * @author Mulay
 */
public class AlgoritmoFlyod {

        /**
     * Encuentra el número qu está duplicado en una lista de ints
     * usando el algoritmo de Floyd
     * @param listaNumeros
     * @return 
     */
    // [1, 3, 2, 4, 4]
    public int findDuplicate(int [] listaNumeros){
        int tortuga = listaNumeros[0];
        int liebre = listaNumeros[0];
        boolean iguales = false;
        while (!iguales){
            tortuga = listaNumeros[tortuga];
            liebre = listaNumeros[listaNumeros[liebre]];
            if (tortuga == liebre){
                iguales = true;
            }
        }
        int aux1 = listaNumeros[0];
        int aux2 = tortuga;
        while (aux1 != aux2){
            aux1 = listaNumeros[aux1];
            aux2 = listaNumeros[aux2];
        }
        return aux1;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlgoritmoFlyod ejercicio = new AlgoritmoFlyod();
        System.out.println(ejercicio.findDuplicate(new int[] {3,2,3,4,1}));
        System.out.println(ejercicio.findDuplicate(new int[] {4,2,3,4,1}));
        System.out.println(ejercicio.findDuplicate(new int[] {1,1,3,4,1}));
    }
    
}
