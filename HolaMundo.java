import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        //imprimir datos en pantalla / consola o terminal
        System.out.println(10);

        System.out.print( "Como van las cosas" ); // con este comando se imprime el mensaje en pantalla con un cambio de linea
        System.out.print(10);           //  "" 
        System.out.print(10.5);
        System.out.print('A');  // print imprime sin salto de linea
        System.out.println(args); // no imprime formatos 

      System.out.printf("aqui va una cadena: %s", "Balmer");
      System.out.printf("aqui va un entero: %d", 10);
      System.out.printf("Mi nombre es %s y tengo %d años%n", "Balmer Arteaga", 28);

       var entrada = new Scanner(System.in);

      
       System.out.print("por favor ingrese un numero entero: ");


       var entero = entrada.nextInt();
       System.out.println(entero);
       entrada.close();
     }
}


// Javac para compilar el archivo, escribo javac HolaMundo.java
//java para ejecutar el archivo sin el .java, escribo java HolaMundo
// tener en cuenta colocar los parentesis, llaves, y punto y coma
