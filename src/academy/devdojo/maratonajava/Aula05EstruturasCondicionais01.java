package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // ! = se não ou else

        if (isAutorizadoComprarBebida != false) {
            System.out.println("Pode tomar bebida alcólica.");
        } else {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
        if (!isAutorizadoComprarBebida) {

        }
        boolean c = false;
        if (c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
    }
}
