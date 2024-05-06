import java.util.Scanner;

public class MenuTransferencia extends Transferencia {

    public void menu(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do pagante: ");
        String nome01 = scanner.nextLine();
        System.out.println("Idade do pagante: ");
        int idade01 = scanner.nextInt();
        Conta contaVitor = new Conta(1500, nome01, idade01); // getSaldo aqui!!!
        scanner.nextLine();

        System.out.println("Nome do recebedor: ");
        String nome02 = scanner.nextLine();
        System.out.println("Idade do recebedor: ");
        int idade02 = scanner.nextInt();
        scanner.nextLine();

        Usuario Vitor = new Usuario(nome01, idade01);

        Usuario Maria = new Usuario(nome02, idade02);

        System.out.println("Valor repassado: ");
        int valor = scanner.nextInt();
        boolean verificacao = contaVitor.isValidSaldo(valor); // Valor da transferência

        if(verificacao){
            Conta contaMaria = new Conta(valor, nome02, idade02);
            transferenciaDeValor(Maria, contaMaria);
        }

        transferenciaDeValor(Vitor, contaVitor);

        System.out.println("Não foi possível fazer a trasferência!!! ");


    }

}
