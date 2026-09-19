class  Ejercicio50 {
public static void main(String[] args) {

//50.- PROBLEMA INTEGRADOR
double cantidad = 300.0; // en unidades
double precioUnitario = 16.8; // en soles
double porcentajeGanancia = 30.0; // en porcentaje
double porcentajeIGV = 18.0; // en porcentaje
System.out.println( cantidad * precioUnitario ); // Costo total
System.out.println( cantidad * precioUnitario * porcentajeGanancia / 100 ); // Ganancia
System.out.println( ( cantidad * precioUnitario ) + ( cantidad * precioUnitario * porcentajeGanancia / 100 ) ); // Valor de venta
System.out.println( ( ( cantidad * precioUnitario ) + ( cantidad * precioUnitario * porcentajeGanancia / 100 ) ) * porcentajeIGV / 100 ); // IGV
System.out.println( ( cantidad * precioUnitario ) + ( cantidad * precioUnitario * porcentajeGanancia / 100 ) + ( ( cantidad * precioUnitario ) + ( cantidad * precioUnitario * porcentajeGanancia / 100 ) ) * porcentajeIGV / 100 ); // Precio total
System.out.println( ( ( cantidad * precioUnitario ) + ( cantidad * precioUnitario * porcentajeGanancia / 100 ) + ( ( cantidad * precioUnitario ) + ( cantidad * precioUnitario * porcentajeGanancia / 100 ) ) * porcentajeIGV / 100 ) / cantidad ); // Precio final por unidad
    
} // Fin del método main
} // Fin de la clase Ejercicio50
