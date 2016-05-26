package main;

/*
 * Enums restringen una variable a tener un número predefinido de valores.
 * El uso de enums ayuda a reducir el número de errores en tu código.
 * Fue introducido en Java 5.
 * Los enums pueden ser declarados en su propia clase (como este ejemplo) o dentro de otra clase.
 */

class Categoria {
	enum CategoriaTipo{ CHICO, MEDIANO, GRANDE }
	CategoriaTipo tipo;
}
