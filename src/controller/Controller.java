package controller;

import java.util.Scanner;

import model.logic.Modelo;
import view.View;

public class Controller {

	/* Instancia del Modelo*/
	private Modelo modelo;

	/* Instancia de la Vista*/
	private View view;

	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new View();
		modelo = new Modelo();
	}

	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option){

			case 1:
				view.printMessage("Inicio de lectura de los archivos."); 
				modelo.leerDatosVideosArregloDinamico();
				view.printMessage("Lectura completa y Arreglo Dinamico creado."); 
				break;
				
			case 2:
				view.printMessage("Inicio de lectura de los archivos."); 
				modelo.leerDatosVideosListaEncadenada();
				view.printMessage("Lectura completa y Lista Encadenada creada.");
				break;
			
			case 3:
				view.printMessage("Inserte el tama�o deseado de la muestra."); 
				dato = lector.nextLine();
				modelo.mostrar(Integer.valueOf(dato));
				view.printMessage("");
				break;

			case 4: 
				view.printMessage("--------- \n Hasta pronto !! \n---------"); 
				lector.close();
				fin = true;
				break;	
				
			default: 
				view.printMessage("--------- \n Opcion Invalida !! \n---------");
				break;
			}
		}

	}	
}
