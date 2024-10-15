public class Java04WrapperClass {
    public static void main(String[] args) {
        /*
         * Classes Wrapper:
         * Oferece funcionalidades, metodos proprios. Já os tipos primitivos não.
         * 
         * Buscar usar sempre os metodos ja existentes.
         */
        Byte idade = 35;
        Integer codigo = 1353540;
        Double preco = 250.90;
        String nome = "Leandro";
        
        System.out.println(nome);
        System.out.println(idade);
        
        nome = nome.concat(" Cardoso ").concat(idade.toString());
        System.out.println(nome);
    }
}
