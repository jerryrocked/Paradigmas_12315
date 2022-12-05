menu:- write('Peso Ideal e IMC'),nl,
    write('0.- Salir'),nl,
    write('1.-Calcular el peso ideal'),nl,
    write('2.-Calcular el IMC'),nl,
    write('Opcion: '),read(Opcion),
    ejecutar(Opcion).

ejecutar(Opcion):- Opcion== 1, peso, menu;
    Opcion== 2, imc, menu;
    Opcion== 0, false.

peso:- write('Escriba su altura en cm: '),read(A),
    write('Escriba su edad: '),read(E),
    write('Escriba su Genero (1:Hombre, 2:Mujer): '),read(G),
    PI is ((A-100)+((E/10)*(0.9))),
    write('Tu peso ideal es: '),write(PI),nl,
    G==1, PIh(A, G, PI); G==2, PIm(A, G, PI).

PIh(A, G, PI):-
    G=1,A>=156,A=<157,PI>=59,PI<=64,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=1,A>=158,A=<160,PI>=60,PI<=65,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=1,A>=161,A=<163,PI>=61,PI<=65,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=1,A>=164,A=<165,PI>=62,PI<=67,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=1,A>=166,A=<168,PI>=63,PI<=68,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=1,A>=169,A=<170,PI>=64,PI<=70,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=1,A>=171,A=<173,PI>=65,PI<=71,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=1,A>=174,A=<175,PI>=67,PI<=72,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=1,A>=176,A=<178,PI>=68,PI<=74,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=1,A>=179,A=<180,PI>=70,PI<=75,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=1,A>=181,A=<183,PI>=71,PI<=77,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=1,A>=184,A=<185,PI>=72,PI<=79,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=1,A>=185,A=<187,PI>=74,PI<=80,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=1,A>=187,A=<189,PI>=75,PI<=82,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=1,A>=190,A=<191,PI>=77,PI<=85,write('Estas en tu peso ideal segun Perrault Dry'),nl.

PIm(A, G, PI):-
    G=2,A>=144,A=<147,PI>=49,PI<=55,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=2,A>=148,A=<150,PI>=50,PI<=56,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=2,A>=150,A=<152,PI>=51,PI<=57,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=2,A>=153,A=<155,PI>=52,PI<=59,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=2,A>=156,A=<157,PI>=54,PI<=60,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=2,A>=158,A=<160,PI>=55,PI<=61,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=2,A>=161,A=<163,PI>=56,PI<=63,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=2,A>=164,A=<165,PI>=58,PI<=64,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=2,A>=166,A=<168,PI>=59,PI<=65,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=2,A>=169,A=<170,PI>=60,PI<=67,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=2,A>=171,A=<173,PI>=62,PI<=68,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=2,A>=174,A=<175,PI>=63,PI<=70,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=2,A>=176,A=<178,PI>=60,PI<=71,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=2,A>=179,A=<180,PI>=66,PI<=72,write('Estas en tu peso ideal segun Perrault Dry'),nl,
    G=2,A>=181,A=<183,PI>=67,PI<=74,write('Estas en tu peso ideal segun Perrault Dry'),nl.

imc:- write('Escriba su peso: '),read(Peso),
    write('Escriba su altura (cm): ')read(Altura),
    IMC is (Peso/((Altura/100)*(Altura/100))),
    write('Su IMC es: '),write(IMC),nl,
    reglas(IMC).

reglas(IMC):-
    IMC<18.5,write('Estas por debajo de tu peso ideal, por lo tanto, te iria bien ganar un poco de peso'),nl;
    IMC>=18.5,IMC=<24.9, write('Felicidades, estas en tu peso ideal!'),nl;
    IMC>=25,I=<30, write('Estas un poco sobre tu peso, intenta bajar un poco'),nl;
    IMC>=30,write('Estas sobrepeso, ten mucho cuidado. Es importante que vayas a ver a un medico'),nl;
    