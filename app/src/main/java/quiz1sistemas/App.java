
package quiz1sistemas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        calcularValorBoleta(null, 0);
        int cantidadBoletas = 0;
        cantidadBoletas = sc.nextInt();
        System.out.println("¿Que boleta desea escoger?");
        String sillaEscogida = sc.nextLine();

        while(cantidadBoletas > 0){
            System.out.println("¿Desea otra boleta?");

            cantidadBoletas = sc.nextInt();
            

    }
}

    /*  Implemente una funcion llamada calcularValorBoleta que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa el tipo de silla comprada (V ó G)
            - Un entero que representa la cantidad de boletas compradas
        * Retorna:
            - Un entero representando el valor total de las boletas
    */
    //------------------------------------------------------------------
    
    public static int calcularValorBoleta(String sillaEscogida, int cantidadBoletas){

        try {          
            int resultado = 0;
            switch (sillaEscogida) {

                case "V":
                int valorBoletaVip = 15000;
                resultado = valorBoletaVip*cantidadBoletas;

                    break;
                
                case "G":
                int valorBoletaGeneral = 10000;
                resultado = valorBoletaGeneral*cantidadBoletas;

                    break;

                default:
                System.out.println("Opción invalida");
                    break;
            }

                return resultado;


        } catch (Exception e) {
            return -1;
        }
    }


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularValorNetoCombo que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el numero de combo selecciondo
            - Un entero representando la cantidad de combos comprados
        * Retorna:
            - Un entero representando el valor neto del combo
    */
    //------------------------------------------------------------------
    
    public static int calcularValorNeto(int comboSeleccionado, int cantidadCombo){

        try {

            int resultado = 0;

            switch (comboSeleccionado) {
                case 1:
                int combo1 = 40000;
                resultado = combo1*cantidadCombo;
                    break;
    
                case 2:
                int combo2 = 30000;
                resultado = combo2*cantidadCombo;
                    break;
    
                case 3:
                int combo3 = 42000;
                resultado = combo3*cantidadCombo;
                    break;
            
                default:
                System.out.println("Opción invalida");
                    break; 

            }
                    return resultado;

        } catch (Exception e) {
            return -1;
    } 

    }
    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularDescuentoCombo que cumpla con las siguientes caracteristicas
        * Recibe:
            - Una cadena de caracteres que representa el tipo de silla comprada (V ó G)
            - Un entero representando el valor neto del combo
        * Retorna:
            - Un entero representando el valor del descuento
    */
    //------------------------------------------------------------------
    
    public static int(String sillaEscogida, int valorNetoCombo){

        try {
            String sillaVip = "";


        } catch (Exception e) {
            return -1;
        }


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularValorFactura que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor neto del combo
            - Un entero representando el valor de las boletas
            - Un entero representando el valor del descuento del combo
        * Retorna:
            - Un entero representando el valor total de la factura
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------
}
}

