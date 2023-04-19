import java.util.ArrayList;

public class Ticket {
    private ArrayList<Item> carrito;
    public Ticket(){
        carrito = new ArrayList<>();
    }
    public void agregarItem(Item nuevo){
        carrito.add(nuevo);
    }

    public int cantidadItems(){
        return carrito.size();
    }
    public double total(){
        int suma = 0;

        for(Item it:carrito){
            suma += it.subTotal();
        }
        return suma;
    }

    @Override
    public String toString() {
        String listado = String.format("| %36s | %8d | \n","Items",cantidadItems());

        for(Item it: carrito ){
            listado += it.toString() + "\n";
        }
        listado += String.format(   "| %36s | %8.2f |", "Total", total() );
        return listado;
    }
}
