/*
En Java realizar lo siguiente. En una relacion de Herencia tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. La clase
Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego
un mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice
lo siguiente: 

public static void main(String[] args) {
       
        //Declaracion del objeto perro
        Animal perro = new perro ("Stich", "Carnivoro", 15, "Doberman");
        perro.Añomentarse();
        //Declaracion del otro objeto perro
        Perro perro1 = new Perro ("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.Alimentarse();
        
        //Declaracion del objeto gato
        Animal gato = new Gato ("Pelusa", "Galletas", 15, "Sianes");
        gato.Alimentarse();
        //Declaracion del objeto caballo
        Animal caballo = new Caballo ("Spark", "Pasto", 25, "Fino");
        caballo.Alimentarse();
    }
}
*/

package guia4ejer1;


public class Guia4Ejer1 {

    
    public static void main(String[] args) {
       
        //Declaracion del objeto perro
        Animal perro1 = new Perro ("Stich", "Carne", 15, "Doberman");
        perro1.Alimentarse();
        //Declaracion del otro objeto perro
        Animal perro2 = new Perro ("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.Alimentarse();
        
        //Declaracion del objeto gato
        Animal gato = new Gato ("Pelusa", "Galletas", 15, "Sianes");
        gato.Alimentarse();
        //Declaracion del objeto caballo
        Animal caballo = new Caballo ("Spark", "Pasto", 25, "Fino");
        caballo.Alimentarse();
    }
}
