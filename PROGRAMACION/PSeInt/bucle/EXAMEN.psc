Algoritmo Ejercicio2
		Definir num1,num2, suma, i Como Entero
		Escribir "Introduzca un número: "
		Leer num1
		Escribir "Introduzca otro número:"
		Leer num2
		suma1 <- 0
		suma2 <-0
		Escribir "Los divisores propios de ", num1 ," son: "Sin Saltar
		Para i <- 1 Hasta num1/2 Con Paso 1 Hacer
			Si num1 % i = 0 Entonces
				Escribir  i "," " " Sin Saltar
				suma1 <- suma1 + i
			FinSi
		FinPara
		escribir  " Y la suma de los divisores propios es: ", suma1
		
		Escribir "Los divisores propios de ", num2 ," son: "Sin Saltar
		Para i <- 1 Hasta num2/2 Con Paso 1 Hacer
			Si num2 % i = 0 Entonces
				Escribir  i "," " " Sin Saltar
				suma2 <- suma2 + i
			FinSi
		FinPara
		escribir  " Y la suma de los divisores propios es: ", suma2
		si suma1=num2 y suma2=num1 Entonces
			Escribir "Los dos números Sí son amigos" 
		FinSi
FinAlgoritmo

