// Tarea 1 Paradigmas de la programacion NRC 12315
//Integrantes:Alejandro Aguilera, Agustín Rivas, Jeremías Pavez 


#include <iostream>
#include <stdlib.h>
#include <math.h>

using namespace std;

//Coordenada tipo
class Punto{
public:
float x;
float y;
void imprimirPunto();
void setCoordenada();

Punto(){};
~Punto(){};
};

void Punto::imprimirPunto(){
  cout<<"\nX: "<<x;
  cout<<"\ny: "<<y;
};

void Punto::setCoordenada(){
    cout<<"Ingrese x: ";
    cin>>x; cout<<endl;
    cout<<"Ingrese y: ";
    cin>>y; cout<<endl;
};


class Forma{ 
  public:
    Forma(){};
    ~Forma(){};
    string color;
    Punto coordenada; //tipo punto
    char *nombreForma; //PUNTERO A NOMBRE DE LA FORMA
    void imprimirForma();
    string getcolor(string color); //obtener color
    void setColor(string c); //cambiar color
    void mover(int x, int y);
    
  
};

void Forma::imprimirForma(){
  cout<<"\nNombre de la forma: "<<nombreForma;
  cout<<"\nColor: "<<color;
  
};


string Forma::getcolor(string color){
  return color;
  };

void Forma::setColor(string c){
  color = c;
};



//Mover coordenada desde punto
void Forma::mover(int x, int y){
  coordenada.setCoordenada();
};

//------------------------------RECTANGULO------------------------------
class rectangulo: public Forma {
  public:
    rectangulo(){};
    ~rectangulo(){};
    float lado_menor,lado_mayor;
    float area(float lado1, float lado2);
    float perimetro(float lado1, float lado2);
    float cambio_tamano(float escala,float area);    
    //FUNCION IMPRIMIR
    
};


//Calculo area del rectangulo
float rectangulo::area(float lado1, float lado2){  
  float areaRectangulo = lado1 * lado2;
  cout<<"\nArea rectangulo: "<<(areaRectangulo); 
  return areaRectangulo;
};

//Calculo perimetro del rectangulo
float rectangulo::perimetro(float lado1, float lado2){
  float perimetroRectangulo = 2*lado1 + 2*lado2;
  cout<<"\nPerimetro rectangulo: "<<(perimetroRectangulo); 
  return perimetroRectangulo;
};

float rectangulo::cambio_tamano(float escala,float area){
  float tamano_rectangulo = area * escala;
  cout<<"\nEscala del cambio de tamano: "<<(tamano_rectangulo);
  
  return tamano_rectangulo;
};

//------------------------------FIN RECTANGULO------------------------------




//------------------------------ELIPSE------------------------------
class elipse: public Forma{
  public:
    elipse(){};
    ~elipse(){};
    float Radio_mayor,radio_menor;
    float area_elipse(float Radio_mayor, float radio_menor);
    
};

float elipse::area_elipse(float Radio_mayor, float radio_menor){
  float areaElipse = M_PI*(Radio_mayor*radio_menor);
  cout<<"\nArea Elipse: "<<(areaElipse);
  return areaElipse;
}


//------------------------------FIN ELIPSE------------------------------



//------------------------------Cuadrado------------------------------
class cuadrado: public rectangulo{
  public:
    cuadrado(){};
    ~cuadrado(){};
    float lado;
    float area(float lado1);
    float perimetro(float lado1);
    float cambio_tamano(float escala_cuadrado,float area);    
    void imprimir_cuadrado(float escala);

};

//Calculo area del cuadrado
float cuadrado::area(float lado1){  
  float areaCuadrado = lado1 * lado1;
  cout<<"\nArea Cuadrado: "<<(areaCuadrado); 
  return areaCuadrado;
};

//Calculo perimetro del cuadrado
float cuadrado::perimetro(float lado1){
  float perimetroCuadrado = 4*lado1;
  cout<<"\nPerimetro Cuadrado: "<<(perimetroCuadrado); 
  return perimetroCuadrado;
};

float cuadrado::cambio_tamano(float escala_cuadrado,float area){
  float tamano_cuadrado = area * escala_cuadrado;
  cout<<"\nEscala del cambio de tamano: "<<(tamano_cuadrado);
  
  return tamano_cuadrado;
};


//------------------------------Fin Cuadrado------------------------------




