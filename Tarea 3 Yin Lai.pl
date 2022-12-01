menu:- write('IMC'),nl,
    write('1.IMC ideal'),nl,
    write('2.calcular mi IMC'),nl,
    write('0.salir'),read(Opcion),ejecutar(Opcion).

ejecutar(Opcion):-
    Opcion==1, leeAltura(A),leeEdad(E),leeGenero(G), ideal(A,E), menu;
    Opcion==2, leeAltura(A),leePeso(P),leeGenero(G),calcularIMC(P,A), menu;
    Opcion==0, true.
leeAltura(A):-write('ingrese su altura(cm):'),read(A),number(A).
leePeso(P):-write('ingrese su peso:'),read(P),number(P).
leeEdad(E):-write('ingrese su edad:'),read(E),number(E).
leeGenero(G):-write('ingrese su sexo [h/m]:'),read(G).
ideal(A,E) :-
   PI is A-100+((E/10)*0.9),
   write('peso ideal: '), write(PI), nl.
calcularIMC(P,A) :-
    Par is A/100, Imc is P/(Par*Par),
    write('El IMC es: '), write(Imc), nl,
    tuIMC(Imc).
tuIMC(Imc) :-
    (Imc<18.5,write('Estas en bajo peso.'),nl);
    (Imc>=18.5,Imc=<24.9,write('Estas bien equilibrado, sigue así.'),nl);
    (Imc>=25,Imc=<30,write('Estas a punto de tener sobre peso'),nl);
    (Imc>30,write('estas en sobre peso.'),nl).