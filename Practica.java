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
System.out.println( dividendo / divisor ); // Cociente
System.out.println( dividendo % divisor ); // Residuo

//4.- DOBLE, TRIPLE Y MITAD
int numero = 24;
System.out.println( numero * 2 );
System.out.println( numero * 3 );
System.out.println( numero / 2 );

//5.- CUADRADO Y CUBO
numero = 7;
System.out.println( numero * numero ); // Cuadrado
System.out.println( numero * numero * numero ); // Cúbo

//6.- PROMEDIO DE TRES NOTAS
int nota1 = 14;
int nota2 = 17;
int nota3 = 16;
System.out.println( (nota1 + nota2 + nota3) / 3.0 ); // Promedio de las tres notas

//7.- PROMEDIO DE CUATRO PRACTICAS
int practica1 = 15;
int practica2 = 13;
int practica3 = 18;
int practica4 = 16;
System.out.println( (practica1 + practica2 + practica3 + practica4) / 4.0 ); // Promedio de las cuatro prácticas

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
System.out.println( lado * lado ); // Area del cuadrado

//12.- PERIMETRO DE UN CUADRADO
lado = 12;
System.out.println( 4 * lado ); // Perímetro del cuadrado

//13.- AREA DE UN RECTANGULO
int base = 18;
double altura = 7;
System.out.println( base * altura ); // Area del rectángulo

//14.- PERIMETRO DE UN RECTANGULO
int largo = 22;
int ancho = 9;
System.out.println( 2 * ( largo + ancho ) ); // Perímetro del rectángulo

//15.- AREA DE UN TRIANGULO
base = 16;
altura = 11;
System.out.println( ( base * altura ) / 2.0 ); // Area del triángulo

//16.- AREA DE UN TRAPECIO

int baseMayor = 20;
int baseMenor = 12;
altura = 8;
System.out.println( ( (baseMayor + baseMenor) * altura ) / 2.0 ); // Area del trapecio

//17.- AREA DE UN ROMBO
int diagonalMayor = 18;
int diagonalMenor = 10;
System.out.println( ( diagonalMayor * diagonalMenor ) / 2.0 ); // Area del rombo

//18.- AREA DE UN CIRCULO
double radio = 6.0;
System.out.println( Math.PI * radio * radio ); // Area del círculo

//19.- LONGITUD DE UNA CIRCUNFERENCIA
radio = 8.0;
System.out.println( 2 * Math.PI * radio ); // Longitud de la circunferencia

//20.- VOLUMEN DE UN CUBO
int arista = 5;
System.out.println( arista * arista * arista ); // Volumen del cubo

//21.- VOLUMEN DE UN PRISMA RECTANGULAR
largo = 12;
ancho = 6;
altura = 4;
System.out.println( largo * ancho * altura ); // Volumen del prisma rectangular

//22.- VOLUMEN DE UN CILINDRO
radio = 4.0;
altura = 10.0;
System.out.println( Math.PI * radio * radio * altura ); // Volumen del cilindro

//23.- DISTANCIA RECORRIDA
double velocidad = 85.0; // en km/h
double tiempo = 3.5; // en horas
System.out.println( velocidad * tiempo ); // Distancia recorrida en km

//24.- VELOCIDAD PROMEDIO
double distancia = 540.0; // en km
tiempo = 6.0; // en horas
System.out.println( distancia / tiempo ); // Velocidad promedio en km/h

//25.- TIEMPO DE VIAJE
distancia = 360.0; // en km
velocidad = 80.0; // en km/h
System.out.println( distancia / velocidad ); // Tiempo de viaje en horas

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
System.out.println( ( temperatura * 9 / 5 ) + 32 ); // En grados Fahrenheit

//29.- FAHRENHEIT A CELSIUS
temperatura = 95.0; // en grados Fahrenheit
System.out.println( ( temperatura - 32 ) * 5 / 9 ); // En grados Celsius

//30.- CONSUMO DE COMBUSTIBLE
double distanciaRecorrida = 525.0; // en km
double combustibleConsumido = 35.0; // en litros
System.out.println( distanciaRecorrida / combustibleConsumido ); // Rendimiento en km/l

//31.- SUELDO SEMANAL
double horasTrabajadas = 44.0; // en horas
double tarifaPorHora = 22.5; // en soles por hora
System.out.println( horasTrabajadas * tarifaPorHora ); // Sueldo semanal

//32.- IMPORTE DE UNA COMPRA
double precioUnitario = 7.8; // en soles
double cantidad = 18.0; // en unidades
System.out.println( precioUnitario * cantidad ); // Importe total de la compra

//33.- DESCUENTO COMERCIAL
double precioOriginal = 1200.0; // en soles
double porcentajeDescuento = 15.0; // en porcentaje
System.out.println( precioOriginal * porcentajeDescuento / 100 ); // Monto del descuento
System.out.println( precioOriginal - ( precioOriginal * porcentajeDescuento / 100 ) ); // Precio con descuento

//34.- PRECIO CON IGV
double precioSinIGV = 850.0; // en soles
double porcentajeIGV = 18.0; // en porcentaje
System.out.println( precioSinIGV * porcentajeIGV / 100 ); // Monto del IGV
System.out.println( precioSinIGV + ( precioSinIGV * porcentajeIGV / 100 ) ); // Precio con IGV

