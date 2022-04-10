# palindromo
paso 2:
2.1: 
el metodo recive un String, luego asigna una variable local, luego igualara esta variable al String recibido pero invertido
luego de eso compara el variable con el String y si son     iguales retorna un true y si no un false.

paso 3:
3.2 casos de prueba implementar: 
1-una palabra que sea palindromo: 

2- Palabra con números: 

3- Palabras con mayúsculas entre medio

4- Palabras que sabemos que no son palindromos

5- Espacio en blanco

3.4: los resultados obtenidos son
aca: true

acas :false

h: true

Paso 4.1

En el caso 1 debería dar false

En el caso 2 debería dar true

En el caso 3 debería dar true

En el caso 4 debería dar false

En el caso 5 debería dar true

Paso 4.2

Para construir el código tomamos en cuenta que el usuario puede ingresar letras mayúsculas de forma arbitraria y también el hecho de que se pueden ingresar espacios en cualquier parte.
Lo que mejoró de nuestro método es que hacemos la validación de entrada, es decir, que solo se puedan ingresar palabras.
Con las pruebas unitarias nos dimos cuenta que debíamos controlar la entrada en el caso de que el usuario ingresara una cadena vacía, ya que conceptualmente, no tiene sentido que “nada“ sea un palíndromo.
