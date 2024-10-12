import java.util.Scanner;


public class MainJava{
    
    public static void main(String[] args) {
        int cantidadPersonas=2;
        Scanner Per = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas que va a registrar");
        cantidadPersonas=Per.nextInt();

      
        for (int numeroPersona = 1; numeroPersona <= cantidadPersonas; numeroPersona++) {
            System.out.println("Ingrese la edad de la persona " + numeroPersona);
            int edad = Per.nextInt();
            System.out.println("Ingrese el estado civil de la persona " + numeroPersona + " 1. Soltero   2. Casado");
            int estadoCivil = Per.nextInt();
            System.out.println("Ingrese la estatura de la persona " + numeroPersona + " en cms");
            int estatura = Per.nextInt();
            System.out.println("Ingrese el sexo de la persona " + numeroPersona + " 1. Hombre     2. Mujer");
            int sexo = Per.nextInt();

        PasoJava prueba1 = new PasoJava(edad, estadoCivil, estatura, sexo, estadoCivil,
        edad, estatura, numeroPersona, edad, edad, estatura, sexo);
        prueba1.calcularPromedio();
        
        }

        Per.close();
       
    }
}