package manuel.araujo.repository;

import manuel.araujo.data.Prices;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface PricesCustomRepository {
    List<Prices> searchPrices(LocalDateTime applicationDate, int idProducto, int idCadena);
}
