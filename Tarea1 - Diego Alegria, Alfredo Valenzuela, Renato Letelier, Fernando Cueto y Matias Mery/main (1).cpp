#include <iostream>
#include <stdlib.h>

#include "figura.h"
#include "rectangulo.h"
#include "elipse.h"
#include "cuadrado.h"
#include "circulo.h"
#include "funciones.h"

using namespace std;

int main(){
    int i;

    //Pide el numero de figuras que quiere agregar.
    cout << "Ingrese el numero de figuras: ";
    cin >> N;

    //Crea la lista de figuras.
    Figura* figuras[N];

    //Ingresa las figuras a la lista.
	ingresarFiguras(figuras);

    //Imprime todas las figuras de la lista.
	for(i=0; i<N; i++){
        figuras[i]->imprimir();
	}

    //--------------------------Parte 2---------------------------//
	//------------------------------------------------------------//

	char op;
	cout << "Desea realizar alguna modificacion? [Y] o [N]: ";
	cin >> op;

	switch(op){
        case 'Y':
            cout << endl;
            cout << "Cambiar valores de todas las figuras.........[1]" << endl;
            cout << "Cambiar el valor de una figura...............[2]" << endl;
            cout << "Setear todas las figuras con el mismo valor..[3]" << endl;
            cout << "Exit.........................................[4]" << endl;
            cout << endl;

            cout << "Ingrese opcion: ";
            cin >> op;

            switch(op){
                case '1':
                    solicitarDatosFigura();

                    break;
                case '2':
                    break;
                case '3':
                    break;
                case '4':
                    exit(0);
            }

            break;

        case 'N':
            exit(0);

        default:
            cout << "Error al ingresar opcion." << endl;
	}

	//Imprime todas las figuras de la lista.
	for(i=0; i<N; i++){
        figuras[i]->imprimir();
	}

    return 0;
}
