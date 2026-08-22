# Práctica de aplicación de estándares de codificación en Java.

# Bad practices in java code

| Error                  | Correccion                       |
|------------------------|----------------------------------|
| Constructor mal hecho  | this.CODIGO = c; this.Nombre = n;|
|                        | this.Precio = p;                 |
| Variables poco         | codigoProducto, nombreProducto,  |
| descriptivas           | precioProducto                   |
| Encapsulamiento de los | private CODIGO, private Nombre,  |
| atributos de clase     | private Precio                   |
| Nombramiento de clase  | Producto.java                    |
| Inconsistencia en el   | Codigo, Nombre, Precio           |
| estilo de nombramiento |                                  |
| Llaves y espacios      | public class producto{           |
|                        |      // Atributos                |
|                        |      public producto(parametros){|
|                        |          // this                 |
|                        |      }                           |
|                        |                                  |
|                        |      public void Mostrar(){      |
|                        |          // Codigo               |
|                        |      }                           |
|                        |   }                              |
| Formato incorrecto de  | Producto.java, producto, codigo  |
| nombres de clases y    | etc.                             |
| variables              |                                  |
| Malas practicas en el  | System.out.println("Codigo: " +  |
| print                  | CODIGO);                         |