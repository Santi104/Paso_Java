import java.util.Scanner;

public class MainFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad = 0, estadoCivil = 0, estatura = 0, sexo = 0, contadorPersonas = 0, acomuladorEdad = 0, acomuladorEstatura = 0,  cantidadPersonas = 0;
        System.out.println("Ingrese el número de personas que deseas registar");
        cantidadPersonas = sc.nextInt();

        for (int numPersona = 1; numPersona <= cantidadPersonas; numPersona++) {
            System.out.println("Ingrese la edad de la persona " + numPersona);
            edad= sc.nextInt();

            System.out.println("Ingrese el estado civil de la persona " + numPersona + " 1. Soltero   2. Casado");
            estadoCivil= sc.nextInt();

            System.out.println("Ingrese la estatura de la persona " + numPersona + " en cms");
            estatura= sc.nextInt();

            System.out.println("Ingrese el sexo de la persona " + numPersona + " 1. Hombre  2. Mujer");
            sexo= sc.nextInt();

            if ((edad >= 18) && (estadoCivil==1) && (estatura>170) && (sexo==1)){
                contadorPersonas = contadorPersonas + 1;
                acomuladorEdad = acomuladorEdad + edad;
                acomuladorEstatura = acomuladorEstatura + estatura;
            }
        }

        LogicFor newLogic = new LogicFor(edad, estadoCivil, estatura, sexo, contadorPersonas, acomuladorEdad, acomuladorEstatura, cantidadPersonas);
        newLogic.calcularPromedio();
    }
}