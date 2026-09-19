class  Ejercicio35 {
public static void main(String[] args) {

//35.- DESCUENTO E IGV
double precioProducto = 1600.0; // en soles
double porcentajeDescuento = 10.0; // en porcentaje
double porcentajeIGV = 18.0; // en porcentaje
System.out.println( precioProducto - ( precioProducto * porcentajeDescuento / 100 ) ); // Precio con descuento
System.out.println( ( precioProducto - ( precioProducto * porcentajeDescuento / 100 ) ) + ( ( precioProducto - ( precioProducto * porcentajeDescuento / 100 ) ) * porcentajeIGV / 100 ) ); // Precio con descuento e IGV
    
} // Fin del método main
} // Fin de la clase Ejercicio35
