package manuel.araujo.service;

import manuel.araujo.data.Prices;

import java.time.LocalDateTime;
import java.util.List;

public interface PricesService{
    List<Prices> getProducto(LocalDateTime applicationDate, int idProducto, int idCadena);

}
