import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public  class Coche {
    int kilometraje;
    String modelo;

    @Override
    public String toString() {
        return "Coche{" +
                "kilometraje=" + kilometraje +
                ", modelo='" + modelo + '\'' +
                '}';
    }




    public static void main(String[] args) {
        Coche c1=new Coche(100,"kia");
        System.out.println("hola mundo");
        String modelo1 = c1.toString();
        System.out.println(modelo1);
    }
}
