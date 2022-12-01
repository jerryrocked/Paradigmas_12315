main :-
    pedir_datos(E,P,A,S),
    mostrar_menu(E,P,A,S).

pedir_datos(E,P,A,S) :-
    write('Indique su edad:'), read(E),
    write('Indique su peso kg:'), read(P),
    write('Indique su altura cm:'), read(A),
    write('Indique su genero m o f:'), read(S).


mostrar_menu(E,P,A,S) :-
    nl,write(' ######## MENÚ ######### '),nl,
    write('1)  Peso ideal'), nl,
    write('2)  IMC'), nl,
    write('3) Salir'), nl,
    write('######################## '),nl,
    write('Indique opcion: '),
    
    read(Opcion), iniciar(Opcion,E,P,A,S).

iniciar(Opcion,E,P,A,S):-
    Opcion == 1, pesoRecomendado(A,P,S), peso_ideal(A,E), mostrar_menu(E,P,A,S);
    Opcion == 2, calcular_IMC(P,A), mostrar_menu(E,P,A,S);
    Opcion == 3, write(' Fin del programa '),nl.


pesoRecomendado(A, P, m):-
    ((A<156; A>191), Pmin = 0, Pmax = 0;
    (A>=156, A<158), Pmin = 59, Pmax = 64;
    (A>=158, A<161), Pmin = 60, Pmax = 65;
    (A>=161, A<164), Pmin = 61, Pmax = 65;
    (A>=164, A<166), Pmin = 62, Pmax = 67;
    (A>=166, A<169), Pmin = 63, Pmax = 68;
    (A>=169, A<171), Pmin = 64, Pmax = 70;
    (A>=171, A<174), Pmin = 65, Pmax = 71;
    (A>=174, A<176), Pmin = 67, Pmax = 72;
    (A>=176, A<179), Pmin = 68, Pmax = 74;
    (A>=179, A<181), Pmin = 70, Pmax = 75;
    (A>=181, A<184), Pmin = 71, Pmax = 77;
    (A>=184, A<185), Pmin = 72, Pmax = 79;
    (A>=185, A<187), Pmin = 74, Pmax = 80;
    (A>=187, A<190), Pmin = 75, Pmax = 82;
    (A>=190, A=<191), Pmin = 77, Pmax = 85),
    mostrar_peso_recomendado(P, Pmin, Pmax).


pesoRecomendado(A, P, f):-
    ((A<144; A>183), Pmin = 0, Pmax = 0;
    (A>=144, A<148), Pmin = 49, Pmax = 55;
    (A>=148, A<150), Pmin = 50, Pmax = 56;
    (A>=150, A<153), Pmin = 51, Pmax = 57;
    (A>=153, A<156), Pmin = 52, Pmax = 59;
    (A>=156, A<158), Pmin = 54, Pmax = 60;
    (A>=158, A<161), Pmin = 55, Pmax = 61;
    (A>=161, A<164), Pmin = 56, Pmax = 63;
    (A>=164, A<166), Pmin = 58, Pmax = 64;
    (A>=166, A<169), Pmin = 59, Pmax = 65;
    (A>=169, A<171), Pmin = 60, Pmax = 67;
    (A>=171, A<174), Pmin = 62, Pmax = 68;
    (A>=174, A<176), Pmin = 63, Pmax = 70;
    (A>=176, A<179), Pmin = 60, Pmax = 71;
    (A>=179, A<181), Pmin = 66, Pmax = 72;
    (A>=181, A=<183), Pmin = 67, Pmax = 74),
    mostrar_peso_recomendado(P, Pmin, Pmax).

mostrar_peso_recomendado(P, Pmin, Pmax) :-
    Pmin==Pmax, write('\nSu estatura no se encuentra registrada en la tabla de pesos recomendados.'), nl, !;

    P>=Pmin, P=<Pmax, write('\nUsted se encuentra en su peso recomendado ('),
    write(Pmin), write(' - '), write(Pmax), write(' Kg).'),nl;

    P<Pmin, write('\nUsted se encuentra por debajo de su peso recomendado ('),
    write(Pmin), write(' - '), write(Pmax), write(' Kg).'),nl;

    P>Pmax, write('\nUsted se encuentra por encima de su peso recomendado ('),
    write(Pmin), write(' - '), write(Pmax), write(' Kg).'),nl.

peso_ideal(A,E) :-
   PI is A-100+((E/10)*0.9),
   write('\nsu peso ideal es '), write(PI), write(' Kg.'), nl.


calcular_IMC(P,A) :-
    Ametros is A/100, IMC is P/(Ametros*Ametros),
    write('Su IMC es: '), write(IMC), nl,
    tipo_IMC(IMC).

tipo_IMC(IMC) :-
    (IMC<18.5,write('Estas por debajo de tu peso ideal, por tanto, te iria bien ganar algo de peso.'),nl);
    (IMC>=18.5,IMC=<24.9,write('Felicidades porque estas en tu peso ideal, no tienes ni que subir ni que bajar.'),nl);
    (IMC>=25,IMC=<30,write('Estas en ligero sobrepeso, tendrias que adelgazar entre 2 a 5 kilos para estar mas sano'),nl);
    (IMC>30,write('Estas en sobrepeso mas severo o, incluso, en obesidad. Es importante que, por motivos de salud, comiences a cambiar tus habitos y a apostar por una vida mas saludable y baja en calorias'),nl).