package JavaCalculator;

import java.util.Scanner;
class Operaciones{
    public static void main(String[] args) { 
        // Bienvenida al programa print´s
        System.out.println("Bienvenido al Programa");
        System.out.println("");
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("");
        
        Integer x = 1; 
        while (x == 1){
            System.out.println("Para Sumar presione la opción 1: ");
            System.out.println("Para Restar presione la opción 2: ");
            System.out.println("Para Multiplicar presione la opción 3: ");
            System.out.println("Para Sumar presione la opción 4: ");
            // Ingreso por teclado 
            Scanner lectura = new Scanner (System.in);
            Integer opcion = lectura.nextInt();

            // Switch para las opciones
            switch(opcion){
                case 1:
                System.out.println("Ingrese los numeros que desea Sumar: ");
                Double sum1 = lectura.nextDouble();
                Double sum2 = lectura.nextDouble();
                Double sumResult = suma(sum1, sum2);
                System.out.println("La suma de ambos numeros nos resulta: " + sumResult);
                break;
                case 2:
                System.out.println("Ingrese los numeros que desea Restar: ");
                Double res1 = lectura.nextDouble();
                Double res2 = lectura.nextDouble();
                Double resResult = resta(res1, res2);
                System.out.println("La Resta de ambos numeros nos resulta: " + resResult);
                break;
                case 3:
                System.out.println("Ingrese los numeros que desea Multiplicar: ");
                Double mul1 = lectura.nextDouble();
                Double mul2 = lectura.nextDouble();
                Double multiResult = multiplicacion(mul1, mul2);
                System.out.println("La Multiplicación de ambos numeros nos resulta: " + multiResult);
                break;
                case 4:
                System.out.println("Ingrese los numeros que desea Dividir: ");
                Double div1 = lectura.nextDouble();
                Double div2 = lectura.nextDouble();
                Double divisResult = multiplicacion(div1, div2);
                System.out.println("La División de ambos numeros nos resulta: " + divisResult);
                break;
                default:
                System.out.println("La opción seleccionada no es valida \n por favor seleccione una nuevamente!");
        }
                // Volver a Ejecutar una opción --> Validar
                Integer y = 1;

                while (y == 1){
                    System.out.println("\nSi Desea Ejecutar otra operación presione 1");
                    System.out.println("En caso contrario presione 0 para salir! ");
                    x = lectura.nextInt();
                        if(x == 1 || x == 0){
                            y = 0;
                        } else {
                            y = 1;
                        }
                }

                // Volver a Ejecutar una opción --> Asignar Acción
                if (x == 1){
                    System.out.println("Menú de Operaciones");
                    y = 0;
                } else if (x == 0){
                    System.out.println("Saliendo del programa.\nVuelva pronto!");
                    y = 0;
                    break;
                } 
            
        }
        
    
    }

    /* Funciones */

        /* SUMA */
    public static double suma(double a, double b){
        double i = a + b;
        return i;
    }

        /* RESTA */
    public static double resta(double a, double b){
        double i = a - b;
        return i;
    }

        /* MULTIPLICACION */
    public static double multiplicacion(double a, double b){
        double i = a * b;
        return i;
    }

        /* DIVISION */
    public static double division(double a, double b){
        double i = a / b;
        return i;
    }
}
