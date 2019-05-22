package org.fasttrackit.shoponlineapi;

import org.fasttrackit.shoponlineapi.Domain.Product;
import org.fasttrackit.shoponlineapi.Service.ProductService;
import org.fasttrackit.shoponlineapi.Transfer.CreateProductRequest;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.IsNull.notNullValue;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceIntegrationTests {
    //many modules are tested like a group

    @Autowired
    private ProductService productService;

    //for calling method from service
    public void testCreateProduct_whenValidRequest_thenReturnProductWithId(){
        CreateProductRequest request=new CreateProductRequest();
        request.setName("Laptop");
        request.setPrice(10);
        request.setQuantity(3);
        request.setSku("dtghd");
        Product product = productService.createProduct(request);

        //with assertThat we are sure that something happend
        assertThat(product,notNullValue());
        assertThat(product.getId(),greaterThan(0L));
    }
}
