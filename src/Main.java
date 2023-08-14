import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a força do objeto em questão: ");
        double forca = scanner.nextDouble();
        System.out.println("Digite a massa do objeto em questão: ");
        double massa = scanner.nextDouble();
        Objeto objeto = new Objeto(forca, massa);
        System.out.println("A aceleração do objeto em questão é: " + objeto.getAceleracaoObjeto() + " m/s².");

    }
}