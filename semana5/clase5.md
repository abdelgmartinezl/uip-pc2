# Clase 5
## Sintaxis Básica
Los programas en Java deben considerar los siguientes puntos:
* _Mayúsculas y minúsculas_: No es lo mismo tener un identificador _Hola_ y _hola_, cada uno tendra un significado diferente.
* _Nombre de clases_: Todas las clases deben tener la primera letra en mayúsculas, ejemplo: Rectangulo. En el caso donde el nombre de la clase tiene varias palabras, la primera letra de cada palabra debe estar en mayúsculas, ejemplo: MiClase.
* _Nombre de métodos_: Todos los nombres de métodos deben iniciar con una letra en minúsculas. Si varias palabras son utilizadas para formar el nombre del método, entonces las palabras siguientes a la primera deben iniciar en mayúsculas, ejemplo: calcularSalario().
* _Nombre del archivo fuente_: El nombre del archivo del programa debe coincidir con el nombre de la clase y terminar con la extensión '.java'.
* _Método principal_: El programa en Java que procesa el método principal del proyecto debe tener la siguiente línea: public static void main(String args[]).
* _Punto y coma_: La mayor parte de las sentencias en Java deben terminar con punto y coma (;). En caso de omitirla, ocurrirá un error de compilación en tu programa.

## Identificadores
Los nombres utilizados para las clases, variables y métodos se conocen como identificadores. Los mismos deben cumplir las siguientes reglas:
* Inician con una letra (a-z o A-Z), un símbolo de dólar ($) o un guión bajo (_).
* Luego del primer caracter se puede tener una combinación de cualquier caracter del punto anterior, incluyendo los números.
* No utilizar las palabras reservadas.
* Recordar la sensibilidad de mayúsculas y minúsculas.

## Modificadores
Existen dos categorías:
* _Modificadores de acceso_: default, public, protected, private.
* _Modificadores de no-acceso_: final, abstract, strictfp.

## Palabras Reservadas
Las palabras reservadas tienen propósitos específicos. No deben ser utilizadas como constantes o variables. La siguiente lista muestra las palabras reservadas en Java:
* abstract
* byte
* class
* do
* extends
* for
* import
* long
* private
* short
* switch
* throws
* volatile
* assert
* case
* const
* double
* final
* goto
* instanceof
* native
* protected
* static
* synchronized
* transient
* while
* boolean
* catch
* continue
* else
* finally
* if
* int
* new
* public
* strictfp
* this
* try
* break
* char
* default
* enum
* float
* implements
* interface
* package
* return
* super
* throw
* void

## Comentarios
Java soporta comentarios de una línea o de múltiples líneas, similar a C. Todos los caracteres dentro de los comentarios serán ignorados por el compilador de Java. Ejemplo:
```java
public class Estudiante {

   /* 
    * Este es un programa sencillo en Java.
    * Autor: Abdel Martinez
    * Esta descripción está en comentarios de varias líneas.
    */

    public static void main(String args[]) {
       // Este es un comentario de una linea
       /* Este es un comentario de una línea */
       System.out.println("Programacion II");
    }	

}
```
