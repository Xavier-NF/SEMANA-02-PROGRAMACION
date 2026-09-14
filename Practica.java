class  Practica {
public static void main(String[] args) {
//1.- SUMA Y DIFERENCIA
int a = 48;
int b = 17;
System.out.println( a + b );
System.out.println( a - b );

//2.- PRODUCTO Y COCIENTE
a = 36;
b = 6;
System.out.println( a * b );
System.out.println( a / b );

//3.- RESIDUO DE UNA DIVISIÓN
int dividendo = 157;
int divisor = 12;
System.out.println( dividendo / divisor );
System.out.println( dividendo % divisor );

//4.- DOBLE, TRIPLE Y MITAD
int numero = 24;
System.out.println( numero * 2 );
System.out.println( numero * 3 );
System.out.println( numero / 2 );

//5.- CUADRADO Y CUBO
numero = 7;
System.out.println( numero * numero );
System.out.println( numero * numero * numero );

//6.- PROMEDIO DE TRES NOTAS
int nota1 = 14;
int nota2 = 17;
int nota3 = 16;
System.out.println( (nota1 + nota2 + nota3) / 3.0 );

//7.- PROMEDIO DE CUATRO PRACTICAS
int practica1 = 15;
int practica2 = 13;
int practica3 = 18;
int practica4 = 16;
System.out.println( (practica1 + practica2 + practica3 + practica4) / 4.0 );

//8.- OPERACIONES COMBINADAS
a = 12;
b = 8;
int c = 4;
System.out.println( (a + b) * c / 2 );

//9.- EXPRESION CON PARÉNTESIS
a = 20;
b = 6;
c = 3; 
System.out.println( ( a - b ) * ( a + c ) );

//10.- EXPRESION FRACCIONARIA
a = 18;
b = 7;
c = 5;
System.out.println( ( a + b ) / c );

//11.- AREA DE UN CUADRADO
int lado = 9;
System.out.println( lado * lado );

//12.- PERIMETRO DE UN CUADRADO
lado = 12;
System.out.println( 4 * lado );

//13.- AREA DE UN RECTANGULO
int base = 18;
int altura = 7;
System.out.println( base * altura );

//14.- PERIMETRO DE UN RECTANGULO
int largo = 22;
int ancho = 9;
System.out.println( 2 * ( largo + ancho ) );

//15.- AREA DE UN TRIANGULO
base = 16;
altura = 11;
System.out.println( ( base * altura ) / 2.0 );

//16.- AREA DE UN TRAPECIO

int baseMayor = 20;
int baseMenor = 12;
altura = 8;
System.out.println( ( (baseMayor + baseMenor) * altura ) / 2.0 );

//17.- AREA DE UN ROMBO
int diagonalMayor = 18;
int diagonalMenor = 10;
System.out.println( ( diagonalMayor * diagonalMenor ) / 2.0 );

//18.- AREA DE UN CIRCULO
double radio = 6.0;
System.out.println( Math.PI * radio * radio );

//19.- LONGITUD DE UNA CIRCUNFERENCIA
radio = 8.0;
System.out.println( 2 * Math.PI * radio );

//20.- VOLUMEN DE UN CUBO
int arista = 5;
System.out.println( arista * arista * arista );

//21.- VOLUMEN DE UN PRISMA RECTANGULAR
largo = 12;
ancho = 6;
altura = 4;
System.out.println( largo * ancho * altura );

//22.- VOLUMEN DE UN CILINDRO
radio = 4.0;
double altura2 = 10.0;
System.out.println( Math.PI * radio * radio * altura );

//23.- DISTANCIA RECORRIDA
double velocidad = 85.0; // en km/h
double tiempo = 3.5; // en horas
System.out.println( velocidad * tiempo );

//24.- VELOCIDAD PROMEDIO
double distancia = 540.0; // en km
tiempo = 6.0; // en horas
System.out.println( distancia / tiempo );

//25.- TIEMPO DE VIAJE
distancia = 360.0; // en km
velocidad = 80.0; // en km/h
System.out.println( distancia / velocidad );

//26.- CONVERSIÓN DE HORAS A MINUTOS Y SEGUNDOS
double horas = 2.5; // en horas
System.out.println( horas * 60 ); // en minutos
System.out.println( horas * 3600 ); // en segundos

//27.- CONVERSIÓN DE SEGUNDOS A HORAS Y MINUTOS
double segundos = 10000.0; // en segundos
System.out.println( segundos / 3600 ); // en horas
System.out.println( segundos / 60 ); // en minutos

//28.- CELSIUS A FAHRENHEIT
double temperatura = 28.0; // en grados Celsius
System.out.println( ( temperatura * 9 / 5 ) + 32 );

//29.- FAHRENHEIT A CELSIUS
temperatura = 95.0; // en grados Fahrenheit
System.out.println( ( temperatura - 32 ) * 5 / 9 );

//30.- CONSUMO DE COMBUSTIBLE
double distanciaRecorrida = 525.0; // en km
double combustibleConsumido = 35.0; // en litros
System.out.println( distanciaRecorrida / combustibleConsumido ); // en km/l

//31.- SUELDO SEMANAL
double horasTrabajadas = 44.0; // en horas
double tarifaPorHora = 22.5; // en soles por hora
System.out.println( horasTrabajadas * tarifaPorHora );

//32.- IMPORTE DE UNA COMPRA
double precioUnitario = 7.8; // en soles
double cantidad = 18.0; // en unidades
System.out.println( precioUnitario * cantidad );

//33.- DESCUENTO COMERCIAL
double precioOriginal = 1200.0; // en soles
double porcentajeDescuento = 15.0; // en porcentaje
System.out.println( precioOriginal * porcentajeDescuento / 100 );
System.out.println( precioOriginal - ( precioOriginal * porcentajeDescuento / 100 ) );

//34.- PRECIO CON IGV
double precioSinIGV = 850.0; // en soles
double porcentajeIGV = 18.0; // en porcentaje
System.out.println( precioSinIGV * porcentajeIGV / 100 );
System.out.println( precioSinIGV + ( precioSinIGV * porcentajeIGV / 100 ) );

//35.- DESCUENTO E IGV
double precioProducto = 1600.0; // en soles
porcentajeDescuento = 10.0; // en porcentaje
porcentajeIGV = 18.0; // en porcentaje
System.out.println( precioProducto - ( precioProducto * porcentajeDescuento / 100 ) );
System.out.println( ( precioProducto - ( precioProducto * porcentajeDescuento / 100 ) ) + ( ( precioProducto - ( precioProducto * porcentajeDescuento / 100 ) ) * porcentajeIGV / 100 ) );
} // Fin del método main
} // Fin de la clase OperadoresAritméticos
