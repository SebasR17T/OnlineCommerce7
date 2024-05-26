/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycomsuaripany.onlinecommerce6.modules;

import com.mycomsuaripany.onlinecommerce6.entities.Pedido;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Torre
 */
@Stateless
public class PedidoFacade extends AbstractFacade<Pedido> implements PedidoFacadeLocal {

    @PersistenceContext(unitName = "com.mycomsuaripany_OnlineCommerce6_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PedidoFacade() {
        super(Pedido.class);
    }
    
}
