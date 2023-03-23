package com.kh.myproduct.svc;

import com.kh.myproduct.dao.Product;
import com.kh.myproduct.dao.ProductDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductSVCImpl implements ProductSVC{

  private final ProductDAO productDAO;

  @Override
  public Long save(Product product) {
    return productDAO.save(product);
  }

  @Override
  public Optional<Product> findById(Long productId) {
<<<<<<< HEAD
=======

>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
    return productDAO.findById(productId);
  }

  @Override
  public int update(Long productId, Product product) {
    return productDAO.update(productId, product);
  }

  @Override
  public int delete(Long productId) {
    return productDAO.delete(productId);
  }

  @Override
  public List<Product> findAll() {
    return productDAO.findAll();
  }
<<<<<<< HEAD

  @Override
  public boolean isExist(Long productId) {
    return productDAO.isExist(productId);
  }
=======
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
}
