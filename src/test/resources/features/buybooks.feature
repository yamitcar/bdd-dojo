#language: es
Característica: Comprar libros sin descuentos
  Como aspirante a mago
  quiero poder comprar los libros de harry potter
  para inspirarme con las historias de este heroe.

  Escenario: comprar 1 libro
    Dado ingreso a la libreria
    Y selecciono 1 libro de "La piedra filosofal"
    Cuando compro mi seleccion de libros
    Entonces veo "Total de su compra: 8 USD"

  Escenario: comprar 2 libro
    Dado ingreso a la libreria
    Y selecciono 1 libro de "La piedra filosofal"
    Y selecciono 1 libro de "La camara secreta"
    Cuando compro mi seleccion de libros
    Entonces veo "Total de su compra: 16 USD"

  Escenario: comprar 5 libro
    Dado ingreso a la libreria
    Y selecciono 1 libro de "La piedra filosofal"
    Y selecciono 1 libro de "La camara secreta"
    Y selecciono 1 libro de "El prisionero de askaban"
    Y selecciono 1 libro de "El caliz de fuego"
    Y selecciono 1 libro de "La orden del fenix"
    Cuando compro mi seleccion de libros
    Entonces veo "Total de su compra: 40 USD"

  Escenario: comprar 17 libro
    Dado ingreso a la libreria
    Y selecciono 3 libro de "La piedra filosofal"
    Y selecciono 5 libro de "La camara secreta"
    Y selecciono 2 libro de "El prisionero de askaban"
    Y selecciono 4 libro de "El caliz de fuego"
    Y selecciono 3 libro de "La orden del fenix"
    Cuando compro mi seleccion de libros
    Entonces veo "Total de su compra: 136 USD"