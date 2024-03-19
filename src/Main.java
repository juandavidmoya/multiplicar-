import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("entre un numero: ");
        int n = scanner.nextInt();
       System.out.print("elija un tipo de bucle (for/while/do-while): ");
        String eleccion = scanner.next();
        int sum=0;
        int i=1;
        // Usando  a while bucle


        switch (eleccion) {
            case "for":
                for (;i <= n;i++) {
                    sum +=i*i;
                    System.out.println("Suma usando el bucle: " + sum);
                }
                break;


            // Usando el  do-while bucle

            case "while": {
                while (i <= n);
                    sum += i * i;
                    i++;
                }
                break;

            // usando  a for bucle
        case "do-while":
            do {
            sum +=i*i;
            i++;
        } while (i<= n);
        break;

        default: {
            System.out.println("el numero que digito no es valido");
            return;
        }
    }
}
}