//35.- DESCUENTO E IGV
double precioProducto = 1600.0; // en soles
porcentajeDescuento = 10.0; // en porcentaje
porcentajeIGV = 18.0; // en porcentaje
System.out.println( precioProducto - ( precioProducto * porcentajeDescuento / 100 ) ); // Precio con descuento
System.out.println( ( precioProducto - ( precioProducto * porcentajeDescuento / 100 ) ) + ( ( precioProducto - ( precioProducto * porcentajeDescuento / 100 ) ) * porcentajeIGV / 100 ) ); // Precio con descuento e IGV

//36.- COMISION DE VENTAS
double ventas = 12500.0; // en soles
double comision = 6.0; // en porcentaje
double sueldoBase = 1400.0; // en soles
System.out.println( ventas * comision / 100 ); // Comision
System.out.println( sueldoBase + ( ventas * comision / 100 ) ); // Sueldo total

//37.- INTERES SIMPLE
double capital = 5000.0; // en soles
double tasaInteres = 8.0; // en porcentaje
tiempo = 3.0; // en años
System.out.println( capital * tasaInteres * tiempo / 100 ); // Interés simple
System.out.println( capital + ( capital * tasaInteres * tiempo / 100 ) ); // Monto total

//38.- REPARTO PORCENTUAL
double total = 9000.0; // en soles
double porcentaje1 = 40.0; // en porcentaje
double porcentaje2 = 35.0; // en porcentaje
double porcentaje3 = 25.0; // en porcentaje
System.out.println( total * porcentaje1 / 100 ); // Monto del primer porcentaje
System.out.println( total * porcentaje2 / 100 ); // Monto del segundo porcentaje
System.out.println( total * porcentaje3 / 100 ); // Monto del tercer porcentaje

//39.- COSTO DE PRODUCCIÓN
double unidadesProducidas = 250.0;
double costoUnitario = 18.5; // en soles
System.out.println( unidadesProducidas * costoUnitario ); // Costo total de producción

//40.- PRECIO DE VENTA
double costoProduccion = 4625.0; // en soles
double margenGanancia = 25.0; // en porcentaje
System.out.println( costoProduccion + ( costoProduccion * margenGanancia / 100 ) ); // Precio de venta

//41- DENSIDAD
double masa = 540.0; // en g
double volumen = 60.0; // en cm^3
System.out.println( masa / volumen ); // Densidad en g/cm^3

//42.- PRESION
double fuerza = 720.0; // en N
double area = 24.0; // en m^2
System.out.println( fuerza / area ); // Presión en Pa

//43.- TRABAJO MECÁNICO
fuerza = 150.0; // en N
distancia = 18.0; // en m
System.out.println( fuerza * distancia ); // Trabajo en J

//44.- LEY DE OHM
double voltaje = 220.0; // en V
double resistencia = 44.0; // en Ω
System.out.println( voltaje / resistencia ); // Corriente en A

//45.- POTENCIA ELECTRICA
voltaje = 220.0; // en V
double corriente = 5.0; // en A
System.out.println( voltaje * corriente ); // Potencia en W

//46.- ENERGIA ELECTRICA
double potencia = 1200.0; // en W
tiempo = 6.0; // en horas
System.out.println( potencia * tiempo ); // Energía en Wh
System.out.println( ( potencia * tiempo ) / 1000 ); // Energía en kWh

//47.- INDICE DE MASA CORPORAL (IMC)
double peso = 72.0; // en kg
double alturaIMC = 1.74; // en m
System.out.println( peso / ( alturaIMC * alturaIMC ) ); // IMC

//48.- HIPOTENUSA 
double cateto1 = 9.0; // en m
double cateto2 = 12.0; // en m
System.out.println( Math.sqrt( ( cateto1 * cateto1 ) + ( cateto2 * cateto2 ) ) ); // Hipotenusa

//49.- DESCOMPOSICIÓN DE TRES CIFRAS
numero = 748;
System.out.println( numero / 100 ); // Centenas
System.out.println( ( numero / 10 ) % 10 ); // Decenas
System.out.println( numero % 10 ); // Unidades

//50.- PROBLEMA INTEGRADOR
cantidad = 300.0; // en unidades
precioUnitario = 16.8; // en soles
double porcentajeGanancia = 30.0; // en porcentaje
porcentajeIGV = 18.0; // en porcentaje
System.out.println( cantidad * precioUnitario ); // Costo total
System.out.println( cantidad * precioUnitario * porcentajeGanancia / 100 ); // Ganancia
System.out.println( ( cantidad * precioUnitario ) + ( cantidad * precioUnitario * porcentajeGanancia / 100 ) ); // Valor de venta
System.out.println( ( ( cantidad * precioUnitario ) + ( cantidad * precioUnitario * porcentajeGanancia / 100 ) ) * porcentajeIGV / 100 ); // IGV
System.out.println( ( cantidad * precioUnitario ) + ( cantidad * precioUnitario * porcentajeGanancia / 100 ) + ( ( cantidad * precioUnitario ) + ( cantidad * precioUnitario * porcentajeGanancia / 100 ) ) * porcentajeIGV / 100 ); // Precio total
System.out.println( ( ( cantidad * precioUnitario ) + ( cantidad * precioUnitario * porcentajeGanancia / 100 ) + ( ( cantidad * precioUnitario ) + ( cantidad * precioUnitario * porcentajeGanancia / 100 ) ) * porcentajeIGV / 100 ) / cantidad ); // Precio final por unidad

} // Fin del método main
} // Fin de la clase OperadoresAritméticos