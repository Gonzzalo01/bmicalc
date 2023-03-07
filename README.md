![example workflow](https://github.com/jmhorcas/bmicalc/actions/workflows/maven.yml/badge.svg)

# BMI calculator
A biomedical calculator for the body mass index (BMI) and other parameters.

Test catValNormalesTest: 
	-Hacemos un bucle recorriendo una lista donde he incluido unos valores con un cierto orden para que se puedan probar en el método category.

Test catValLimite:
	-Volvemos a usar un bucle para recorrer otra lista con los valores añadidos, siendo estos valores más especificos para intentar buscar el error, por ejemplo el 24.99
	
Test cateLimit2: 
	-En una lista guardamos unos valores que deberian lanzar una excepcion, por lo que con un bucle y la lista comprobamos que se cumple el lanzamiento de la excepcion esperada.
	

Test bmiTest:
	-Declaro dos listas una con valores de masa y otra con valores de altura. Creo un bucle for que recorra la lista y compruebe paso a paso que se comprueba la condicion del assertEqual.
	
Test bmiLimitTest:
	-Hacemos un test que confirme que se ejecuta la excepcion. Para ello creamos 2 listas de valores donde vamos a poner a prueba parte del código. En caso de que no se lance la excepcion saldra un fail() que hara que el test falle
	
Test bmiLimitTest2:
	-Igual que el test anterior. Simplemente cambian los valores dentro de las listas.
	
Test abdObT1:
	-Este test junto al siguiente estan compuestos de la misma forma. Un bucle for que recorre parte de la array con los datos seleccionados manualmente en funcion de cuan probable es que tiendan a dar error en el código y otro bucle for que hace lo mismo que el anterior pero con las mujeres. En este test comprobamos que al darle ciertos valores tanto hombres como mujeres salgan que son obesos, con datos que si son.
	
Test abdObT2:
	-Este test esta formado igual que el anterior la única diferencia es que comprobamos el funcionamiento de este introduciendo valores que deberian ser falsos a la hora de hablar si el paciente está obeso.
	

![doc/Model.jgp] (https://github.com/Gonzzalo01/bmicalc/blob/main/doc/Model.jpg)
 


