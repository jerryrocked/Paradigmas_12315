/* ------------------------------------
 * DESCRIPCIÓN DE VARIABLES Y TÉRMINOS:
 * ------------------------------------
 * E: Edad
 * P: Peso
 * A: Altura
 * S: Sexo
 * Pmin: Peso recomendado mínimo
 * Pmax: Peso recomendado máximo
 * PI: Peso ideal
 * Ametros: Altura en metros
 * IMC: Indice de masa corporal
 * ------------------------------------
 * m: masculino
 * f: femenino
 * ------------------------------------
 */

/* Se encarga de iniciar el programa,ejecuta la cláusula 'pedirDatos' y
 * luego ejecuta la regla 'menu'.
 */
iniciar :-
    pedirDatos(E,P,A,S),
    menu(E,P,A,S).

/* Solicita por teclado los datos de edad, peso, altura y genero.
 */
pedirDatos(E,P,A,S) :-
    write('Ingrese su edad: '), read(E),
    write('Ingrese su peso (kg): '), read(P),
    write('Ingrese su altura (cm): '), read(A),
    write('Ingrese su genero (m/f): '), read(S).

/* Muestra el menu principal, solicita una opción por teclado
 * y la ejecuta.
 */
menu(E,P,A,S) :-
    nl,write('**** MENU ****'),nl,
    write('1. Calcular el peso ideal'), nl,
    write('2. Calcular el IMC'), nl,
    write('3. salir'), nl,
    write('Ingrese opcion: '),
    read(Opcion), ejecutar(Opcion,E,P,A,S).

/* Al ingresar la opción 3 en el menú principal pregunta si realmente quiere salir
 * o quiere calcular otra persona, pide una opción por teclado y la ejecuta.
 */
confirmarSalida :-
    write('\n¿Esta seguro de que quiere salir?:'),nl,
    write('1. Calcular otra persona'),nl,
    write('2. Salir'), nl,
    write('Ingrese opcion: '), read(Opcion), ejecutar(Opcion).

/* Ejecuta las clausulas correspondientes a la opción ingresada en el menu principal.
 */
ejecutar(Opcion,E,P,A,S):-
    Opcion == 1, pesoRecomendado(A,P,S), pesoIdeal(A,E), menu(E,P,A,S);
    Opcion == 2, calcularIMC(P,A), menu(E,P,A,S);
    Opcion == 3, confirmarSalida, !.

/* Ejecuta las clausulas correspondientes a la opción ingresada en el menú de confirmación
 * de salida.
 */
ejecutar(Opcion):-
    Opcion == 1, iniciar, !;
    Opcion == 2, write('Fin del programa'),nl, !, false.

/* Recibe como parámetros la altura, cuando el sexo es masculino,
 * Si los datos no se encuentran en la tabla, el peso recomendado minimo
 * y máximo almacenan 0, si se encuentran en la tabla, el peso recomendado
 * minimo y máximo almacenan los valores correspondientes. Finalmente pasa los
 * parametros de peso, pesos recomendados a la clausula 'mostrarPesoRecomendado'.
 */
pesoRecomendado(A, P, m):-
    ((A<156; A>191), Pmin is 0, Pmax is 0;
    A>=156, A<158, Pmin is 59, Pmax is 64;
    A>=158, A<161, Pmin is 60, Pmax is 65;
    A>=161, A<164, Pmin is 61, Pmax is 65;
    A>=164, A<166, Pmin is 62, Pmax is 67;
    A>=166, A<169, Pmin is 63, Pmax is 68;
    A>=169, A<171, Pmin is 64, Pmax is 70;
    A>=171, A<174, Pmin is 65, Pmax is 71;
    A>=174, A<176, Pmin is 67, Pmax is 72;
    A>=176, A<179, Pmin is 68, Pmax is 74;
    A>=179, A<181, Pmin is 70, Pmax is 75;
    A>=181, A<184, Pmin is 71, Pmax is 77;
    A>=184, A<185, Pmin is 72, Pmax is 79;
    A>=185, A<187, Pmin is 74, Pmax is 80;
    A>=187, A<190, Pmin is 75, Pmax is 82;
    A>=190, A=<191, Pmin is 77, Pmax is 85),
    mostrarPesoRecomendado(P, Pmin, Pmax).

