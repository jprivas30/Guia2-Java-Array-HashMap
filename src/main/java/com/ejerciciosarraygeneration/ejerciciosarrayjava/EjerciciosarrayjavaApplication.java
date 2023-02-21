package com.ejerciciosarraygeneration.ejerciciosarrayjava;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import javax.print.attribute.Size2DSyntax;
import java.util.HashMap;

@SpringBootApplication
public class EjerciciosarrayjavaApplication {

//------------------------------------------ EJERCICIO 1 ----------------------------------------------

public static void print(ArrayList <Integer> number){
	for(int i=0; i< number.size(); i++){
		System.out.println("Los numeros del arreglo son: "+ number.get(i));
	}
}

//------------------------------------------ EJERCICIO 2 ----------------------------------------------

public static void printReverse(ArrayList <Integer> number){
	for(int i=4; i>=0; i--){
		System.out.println("Los numeros al reves del arreglo son: "+ number.get(i));
	}
}

//------------------------------------------ EJERCICIO 3 ----------------------------------------------

public static void sumaElementos(ArrayList <Integer> number){
	int suma=0;
	for(int i=0; i< number.size(); i++){
			suma= suma + number.get(i);
	}
		System.out.println("La suma de los numeros del arreglo " +number+ " es igual a: "+ suma);
	}


//------------------------------------------ EJERCICIO 4 ----------------------------------------------


public static void numMenor(ArrayList <Integer> numeros){

int numMenor= numeros.get(0);
for (int i = 0; i < numeros.size() ; i++) {
    if (numeros.get(i) < numMenor) {
        numMenor = numeros.get(i);  
    } 
}
System.out.println("El numero menor del arreglo es: "+ numMenor );
}


//------------------------------------------ EJERCICIO 5 ----------------------------------------------





//------------------------------------------ EJERCICIO 6 ----------------------------------------------



//------------------------------------------ EJERCICIO 7 ----------------------------------------------



//------------------------------------------ EJERCICIO 8 ----------------------------------------------


//FUNCION PARA HALLAR EL PROMEDIO DE NOTAS 
public static Double promedioNotas(ArrayList<Double> notas){
	Double suma = 0.0;
	for (int i = 0; i < notas.size(); i++) {
		suma += notas.get(i);
	}
	return suma/notas.size();
}

//FUNCION PARA SABER SI EL ALUMNO REPRUEBA O APRUEBA 
public static Boolean aprobado(ArrayList<Double> notas, Double notaAprobatoria){
	Double promedio = promedioNotas(notas);
	if(promedio >= notaAprobatoria){
		return true;
	}else{
		return false; 
	}
}

//FUNCION PARA SABER SI EL ALUMNO ESTA POR SOBRE O POR DEBAJO DEL PROMEDIO 
public static void sobrePromedio(Double promedioGeneral, ArrayList<Double> notas, String nombreAlum){
	Double promedioAlumno = promedioNotas(notas);
	if(promedioAlumno>promedioGeneral){
		System.out.println("El alumno "+nombreAlum+" está sobre el promedio");
	}else if(promedioAlumno == promedioGeneral){
		System.out.println("El alumno "+nombreAlum+" es igual al promedio general");
	}else{
		System.out.println("El alumno "+nombreAlum+" está bajo el promedio");
	}
}



public static void main(String[] args) {




//------------------------------------------ EJERCICIO 1 ----------------------------------------------
//1- Escriba un programa que permita imprimir en pantalla cada uno de los elementos del siguiente arreglo [0, 28, 30, 10, 4]:

/*ArrayList <Integer> numeros= new ArrayList<Integer>();

numeros.add(0);
numeros.add(28);
numeros.add(30);
numeros.add(10);
numeros.add(4);*/

//print(numeros);

/*for(int i=0; i< numeros.size(); i++){
	System.out.println("Los numeros del arreglo son: "+ numeros.get(i));
}
*/


//------------------------------------------ EJERCICIO 2 ----------------------------------------------
//2- Escriba un programa que permita imprimir al revés cada uno de los elementos del siguiente arreglo [0, 28, 30, 10, 4]:

/*for(int i=4; i>=0; i--){
	System.out.println("Los numeros al reves del arreglo son: "+ numeros.get(i));
}*/

//printReverse(numeros);


//------------------------------------------ EJERCICIO 3 ----------------------------------------------
//3- Escriba un programa que permita calcular la suma de todos los elementos del siguiente arreglo [1, 3, 6, 82, 23].


/*ArrayList <Integer> numNew= new ArrayList<Integer>();

numNew.add(1);
numNew.add(3);
numNew.add(6);
numNew.add(82);
numNew.add(23);

sumaElementos(numNew);*/


//------------------------------------------ EJERCICIO 4 ----------------------------------------------
//4- Escriba un programa que deduzca e imprima en pantalla el número menor en el siguiente arreglo [90, 1, 38, 0, 29, 4].

/*ArrayList <Integer> numeros2= new ArrayList<Integer>();

numeros2.add(90);
numeros2.add(1);
numeros2.add(38);
numeros2.add(0);
numeros2.add(29);
numeros2.add(4);


numMenor(numeros2);*/


//------------------------------------------ EJERCICIO 5 ----------------------------------------------
//5- Escriba un programa que permita calcular la suma y el producto entre pares de todos los elementos de los siguientes arreglos:    [0, 28, 30, 10, 4] y [1, 3, 6, 82, 23].

/*ArrayList <Integer> array1= new ArrayList<Integer>();
ArrayList <Integer> array2= new ArrayList<Integer>();

array1.add(0);
array1.add(28);
array1.add(30);
array1.add(10);
array1.add(4);

array2.add(1);
array2.add(3);
array2.add(6);
array2.add(82);
array2.add(23);
*/


//------------------------------------------ EJERCICIO 6 ----------------------------------------------
//6- Escriba un programa que lea un arreglo de seis elementos (ingresados por el usuario) e intercambie las posiciones de sus elementos, de tal forma que el primero pase a ser el último y el último el primero, el segundo el penúltimo, y así sucesivamente. Imprima en pantalla el arreglo resultante.




//------------------------------------------ EJERCICIO 7 ----------------------------------------------
//7- Escriba un programa que solicite al usuario el número de alumnos de un curso y cree un arreglo que almacene las notas del control 1 del curso. Luego, imprima en pantalla el promedio de todas las notas y muestre cuáles notas resultaron estar sobre el promedio




//------------------------------------------ EJERCICIO 8 ----------------------------------------------
//Escriba un programa que solicite al usuario el tamaño de un arreglo y un número entero, e imprima en pantalla el resultado de llenar dicho arreglo con los múltiplos del número dado. Por ejemplo, si se define un arreglo de tamaño 5 y se indica el valor 3, el resultado será el arreglo formado por los valores [3, 6, 9, 12, 15]

//DECLARACION DE VARIABLE GLOBALES

/*Scanner teclado = new Scanner(System.in);
String nomAlum = "";
Double notaAprobatoria = 4.0;
HashMap <String, ArrayList<Double>> libroClase = new HashMap<String, ArrayList<Double>>();
int cantAlum;
int cantNotas;

//VALIDACION DE DATOS INGRESADOS POR EL USUARIO 

do{
	System.out.print("Indique la cantidad de alumnos que va a ingresar: ");
	cantAlum = teclado.nextInt();
	if(cantAlum <= 0){
		System.out.print("La cantidad de alumnos debe ser mayor a cero, porfavor intente denuevo");
	}

}while(cantAlum <= 0);

do{
	System.out.print("Indique la cantidad de notas por alumnos: ");
	cantNotas = teclado.nextInt();
	if(cantNotas <= 0){
		System.out.print("La cantidad de notas debe ser mayor a cero, por favor entente mas tarde");
	}
}while(cantNotas <= 0);


//CICLO PARA AGREGAR LOS DATOS AL ARRAY NOTAS Y A SU VEZ AL HASHMAP 

for(int i = 1; i <= cantAlum; i++){
	teclado.nextLine();
	ArrayList <Double> notasAlumnos = new ArrayList<Double>();
	System.out.print("Ingresa nombre del alumno: ");
	nomAlum = teclado.nextLine();
	for(int x = 1; x <= cantNotas; x++){
		System.out.print("Ingresa nota " +x+ " del alumno "+ nomAlum +": ");
		Double nota = teclado.nextDouble();
		notasAlumnos.add(nota);
	}
	libroClase.put(nomAlum, notasAlumnos);

}

//CREACION DEL MENU QUE VA A VER EL USUARIO 

int opcion = 1; 

while(opcion != 0){

	do{
		System.out.println("**************Comienzo de Menú***************");
		System.out.println("Bienvenido/a");
		System.out.println("Seleccione 1 si quiere obtener el promedio de las notas por alumno.");
		System.out.println("Seleccione 2 si quiere ver si el alumno aprueba o reprueba");
		System.out.println("Seleccione 3 para ver si la nota está sobre o por debajo del promedio general");
		System.out.println("Seleccione 0 para salir del menú");
		System.out.print("Seleccione su opción: ");
		opcion = teclado.nextInt();
		
	}while(opcion < 0 || opcion > 3);

	//ACCIONES QUE SE VAN A REALIZAR DEPENDE DE LA OPCION SELECCIONADA POR EL USUARIO 

	if(opcion == 1){
		for(String i : libroClase.keySet()){
			Double promAlum = promedioNotas(libroClase.get(i));
			System.out.println("El promedio del alumno: "+ i +" es de: " + promAlum);
		}
	}else if (opcion == 2){
		for(String i : libroClase.keySet()){
			Boolean aprobar = aprobado(libroClase.get(i), notaAprobatoria);
			if(aprobar){
				System.out.println("El alumno/a "+i+" está aprobado");
			}else{
				System.out.println("El alumno/a "+i+" está reprobado");
			}
			
		}
	}else if(opcion == 3){
		Double sumaPromedio = 0.0;
		for(String i : libroClase.keySet()){
			sumaPromedio = sumaPromedio + promedioNotas(libroClase.get(i));
			
		}
		Double promedioGeneral = sumaPromedio / cantAlum;
		for(String i : libroClase.keySet()){
			sobrePromedio(promedioGeneral, libroClase.get(i), i);
		}
	}else{
		System.out.println("Gracias por cerrar el menú, hasta pronto :D");
	}
teclado.close();

}*/


}
}