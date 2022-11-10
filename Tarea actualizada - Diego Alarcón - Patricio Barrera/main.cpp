#include <iostream>
#include "Figuras.h"

using namespace std;

int main(){
    vredimensiona(1080,720);
    char opcion;
    Rectangulo rec;
    Cuadrado cuad;
    Elipse elip;
    Circulo cir;

    cout<<"##### ELECCION DE FIGURA ##########\n ";                           //MENU
    cout<<"\n1. RECTANGULO ";
    cout<<"\n2. ELIPSE ";
    cout<<"\n3. CUADRADO ";
    cout<<"\n4. CIRCULO ";
    cout<<'\n';
    cout<<"\nIngrese el numero de la forma segun corresponda: ";
    cin >> opcion;cout<<endl;

switch (opcion){
    case '1':
        rec.agregarRect();
        rec.perimetroRect();
        rec.areaRect();
        rec.imprimir();
        break;
    case '2':
        elip.agregarElipse();
        elip.areaElipse();
        elip.imprimir();
        break;
    case '3':
        cuad.agregarCuadrado();
        cuad.perimetroCuad();
        cuad.areaCuad();
        cuad.imprimir();
        break;
    case '4':
        cir.agregarCirculo();
        cir.areaCirculo();
        cir.imprimir();
        break;
    default:
         cout<<"\nError! Ingrese un numero valido....\n\n" ;
         main();
    }

}



