package ssproductsservice.repository;

import ssproductsservice.model.view.ProductView;

public interface ProductRepository {
    List<ProductView> getAllProducts();
}
