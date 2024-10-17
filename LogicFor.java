public class LogicFor {
        int edad = 0, estadoCivil = 0, estatura = 0, sexo = 0, contadorPersonas=0, acomuladorEdad = 0, acomuladorEstatura = 0;
        int cantidadPersonas=0;
    
        public LogicFor(int edad, int estadoCivil, int estatura, int sexo, int contadorPersonas, int acomuladorEdad,
                        int acomuladorEstatura, int cantidadPersonas) {
            this.edad = edad;
            this.estadoCivil = estadoCivil;
            this.estatura = estatura;
            this.sexo = sexo;
            this.contadorPersonas = contadorPersonas;
            this.acomuladorEdad = acomuladorEdad;
            this.acomuladorEstatura = acomuladorEstatura;
            this.cantidadPersonas = cantidadPersonas;
        }

        public void calcularPromedio() {
                if (contadorPersonas > 0) {
                    double promEdad = acomuladorEdad / contadorPersonas;
                    double promEstatura = acomuladorEstatura / contadorPersonas;
                    
                    System.out.println("El promedio de edad de las personas que cumplen es: " + promEdad + " años ");
                    System.out.println("El promedio de estatura de las personas que cumplen es: " + promEstatura + " centimetros ");
                
                } else {
                    System.out.println("No hay personas que cumplan con las condiciones.");
                }
        
                double porcentajePersonas = (contadorPersonas / cantidadPersonas) * 100.0;
                System.out.println("El porcentaje de personas que cumplen con la condición es del: " + porcentajePersonas + " % ");
            }
        }
        /* Profesor use el 100.0 para poder que en caso de divisiones que sean 0 y tengan decimales, den un resultado preciso, mas no un cero (que me sucedio al tener variables enteras) */
        
