#include <iostream>
#include "figura.h"

using namespace std;

string name, col;
int coorX, coorY;
double rad, rad1, rad2, lad, lad1, lad2;
int N;
char opcion;

void solicitarDatosFigura(){
    cout << "Ingrese nombre: ";
    cin >> name;

    cout << "Ingrese color: ";
    cin >> col;

    cout << "Ingrese coordenada X: ";
    cin >> coorX;

    cout << "Ingrese coordenada Y: ";
    cin >> coorY;
}

void ingresarFiguras(Figura* lista[]){
    int i;

    cout << "   Rectangulo[R]\n   Elipse....[E]\n   Cuadrado..[Q]\n   Circulo...[C]." << endl;

    for(i=0; i<N; i++){
        cout << "Tipo de figura: ";
        cin >> opcion;

        switch(opcion){
            case 'R':
                solicitarDatosFigura();
                cout << "Ingrese lado 1: ";
                cin >> lad1;
                cout << "Ingrese lado 2: ";
                cin >> lad2;
                cout << endl;

                lista[i] = new Rectangulo(name, col, coorX, coorY, lad1, lad2);
                break;

            case 'E':
                solicitarDatosFigura();
                cout << "Ingrese radio 1: ";
                cin >> rad1;
                cout << "Ingrese radio 2: ";
                cin >> rad2;
                cout << endl;

                lista[i] = new Elipse(name,col, coorX, coorY, rad1, rad2);
                break;

            case 'Q':
                solicitarDatosFigura();
                cout << "Ingrese lado: ";
                cin >> lad;
                cout << endl;

                lista[i] = new Cuadrado(name, col, coorX, coorY, lad);
                break;

            case 'C':
                solicitarDatosFigura();
                cout << "Ingrese radio: ";
                cin >> rad;
                cout << endl;

                lista[i] = new Circulo(name, col, coorX, coorY, rad);
                break;

            default:
                cout << "Ingreso erroneamente la letra de la figura." << endl;
                exit(1);
        }
	}
}
