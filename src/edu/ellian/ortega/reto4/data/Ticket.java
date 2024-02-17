
package edu.ellian.ortega.reto4.data;

public class Ticket {
   private Usuario usuario;
   private double importe;

   public Ticket(Usuario usuario, double importe) {
      this.usuario = usuario;
      this.importe = importe;
   }

   public void mostrarDatosCompra() {
      System.out.println("Ticket de venta:");
      System.out.println("Nombre completo del comprador: " + usuario.getNombreCompleto());
      System.out.println("Cantidad de boletos: " + usuario.getCantidadBoletos());
      System.out.println("Importe: $" + importe);
   }
}