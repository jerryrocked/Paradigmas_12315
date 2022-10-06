#include <iostream>
#include "miniwin.h"
#include "Menu.h"
using namespace miniwin;
using namespace std;
void menu();
int main(){
    vredimensiona(400,400);
    menu();

    /*//color(ROJO);
    linea(0,0,100,100);

    //color(VERDE);
    rectangulo(250,150,350,350);

    //animado
    for (int i = 0; i < 400; i++)
    {
        punto(i,i);
        refresca();
        espera(30);
    }


    refresca();*/
    return 0;
}