/* Recibe como parámetros la altura, cuando el sexo es femenino,
 * Si los datos no se encuentran en la tabla, el peso recomendado minimo
 * y máximo almacenan 0, si se encuentran en la tabla, el peso recomendado
 * minimo y máximo almacenan los valores correspondientes. Finalmente pasa los
 * parametros de peso, pesos recomendados a la clausula 'mostrarPesoRecomendado'.
 */
pesoRecomendado(A, P, f):-
    ((A<144; A>183), Pmin is 0, Pmax is 0;
    A>=144, A<148, Pmin is 49, Pmax is 55;
    A>=148, A<150, Pmin is 50, Pmax is 56;
    A>=150, A<153, Pmin is 51, Pmax is 57;
    A>=153, A<156, Pmin is 52, Pmax is 59;
    A>=156, A<158, Pmin is 54, Pmax is 60;
    A>=158, A<161, Pmin is 55, Pmax is 61;
    A>=161, A<164, Pmin is 56, Pmax is 63;
    A>=164, A<166, Pmin is 58, Pmax is 64;
    A>=166, A<169, Pmin is 59, Pmax is 65;
    A>=169, A<171, Pmin is 60, Pmax is 67;
    A>=171, A<174, Pmin is 62, Pmax is 68;
    A>=174, A<176, Pmin is 63, Pmax is 70;
    A>=176, A<179, Pmin is 60, Pmax is 71;
    A>=179, A<181, Pmin is 66, Pmax is 72;
    A>=181, A=<183, Pmin is 67, Pmax is 74),
    mostrarPesoRecomendado(P, Pmin, Pmax).

/* Recibe como parametro el peso de la persona, su peso recomendado minimo y maximo,
 * imprime por pantalla si sus valores a solicitar no se encuentran en la tabla o si esta en su peso ideal o no.
 */
mostrarPesoRecomendado(P, Pmin, Pmax) :-
    Pmin==Pmax, write('\nSu estatura no se encuentra registrada en la tabla de pesos recomendados.'), nl, !;

    P>=Pmin, P=<Pmax, write('\nSegun la tabla de pesos recomendados usted se encuentra en su peso recomendado ('),
    write(Pmin), write(' - '), write(Pmax), write(' Kg).'),nl;

    P<Pmin, write('\nSegun la tabla de pesos recomendados usted se encuentra por debajo de su peso recomendado ('),
    write(Pmin), write(' - '), write(Pmax), write(' Kg).'),nl;

    P>Pmax, write('\nSegun la tabla de pesos recomendados usted se encuentra por encima de su peso recomendado ('),
    write(Pmin), write(' - '), write(Pmax), write(' Kg).'),nl.

/* Recibe como parametro la altura y edad de la persona, y calcula su peso ideal con la fórmula de Perrault Dry,
 * luego lo imprime por pantalla.
 */
pesoIdeal(A,E) :-
   PI is A-100+((E/10)*0.9),
   write('\nSegun la formula de Perrault Dry su peso ideal es '), write(PI), write(' Kg.'), nl.

/* Recibe como parametros el peso y la altura de la persona, transforma la altura de centimetros a metros, y calcula el
 * indice de masa corporal(IMC), lo imprime por pantalla y llama a la clausula tipoIMC.
 */
calcularIMC(P,A) :-
    Ametros is A/100, IMC is P/(Ametros*Ametros),
    write('Su indice de masa corporal (IMC) es: '), write(IMC), nl,
    tipoIMC(IMC).

/* Recibe como parametro el IMC de la persona, y muestra por pantalla si está por debajo de su peso ideal, si está en su peso ideal,
 * si está en un ligero sobrepeso, o si está en un sobrepeso severo.
 */
tipoIMC(IMC) :-
    (IMC<18.5,write('Estas por debajo de tu peso ideal, por tanto, te iria bien ganar algo de peso.'),nl);
    (IMC>=18.5,IMC=<24.9,write('Felicidades porque estas en tu peso ideal, no tienes ni que subir ni que bajar.'),nl);
    (IMC>=25,IMC=<30,write('Estas en ligero sobrepeso, tendrias que adelgazar entre 2 a 5 kilos para estar mas sano'),nl);
    (IMC>30,write('Estas en sobrepeso mas severo o, incluso, en obesidad. Es importante que, por motivos de salud, comiences a cambiar tus habitos y a apostar por una vida mas saludable y baja en calorias'),nl).

