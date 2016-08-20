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
public class Binaria extends Busqueda {//Se crea un metodo para el
    //algoritmo de busqueda Binaria y se extiende a la clase Busqueda
    
    @Override
    public int Buscar(int [] arr, int e){
        int inicio, fin, centro, valorCentro;
        
        inicio = 0;
        fin = arr.length - 1;
        while(inicio < fin){
          centro = (inicio + fin)/ 2;
          valorCentro = arr[centro];
          if(valorCentro == e){
              return centro;
          }else{
              if(e < valorCentro){
                  fin = centro - 1;
              }else{
                  inicio = centro +1;
              }
          }
        }
        return -1;
    }
    
}
