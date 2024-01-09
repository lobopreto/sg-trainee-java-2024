import java.io.IOException;
import java.util.Scanner;

public class Animais {

public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    String tipo1 = leitor.next();
    String tipo2 = leitor.next();
    String tipo3 = leitor.next();
    if (tipo1("vertebrado")) {
        if (tipo2("ave")) {
            if (tipo3("carnivoro")) {
                System.out.println("aguia");
            } else {
                System.out.println("pomba");
            }
        } else {
            if (tipo3("onivoro")) {
                System.out.println("homem");
            } else {
                System.out.println("vaca");
            }
        }
    } else {
        if (tipo2("inseto")) {
            if (tipo3("hematofago")) {
                System.out.println("pulga");
            } else {
                System.out.println("lagarta");
            }
        } else {
            if (tipo3("hematofago")) {
                System.out.println("sanguessuga");
            } else {
                System.out.println("minhoca");
            }
        }
    }
}

}