//------------------------------Circulo------------------------------
class circulo:public elipse{
  public:
    circulo(){};
    ~circulo(){};
    float radio;
    float area_circulo(float r);
};

float circulo::area_circulo(float r){
    float radio = M_PI*pow(r,2);
    cout<<"\nArea circulo: "<<(radio); 
  return radio;
};

//------------------------------Fin circulo------------------------------



int main(){
  int a,b;
  
  do{  
      cout<<("\n\nSeleccione Forma:\n\n");
      cout<<("1- Rectangulo\n");
      cout<<("2- Cuadrado\n");
      cout<<("3- Elipse\n");
      cout<<("4- Circulo\n");
      cout<<("5- Salir\n");
      cout<<("Respuesta: ");
      cin>> a;

      switch(a)
      {
        case 1:
          
            //area rectangulo
            float num1, num2,num3;
            char color[40];
            
            
                
                cout<<("\nIngrese lado menor:\n");
                cin>>num1;
                cout<<("\nIngrese lado mayor:\n");
                cin>>num2;
                cout<<("\nEscala:\n");
                cin>>num3;
                cout<<("\nEliga color:\n");
                cin>>color;
          
                if(num1 > 0 ){         
                  cout<<("\n****************************************");
                  rectangulo rectangulito; //crear rectangulo
                  float areaRectangulo = rectangulito.area(num1, num2);    
                  //perimetro rectangulo
                  float perimetroRectangulo = rectangulito.perimetro(num1, num2);
                  //cambio tamano
                  float tamano_rectangulo =  rectangulito.cambio_tamano( num3,areaRectangulo);    
                  rectangulito.setColor(color);
                  char nombre[40] = "rectangulo";
                  rectangulito.nombreForma = &nombre[0];
                  
                  rectangulito.imprimirForma();
                  cout<<("\n****************************************\n");
                  
                  
                  }           
          break;

        case 2:
          
             //area cuadrado   
                cout<<("\nIngrese lado:\n");
                cin>>num1;
                cout<<("\nEscala:\n");
                cin>>num3;
                cout<<("\nEliga color:\n");
                cin>>color;
                
                if(num1 > 0 ){         
                  cout<<("\n****************************************");
                  cuadrado cuadradito;
                  float areaCuadrado = cuadradito.area(num1);    
                  //perimetro cuadrado
                  float perimetrocuadrado = cuadradito.perimetro(num1);
                  //cambio tamano
                  float tamano_cuadrado =  cuadradito.cambio_tamano( num3,areaCuadrado);

                  cuadradito.setColor(color);
                  char nombre[40] = "Cuadrado";
                  cuadradito.nombreForma = &nombre[0];
                  
                  cuadradito.imprimirForma();
                  cout<<("\n****************************************\n");
                  }
            
          break;
        
        case 3:
          
              cout<<("Ingrese radio menor:\n");
                cin>>num1;
                cout<<("\nIngrese radio mayor:\n");
                cin>>num2;
                cout<<("\nEliga color:\n");
                cin>>color;
    
                if(num1 > 0 ){    
                  cout<<("\n****************************************");
                  elipse minielipse;
                  float areaElipse = minielipse.area_elipse(num1, num2);  
                  minielipse.setColor(color);
                  char nombre[40] = "Elipse";
                  minielipse.nombreForma = &nombre[0];
                  
                  minielipse.imprimirForma();         
                  cout<<("\n****************************************\n");
                  }
          break;
        case 4:
          
              cout<<("\nIngrese radio:\n");
              cin>>num1;
              cout<<("\nEliga color:\n");
              cin>>color;
              if(num1 > 0 ){       
                cout<<("\n****************************************");
                circulo circulito;
                float area_circulo = circulito.area_circulo(num1);  
                circulito.setColor(color);
                char nombre[40] = "Circulo";
                circulito.nombreForma = &nombre[0];
                  
                circulito.imprimirForma();
                cout<<("\n****************************************\n");
                }
          
          break;

        case 5:
          cout<<("\nSeguro que quieres salir? Si o No\n\n");
          cout<<("1- Si\n");
          cout<<("2- No\n");
          cin>>b;
          if(b == 1)
          {
            return 0;         
          }
          else{
            return main();
          }
          break;        
      }
    }while((a != 5));
  
  return 0;
};



