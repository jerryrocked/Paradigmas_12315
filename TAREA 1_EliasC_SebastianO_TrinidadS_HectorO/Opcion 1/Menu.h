#include <iostream>
#include "miniwin.h"
#include "Forma.h"
#include <cmath>
using namespace miniwin;
using namespace std;
int radio_men, radio_may;
int opcion, col, figura,x= 0,y= 0, centro;
void menu(){
while (opcion!=5){
    cout<<"\tMenu de opciones"<<endl;
    cout<<"1. Escoger color:"<<endl;
    cout<<"2. Posicion de forma"<<endl;
    cout<<"3. Dibujar forma:"<<endl;
    cout<<"4. Limpiar pantalla"<<endl;
    cout<<"5. Salir"<<endl;
    cin>>opcion;
    system("cls");

    switch(opcion){
    case 1: cout<<"Colores disponibles:"<<endl;
            cout<<"1. Negro\n 2. Rojo\n 3. Verde\n 4. Azul\n 5. Amarillo\n 6. Magenta\n 7. Cyan\n 8. Blanco\n"<<endl;
            cout<<"Ingrese el numero del color escogido"<<endl;
            cin>>col;
            color(col-1);
            system("cls");
            break;
    case 2: cout<<"Escoga la posicion X: "<<endl;
            cin>>x;
            cout<<"Escoga la posicion Y: "<<endl;
            cin>>y;
            system("cls");
            break;
    case 3: cout<<"\nFormas disponibles:"<<endl;
            cout<<"1. Rectangulo, 2. elipse, 3. cuadrado, 4. ciruclo"<<endl;
            cout<<"Ingrese el numero de la figura: "<<endl;
            cin>>figura;
            switch(figura){
                case 1:cout<<"\n\tEste es un rectangulo\n"<<endl;
                rectangulo(x/2,y/2,x*2,y*2);
                refresca();
                punto(x,y);
                refresca();
                cout<<"Hola"<<endl;
                break;

                case 2: cout<<"\n\tEsto es una elipse\n"<<endl;
                cout<<"Ingrese el radio menor: "<<endl;
                cin>>radio_men;
                circulo(x,y,radio_men);
                refresca();
                cout<<"Ingrese el radio mayor: "<<endl;
                cin>>radio_may;
                circulo(x,y,radio_may);
                refresca();
                system("cls");
                break;

                case 3: cout<<"\n\tEsto es un cuadrado \n"<<endl;
                cout<<"Ingrese el lado: "<<endl;
                rectangulo(x,y,x*2,y*2);
                refresca();
                cout<<"Hola"<<endl;
                break;
            }
    case 4: borra();
            refresca();
            break;
    //case 5:
    //default:

    }

    }
}
