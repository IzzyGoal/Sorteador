package com.example.sorteador;

import javax.swing.*;

/**

 * essa é a classe main, onde vai acontecer a magica, onde o programa vai pegar os elementos para rodar a aplicação;

 */

public class Sorteio {



    public static void main(String[] args) {

        /**

         * aqui a gente instancia a classe para poder inserir os dados e usar seus metodos/atributos

         */

        Sorteador sorteador =  new Sorteador();

        /**

         * definimos o nome do participante com SET , isto é , estou SETANDO uma informação dentro de um atributo.

         */

        sorteador.setParticipante(JOptionPane.showInputDialog("Qual seu nome ?"));

        /**

         * inciamos uma variavel Integer com o valor 0 para atribuir as tentativas do usuario posteriormente;

         */

        int i = 0;

        /**

         * geraremos uma varivel statica do nosso numero aleatrio.

         */

        int numeroAleatorio = sorteador.numeroAleatorio();

        /**

         * Aqui vamos capturar o primeiro palpite do participante.

         */

        String primeiroPalpiteString = JOptionPane.showInputDialog("Qual o seu palpite ? ");

        /**

         * Aqui a gente SETA o valor do nosso atributo boolean , sera armazenado como verdadeiro ou falso.

         */

        sorteador.setAcerto(sorteador.Sorteador(primeiroPalpiteString, numeroAleatorio));

        /**

         * faça

         */

        do {

            /**

             * nos capturamos o novo palpite.

             */

            String palpite = JOptionPane.showInputDialog("Qual o seu palpite ? ");

            /**

             * nos atribuimos um novo valor a nosso atributo Bolean , para fazer novamente a validacao.

             */

            sorteador.setAcerto(sorteador.Sorteador(palpite,numeroAleatorio));

            /**

             * aqui incrementamos a nossa variavel de tentativas.

             */

            i++;

        }

        /**

         * enquanto :

         * aqui é o core da nossa aplicação , basicamente enquanto uma condição nao for verdadeira ele ira repetir o que

         * esta no DO.

         */

        while(sorteador.getAcerto() != true);

        /**

         * acabou o laço , nos informamos que ele acertou, quantas tentativas e informamos tambem o seu nome com um GET no atributo.

         */

        JOptionPane.showMessageDialog(null, "Parabens " + sorteador.getParticipante() + " voce acertou o palpite em: " + i + " tentativas.");

    }

}