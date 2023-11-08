package manuel.araujo.rest;

import manuel.araujo.data.Prices;
import manuel.araujo.service.PricesService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(ApplicationRest.MAPPING)
public class ApplicationRest {
    public static final String MAPPING = "/Prices";

    private final PricesService pricesService;
    public ApplicationRest(PricesService pricesService){
        this.pricesService=pricesService;
    }

    @GetMapping("/getPrice")
    public ResponseEntity<Prices> getPrice(
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @RequestParam(name = "fechaAplicacion", required = true) LocalDateTime applicationDate,
            @RequestParam(name = "idProducto", required = true) int idProducto,
            @RequestParam(name = "idCadena", required = true) int idCadena
    )
    {
        List<Prices> response = pricesService.getProducto(applicationDate,idProducto,idCadena);
        if(response==null||response.size()==0){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(response.get(0));
        }
    }
}
