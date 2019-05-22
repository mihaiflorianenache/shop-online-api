package org.fasttrackit.shoponlineapi.Persistence;

import org.fasttrackit.shoponlineapi.Domain.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product,Long> {
}
