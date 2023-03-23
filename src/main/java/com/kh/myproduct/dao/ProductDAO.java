package com.kh.myproduct.dao;

import java.util.List;
import java.util.Optional;

public interface ProductDAO {
<<<<<<< HEAD
=======


>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
  /**
   * 등록
   * @param product 상품
   * @return 상품아이디
   */
  Long save(Product product);
<<<<<<< HEAD

=======
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
  /**
   * 조회
   * @param productId 상품아이디
   * @return 상품
   */
  Optional<Product> findById(Long productId);

  /**
   * 수정
   * @param productId 상품아이디
   * @param product 상품
   * @return 수정된 레코드 수
   */
<<<<<<< HEAD
  int update(Long productId,Product product);
=======
  int update(Long productId, Product product);
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9

  /**
   * 삭제
   * @param productId 상품아이디
   * @return 삭제된 레코드 수
   */
  int delete(Long productId);

  /**
<<<<<<< HEAD
   * 전체 삭제
   * @return 삭제한 레코드 건수
   */
  int deleteAll();

  /**
=======
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
   * 목록
   * @return 상품목록
   */
  List<Product> findAll();
<<<<<<< HEAD

  /**
   * 상품존재유무
   * @param productId 상품아이디
   * @return 
   */
  boolean isExist(Long productId);

  /**
   * 등록된 상품수
   * @return 레코드 건수
   */
  int countOfRecord();
=======
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
}
