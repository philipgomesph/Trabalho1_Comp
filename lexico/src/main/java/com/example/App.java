package com.example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Start program" );

        
        String fileName = "test.txt";

        substituirTabulacao(fileName);

        Lexico lexico = new Lexico(fileName);

        Token token = new Token();

        while(token.getClasse() != TokenEnum.cEOF){
            token = lexico.getToken();
            System.out.println(token);
        }

        
    }

    public static void substituirTabulacao(String nomeArquivo) {
        Path caminhoArquivo = Paths.get(nomeArquivo);
        
        StringBuilder palavraS = new StringBuilder();
        int espacosTab = 4;
        
        String espacos;

        for (int cont = 0; cont < espacosTab; cont++) {
            palavraS.append(" ");
        }


        espacos = palavraS.toString();

        String conteudo;
        try {

            conteudo = new String(Files.readAllBytes(caminhoArquivo), StandardCharsets.UTF_8);

            conteudo = conteudo.replace("\t", espacos);

            Files.write(caminhoArquivo, conteudo.getBytes(StandardCharsets.UTF_8));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
