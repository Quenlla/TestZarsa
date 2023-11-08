package manuel.araujo.repository;

import manuel.araujo.data.Prices;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public class PricesCustomRepositoryImpl implements PricesCustomRepository{
    @PersistenceContext
    protected EntityManager entityManager;
    public List<Prices> searchPrices(LocalDateTime applicationDate, int idProducto, int idCadena){
        Query query = entityManager.createQuery(
                "SELECT P " +
                        "FROM Prices P "+
                "WHERE ?1 BETWEEN P.startDate AND P.endDate "+
                "AND P.productID = ?2 " +
                "AND P.brandID = ?3" +
                "ORDER BY P.priority DESC"
                ,Prices.class);
         query.setParameter(1, Timestamp.valueOf(applicationDate));
        query.setParameter(2, idProducto);
        query.setParameter(3, idCadena);

        query.getResultList();
        return query.getResultList();
    }
}
