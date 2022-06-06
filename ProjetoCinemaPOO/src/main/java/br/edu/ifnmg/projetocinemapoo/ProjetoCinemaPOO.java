/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo;

import br.edu.ifnmg.projetocinemapoo.dao.FilmeDao;
import br.edu.ifnmg.projetocinemapoo.dao.FuncionarioDao;
import br.edu.ifnmg.projetocinemapoo.dao.GeneroDao;
import br.edu.ifnmg.projetocinemapoo.dao.IngressoDao;
import br.edu.ifnmg.projetocinemapoo.dao.SalaDao;
//import br.edu.ifnmg.projetocinemapoo.dao.SessaoDao;
import br.edu.ifnmg.projetocinemapoo.dao.VendaDao;
import br.edu.ifnmg.projetocinemapoo.entity.Audio;
import br.edu.ifnmg.projetocinemapoo.entity.Classificacao;
import br.edu.ifnmg.projetocinemapoo.entity.Funcionario;
import br.edu.ifnmg.projetocinemapoo.entity.Sala;
import br.edu.ifnmg.projetocinemapoo.entity.Tela;
import br.edu.ifnmg.projetocinemapoo.entity.Genero;
import br.edu.ifnmg.projetocinemapoo.entity.Filme;
import br.edu.ifnmg.projetocinemapoo.entity.Sessao;
import br.edu.ifnmg.projetocinemapoo.entity.Ingresso;
import br.edu.ifnmg.projetocinemapoo.entity.Venda;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

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
        filme2.setNome("Harry Potter");
        filme2.setDuracao(1);
        filme2.setClassificacao(Classificacao._14);
        
        System.out.println(">>"+filme2);
        
        new FilmeDao().salvar(filme2);
        */
        /*
        Filme fil = new Filme();
        
        
        fil = new FilmeDao().localizarPorId(4L);
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

        
        
    }
}
