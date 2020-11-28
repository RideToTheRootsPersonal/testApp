/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rchakrab
 */
@Stateless
public class RecordsEntityFacade extends AbstractFacade<RecordsEntity> {

    @PersistenceContext(unitName = "testApp-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RecordsEntityFacade() {
        super(RecordsEntity.class);
    }

}
