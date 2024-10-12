public class PasoJava{
    int edad = 0, estadoCivil = 0, estatura = 0, sexo = 0, contadorPersonas = 0, acomuladorEdad = 0, acomuladorEstatura = 0,  numeroPersona = 1;
    int cantidadPersonas;
    float promedioEdad = 0, promedioEstatura = 0, porcentajePersonas = 0;
    
    
    public PasoJava(int edad, int estadoCivil, int estatura, int sexo, int contadorPersonas, int acomuladorEdad,
            int acomuladorEstatura, int numeroPersona, int cantidadPersonas, float promedioEdad, float promedioEstatura,
            float porcentajePersonas) {
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.estatura = estatura;
        this.sexo = sexo;
        this.contadorPersonas = contadorPersonas;
        this.acomuladorEdad = acomuladorEdad;
        this.acomuladorEstatura = acomuladorEstatura;
        this.numeroPersona = numeroPersona;
        this.cantidadPersonas = cantidadPersonas;
        this.promedioEdad = promedioEdad;
        this.promedioEstatura = promedioEstatura;
        this.porcentajePersonas = porcentajePersonas;
    }

    public void calcularPromedio(){
        
        if ((edad >= 18)&&(estadoCivil==1)&&(estatura>170)&&(sexo==1)){
        contadorPersonas = contadorPersonas + 1;
        acomuladorEdad = acomuladorEdad + edad;
        acomuladorEstatura = acomuladorEstatura + estatura;
        }
    
    promedioEdad = acomuladorEdad / contadorPersonas;
    promedioEstatura = acomuladorEstatura / contadorPersonas;
    porcentajePersonas = (contadorPersonas/cantidadPersonas)*100;

    System.out.println("El promedio de edad de las personas que cumplen es: " + promedioEdad + " años ");
    System.out.println("El promedio de estatura de las personas que cumplen es: " + promedioEstatura + " centimetros ");
    System.out.println("El porcentaje de personas que cumplen con la condición es del: " + porcentajePersonas + " % ");

   }
}

