package manuel.araujo.service;

import manuel.araujo.data.Prices;
import manuel.araujo.repository.PricesCustomRepository;
import manuel.araujo.repository.PricesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class PricesServiceImpl implements PricesService{
    @Autowired
    private PricesCustomRepository pricesRepository;

    @Override
    public List<Prices> getProducto(LocalDateTime applicationDate, int idProducto, int idCadena) {
        return pricesRepository.searchPrices(applicationDate,idProducto,idCadena);
    }

}
