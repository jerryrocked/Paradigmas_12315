/*
Ashley Rodriguez 25995896-2
Omar Leiva       20189017-9
Sergio Roman     20677171-2
*/
#include "miniwin.h"
#include <iostream>
#include <cmath>
using namespace miniwin;
using namespace std;


class Forma{
public:
    int COLOR;
    float x,y;
    string NOMBRE,r1,r2;
    void agregar_forma();
    };
class Rectangulo: public Forma {
public:
    float l_menor,l_mayor,perimetro_rec,area_rec;
    void agregar_rec();
    float cal_perimetro();
    float cal_area();
    void mod_rec();//cambiar tamaño
    void imp_rec();
    };
class Elipse : public Forma{
public:
    float rad_menor,rad_mayor;
    void agregar_elip();
    float area_elip();
    void mod_elip();
    void imp_elip();
};
class Cuadrado : public Rectangulo{
public:
    float lado;
    void agregar_cuad();
    float perimetro_cuad();
    float area_cuad();
    void mod_cuad();//cambiar tamaño
    void imp_cuad();

};
class  Circulo : public Elipse {
public:
    float radio;
    void agregar_cir();
    float area_cir();
    void mod_cir();
    void imp_cir();


};

void Forma::agregar_forma(){
  cout<<"Escriba el nombre de la forma: ";
  getline(cin,NOMBRE);cout<<endl;

}

void Rectangulo::agregar_rec(){
cout<<"\n\RECTANGULO";
cout<<"\n\nEscriba el lado menor del rectangulo: ";
cin>>l_menor;cout<<endl;
cout<<"\nEscriba el lado mayor del rectangulo: ";
cin>>l_mayor;cout<<endl;
}
float Rectangulo::cal_perimetro(){
    float Perimetro =(2*l_mayor)+(2*l_menor);
    cout<<"\nel perimetro es: "<<Perimetro<<endl;
    return Perimetro;
}
float Rectangulo::cal_area(){
    float area =(l_mayor*l_menor);
    cout<<"\nel area es:"<<area<<endl;
    return area;
}
void Rectangulo::mod_rec(){
    cout<<"\nDesea modificar el tamaño?(s/n): ";
    cin>>r2;cout<<endl;
    if(r2 == "s"){
    float factor;
    cout<<"\nIngrese un numero para modificar el tamaño del rectangulo: ";
    cin>>factor;cout<<endl;
    l_mayor = l_mayor*factor;
    l_menor = l_menor*factor;
    cout<<"\nel nuevo valor del lado menor es: "<<l_menor;
    cout<<"\nel nuevo valor del lado mayor es: "<<l_mayor;

}
else
  {
    cout<<"\nSe mantienen los datos";
  }
}
void Rectangulo::imp_rec(){
    float x,y;
     cout<<"\n\n1= ROJO\n2= VERDE\n3= AZUL\n4= AMARILLO\n5= MANGENTA\n6= CYAN\n7= BLANCO\n\nseleccione un numero del 1 al 7 para escoger un color: ";
     cin>>COLOR;cout<<endl;
     cout<<"\nEl color que escogio es: "<<COLOR;
     cout<<"\nDesea cambiar el color ?(s /n): ";
     cin>>r1;cout<<endl;
     if(r1 == "s"){
            cout<<"\nSeleccione un nuevo color: ";
     cin>>COLOR;cout<<endl;
     }else{
         cout<<"\nSe mantiene el color\n";
         }
     cout<<"\nEscriba una coordenada para X: ";
     cin>>x;cout<<endl;
     cout<<"\nEscriba una coordenada para Y: ";
     cin>>y;cout<<endl;
     cout<<"\nLa coordenada X es: "<<x;
     cout<<"\nLa coordenada Y es: "<<y;
     color(COLOR);
    rectangulo_lleno(x,y,l_menor,l_mayor);
    refresca();

}

void Elipse:: agregar_elip(){
    cout<<"\nELIPSE";
    cout<<"\n\nEscriba el radio menor: ";
    cin>>rad_menor;cout<<endl;
    cout<<"\nEscriba el radio mayor: ";
    cin>>rad_mayor;cout<<endl;
}
float Elipse ::area_elip(){
    float PI;
    PI = 3.141592;
    float areaElipse=(PI*(rad_mayor*rad_menor));
    cout<<"\nel area del elipse es:"<<areaElipse<<endl;
    return areaElipse;
}
void Elipse ::mod_elip(){
    string r3;
    cout<<"\nDesea modificar el tamaño del elipse?(s/n): ";
    cin>>r3;cout<<endl;
    if(r3 == "s"){
    float factorElipse;
    cout<<"Ingrese un numero para modificar el tamaño del elipse: ";
    cin>>factorElipse;cout<<endl;
    rad_mayor = rad_mayor*factorElipse;
    rad_menor = rad_menor*factorElipse;
    cout<<"\nel nuevo valor del radio menor es: "<<rad_menor;
    cout<<"\nel nuevo valor del radio mayor es: "<<rad_mayor;
    }
    else{
            cout<<"\nSe mantienen los datos\n";
    }
}
void Elipse ::imp_elip(){
    float ex,ey;
    int COLOR_E;
    string r4;
     cout<<"\n1= ROJO\n2= VERDE\n3= AZUL\n4= AMARILLO\n5= MANGENTA\n6= CYAN\n7= BLANCO\n\nseleccione un numero del 1 al 7 para escoger un color: ";
     cin>>COLOR_E;cout<<endl;
     cout<<"\n\nEl color que escogio es: "<<COLOR_E;
     cout<<"\nDesea cambiar el color ?(s /n): ";
     cin>>r4;cout<<endl;
     if(r4 == "s"){
            cout<<"\nSeleccione un nuevo color: ";
     cin>>COLOR_E;cout<<endl;
     }else{
         cout<<"\nSe mantiene el color\n";
         }
     cout<<"\nEscriba una coordenada para X: ";
     cin>>ex;cout<<endl;
     cout<<"\nEscriba una coordenada para Y: ";
     cin>>ey;cout<<endl;
     cout<<"\nLa coordenada X es: "<<ex;
     cout<<"\nLa coordenada Y es: "<<ey;
     color(COLOR_E);
    elipse_lleno(ex,ex,rad_menor,rad_mayor);
    refresca();

}

