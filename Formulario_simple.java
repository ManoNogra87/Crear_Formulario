//crear foremulario en blanco

import javax.swing.*;


//creacion de clase principal, con una herencia de la clase JFrame
public class Formulario_simple extends JFrame{
//se crea el constructor de acceso publico, para el inicio del programa 

  public Formulario_simple(){
    /*activar la manipulacion de las coordenadas de la interfaces
     al ponerlo null, le indicamos que se active pero que espere las indicaciones 
     que se le daran dentro del metodo main */
    setLayout(null);
  }

  //se crea el metodo main 
  public static void main(String args[]){
  /*se crea un objeto para hacer uso de las libreria JFrame
    el objeto se crea de tipo Formulario que es quien esta eredando los metodos de 
     la clase JFrame, se debe crear con el nombre de la misma clase.*/ 
  Formulario_simple formulario1 = new Formulario_simple();
  
  //se manupulan las caracteristicas de la interfas
   //ubicacion del formulario izquierda, alto_en_pantalla, ancho_formulario, altura_formulario
   formulario1.setBounds(0, 0, 0400, 550);
   //hacer visible la interfas
   formulario1.setVisible(true);


  }
}



//la librerya swing nos permite usar interfaces graficas para un programa
//la clase principal-constructor que seria el formulario, debe heredar los metodos y propiedades de la clase
//JFrame, para poder visualizar y proporcionarle las caracteresticas deseadas.
//este constructo debe de ser publico para que el JFrame pueda tener acceso al constructor, y pueda integrar los 
//elementos-objetos necesarios para un programa.
//Para la manupulacion del formulario se crea un objeto del mismo tipo de la clase para que la referencia pueda persistir
//el objeto se crea de tipo Formulario porque esta clase es la que esta heredando los poderes de la clase padre 
//JFrame y es quien tiene el control real del formulario.