package manuel.araujo.repository;


import manuel.araujo.data.Prices;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface PricesRepository extends JpaRepository<Prices, Long> {

}