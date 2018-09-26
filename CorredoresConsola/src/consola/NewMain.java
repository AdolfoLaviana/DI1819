/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

import beans.Corredor;
import java.util.Scanner;
import logic.LogicaAplicacion;
import utils.FechaUtils;
import utils.TokenizarUtils;

/**
 *
 * @author dstarsln
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        Corredor corredor;

        int respuesta = 0;
        LogicaAplicacion la = new LogicaAplicacion();
        TokenizarUtils tokenizar = new TokenizarUtils(la);
        tokenizar.leerCSVcorredor();

        do {
            System.out.println("Menu");
            System.out.println("5.Salir");
            System.out.println("1.Añadir corredor");
            System.out.println("2.Mostrar corredores");
            System.out.println("3.Eliminar corredor");
            System.out.println("4.Modificar corredor");
            System.out.println("introduce un numero");
            respuesta = teclado.nextInt();

            switch (respuesta) {
                case 1:
                    System.out.println("Corredor creado");
                    corredor = new Corredor("Juan", "22222234x", "Sama", "456321687", FechaUtils.pasarStringADate("23/04/1998"));
                    la.darAltaCorredor(corredor);
                    break;
                case 2:
                    for (Corredor corredorLista : la.getListaDeCorredores()) {
                        System.out.println(corredorLista.toString());

                    }
                    break;
                case 3:
                    System.out.println("dni del corredor que quieres dar de baja");
                    teclado.nextLine();
                    String dni = teclado.nextLine();
                    la.darBajaCorredor(dni);
                    break;
                case 4:
                    System.out.println("Introduce el nombre del corredor que quieres modificar");
                    teclado.nextLine();
                    String nombre = teclado.nextLine();
                    System.out.println("vamos a modificarlo automáticamente que me da la chapa hacer todas las preguntas");
                    System.out.println("Por si acaso lo que haria seria crear un corredor y pasarselo a la logica donde hago la modificacion");
                    corredor = new Corredor("Lucas","42342424323424x","Sotrondio","323545767",FechaUtils.pasarStringADate("15/08/1998"));
                    la.modificarCorredor(nombre, corredor);
                    break;

            }

        } while (respuesta != 5);
        System.out.println("Salida");
    }

}
