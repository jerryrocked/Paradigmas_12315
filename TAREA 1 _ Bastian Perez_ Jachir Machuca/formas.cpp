#include <iostream>
#include <cmath>
#include "formas.h"
#include "miniwin.h"

/***************
* DEFINICIONES *
***************/
#define MAX 100
#define PI 3.14159265358979323846
using namespace std;
using namespace miniwin;

/*********************
* VARIABLES GLOBALES *
*********************/
FORMA *FORMAS[MAX]; // vector de punteros
int n = 0; //cantidad de formas

/********************************
* INICIALIZADORES Y DESTRUCTORES*
********************************/
PUNTO::PUNTO(){}
FORMA::FORMA(){}
RECTANGULO::RECTANGULO(){}
ELIPSE::ELIPSE(){}
CUADRADO::CUADRADO(){}
CIRCULO::CIRCULO(){}

PUNTO::~PUNTO(){}
RECTANGULO::~RECTANGULO(){}
ELIPSE::~ELIPSE(){}
CUADRADO::~CUADRADO(){}
CIRCULO::~CIRCULO(){}

/*******
* MENU *
*******/

/*
FUNCION: Muestra el menú, realiza la acción escogida, actualiza miniwin y retorna la opción escogida
*/
int menu(){
    int opcion = 0, seleccion, nuevoColor;
    float cX, cY;

    cout<<"\n"<<
    " ##########################################"<<endl<<
    " #                 MENU                   #"<<endl<<
    " #----------------------------------------#"<<endl<<
    " #  1.  INGRESAR RECTANGULO               #"<<endl<<
    " #  2.  INGRESAR ELIPSE                   #"<<endl<<
    " #  3.  INGRESAR CUADRADO                 #"<<endl<<
    " #  4.  INGRESAR CIRCULO                  #"<<endl<<
    " #----------------------------------------#"<<endl<<
    " #  5.  CALCULAR AREA                     #"<<endl<<
    " #  6.  CALCULAR PERIMETRO                #"<<endl<<
    " #----------------------------------------#"<<endl<<
    " #  7.  CAMBIAR TAMANO                    #"<<endl<<
    " #  8.  CAMBIAR COLOR A UNA FORMA         #"<<endl<<
    " #  9.  CAMBIAR COLOR A TODAS LAS FORMAS  #"<<endl<<
    " #----------------------------------------#"<<endl<<
    " #  10. MOVER UNA FORMA                   #"<<endl<<
    " #  11. MOVER TODAS LAS FORMAS            #"<<endl<<
    " #----------------------------------------#"<<endl<<
    " #  12. IMPRIMIR FORMA                    #"<<endl<<
    " #----------------------------------------#"<<endl<<
    " #  13. SALIR                             #"<<endl<<
    " ##########################################"<<endl;

    opcion = ingresarOpcion(1, 13);

    switch(opcion){
    case 1:{ //INGRESAR RECTANGULO
        RECTANGULO *R = new RECTANGULO;
        R->ingresarRectangulo();
        FORMAS[n] = R; R = NULL; n++;
        break;
    }
    case 2:{ //INGRESAR ELIPSE
        ELIPSE *E = new ELIPSE;
        E->ingresarElipse();
        FORMAS[n] = E; E = NULL; n++;
        break;
    }
    case 3:{ //INGRESAR CUADRADO
        CUADRADO *C = new CUADRADO;
        C->ingresarCuadrado();
        FORMAS[n] = C; C = NULL; n++;
        break;
    }
    case 4:{//INGRESAR CIRCULO
        CIRCULO *C = new CIRCULO;
        C->ingresarCirculo();
        FORMAS[n] = C; C = NULL; n++;
        break;
    }
    case 5:{//CALCULAR AREA
        seleccion = mostrarNombres();
        if(seleccion != -1)
            FORMAS[seleccion]->calcularArea();
        break;
    }
    case 6:{ //CALCULAR PERIMETRO
        seleccion = mostrarNombres();
        if(seleccion != -1)
            FORMAS[seleccion]->calcularPerimetro();
        break;
    }
    case 7:{ //CAMBIAR TAMAÑO
        seleccion = mostrarNombres();
        if(seleccion != -1)
            FORMAS[seleccion]->cambiarTamano();
        break;
    }
    case 8:{ //CAMBIAR COLOR
        seleccion = mostrarNombres();
        if (seleccion != -1){
            nuevoColor = elegirColor();
            FORMAS[seleccion]->FORMA_cambiarColor(nuevoColor);
        }
        break;
    }
    case 9:{ //CAMBIAR COLOR TODO
        nuevoColor = elegirColor();
        for(int i=0; i<n; i++){
            FORMAS[i]->FORMA_cambiarColor(nuevoColor);
        }
        break;
    }

    case 10:{ //MOVER
        seleccion = mostrarNombres();
        if(seleccion != -1){
            cout<<"Ingrese x: "; cin>>cX; cout<<endl;
            cout<<"Ingrese y: "; cin>>cY; cout<<endl;
            FORMAS[seleccion]->FORMA_mover(cX, cY);
        }
        break;
    }
    case 11:{ //MOVER TODO
        cout<<"Ingrese x: "; cin>>cX; cout<<endl;
        cout<<"Ingrese y: "; cin>>cY; cout<<endl;
        for(int i=0; i<n; i++){
            FORMAS[i]->FORMA_mover(cX, cY);
        }
        break;
    }
    case 12:{ //IMPRIMIR
        seleccion = mostrarNombres();
        if(seleccion != -1)
            FORMAS[seleccion]->imprimir();

        break;
    }
    case 13: { //SALIR
        vcierra();
        eliminarTodo();
        break;
    }
    default:
        break;
    }

    return opcion;
}