void Cuadrado ::agregar_cuad(){
    cout<<"\n\CUADRADO";
    cout<<"\n\nEscriba un lado para crear un cuadrado: ";
    cin>>lado;cout<<endl;

}
float Cuadrado ::perimetro_cuad(){
    float Perimetro_C =(lado*4);
    cout<<"\nel perimetro es: "<<Perimetro_C<<endl;
    return Perimetro_C;
}
float Cuadrado::area_cuad(){
 float area_C =(lado*lado);
    cout<<"\nel area es:"<<area_C<<endl;
    return area_C;
}
void Cuadrado::mod_cuad(){
    string r5;
    cout<<"\nDesea modificar el tamaño del cuadrado?(s/n): ";
    cin>>r5;cout<<endl;
    if(r5 == "s"){
    float factorCuadrado;
    cout<<"Ingrese un numero para modificar el tamaño del cuadrado: ";
    cin>>factorCuadrado;cout<<endl;
    lado = lado*factorCuadrado;
    cout<<"\nel nuevo valor del lado es: "<<lado;
    }
    else{
            cout<<"\nSe mantienen los datos";
    }

}
void Cuadrado ::imp_cuad(){

    float cx,cy;
    int COLOR_C;
    string r6;
     cout<<"\n1= ROJO\n2= VERDE\n3= AZUL\n4= AMARILLO\n5= MANGENTA\n6= CYAN\n7= BLANCO\n\nseleccione un numero del 1 al 7 para escoger un color: ";
     cin>>COLOR_C;cout<<endl;
     cout<<"\n\nEl color que escogio es: "<<COLOR_C;
     cout<<"\nDesea cambiar el color ?(s /n): ";
     cin>>r6;cout<<endl;
     if(r6 == "s"){
            cout<<"\nSeleccione un nuevo color: ";
     cin>>COLOR_C;cout<<endl;
     }else{
         cout<<"\nSe mantiene el color\n";
         }
     cout<<"\nEscriba una coordenada para X: ";
     cin>>cx;cout<<endl;
     cout<<"\nEscriba una coordenada para Y: ";
     cin>>cy;cout<<endl;
     cout<<"\nLa coordenada X es: "<<cx;
     cout<<"\nLa coordenada Y es: "<<cy;
     color(COLOR_C);
    rectangulo(cx,cy,lado,lado);
    refresca();
}

void Circulo:: agregar_cir(){
    cout<<"\n\CIRCULO";
    cout<<"\n\nEscriba el radio del circulo: ";
    cin>>radio;cout<<endl;
}
float Circulo ::area_cir(){
    float PI;
    PI = 3.141592;
    float areaCirculo=(PI*(radio*radio));
    cout<<"\nel area del circulo es:"<<areaCirculo<<endl;
    return areaCirculo;
}
void Circulo::mod_cir(){
    string r7;
    cout<<"\nDesea modificar el tamaño del circulo?(s/n): ";
    cin>>r7;cout<<endl;
    if(r7 == "s"){
    float factorCirculo;
    cout<<"Ingrese un numero para modificar el tamaño del circulo: ";
    cin>>factorCirculo;cout<<endl;
    radio = radio*factorCirculo;
    cout<<"\n\nel nuevo valor del radio es: "<<radio;
    }
    else{
            cout<<"\nSe mantienen los datos";
    }
}
void Circulo ::imp_cir(){
    float cix,ciy;
    int COLOR_CI;
    string r8;
     cout<<"\n\n1= ROJO\n2= VERDE\n3= AZUL\n4= AMARILLO\n5= MANGENTA\n6= CYAN\n7= BLANCO\n\nseleccione un numero del 1 al 7 para escoger un color: ";
     cin>>COLOR_CI;cout<<endl;
     cout<<"\n\nEl color que escogio es: "<<COLOR_CI;
     cout<<"\nDesea cambiar el color ?(s /n): ";
     cin>>r8;cout<<endl;
     if(r8 == "s"){
            cout<<"\nSeleccione un nuevo color: ";
     cin>>COLOR_CI;cout<<endl;
     }else{
         cout<<"\nSe mantiene el color\n";
         }
     cout<<"\nEscriba una coordenada para X: ";
     cin>>cix;cout<<endl;
     cout<<"\nEscriba una coordenada para Y: ";
     cin>>ciy;cout<<endl;
     cout<<"\nLa coordenada X es: "<<cix;
     cout<<"\nLa coordenada Y es: "<<ciy;
     color(COLOR_CI);
    circulo_lleno(cix,ciy,radio);
    refresca();

}

