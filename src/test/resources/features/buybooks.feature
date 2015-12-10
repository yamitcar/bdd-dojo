#language: es
Característica: Comprar libros sin descuentos
  Como aspirante a mago
  quiero poder comprar los libros de harry potter
  para inspirarme con las historias de este heroe.

  Escenario: comprar 1 libro
    Dado ingreso a la libreria
    Cuando compro un libro
    Entonces veo el mensaje "Bienvenido a Flourish y Blotts"