/*******************
* FUNCIONES: PUNTO *
*******************/

//FUNCION: Solicita por teclado los datos del objeto PUNTO
void PUNTO::ingresarPunto(){
    cout<<"Ingrese x: ";
    cin>>x; cout<<endl;
    cout<<"Ingrese y: ";
    cin>>y; cout<<endl;
}

/*******************
* FUNCIONES: FORMA *
*******************/

//FUNCION: Solicita por teclado los datos de la clase FORMA
void FORMA::FORMA_ingresar(){
    cout<<"Ingrese nombre: ";
    getline(cin>>ws, nombre); cout<<endl;
    COLOR = elegirColor();
    coordenada.ingresarPunto();
}

//FUNCION: muestra por consola los datos del objeto FORMA
void FORMA::FORMA_imprimir(){
    cout<<"Nombre: "<<nombre<<endl<<"Color: ";
    switch (COLOR){
    case 1:{cout<<"Rojo"<<endl; break;}
    case 2:{cout<<"Verde"<<endl;break;}
    case 3:{cout<<"Azul"<<endl;break;}
    case 4:{cout<<"Amarillo"<<endl;break;}
    case 5:{cout<<"Magenta"<<endl;break;}
    case 6:{cout<<"Cyan"<<endl;break;}
    case 7:{cout<<"Blanco"<<endl;break;}
    default:break;
    }
    cout<<"Coordenada: ("<<coordenada.x<<", "<<coordenada.y<<")"<<endl;
}

//FUNCION: Cambia el color del objeto FORMA
void FORMA::FORMA_cambiarColor(int c){
    COLOR = c;
}

//FUNCION: Cambia los datos del objeto FORMA
void FORMA::FORMA_mover(float X, float Y){
    coordenada.x = X;
    coordenada.y = Y;
}

/************************
* FUNCIONES: RECTANGULO *
************************/

//FUNCION: Solicita por teclado los datos de la calse RECTANGULO
void RECTANGULO::ingresarRectangulo(){
    FORMA_ingresar();
    cout<<"Ingrese lado menor: ";
    cin>>ladoMenor; cout<<endl;
    cout<<"Ingrese lado mayor: ";
    cin>>ladoMayor; cout<<endl;
}

//FUNCION: Muestra por consola los datos del objeto RECTANGULO
void RECTANGULO::imprimir(){
    if(ladoMayor==ladoMenor){
        cout<<"## CUADRADO ##"<<endl<<
        "Lados: "<<ladoMayor<<endl;
    }else{
        cout<<"## RECTANGULO ##"<<endl<<
        "Lados: "<<ladoMayor<<" x "<<ladoMenor<<endl;
    }
    FORMA_imprimir();
    PAUSE();
}

//FUNCION: Calcula el área del rectángulo, la muestra por consola y la retorna
float RECTANGULO::calcularArea(){
    float area = ladoMenor * ladoMayor;
    cout<<"AREA: "<<area<<endl;
    PAUSE();
    return area;
}

//FUNCION: Calcula el perimetro del rectangulo, lo muestra por consola y la retorna
float RECTANGULO::calcularPerimetro(){
    float perimetro = (2*ladoMayor) + (2*ladoMenor);
    cout<<"PERIMETRO: "<<perimetro<<endl;
    PAUSE();
    return perimetro;
}

//FUNCION: Solicita por teclado el factor de cambio del tamaño y cambia el tamaño del objeto
void RECTANGULO::cambiarTamano(){
    float factor;
    cout<<"Ingrese factor: ";
    cin>>factor; cout<<endl;
    ladoMayor = ladoMayor*factor;
    ladoMenor = ladoMenor*factor;
}

//FUNCION: Selecciona color a mostrar, y carga la figura a miniwin
void RECTANGULO::obtener(){
    color(COLOR);
    rectangulo_lleno(coordenada.x-(ladoMayor/2), coordenada.y-(ladoMenor/2),coordenada.x+(ladoMayor/2), coordenada.y+(ladoMenor/2));
    espera(10);
}

/*******************
* FUNCIONES ELIPSE *
*******************/
//FUNCION: Solicita por teclado los datos de la calse ELIPSE
void ELIPSE::ingresarElipse(){
    FORMA_ingresar();
    cout<<"Ingrese radio menor: ";
    cin>>radioMenor; cout<<endl;
    cout<<"Ingrese radio mayor: ";
    cin>>radioMayor; cout<<endl;
}

