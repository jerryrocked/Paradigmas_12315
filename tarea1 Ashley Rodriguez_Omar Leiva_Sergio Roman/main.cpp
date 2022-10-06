/*
Ashley Rodriguez 25995896-2
Omar Leiva       20189017-9
Sergio Roman     20677171-2
*/
#include <iostream>
#include "forma.h"
using namespace std;

int main(){
    vredimensiona(1980,1080);
    Forma f;
    Rectangulo r;
    Elipse e;
    Cuadrado c;
    Circulo s;
    int seleccionar;

        cout<<"    ~MENU~ \n1. RECTANGULO\n2. ELIPSE\n3. CUADRADO\n4. CIRCULO  ";
        cout<<"\nEscriba el numero de la forma que prefiera: ";
        cin >> seleccionar;cout<<endl;

        if ((seleccionar < 0) || (seleccionar > 4)){
            cout<<"\nno valido\n\n";
            main();
        }
        else if (seleccionar == 1){
            r.agregar_rec();
            r.cal_perimetro();
            r.cal_area();
            r.mod_rec();
            r.imp_rec();
        }
        else if (seleccionar == 2){
            e.agregar_elip();
            e.area_elip();
            e.mod_elip();
            e.imp_elip();
        }
        else if (seleccionar == 3){
          c.agregar_cuad();
          c.perimetro_cuad();
          c.area_cuad();
          c.mod_cuad();
          c.imp_cuad();
        }
        else if (seleccionar == 4){
            s.agregar_cir();
            s.area_cir();
            s.mod_cir();
            s.imp_cir();
        }
    return 0;
};













