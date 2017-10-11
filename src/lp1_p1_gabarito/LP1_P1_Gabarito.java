package lp1_p1_gabarito;

import java.util.Scanner;

public class LP1_P1_Gabarito {

    public static void main(String[] args) {

        // Questão 02, letra a) -------------------------
        Pessoa vivente = new Pessoa();
        Pessoa paiVivente = new Pessoa();
        Pessoa maeVivente = new Pessoa();
        Pessoa filho1 = new Pessoa();
        Pessoa filho2 = new Pessoa();
        Pessoa filho3 = new Pessoa();

        vivente.setNome("João da Silva");
        vivente.setEndereco("Rua do Sabugueiro, 87");
        vivente.setTelefone("(12)99111-2222");
        vivente.setDataNascimento("12/09/1975");

        paiVivente.setNome("Antonio da Silva");
        paiVivente.setEndereco("Rua das Margaridas, 654");
        paiVivente.setTelefone("(12)99222-3333");
        paiVivente.setDataNascimento("15/12/1952");

        maeVivente.setNome("Lucia Maria Carvalho da Silva");
        maeVivente.setEndereco("Rua das Margaridas, 654");
        maeVivente.setTelefone("(12)99333-4444");
        maeVivente.setDataNascimento("21/04/1950");

        filho1.setNome("Luiz Américo da Costa Silva");
        filho1.setEndereco("Avenida do Gaúcho, 24");
        filho1.setTelefone("(12)99444-5555");
        filho1.setDataNascimento("02/01/2000");

        filho2.setNome("Ana Maria da Costa Silva Mendonça");
        filho2.setEndereco("Rua Antonio Marreco, 113");
        filho2.setTelefone("(12)99555-6666");
        filho2.setDataNascimento("26/11/2006");

        filho3.setNome("Marcelo da Costa Silva");
        filho3.setEndereco("Rua do Sabugueiro, 87");
        filho3.setTelefone("(12)99666-7777");
        filho3.setDataNascimento("02/01/2015");

        // FIM Questão 02, letra a) ---------------------
        // Questão 2, letra b) -------------------------
        vivente.setPai(paiVivente);
        vivente.setMae(maeVivente);
        vivente.adicionarFilho(filho1);
        vivente.adicionarFilho(filho2);
        vivente.adicionarFilho(filho3);

        filho1.setPai(vivente);
        filho2.setPai(vivente);
        filho3.setPai(vivente);

        paiVivente.adicionarFilho(vivente);
        maeVivente.adicionarFilho(vivente);
        // FIM Questão 02, letra b) ---------------------

        // Questão 2, letra c) -------------------------
        System.out.println(vivente.toString());
        // FIM Questão 02, letra c) ---------------------

        Pessoa pessoas[] = new Pessoa[32];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();
            pessoas[i].setNome("p" + (i + 1));
        }

        // declaração de filhos de p1 e p2
        pessoas[0].adicionarFilho(pessoas[2]);
        pessoas[1].adicionarFilho(pessoas[2]);
        pessoas[0].adicionarFilho(pessoas[3]);
        pessoas[1].adicionarFilho(pessoas[3]);
        pessoas[0].adicionarFilho(pessoas[4]);
        pessoas[1].adicionarFilho(pessoas[4]);
        pessoas[0].adicionarFilho(pessoas[5]);
        pessoas[1].adicionarFilho(pessoas[5]);

        // Adicionando filhos de p3 e p7
        pessoas[2].adicionarFilho(pessoas[7]);
        pessoas[2].adicionarFilho(pessoas[8]);
        pessoas[6].adicionarFilho(pessoas[7]);
        pessoas[6].adicionarFilho(pessoas[8]);

        // Adicionando filhos de p4 e p10
        pessoas[3].adicionarFilho(pessoas[10]);
        pessoas[3].adicionarFilho(pessoas[18]);
        pessoas[9].adicionarFilho(pessoas[10]);
        pessoas[9].adicionarFilho(pessoas[18]);
        
        // Adicionando filhos de p6 p27
        pessoas[5].adicionarFilho(pessoas[27]);
        pessoas[5].adicionarFilho(pessoas[28]);
        pessoas[26].adicionarFilho(pessoas[27]);
        pessoas[26].adicionarFilho(pessoas[28]);
        
        // Adicionando filhos de p11 e p12
        pessoas[10].adicionarFilho(pessoas[12]);
        pessoas[10].adicionarFilho(pessoas[13]);
        pessoas[10].adicionarFilho(pessoas[14]);
        pessoas[11].adicionarFilho(pessoas[12]);
        pessoas[11].adicionarFilho(pessoas[13]);
        pessoas[11].adicionarFilho(pessoas[14]);
        
        // Adicionando filhos de p19 e p20
        pessoas[18].adicionarFilho(pessoas[20]);
        pessoas[18].adicionarFilho(pessoas[22]);
        pessoas[19].adicionarFilho(pessoas[20]);
        pessoas[19].adicionarFilho(pessoas[22]);
        
        // Adicionando filhos de p29 e p30
        pessoas[28].adicionarFilho(pessoas[30]);
        pessoas[29].adicionarFilho(pessoas[30]);
        
        // Adicionando filhos de p15 e p16
        pessoas[14].adicionarFilho(pessoas[16]);
        pessoas[14].adicionarFilho(pessoas[17]);
        pessoas[15].adicionarFilho(pessoas[16]);
        pessoas[15].adicionarFilho(pessoas[17]);
        
        // Adicionando filhos de p22 e p23
        pessoas[21].adicionarFilho(pessoas[23]);
        pessoas[21].adicionarFilho(pessoas[24]);
        pessoas[22].adicionarFilho(pessoas[23]);
        pessoas[22].adicionarFilho(pessoas[24]);
        
        // Adicionando filho de p31
        pessoas[30].adicionarFilho(pessoas[31]);
        
        // Adicionando filho de p25
        pessoas[24].adicionarFilho(pessoas[25]);
        
        

    }

}