//FUNCION: Muestra por consola los datos del objeto ELIPSE
void ELIPSE::imprimir(){
    if(radioMayor == radioMenor){
        cout<<"## CIRCULO ##"<<endl<<
        "Radio: "<<radioMayor<<endl;
    }else{
        cout<<"## ELIPSE ##"<<endl;
        cout<<"Radio Mayor: "<<radioMayor<<endl<<
        "Radio Menor: "<<radioMenor<<endl;
    }
    FORMA_imprimir();
    PAUSE();
}

//FUNCION: Calcula el área del elipse, la muestra por consola y la retorna
float ELIPSE::calcularArea(){
    float area = PI * (radioMayor * radioMenor);
    cout<<"Area: "<< area<<endl;
    PAUSE();
    return area;
}

//FUNCION: Calcula el perimetro del elipse, lo muestra por consola y la retorna
float ELIPSE::calcularPerimetro(){
    float perimetro = 2*PI*sqrt((radioMenor*radioMenor + radioMayor*radioMayor)/2);
    cout<<"Perimetro: "<<perimetro<<endl;
    PAUSE();
    return perimetro;
}

//FUNCION: Solicita por teclado el factor de cambio del tamaño y cambia el tamaño del objeto
void ELIPSE::cambiarTamano(){
    float factor;
    cout<<"Ingrese factor: ";
    cin>>factor; cout<<endl;
    radioMayor = radioMayor * factor;
    radioMenor = radioMenor * factor;
}

//FUNCION: Selecciona color a mostrar, y carga la figura a miniwin
void ELIPSE::obtener(){
    color(COLOR);
    elipse_lleno(coordenada.x, coordenada.y, radioMenor, radioMayor);
    espera(10);
}

/*********************
* FUNCIONES CUADRADO *
*********************/

//FUNCION: Solicita por teclado los datos de la calse CUADRADO
void CUADRADO::ingresarCuadrado(){
    FORMA_ingresar();
    cout<<"Ingrese lado: ";
    cin>>lado; cout<<endl;
    ladoMayor=lado; ladoMenor=lado;
}

/********************
* FUNCIONES CIRCULO *
********************/

//FUNCION: Solicita por teclado los datos de la calse CIRCULO
void CIRCULO::ingresarCirculo(){
    FORMA_ingresar();
    cout<<"Ingrese radio: ";
    cin>>radio; cout<<endl;
    radioMayor=radio; radioMenor=radio;
}

/******************
* OTRAS FUNCIONES *
******************/

//FUNCION: Solicita presionar ENTER por teclado para continuar con la ejecución del programa
void PAUSE(){
    cout<<"\nPresione ENTER para continuar.";
    cin.ignore(); cin.get(); cout<<endl;
}

//FUNCION: Pide como parametro la primera opcion y la ultima, solicita una opcion por teclado hasta que la opcion elegida
//         se encuentre entre la primera y la ultima
int ingresarOpcion(int PRIM, int ULT){
    int op = 0;
    cout<<"Ingrese una opcion: ";
    cin>>op; cout<<endl;
    while(op<PRIM || op>ULT ){
        cout<<"OPCION INVALIDA."<<endl<<"Ingrese la opcion nuevamente: ";
        cin>>op; cout<<endl;
    }
    return op;
}

//FUNCION: Recorre todos los elementos de la lista de formas e imprime una lista con los nombres
int mostrarNombres(){
    int seleccion;

    for(int i=0; i<n; i++)
        cout<<i+1<<". "<<FORMAS[i]->nombre<<endl;
    cout<<n+1<<". "<<"Salir"<<endl;
    seleccion = ingresarOpcion(1, n+1);
    if(seleccion==n+1) return -1;
    else return seleccion-1;
}

//FUNCION: Muestra una lista con colores, Solicita una opcion por teclado y la retorna
int elegirColor(){
    int C;
    cout<<endl<<
    "###############"<<endl<<
    "#   COLORES   #"<<endl<<
    "#-------------#"<<endl<<
    "# 1. Rojo     #"<<endl<<
    "# 2. Verde    #"<<endl<<
    "# 3. Azul     #"<<endl<<
    "# 4. Amarillo #"<<endl<<
    "# 5. Magenta  #"<<endl<<
    "# 6. Cyan     #"<<endl<<
    "# 7. Blanco   #"<<endl<<
    "###############"<<endl;

    C = ingresarOpcion(1,7);

    return C;
}

//FUNCION: Limpia la pantalla, dejando la cuadricula, carga todas las figuras creadas y refresca la pantalla de miniwin
void actualizar(){
    borrarFiguras();
    for(int i=0; i<n; i++)
        FORMAS[i]->obtener();
    espera(50); refresca();
}

//FUNCION: Cierra la ventana de miniwin y destruye todos los elementos de la lista de formas
void eliminarTodo(){
    for(int i=0; i<n; i++)
        delete FORMAS[i];
    n=0;
}
