#include "miniwin.h"
#include "forma.h"
#include <iostream>
#include <cstdlib>
#include <time.h>
using namespace std;
using namespace miniwin;

int main() {
    vredimensiona(800, 600);
    int i, c = 0;
    cout << "¿Que figura quieres?" << endl;
    cout << " 1. Cuadrado \n 2. Rectangulo \n 3. Elipse \n 4. Circulo" << endl;
    scanf("%d", &i);
    cout << "¿Que color?" << endl;
    cout << " 1. Rojo \n 2. Verde \n 3. Azul \n 4. Amarillo \n 5. Magenta \n 6. Cyan \n 7. Blanco" << endl;
    scanf("%d", &c);
    color(c);

    switch (i){
        case 1:{
            int izq = 320, arr = 200, der = 370, ab = 250, lmay, esc;
            int resp=0, tam;
            cout << "Valor de los lados: " << endl;
            scanf("%d", &lmay);
            Cuadrado C("Cuadrado", 1, 2, lmay, 0);
            rectangulo_lleno(izq, arr, der, ab);
            refresca();
            cout << "--------------------------------" << endl;
            C.area_cuad();
            C.perim_cuad();
            cout << "--------------------------------" << endl;
            cout << " ¿Desea cambiar el tamano? \n 1. Si \n 2. No" << endl;
            scanf("%d", &tam);
            if (tam == 1){
                cout << "Ingrese el factor de escala (en incrementos de 10)" << endl;
                scanf("%d", &esc);
                der = der+esc;
                ab = ab+esc;
                borra();
                rectangulo_lleno(izq, arr, der, ab);
                refresca();
            }
            do{
                cout << "¿Mover figura a una posicion al azar?" << endl;
                cout << " 1. Si \n 2. No" << endl;
                scanf("%d", &resp);
                if (resp==1){
                    borra();
                    izq = rand() % 600 + 1;
                    arr = rand() % 500 + 1;
                    if (esc != NULL){
                        der = izq + 50 + esc;
                        ab = arr + 50 + esc;
                    }else{
                        der = izq + 50;
                        ab = arr + 50;
                    }
                    rectangulo_lleno(izq, arr, der, ab);
                    refresca();
                }else{
                    vcierra();
                }

            }
            while (resp != 2);
            break;
        }
        case 2:{
            srand(time(0));
            int izq = 320, arr = 200, der = 420, ab = 250, lmay, lmen, esc;
            int resp=0, tam;
            cout << "Valor lado mayor: " << endl;
            scanf("%d", &lmay);
            cout << "Valor lado menor: " << endl;
            scanf("%d", &lmen);
            Rectangulo R("Rectangulo", 5, 6, lmay, lmen);
            rectangulo_lleno(izq, arr, der, ab);
            refresca();
            cout << "--------------------------------" << endl;
            R.area_rec();
            R.perim_rec();
            cout << "--------------------------------" << endl;
            cout << " ¿Desea cambiar el tamano? \n 1. Si \n 2. No" << endl;
            scanf("%d", &tam);
            if (tam == 1){
                cout << "Ingrese el factor de escala (en incrementos de 10)" << endl;
                scanf("%d", &esc);
                der = der+esc;
                ab = ab+esc;
                borra();
                rectangulo_lleno(izq, arr, der, ab);
                refresca();
            }
            do{
                cout << "¿Mover figura a una posicion al azar?" << endl;
                cout << " 1. Si \n 2. No" << endl;
                scanf("%d", &resp);
                if (resp==1){
                    borra();
                    izq = rand() % 600 + 1;
                    arr = rand() % 500 +1;
                    if (esc != NULL){
                        der = izq + 100 + esc;
                        ab = arr + 50 + esc;
                    }else{
                        der = izq + 100;
                        ab = arr + 50;
                    }
                    rectangulo_lleno(izq, arr, der, ab);
                    refresca();
                }else{
                    vcierra();
                }

            }
            while (resp != 2);
            break;
        }
        case 3:{
            srand(time(0));
            int x = 400, y = 150, rmay, rmen, esc;
            int resp=0, tam;
            cout << "Valor radio mayor: " << endl;
            scanf("%d", &rmay);
            cout << "Valor radio menor: " << endl;
            scanf("%d", &rmen);
            Elipse E("Elipse", 4, 1, rmay, rmen);
            circulo_lleno(x, y, 50);
            refresca();
            cout << "--------------------------------" << endl;
            E.area_elip();
            cout << "--------------------------------" << endl;
            cout << " ¿Desea cambiar el tamano? \n 1. Si \n 2. No" << endl;
            scanf("%d", &tam);
            if (tam == 1){
                cout << "Ingrese el factor de escala (en incrementos de 10)" << endl;
                scanf("%d", &esc);
                rmen = 50 + esc;
                borra();
                circulo_lleno(x, y, rmen);
                refresca();
            }
            do{
                cout << "¿Mover figura a una posicion al azar?" << endl;
                cout << " 1. Si \n 2. No" << endl;
                scanf("%d", &resp);
                if (resp==1){
                    borra();
                    x = rand() % 600 + 1;
                    y = rand() % 500 + 1;
                    if (esc != NULL){
                        rmen = 50 + esc;
                    }else{
                        rmen = 50;
                    }

                    circulo_lleno(x, y, rmen);
                    refresca();
                }else{
                    vcierra();
                }

            }
            while (resp != 2);
            break;
        }
        case 4:{
            srand(time(0));
            int x = 400, y = 150, rad, rad1, esc;
            int resp=0, tam;
            cout << "Valor del radio: " << endl;
            scanf("%d", &rad);
            Circulo S("Circulo", 2, 3, rad, 0);
            circulo_lleno(x, y, 50);
            refresca();
            cout << "--------------------------------" << endl;
            S.area_circ();
            S.perim_circ();
            cout << "--------------------------------" << endl;
            cout << " ¿Desea cambiar el tamano? \n 1. Si \n 2. No" << endl;
            scanf("%d", &tam);
            if (tam == 1){
                cout << "Ingrese el factor de escala (en incrementos de 10)" << endl;
                scanf("%d", &esc);
                rad1 = 50 + esc;
                borra();
                circulo_lleno(x, y, rad1);
                refresca();
            }
            do{
                cout << "¿Mover figura a una posicion al azar?" << endl;
                cout << " 1. Si \n 2. No" << endl;
                scanf("%d", &resp);
                if (resp==1){
                    borra();
                    x = rand() % 600 + 1;
                    y = rand() % 500 + 1;
                    if (esc != NULL){
                        rad1 = 50 + esc;
                    }else{
                        rad1 = 50;
                    }
                    circulo_lleno(x, y, rad1);
                    refresca();
                }else{
                    vcierra();
                }

            }
            while (resp != 2);
            break;
        }
    }
}

