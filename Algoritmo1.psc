Algoritmo pseudocodigoEjercicio1
	
	Definir number, random, result Como Entero
	
	Escribir "Ingresa un numero"
	Leer number
	
	Para i <- 0 Hasta number Con Paso 1 Hacer
		random = azar(100)
		result = random % 2
		
		si result = 0 Entonces
			Escribir ""
			
		SiNo
			
		FinSi
		
	Fin Para
	
	
FinAlgoritmo