package com.example.sorteador;

import javax.swing.*;

import java.util.Random;

/**

 * Essa sera a classe que sera consumida pelo sorteio para realizar as funções.

 */

public class Sorteador {



    /**

     * esse sao os dados dinamicos , basicamente serao os personagens dentro da nossa aplicação,

     * e abaixo como padrãoo criamos getter e setter;

     */

    String participante;

    Boolean acerto;

    /**

     * Os getter e setters permitem que a gente trabalhe com os dados de forma dinamica.

     *

     */

    public Boolean getAcerto() {

        return acerto;

    }



    public void setAcerto(Boolean acerto) {

        this.acerto = acerto;

    }



    public String getParticipante() {

        return participante;

    }



    public void setParticipante(String participante) {

        this.participante = participante;

    }





    /**

     * Esse é o metodo responsavel por nos dar um numero aleatorio para o sorteio , é importante entender que ele nao

     * precisa de parametro pra funcionar.

     * @return um numero do tipo Inteiro.

     */

    public Integer numeroAleatorio(){

        Random radom = new Random();

        int numero = radom.nextInt(21);

        return numero;

    }



    /**

     * esse é o metodo mais importante de nossa aplicação , ele fara a verificação se o palpite do participante é maior,

     * menor ou igual ao nosso numero aleatorio , ele tabem ira fazer a conversao da string palpite em um tipo inteiro.

     * @param palpiteString - String de entrada do palpite do participante que sera convertida em integer

     * @param numero - aqui é o nosso numero aleatorio

     * @return o retorno sera Boolean , isto é , FALSE OU TRUE.

     */

    public Boolean Sorteador(String palpiteString, int numero){

        /**

         * conversao da string para o tipo inteiro

         */

        Integer palpite = Integer.parseInt(palpiteString);

        /**

         * primeira validação , se o numero for diferente do palpite ele entra no outro if que valida se o chute foi

         * maior ou menor , de qualquer forma ele nos tras o retorno false porque o participante nao acertou, caso seja

         * igual ele ira retornar true;

         */

        if(palpite !=  numero ) {

            if (palpite > numero) {

                JOptionPane.showMessageDialog(null, "O seu palpite foi maior que o numero");

                return false;

            } else {

                JOptionPane.showMessageDialog(null, "O seu palpite foi menor que o numero");

                return false;

            }

        }

        return true;

    }

}