# Crear_Formulario
Código explicado de cómo crear un formulario y tenerlo listo para agregarle cuelquier funcionalidad.

Comentarios generales: La librerya swing nos permite usar interfaces graficas para un programa
la clase principal-constructor que seria el formulario, debe heredar los metodos y propiedades de la clase
JFrame, para poder visualizar y proporcionarle las caracteresticas deseadas.
este constructo debe de ser publico para que el JFrame pueda tener acceso al constructor, y pueda integrar los 
elementos-objetos necesarios para un programa.
Para la manupulacion del formulario se crea un objeto del mismo tipo de la clase para que la referencia pueda persistir
el objeto se crea de tipo Formulario porque esta clase es la que esta heredando los poderes de la clase padre 
JFrame y es quien tiene el control real del formulario.
