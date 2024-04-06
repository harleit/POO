package teste;

import model.PessoaJuridica;
import model.ValidarDocumentosPessoaJuridica;

import java.util.ArrayList;
import java.util.List;

public class TestaDocumentoPessoaJuridica {

    public static String geraDocumentoAleatorio(int tamanho){

        return ("62"+String.valueOf(
                Math.random()*10).substring(2,(tamanho-1))
                +(Math.floor(Math.random()*10)%2==0 ? 'A' : '1'));
    }

    public static void main(String[] args) {

        List<PessoaJuridica> pessoasJuridicas = new ArrayList<>();



        for (int i = 0; i<100; i++) {

            PessoaJuridica pf = new PessoaJuridica();
            pf.setNome("Pessoa "+(i+1));
            pf.setDocumento(geraDocumentoAleatorio(14));;
            pf.setAliquota(1.95);

            pessoasJuridicas.add(pf);

        }

        //Executar o objeto validador
        ValidarDocumentosPessoaJuridica validador =
                new ValidarDocumentosPessoaJuridica();

        for (PessoaJuridica p: pessoasJuridicas){
            validador.addPessoaJuridica(p);
        }

        //Mostrar os validos
        System.out.println("************MOSTRAR OS VALIDOS******************");
        for (PessoaJuridica p:validador.getValidos()){

            System.out.println(p.getNome());
            System.out.println(p.getDocumento());
            System.out.println(p.getAliquota());
            System.out.println();


        }
        //Mostrar os invalidos

        System.out.println("************MOSTRAR OS INVALIDOS******************");
        for (PessoaJuridica p:validador.getInvalidos()){

            System.out.println(p.getNome());
            System.out.println(p.getDocumento());
            System.out.println(p.getAliquota());
            System.out.println();

        }
    }
}

