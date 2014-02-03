package base;

// Generated 08/05/2012 00:04:43 by Hibernate Tools 3.2.0.b9

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Trazabi.
 * @see base.Trazabi
 * @author Hibernate Tools
 */
@Stateless
public class TrazabiHome {

	private static final Log log = LogFactory.getLog(TrazabiHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Trazabi transientInstance) {
		log.debug("persisting Trazabi instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Trazabi persistentInstance) {
		log.debug("removing Trazabi instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Trazabi merge(Trazabi detachedInstance) {
		log.debug("merging Trazabi instance");
		try {
			Trazabi result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Trazabi findById(int id) {
		log.debug("getting Trazabi instance with id: " + id);
		try {
			Trazabi instance = entityManager.find(Trazabi.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
