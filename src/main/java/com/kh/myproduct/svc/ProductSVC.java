package com.kh.myproduct.svc;

import com.kh.myproduct.dao.Product;

import java.util.List;
import java.util.Optional;

public interface ProductSVC {
  //등록
  Long save(Product product);
<<<<<<< HEAD
  //조회;
  Optional<Product> findById(Long productId);
  //수정
  int update(Long productId,Product product);
=======
  //조회
  Optional<Product> findById(Long productId);
  //수정
  int update(Long productId, Product product);
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
  //삭제
  int delete(Long productId);
  //목록
  List<Product> findAll();
<<<<<<< HEAD
  /**
   * 상품존재유무
   * @param productId 상품아이디
   * @return
   */
  boolean isExist(Long productId);
=======
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
}
