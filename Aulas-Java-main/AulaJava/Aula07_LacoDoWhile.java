package AULAJAVA;

public class Aula07_LacoDoWhile {
    public static void main(String[] args) {
        int energia = 0;

        // Executa o bloco obrigatoriamente pelo menos uma vez antes de testar
        do {
            System.out.println("Tentando desferir um golpe mesmo cansado...");
        } while (energia > 0);
    }
}