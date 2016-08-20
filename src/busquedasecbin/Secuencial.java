//Josué Alexis Ramírez Pérez A00513622 ITIC 5ª Semestre
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedasecbin;

/**
 *
 * @author josuealexis96
 */
public class Secuencial extends Busqueda {//Se crea un metodo para el
    //algoritmo de busqueda Secuencial y se extiende a la clase Busqueda
    
    @Override
    public int Buscar(int [] arr, int e){
      int i;
        boolean encontrado = false;
        for (i = 0; i < arr.length && encontrado == false; i++){
            if(e == arr[i]){
                encontrado = true;
                return i;
            }
        }
        return -1;
    }
    
}
