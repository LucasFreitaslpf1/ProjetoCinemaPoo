/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo;

import br.edu.ifnmg.projetocinemapoo.dao.FilmeDao;
import br.edu.ifnmg.projetocinemapoo.dao.FuncionarioDao;
import br.edu.ifnmg.projetocinemapoo.dao.GeneroDao;
import br.edu.ifnmg.projetocinemapoo.dao.GuicheDao;
import br.edu.ifnmg.projetocinemapoo.dao.IngressoDao;
import br.edu.ifnmg.projetocinemapoo.dao.SalaDao;
import br.edu.ifnmg.projetocinemapoo.dao.SessaoDao;
//import br.edu.ifnmg.projetocinemapoo.dao.SessaoDao;
import br.edu.ifnmg.projetocinemapoo.dao.VendaDao;
import br.edu.ifnmg.projetocinemapoo.entity.Audio;
import br.edu.ifnmg.projetocinemapoo.entity.Classificacao;
import br.edu.ifnmg.projetocinemapoo.entity.Funcionario;
import br.edu.ifnmg.projetocinemapoo.entity.Sala;
import br.edu.ifnmg.projetocinemapoo.entity.Tela;
import br.edu.ifnmg.projetocinemapoo.entity.Genero;
import br.edu.ifnmg.projetocinemapoo.entity.Filme;
import br.edu.ifnmg.projetocinemapoo.entity.Guiche;
import br.edu.ifnmg.projetocinemapoo.entity.Sessao;
import br.edu.ifnmg.projetocinemapoo.entity.Ingresso;
import br.edu.ifnmg.projetocinemapoo.entity.Venda;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author Lucas
 */
public class ProjetoCinemaPOO {

    public static void main(String[] args) {
        // testes

//        Funcionario g = new Funcionario();
//        g.setNome("Asd");
//        
//        new FuncionarioDao().salvar(g);
////        
//        Funcionario g = new Funcionario();
//        g.setId(2L);
//        g.setNome("lucas");
//        
//        new FuncionarioDao().salvar(g);
//        Funcionario g = new Funcionario();
//        
//        g = new FuncionarioDao().localizarPorId(3L);
//        System.out.println(g);
//        List<Funcionario> g = new ArrayList<>();
//
//        g = new FuncionarioDao().localizarTodos();
//        System.out.println(g);
        //TESTE
        /*
        Sala sala = new Sala();
        sala.setNumero(01);
        sala.setCapacidade(300);
        sala.setTela(Tela._3D);

        SalaDao salaDao = new SalaDao();
        Long id = salaDao.salvar(sala);

        sala.setId(id);
        System.out.println("Salas: " + salaDao.localizarTodos());
         */
 /*Ingresso i = new Ingresso();
        i.setMeiaEntada(Boolean.TRUE);
        i.setPreco(15f);

        IngressoDao iDao = new IngressoDao();
        Long id = iDao.salvar(i);
        i.setId(id);

        System.out.println("Ingresso : " + iDao.localizarPorId(i.getId()));

        System.out.println("Ingressos: " + iDao.localizarTodos());*/
 /*Venda v = new Venda();
        v.setCodigoVenda((long)111555);
        v.setQuantidade((short)5);
        v.setValorTotal(123d);
        
        VendaDao vDao = new VendaDao();
        Long id = vDao.salvar(v);
        v.setId(id);
        System.out.println("Venda : " + vDao.localizarPorId(v.getId()));
        System.out.println("Vendas: " + vDao.localizarTodos());*/
 /*
        Filme filme1 = new Filme();
        filme1.setNome("Forest Gump");
        filme1.setDuracao(2);
        filme1.setClassificacao(Classificacao._16);
        
        System.out.println(">>"+filme1);
        
        new FilmeDao().salvar(filme1);
        
        Filme filme2 = new Filme();
        filme2.setNome("Senhor dos aneis");
        filme2.setDuracao(3);
        filme2.setClassificacao(Classificacao._14);
        
        System.out.println(">>"+filme2);
        
        new FilmeDao().salvar(filme2);
         */
 /*
        Filme fil = new Filme();
        
        
        fil = new FilmeDao().localizarPorId(1L);
        System.out.println("Pesquisado >>"+fil);
       
        
        List<Filme> filmes = new ArrayList<>();
        
        filmes =  new FilmeDao().localizarTodos();
        
        for (Filme al : filmes) {
            al.toString();
        }
         */
        //Genero genero1 = new Genero();
        //genero1.setNome("Romance");
        //new GeneroDao().salvar(genero1);
        
        
        
        
        
        //TESTE RELAÇÃO VENDA COM INGRESSO
        /*Funcionario funcionario = new Funcionario();
        funcionario.setNome("ANA");

        FuncionarioDao funcionarioDao = new FuncionarioDao();
        Long funcionarioId = funcionarioDao.salvar(funcionario);
        funcionario.setId(funcionarioId);

        Guiche guiche = new Guiche();
        guiche.setNumero(5);
        guiche.setFuncionario(funcionario);

        GuicheDao guicheDao = new GuicheDao();
        Long guicheId = guicheDao.salvar(guiche);
        guiche.setId(guicheId);

        Sessao sessao = new Sessao();
        sessao.setAudio(Audio.DUBLADO);
        sessao.setIngressosVendidos(78);
        sessao.setHorario(LocalDateTime.now());
        sessao.setValorSessao(18d);

        SessaoDao sessaoDao = new SessaoDao();
        Long sessaoId = sessaoDao.salvar(sessao);
        sessao.setId(sessaoId);

        Venda venda = new Venda();
        venda.setCodigoVenda((long) 111555);
        venda.setQuantidade((short) 5);
        venda.setGuiche(guiche);
        venda.setSessao(sessao);
        venda.setValorTotal(77d);

        VendaDao vendaDao = new VendaDao();
        Long vendaId = vendaDao.salvar(venda);
        venda.setId(vendaId);

        Ingresso ingresso1 = new Ingresso();
        ingresso1.setMeiaEntada(Boolean.TRUE);
        ingresso1.setPreco(12D);
        ingresso1.setVendaId(vendaId);

        IngressoDao ingressoDao1 = new IngressoDao();
        Long id1 = ingressoDao1.salvar(ingresso1);
        ingresso1.setId(id1);

        Ingresso ingresso2 = new Ingresso();
        ingresso2.setMeiaEntada(Boolean.FALSE);
        ingresso2.setPreco(13D);
        ingresso2.setVendaId(vendaId);

        IngressoDao ingressoDao2 = new IngressoDao();
        Long id2 = ingressoDao2.salvar(ingresso2);
        ingresso2.setId(id2);

        Ingresso ingresso3 = new Ingresso();
        ingresso3.setMeiaEntada(Boolean.TRUE);
        ingresso3.setPreco(15D);
        ingresso3.setVendaId(vendaId);

        IngressoDao ingressoDao3 = new IngressoDao();
        Long id3 = ingressoDao3.salvar(ingresso3);
        ingresso3.setId(id3);

        venda.setIngressos(Arrays.asList(new Ingresso[]{ingresso1, ingresso2, ingresso3}));
        
        System.out.println("Ingresso: " + ingressoDao3.localizarPorId(ingresso3.getId()));
        System.out.println("Ingressos: " + ingressoDao3.localizarTodos());
        
        System.out.println("Venda : " + vendaDao.localizarPorId(venda.getId()));
        System.out.println("Vendas: " + vendaDao.localizarTodos());*/

    }
}
