/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fip.pp.exoticacalcados.dao;


import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.fip.pp.exoticacalcados.entidades.Produto;

/**
 *
 * @author Luiz
 */
public class ProdutoDao implements Serializable{
    
    private Produto produto;
    private Session session;
    private Transaction trans;
    private List<Produto> listaProduto;

    public List<Produto> getListaProduto() {
    	/*
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.trans = session.beginTransaction();
            
            Criteria cri = session.createCriteria(Produto.class);
            this.listaProduto = cri.list();
            
            
        } catch (HibernateException e) {
        } finally {
            session.close();
        }
        */
        return listaProduto;
    }

    public void adicionarProduto(Produto produto){
    	/*
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.trans = session.beginTransaction();
            
            session.save(produto);
            trans.commit();
            
        } catch (HibernateException e) {
        } finally {
            session.close();
        }
        */
    	listaProduto.add(produto);
    }
    
    public void atualizarProduto(Produto produto){
    	/*
         try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.trans = session.beginTransaction();
            
            session.update(produto);
            trans.commit();
            
        } catch (HibernateException e) {
        } finally {
            session.close();
        }
        */
    }
    public void removerProduto(Produto produto){
    	/*
         try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.trans = session.beginTransaction();
            
            session.delete(produto);
            trans.commit();
            
        } catch (HibernateException e) {
        } finally {
            session.close();
        }
        */
    }
}
