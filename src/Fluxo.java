public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        }catch (MinhaExcecao | MinhaOutraExcecao ex){
            System.out.println(ex.getMessage());

        }

        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaOutraExcecao{
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaOutraExcecao {
        System.out.println("Ini do metodo2");
        //throw new MinhaExcecao("Teste");
        throw new MinhaOutraExcecao("Teste2");

        //System.out.println("Fim do metodo2");
    }
}