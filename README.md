# Lists (ArrayList, HashMaps, LinkedList, HashSet)
Ejemplo aplicando ArrayList, HashMaps, LinkedList, HashSet

##Ejemplo
Siguiendo el ejercicio [Colecciones-Iterador-Sort-Java](https://github.com/Gamis214/Colecciones-Iterador-Sort-Java) a continuacion veremos 
los diferentes tipos de listas que son usados frecuentemente en **JAVA**:
* ArrayList
* LinkedList
* HashSet
* HashMap

###ArrayList
La declaracion de un objeto de la clase **ArrayList**:
```java
List<Integer> lstArrayList = new ArrayList<>();
```
Recordemos que estas listas pueden ser instanciadas por algun dato ya sea **Entero**,**String**,**Boolean** u **Objeto**.

Para agregar datos a nuestro ArrayList se genera de la siguiente manera:
```java
lstArrayList.add(1);
lstArrayList.add(2);
lstArrayList.add(3);
lstArrayList.add(4);
lstArrayList.add(5);
```
Los **ArrayList** son muy utilizados ya que son rapidos para obtener los datos, pero son lentos al borrar y agregar datos.

###LinkedList
La declaracion de un objeto de la clase **LinkedList**:
```java
List<Integer> lstLinkedList = new LinkedList<>();
```
Estas listas pueden ser instanciadas por algun dato ya sea **Entero**,**String**,**Boolean** u **Objeto**.

Para agregar datos a nuestro LinkedList se genera de la siguiente manera:
```java
lstLinkedList.add(1);
lstLinkedList.add(2);
lstLinkedList.add(3);
lstLinkedList.add(4);
lstLinkedList.add(5);
```
Este tipo de listas pueden ser implementadas cuando necesitamos que su rendimiento sea rapido al agregar datos y borrar, ya que es demasiado 
lento para obtener los datos.

###HashSet
La declaracion de un objeto de la clase **HashSet**:
```java
Set<Integer> lstHashSet = new HashSet<>();
```
Estas listas pueden ser instanciadas por algun dato ya sea **Entero**,**String**,**Boolean** u **Objeto**.

Para agregar datos a nuestro HashSet se genera de la siguiente manera:
```java
lstHashSet.add(1);
lstHashSet.add(2);
lstHashSet.add(3);
lstHashSet.add(4);
lstHashSet.add(5);
```
Este tipo de listas no llevan un orden ya que es aleatorio la generacion de los bloques de memoria por lo cual siempre sera Random 
la ubicacion de los datos, pero a su vez permite que los datos no se repitan lo cual omite los demas excepto la original.

###HashMap
La declaracion de un objeto de la clase **HashMap**:
```java
HashMap lstHashMap2 = new HashMap();
```
Estas listas pueden ser instanciadas por algun dato ya sea **Entero**,**String**,**Boolean** u **Objeto**.

Para agregar datos a nuestro HashMap se genera de la siguiente manera teniendo en cuenta:
```java
lstHashMap2.put(1,"A");
lstHashMap2.put(2,"B");
lstHashMap2.put(3,"C");
lstHashMap2.put(4,"D");
lstHashMap2.put(5,"F");
```
Se debe tomar en cuenta que el primer campo es el **KEY** y el segundo es el valor de el.

Este tipo de lista nos permite tener un indice de **KEY** para lo cual acceder mas rapido a ella o buscar si contiene esa key o buscar si contiene el dato a buscar.

