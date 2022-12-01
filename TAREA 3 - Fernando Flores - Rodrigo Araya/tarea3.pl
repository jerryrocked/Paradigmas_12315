menu:- write(" Calculadora de Peso ideal y IMC "),nl,
       write("1. Calcular Peso Ideal"),nl,
       write("2. Calcular IMC"),nl,
       write("Seleccione una opcion(0 para salir): "), read(Opcion),
       ejecutar(Opcion).

ejecutar(Opcion):- Opcion == 1, calcular_peso_ideal, menu, nl;
                   Opcion == 2, calcular_imc, menu, nl;
                   Opcion == 0, true.

calcular_peso_ideal:- write("¿Cual es su Altura en cm?"), read(Altura),nl,
                      write("¿Cual es su Edad?"), read(Edad),nl,
                      write("¿Cual es su género? *m o f*"), read(Genero),nl,
                      peso(Altura, Edad, Genero).

peso(Altura, Edad, Genero):- Genero == 'm',calculo_peso_m(Altura,Edad);
                             Genero == 'f',calculo_peso_f(Altura,Edad).

calculo_peso_m(Altura,Edad):- Peso is Altura-100+((Edad/10)*0.9),
                              write("El peso ideal para usted es: "),
                              write(Peso),nl.

calculo_peso_f(Altura,Edad):- Peso is Altura-100+((Edad/10)*0.9),
                              write("El peso ideal para usted es: "),
                              write(Peso),nl.

calcular_imc:- write("¿Cual es su peso en kg?"),read(Peso),nl,
               write("¿Cual es su altura en cm?"),read(Altura),nl,
               ALTURA is Altura/100,
               IMC is Peso/(ALTURA^2),
               ((IMC < 18.5) -> write("Su IMC es de: "),
                                write(IMC),nl,
                                write("Esto indica que usted necesita subir de peso"),nl;
               (IMC >= 18.5, IMC =< 24.9)-> write("Su IMC es de: "),
                                            write(IMC),nl,
                                            write("Esto nos indica que usted se encuentra bien de peso"),nl;
               (IMC >= 25, IMC =<30)-> write("Su IMC es de: "),
                                       write(IMC),nl,
                                       write("Esto nos indica que usted esta con sobrepeso"),nl;
               (IMC >= 30)-> write("Su IMC es de: "),
                             write(IMC),nl,
                             write("Esto nos indica que usted esta en obesidad")).
