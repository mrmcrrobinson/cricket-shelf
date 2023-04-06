/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Addresses;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Squash
 */
@Stateless
public class AddressesFacade extends AbstractFacade<Addresses> {

    @PersistenceContext(unitName = "com.up2022742_cricket-store_war_0.1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AddressesFacade() {
        super(Addresses.class);
    }
    
}
