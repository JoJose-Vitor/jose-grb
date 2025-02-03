package Programacao_Orientada_a_Objetos.lista2poo;

import java.util.Scanner;

public class lista2exerciciopoo {

    public static int QuantidadePerguntas = 3;
    public static String[] Respostas = new String[QuantidadePerguntas];
    public static String[] Gabarito = new String[QuantidadePerguntas];
    public static Scanner scanner = new Scanner(System.in);

    public static String NomeFormatado(String nomecerto){

        String[] NomeSeparado = new String[nomecerto.length()];

        NomeSeparado = nomecerto.split("");

        for(int i =  0; i < NomeSeparado.length; i++){
            if (i == 0){
                NomeSeparado[i] = NomeSeparado[i].toUpperCase();
            }else{
                NomeSeparado[i] = NomeSeparado[i].toLowerCase();
            }
        }

        nomecerto = "";

        for(String letras : NomeSeparado){
            nomecerto = (nomecerto + letras);
        }

        return nomecerto;
    }

    public static String SeuNome(String nome){

        System.out.println("Informe o seu nome: ");
        nome = scanner.nextLine();
        
        NomeFormatado(nome);

        return nome;
    }

    public static String Saudacao(String IniciaQuiz){
        IniciaQuiz = String.format(
        """

            Olá, %s!

            Seja bem vindo ao Quiz!

            Aqui você irá responder perguntas com 5 alternativas

            Ao final, você terá uma pontuação com o numero de respostas corretas!
            
            Assim que estiver pronto, aperte 'Enter' para começar o Quiz!
                """,
            NomeFormatado(IniciaQuiz)
        );
        System.out.println(IniciaQuiz);
        String Enter = scanner.nextLine();
        return IniciaQuiz;
    }

    public static String pergunta1(String resposta1){
        System.out.println(
            """

                Primeira Pergunta:

                Qual a primeira letra do alfabeto?

                1 - B
                2 - D
                3 - A
                4 - C
                5 - E

                Informe o número correspondente com a alternativa correta:

                """);

                if(conferencia(true) == true){
                    resposta1 = Respostas[0];
                    Gabarito[0] = "3";
                    return resposta1;
                    }else{
                    pergunta1(resposta1);
                    }
                    return resposta1;
    }

    public static String pergunta2(String resposta2){
        System.out.println(
            """

                Segunda Pergunta:
                Quanto é 10 x 10?

                1 - 327
                2 - 903
                3 - 88
                4 - 420169
                5 - 100

                Informe o número correspondente com a alternativa correta:

                """);
                if (conferencia(true) == true){
                    resposta2 = Respostas[1];
                    Gabarito[1] = "5";
                    return resposta2;
                    }else{pergunta2(resposta2);
                    }
                    return resposta2;

    }

        public static String pergunta3(String resposta3){
            System.out.println(
            """

                Terceira Pergunta:
                Qual a capital da Bélgica?

                1 - Praga
                2 - Bruxelas
                3 - Varsóvia
                4 - Zagrebe
                5 - Bucareste
    
                Informe o número correspondente com a alternativa correta:

                """);

            if (conferencia(true) == true){
            resposta3 = Respostas[2];
            Gabarito[2] = "2";
            return resposta3;
            }else{pergunta3(resposta3);
            }
            return resposta3;
    }

    public static boolean conferencia(boolean NaoVazio){

        String resposta = scanner.nextLine();

        if(resposta.isBlank()){
            System.out.println(
                """

            Incorreto, informe um valor válido!

            """);
            NaoVazio = false;
        }else{
            for(int i = 0; i < QuantidadePerguntas; i++){
                if(Respostas[i] == null){
                Respostas[i] = resposta;
                NaoVazio = true;
                return NaoVazio;   
            }
            }       
        }
        return NaoVazio;    
    }

    public static String Resultado(String ResultadoQuiz){

        int acertos = 0;

        for(int j = 0; j < QuantidadePerguntas; j++){
            if(Respostas[j].equals(Gabarito[j])){
                acertos = acertos + 1;
            }
        }

        String parabenizacao = "";

        switch(acertos){

            case 0:
            parabenizacao = "que pena, poderia ter se esforçado mais, tente novamente";
            break;
            
            case 1:
            parabenizacao = "que bom, estude um pouco para conseguir melhores resultados";
            break;

            case 2:
            parabenizacao = "quase perfeito, você foi muito bem";
            break;
            
            case 3:
            parabenizacao = "Perfeito! Você completou totalmente o quiz";
            break;
        }

        System.out.println( String.format(
        """

            Você acertou %s das 3 perguntas, %s!  
            
            """,
            acertos,
            parabenizacao
            )
        );
    
    return ResultadoQuiz;
    }

    public static String agradecimento(String agradecenome){
        System.out.println( String.format(
        """

            Obrigado por participar do Quiz, %s
            Continue estudando para aprender cada vez mais e participar novamente!
            Até mais!

            """,
            NomeFormatado(agradecenome)
            ));
    return agradecenome;
    }
    public static void main(String[] args){
        String chamanome = SeuNome("");
        Saudacao(chamanome);
        pergunta1("");
        pergunta2("");
        pergunta3("");
        Resultado("");
        agradecimento(chamanome);
    }

}
