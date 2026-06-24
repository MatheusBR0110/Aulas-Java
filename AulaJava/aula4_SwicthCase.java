package AULAJAVA;

public class Aula04_SwitchCase {

    public static void main(String[] args) {
        int opcaoMenu = 2;

        swicth(opcaoMenu) {
            case 1:
                System.out.println("Iniciando");
                break;
                case 2:
                    System.out.println("Carregando jogo salvo");
                    break;
                case 3:
                    System.out.println("Saino do programa");
                    break;
            
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}