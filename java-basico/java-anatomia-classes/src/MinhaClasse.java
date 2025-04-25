public class MinhaClasse {
    public static void main (String [] args) {
        String primeiroNome = "Anna";
        String segundoNome = "Souza";


        //chamando método dentro de uma variável
        String nomecompleto = nomeCompleto(primeiroNome, segundoNome);
        //impimindo a varável 
        System.out.println(nomecompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método:" + primeiroNome.concat(" ").concat(segundoNome);
    }
}
