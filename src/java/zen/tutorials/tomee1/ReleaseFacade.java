/*
 */
package zen.tutorials.tomee1;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author chz
 */
@Stateless
public class ReleaseFacade extends AbstractFacade<Release> {

    @PersistenceContext(unitName = "tomee_tutorial1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReleaseFacade() {
        super(Release.class);
    }
    
}
