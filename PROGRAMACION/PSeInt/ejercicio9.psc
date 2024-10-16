Algoritmo sin_titulo
	Escribir "dame 3 numeros diferente , dame el primero"
	Leer num1
	Escribir "dame el segundo"
	Leer num2
	Escribir "dame el tercero"
	Leer num3
	si num1=num2 y num2=num3 Entonces
		Escribir "los numeros son iguales"
	FinSi
	si num1>num2 y num2>num3 Entonces
		Escribir "el orden es" 
		escribir"primer numero=" num1
		Escribir "segundo numero=" num2
		Escribir "tercer numero=" num3
		
	FinSi
	si num2>num1 y num1>num3 Entonces
		Escribir "el orden es" 
		escribir"primer numero=" num2
		Escribir "segundo numero=" num1
		Escribir "tercer numero=" num3
		
	FinSi
	si num3>num1 y num1>num2 Entonces
		Escribir "el orden es" 
		escribir"primer numero=" num3
		Escribir "segundo numero=" num1
		Escribir "tercer numero=" num2
	FinSi
	si num1>num3 y num3>num2 Entonces
		Escribir "el orden es" 
		escribir"primer numero=" num1
		Escribir "segundo numero=" num3
		Escribir "tercer numero=" num2
	FinSi
	si num2>num3 y num3>num1 Entonces
		Escribir "el orden es" 
		escribir"primer numero=" num2
		Escribir "segundo numero=" num3
		Escribir "tercer numero=" num1
	FinSi
	si num3>num2 y num2>num1 Entonces
		Escribir "el orden es" 
		escribir"primer numero=" num3
		Escribir "segundo numero=" num2
		Escribir "tercer numero=" num1
	FinSi
FinAlgoritmo
