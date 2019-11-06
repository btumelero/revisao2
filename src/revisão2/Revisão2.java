/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisão2;

/**
 *
 * @author bruno.191196
 */
public class Revisão2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Navegador navegador = new Navegador();
    
    navegador.abrirAba("1,0", TipoAba.ANONIMA);
    navegador.abrirAba("2,0", TipoAba.REGULAR);
    System.out.println();
    navegador.listaDeAbas.get(0).visitarPagina("1,1");
    navegador.listaDeAbas.get(1).visitarPagina("2,1");
    System.out.println();
    navegador.interrompe();
    navegador.retoma();
    System.out.println();
    navegador.listaDeAbas.get(0).visitarPagina("1,2");
    navegador.listaDeAbas.get(1).visitarPagina("2,2");
    System.out.println();
    navegador.interrompe();
    navegador.retoma();
    System.out.println();
    navegador.listaDeAbas.get(0).recarrega();
    navegador.listaDeAbas.get(1).recarrega();
    System.out.println();
    System.out.println(navegador.listaDeAbas.get(0).getUrl());
    System.out.println(navegador.listaDeAbas.get(1).getUrl());
    System.out.println();
    System.out.println(Aba.numeroDeAbas);
  }
  
}
