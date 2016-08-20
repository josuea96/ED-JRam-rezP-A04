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
public abstract class Busqueda {
    
    protected int [] Vector;
    //Se declaran los arreglos que se van a utilizar pero protegidos
    
    public Busqueda(int[] Vector){//Se declara un constructor de la clase
        //con los parametros
        this.Vector = Vector;
    }
    public Busqueda(){//Se declara un constructor de la clase sin añadir parametros
        this.Vector = Vector;
    }
    
    public void setVector(int [] v){//Inicio del metodo setVector
        Vector = v;
    }//Fin de setVector
    
    public int [] CrearVector(){//Se crea un metodo para pedirle al usuario los valores que
        //quiere poner el vector y su respectivo tamaño
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Escribe el tamaño del arreglo: ");
        int n = sc.nextInt();
        int vector[] = new int [n];
       
        for (int i = 0; i < n; i++){//Se va recorriendo el puntero en el arreglo
            //para que el usuario inserte el número que guste
            System.out.println("Escribe el dato " + i + " : ");
            vector[i] = sc.nextInt();//Se guarda el numero dado en la una posicion del vector
        }
        return vector;
    }
    
    public int [] getVector(){//Metodo para regresar el vector que se dio al inicio
        return Vector;
    }
    
    public int solicitarElemento(){//Metodo para solicitar el elemento que se quiere buscar
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("¿Escribe el elemento que deseas buscar ");
        int e = sc.nextInt();
        return e;
    }//Fin del metodo solicitarElemento
    
    public void mostrarResultado(int n){
        if(n != -1){
            System.out.println("El número solicitado se encuentra en la posición " + n);
        }
        else{
            System.out.println("El número solicitado no se encuentra en el arreglo");
        }
    }
    
    abstract public int Buscar(int [] arr, int e);
    
    public void mostrarVector(int [] Vector){//Se crea un metodo para
        //desplegar los valores que se encuentran en el vector
        for(int i = 0; i < Vector.length; i++){//Se hace un ciclo for
            //y va recorriendo el vector y desplegando los valores
            //que tiene guardado
            System.out.println(" | " + Vector[i] );
        }

    } 
}
