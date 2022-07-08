/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

/**
 *
 * @author Lucas
 */
public class ProjetoCinemaPOO {

    public static void main(String[] args) {
        //TESTE GERAL
//        Funcionario funcionario1 = new Funcionario();
//        funcionario1.setNome("Ana Paula");
//        funcionario1.setSenha("123");
//        funcionario1.setTipoFuncionario(TipoFuncionario.GERENTE);
//
//        FuncionarioDao funcionarioDao1 = new FuncionarioDao();
//        Long funcionarioId1 = funcionarioDao1.salvar(funcionario1);
//        funcionario1.setId(funcionarioId1);
//
//        Funcionario funcionario2 = new Funcionario();
//        funcionario2.setNome("Jorge Augusto");
//        funcionario2.setSenha("456");
//        funcionario2.setTipoFuncionario(TipoFuncionario.CAIXA);
//
//        FuncionarioDao funcionarioDao2 = new FuncionarioDao();
//        Long funcionarioId2 = funcionarioDao2.salvar(funcionario2);
//        funcionario2.setId(funcionarioId2);
//
//        Guiche guiche1 = new Guiche();
//        guiche1.setNumero(1);
//
//        GuicheDao guicheDao1 = new GuicheDao();
//        Long guicheId1 = guicheDao1.salvar(guiche1);
//        guiche1.setId(guicheId1);
//
//        Guiche guiche2 = new Guiche();
//        guiche2.setNumero(2);
//
//        GuicheDao guicheDao2 = new GuicheDao();
//        Long guicheId2 = guicheDao2.salvar(guiche2);
//        guiche2.setId(guicheId2);
//
//        Genero genero1 = new Genero();
//        genero1.setNome("Romance");
//
//        GeneroDao generoDao1 = new GeneroDao();
//        Long genroId1 = generoDao1.salvar(genero1);
//        genero1.setId(genroId1);
//
//        Genero genero2 = new Genero();
//        genero2.setNome("Suspense");
//
//        GeneroDao generoDao2 = new GeneroDao();
//        Long genroId2 = generoDao2.salvar(genero2);
//        genero2.setId(genroId2);
//
//        Genero genero3 = new Genero();
//        genero3.setNome("Terror");
//
//        GeneroDao generoDao3 = new GeneroDao();
//        Long genroId3 = generoDao3.salvar(genero3);
//        genero3.setId(genroId3);
//
//        Filme filme1 = new Filme();
//        filme1.setNome("Filme 1");
//        filme1.setDuracao(111);
//        filme1.setClassificacao(Classificacao.LIVRE);
//        filme1.setGeneroPrincipal(genero1);
//
//        FilmeDao filmeDao1 = new FilmeDao();
//        Long filmeId1 = filmeDao1.salvar(filme1);
//        filme1.setId(filmeId1);
//
//        Filme filme2 = new Filme();
//        filme2.setNome("Filme 2");
//        filme2.setDuracao(222);
//        filme2.setClassificacao(Classificacao._12);
//        filme2.setGeneroPrincipal(genero2);
//
//        FilmeDao filmeDao2 = new FilmeDao();
//        Long filmeId2 = filmeDao2.salvar(filme2);
//        filme2.setId(filmeId2);
//
//        Filme filme3 = new Filme();
//        filme3.setNome("Filme 3");
//        filme3.setDuracao(333);
//        filme3.setClassificacao(Classificacao._16);
//        filme3.setGeneroPrincipal(genero3);
//
//        FilmeDao filmeDao3 = new FilmeDao();
//        Long filmeId3 = filmeDao3.salvar(filme3);
//        filme3.setId(filmeId3);
//
//        Sala sala1 = new Sala();
//        sala1.setNumero(1);
//        sala1.setCapacidade(111);
//        sala1.setTela(Tela._2D);
//
//        SalaDao salaDao1 = new SalaDao();
//        Long salaId1 = salaDao1.salvar(sala1);
//        sala1.setId(salaId1);
//
//        Sala sala2 = new Sala();
//        sala2.setNumero(2);
//        sala2.setCapacidade(222);
//        sala2.setTela(Tela._3D);
//
//        SalaDao salaDao2 = new SalaDao();
//        Long salaId2 = salaDao2.salvar(sala2);
//        sala2.setId(salaId2);
//
//        Sessao sessao1 = new Sessao();
//        sessao1.setFilme(filme1);
//        sessao1.setHorario(LocalDateTime.of(2022, 7, 21, 15, 30));
//        sessao1.setSala(sala1);
//        sessao1.setAudio(Audio.DUBLADO);
//        sessao1.setIngressosVendidos(11);
//        sessao1.setValorSessao(11.5);
//
//        SessaoDao sessaoDao1 = new SessaoDao();
//        Long sessaoId1 = sessaoDao1.salvar(sessao1);
//        sessao1.setId(sessaoId1);
//
//        Sessao sessao2 = new Sessao();
//        sessao2.setFilme(filme2);
//        sessao2.setHorario(LocalDateTime.of(2022, 7, 25, 12, 00));
//        sessao2.setSala(sala2);
//        sessao2.setAudio(Audio.LEGENDADO);
//        sessao2.setIngressosVendidos(22);
//        sessao2.setValorSessao(12.5);
//
//        SessaoDao sessaoDao2 = new SessaoDao();
//        Long sessaoId2 = sessaoDao2.salvar(sessao2);
//        sessao2.setId(sessaoId2);
//
//        Sessao sessao3 = new Sessao();
//        sessao3.setFilme(filme3);
//        sessao3.setHorario(LocalDateTime.of(2022, 7, 27, 14, 00));
//        sessao3.setSala(sala1);
//        sessao3.setAudio(Audio.LEGENDADO);
//        sessao3.setIngressosVendidos(33);
//        sessao3.setValorSessao(13.5);
//
//        SessaoDao sessaoDao3 = new SessaoDao();
//        Long sessaoId3 = sessaoDao3.salvar(sessao3);
//        sessao3.setId(sessaoId3);
//
//        Venda venda1 = new Venda();
//        venda1.setQuantidade((short) 3);
//        venda1.setGuiche(guiche1);
//        venda1.setSessao(sessao1);
//        venda1.setValorTotal(111.0);
//        venda1.setFuncionario(funcionario1);
//
//        VendaDao vendaDao1 = new VendaDao();
//        Long vendaId1 = vendaDao1.salvar(venda1);
//        venda1.setId(vendaId1);
//
//        Ingresso ingresso1 = new Ingresso();
//        ingresso1.setMeiaEntrada(Boolean.TRUE);
//        ingresso1.setPreco(venda1.getSessao().getValorSessao());
//        ingresso1.setVendaId(vendaId1);
//
//        IngressoDao ingressoDao1 = new IngressoDao();
//        Long ingressoId1 = ingressoDao1.salvar(ingresso1);
//        ingresso1.setId(ingressoId1);
//
//        Ingresso ingresso2 = new Ingresso();
//        ingresso2.setMeiaEntrada(Boolean.FALSE);
//        ingresso2.setPreco(venda1.getSessao().getValorSessao());
//        ingresso2.setVendaId(vendaId1);
//
//        IngressoDao ingressoDao2 = new IngressoDao();
//        Long ingressoId2 = ingressoDao2.salvar(ingresso2);
//        ingresso2.setId(ingressoId2);
//
//        Ingresso ingresso3 = new Ingresso();
//        ingresso3.setMeiaEntrada(Boolean.TRUE);
//        ingresso3.setPreco(venda1.getSessao().getValorSessao());
//        ingresso3.setVendaId(vendaId1);
//
//        IngressoDao ingressoDao3 = new IngressoDao();
//        Long ingressoId3 = ingressoDao3.salvar(ingresso3);
//        ingresso3.setId(ingressoId3);
//
//        venda1.setIngressos(Arrays.asList(new Ingresso[]{ingresso1, ingresso2, ingresso3}));
//
//        Venda venda2 = new Venda();
//        venda2.setQuantidade((short) 2);
//        venda2.setGuiche(guiche2);
//        venda2.setSessao(sessao2);
//        venda2.setValorTotal(222.0);
//        venda2.setFuncionario(funcionario2);
//        
//
//        VendaDao vendaDao2 = new VendaDao();
//        Long vendaId2 = vendaDao2.salvar(venda2);
//        venda2.setId(vendaId2);
//
//        Ingresso ingresso4 = new Ingresso();
//        ingresso4.setMeiaEntrada(Boolean.TRUE);
//        ingresso4.setPreco(venda2.getSessao().getValorSessao());
//        ingresso4.setVendaId(vendaId2);
//
//        IngressoDao ingressoDao4 = new IngressoDao();
//        Long ingressoId4 = ingressoDao4.salvar(ingresso4);
//        ingresso4.setId(ingressoId4);
//
//        Ingresso ingresso5 = new Ingresso();
//        ingresso5.setMeiaEntrada(Boolean.FALSE);
//        ingresso5.setPreco(venda2.getSessao().getValorSessao());
//        ingresso5.setVendaId(vendaId2);
//
//        IngressoDao ingressoDao5 = new IngressoDao();
//        Long ingressoId5 = ingressoDao5.salvar(ingresso5);
//        ingresso5.setId(ingressoId5);
//
//        venda2.setIngressos(Arrays.asList(new Ingresso[]{ingresso4, ingresso5}));
//
//        System.out.println("\n>>>>FUNCIONÁRIOS: " + new FuncionarioDao().localizarTodos() + "\n");
//
//        System.out.println("\n>>>>GUICHÊS: " + new GuicheDao().localizarTodos() + "\n");
//
//        System.out.println("\n>>>>GÊNEROS: " + new GeneroDao().localizarTodos() + "\n");
//
//        System.out.println("\n>>>>FILMES: " + new FilmeDao().localizarTodos() + "\n");
//
//        System.out.println("\n>>>>SALAS: " + new SalaDao().localizarTodos() + "\n");
//
//        System.out.println("\n>>>>SESSÕES: " + new SessaoDao().localizarTodos() + "\n");
//
//        System.out.println("\n>>>>VENDAS: " + new VendaDao().localizarTodos() + "\n");
//
//        System.out.println("\n>>>>INGRESSOS: " + new IngressoDao().localizarTodos() + "\n");

    }
}
