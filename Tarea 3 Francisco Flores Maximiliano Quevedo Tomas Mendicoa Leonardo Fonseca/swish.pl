menu:- write('IMC'),nl,
    write('1.IMC ideal'),nl,
    write('2.calcular mi IMC'),nl,
    write('0.salir'),read(Opcion),ejecutar(Opcion).

ejecutar(Opcion):-
    Opcion==1, leeAltura(A),leeEdad(E),leeSexo(S), ideal(A,E), menu;
    Opcion==2, leeAltura(A), leePeso(P),leeSexo(S),calcularIMC(P,A), menu;
    Opcion==0, true.
leeAltura(A):-write('ingrese su altura(cm):'),read(A),number(A).
leePeso(P):-write('ingrese su peso:'),read(P),number(P).
leeEdad(E):-write('ingrese su edad:'),read(E),number(E).
leeSexo(S):-write('ingrese su sexo [m/f]:'),read(S).
ideal(A,E) :-
   PI is A-100+((E/10)*0.9),
   write('peso ideal: '), write(PI), nl.
calcularIMC(P,A) :-
    Par is A/100, Imc is P/(Par*Par),
    write('El IMC es: '), write(Imc), nl,
    tuIMC(Imc).
tuIMC(Imc) :-
    (Imc<18.5,write('estás por debajo de tu peso ideal, por tanto, te iría bien ganar algo de peso.'),nl);
    (Imc>=18.5,Imc=<24.9,write('estás por debajo de tu peso ideal, por tanto, te iría bien ganar algo de peso.'),nl);
    (Imc>=25,Imc=<30,write('estás en ligero sobrepeso, tendrías que adelgazar entre 2 a 5 kilos para estar más sano.'),nl);
    (Imc>30,write('hablamos de que estás en sobrepeso más severo o, incluso, en obesidad. Es importante que, por motivos de salud, comiences a cambiar tus hábitos y a apostar por una vida más saludable y baja en calorías.'),nl).