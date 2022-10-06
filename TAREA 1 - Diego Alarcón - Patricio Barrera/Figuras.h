
#define FIGURAS_H_INCLUDED

#include <iostream>
#include <stdlib.h>
using namespace std;


class Forma {
  private:
    std::string color;
    float cordcentro;
    char* nombreforma;
  public:
    Forma(std::string, float, char*);//constructor
    void imprimir();
    void obtcambcolor();
    void moverforma();
} ;

class Rectangulo : public Forma {
    private:
      float ladomenor,ladomayor;
    public:
      Rectangulo(std::string, float, char*,float,float);//constructor
      void area();
      void perimetro();
      void cambtamano();
} ;

Forma::Forma(std::string _color, float _cordcentro, char* _nombreforma){
    color = _color;
    cordcentro = _cordcentro;
    nombreforma = _nombreforma;
}

Rectangulo::Rectangulo((std::string _color, float _cordcentro, char* _nombreforma, float _ladomenor, float _ladomayor) Forma(_color,_cordcentro, _nombreforma){
    ladomenor = _ladomenor;
    ladomayor = _ladomayor;
}

void Forma::obtcambcolor(){
    cout<<"el color de la forma "<<nombreforma<< "es:" <<color<<endl;
    cout<<"el color cambio a: "<<color<<endl;
  }

void Forma::moverforma(){
    cout<<"la coordenada "<<cordcentro<< "de la forma"<<nombreforma "se movio a "<<moverforma<<endl;
  }

void Rectangulo::area(){
    float _area;
    _area = ladomenor * ladomayor;
    cout<<"El area es: "<<_area<<endl;
  }

void Rectangulo::perimetro(){
    float _perimetro;
    _perimetro = (2*ladomenor) + (2*ladomayor);
    cout<<"El perimetro es: "<<_perimetro<<endl;
}

void Rectangulo::cambtamano(){
    float _cambtamano;

    cout<<"El tamaño cambio a: "<<_cambtamano<<endl;
}



class Elipse : public Forma {
   private:
        float h;
        float c;
        float a;
        float b;
    public:
        Elipse(float_h,float_c ,float_a,float_b,std::string, float, char*){
           h = _h;
           c = _c;
           a = _a;
           b = _b;
       }
        float getY1(float x){
            return(c + sqrt(pow(b, 2)(1 -(pow(x - h, 2)/pow(a, 2))));
       }
        float get2(float x){
            return(c - sqrt(pow(b, 2)(1 -(pow(x - h, 2)/pow(a, 2))));
       }
};


class Circunferencia : public Elipse {
    private:
        float h;
        float c;
        float r;
    public:
        Circunferencia(float_h ,float_c ,float_r,float_h,float_c ,float_a,float_b,std::string, float, char*){
            h = _h ;
            c = _c;
            r = _r;
        }
        float getY1(float x){
            return (c + sqrt(pow(r, 2) - pow((x - h), 2)));
        }
        float getY2 (float x){
            return (sqrt(pow(r, 2)pow((x - h), 2)));
        }
};


class Cuadrado : public Rectangulo {
    public:
      Cuadrado(std::string, float, char*,float,float);
};



//void pintar_circunferencia(float h,float c,float r,int color = YELLOW ){
//    Punto p1 = Punto(0.0f, 0.0f);
//    Punto p2 = Punto(0.0f, 0.0f);
//    Circunferencia circunf = Circunferencia(h ,c ,r);
//
//    float longitud = (float)ancho/(2 * k);
//
//    for (float i = -longitud;i <= longitud;i + = 0.01)
//        pl.setX(i);
//        pl.sety(circunf.getY1(i));
//
//        p2.setx(i);
//        p2.sety(circunf.getY2(i));
//
//        putpixel(posx(p1.getX()), posy(p1.getY()), color);
//        putpixel(posx(p2.getX()), posY(p2.getY()), color);
//    }
//  }
//void pintar_elipse (float h,float c,float a,float b,int color = YELLOW > {
//   Punto p1 = Punto(0.0f ,0.0f );
//   Punto p2 = Punto(0.0f ,0.0f );
//    Elipse elip = Elipse(h ,c ,a ,b );
//
//    float longitud = (float)ancho/(2*k);
//
//    for(float i = -longitud; i <=)longitud; i + =0.01){
//       pl.setX(i);
//       pl.setY(elip.getY1(i));
//
//       pl.setX(i);
//       pl.setY(elip.getY2(i));
//
//       putpixel(posX(p1.getX()), posY(p1.getY()), color);
//       putpixel(posX(p2.getX()), posY(p2.getY()), color);
//    }
//                                                                    I
//};

