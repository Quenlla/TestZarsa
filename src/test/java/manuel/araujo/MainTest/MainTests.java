package manuel.araujo.MainTest;

import manuel.araujo.data.Prices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class MainTests {


	@Autowired
	private TestRestTemplate rest;

	@Test
	void contextLoad() throws Exception {
		assertThat(rest).isNotNull();
	}

	@Test
	void givenTestProduct_35455_brand_1_date14_1000() throws Exception {
		System.out.println("Test 1-> Petition with parameters: \n " +
				"fechaAplicacion=>2020-06-14T10:00:00\n " +
				"idCadena		=>1 (Zara) \n" +
				"idProducto		=>35455");
		Prices response = this.rest.getForEntity(
				"http://localhost:8080/Test-Zarsa/Prices/getProducto?fechaAplicacion=2020-06-14T10:00:00&idCadena=1&idProducto=35455",
				Prices.class).getBody();
		assertThat(response.getPrice()).isEqualTo(35.50);
		System.out.println("got final price: " +response.getPrice() + " " +response.getCurr());

	}
	@Test
	void givenTestProduct_35455_brand_1_date14_1600() throws Exception {
		System.out.println("Test 1-> Petition with parameters: \n " +
				"fechaAplicacion=>2020-06-14T16:00:00\n " +
				"idCadena		=>1 (Zara) \n" +
				"idProducto		=>35455");
		Prices response = this.rest.getForEntity(
				"http://localhost:8080/Test-Zarsa/Prices/getProducto?fechaAplicacion=2020-06-14T16:00:00&idCadena=1&idProducto=35455",
				Prices.class).getBody();
		assertThat(response.getPrice()).isEqualTo(25.45);
		System.out.println("got final price: " +response.getPrice() + " " + response.getCurr());

	}
	@Test
	void givenTestProduct_35455_brand_1_date14_2100() throws Exception {
		System.out.println("Test 1-> Petition with parameters: \n " +
				"fechaAplicacion=>2020-06-14T21:00:00\n " +
				"idCadena		=>1 (Zara) \n" +
				"idProducto		=>35455");
		Prices response = this.rest.getForEntity(
				"http://localhost:8080/Test-Zarsa/Prices/getProducto?fechaAplicacion=2020-06-14T21:00:00&idCadena=1&idProducto=35455",
				Prices.class).getBody();
		assertThat(response.getPrice()).isEqualTo(35.50);
		System.out.println("got final price: " +response.getPrice() + " " + response.getCurr());

	}
	@Test
	void givenTestProduct_35455_brand_1_date15_1000() throws Exception {
		System.out.println("Test 1-> Petition with parameters: \n " +
				"fechaAplicacion=>2020-06-15T10:00:00\n " +
				"idCadena		=>1 (Zara) \n" +
				"idProducto		=>35455");
		Prices response = this.rest.getForEntity(
				"http://localhost:8080/Test-Zarsa/Prices/getProducto?fechaAplicacion=2020-06-15T10:00:00&idCadena=1&idProducto=35455",
				Prices.class).getBody();
		assertThat(response.getPrice()).isEqualTo(30.50);
		System.out.println("got final price: " +response.getPrice() + " " + response.getCurr());

	}
	@Test
	void givenTestProduct_35455_brand_1_date16_2100() throws Exception {
		System.out.println("Test 1-> Petition with parameters: \n " +
				"fechaAplicacion=>2020-06-16T21:00:00\n " +
				"idCadena		=>1 (Zara) \n" +
				"idProducto		=>35455");
		Prices response = this.rest.getForEntity(
				"http://localhost:8080/Test-Zarsa/Prices/getProducto?fechaAplicacion=2020-06-16T21:00:00&idCadena=1&idProducto=35455",
				Prices.class).getBody();
		assertThat(response.getPrice()).isEqualTo(38.95);
		System.out.println("got final price: " +response.getPrice() + " " + response.getCurr());

	}


}
