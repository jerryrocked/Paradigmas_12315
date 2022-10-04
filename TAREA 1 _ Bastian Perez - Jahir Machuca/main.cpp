/*-------------------------------------------*
* Tarea N°1: POO C++                         *
* Integrantes: Bastián Pérez y Jahir Machuca *
* NRC: 12315                                 *
* Fecha: 22/09/2022                          *
*-------------------------------------------*/

#include <iostream>
#include "formas.h"
#include "miniwin.h"

using namespace miniwin;

int main(){
    vredimensiona(700,700);

    do{actualizar();} while(menu() != 13);

    return 0;
}
