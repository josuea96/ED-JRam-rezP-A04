//Josué Alexis Ramírez Pérez A00513622 ITIC 5ª Semestre
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedasecbin;

import java.util.Scanner;

/**
 *
 * @author josuealexis96
 */
public class BusquedaSecBin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);//Se declaran las variables que se usaran,
        //en este caso el scanner para pedir un tamaño, números y la opcion que quiere
     
        int [] vector1;//Se declaran los arreglos
        int [] vector2;
        int num;//Se declara la variable num para poder llamar al objeto que se encuentra en la clase Busqueda
       
        System.out.println("¿Qué tipo de vector quieres crear? 1. Secuencial 2. Binario");
        //Se imprime la pregunta que tipo de vector quiere crear el usuario, y tiene que poner 1 para secuencial
        //o 2 para el binario
        int a = sc.nextInt();//El número que proporciono el usuario se guardara en la variable de tipo int
        if (a == 1){
            Secuencial buscarS = new Secuencial(); //Se crea el objeto buscarS que manda a llamar al metodo
            //que se encuentra en la clase busqueda y usar la busqueda Secuencial
            vector2 = buscarS.CrearVector();
            buscarS.setVector(vector2);//Se manda a llamar al metodo crearVector que se usara para pedir el tamaño
            //del arreglo y a su vez pedirle al usuario que números va a usar
            buscarS.mostrarVector(vector2);
            buscarS.solicitarElemento();//Buscamos el elemento que deseamos en el vector
            buscarN = buscarS.Buscar(buscarS.getVector(), buscarN);//Se muestra el resultado
            buscarS.mostrarResultado(buscarN);
            
        }
        
        else{
            Binaria buscarB = new Binaria(); //Se crea el objeto buscarB que manda a llamar al metodo
            //que se encuentra en la clase busqueda y usar la busqueda Secuencial
            vector1 = buscarB.CrearVector();//se guarda el metodo crearVector en el vector1
            buscarB.setVector(vector1);//Se manda a llamar al metodo crearVector que se usara para pedir el tamaño
            //del arreglo y a su vez pedirle al usuario que números va a usar
            buscarB.mostrarVector(buscarB.getVector());
            buscarB.mostrarResultado(buscarB.Buscar(vector1, buscarB.solicitarElemento()));
        }
    }   
}
