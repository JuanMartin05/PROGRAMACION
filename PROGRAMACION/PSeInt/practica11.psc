Algoritmo sin_titulo
	Escribir "¿cuantos zapatos vas a comprar?"
	Leer zapatos
	si zapatos<=10 Entonces
		preciozapatos<-zapatos*80 
		rebaja<-10/100
		rebaja2<-rebaja*preciozapatos
		total<-preciozapatos-rebaja2
		Escribir "el precio es de=" total
	FinSi
	si zapatos>10 y zapatos<=30 Entonces
		preciozapatos<-zapatos*80 
		rebaja<-20/100
		rebaja2<-rebaja*preciozapatos
		total<-preciozapatos-rebaja2
		Escribir "el precio es de=" total
	FinSi
	si zapatos>30 Entonces
		preciozapatos<-zapatos*80 
		rebaja<-40/100
		rebaja2<-rebaja*preciozapatos
		total<-preciozapatos-rebaja2
		Escribir "el precio es de=" total
	FinSi
FinAlgoritmo
