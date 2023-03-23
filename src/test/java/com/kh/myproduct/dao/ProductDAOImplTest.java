package com.kh.myproduct.dao;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Slf4j
@SpringBootTest
public class ProductDAOImplTest {

  @Autowired
  ProductDAO productDAO;

  //등록
  @Test
  @DisplayName("상품등록")
  void save(){
    Product product = new Product();
    product.setPname("복사기");
    product.setQuantity(10L);
    product.setPrice(1000000L);

    Long productId = productDAO.save(product);
<<<<<<< HEAD
    log.info("productId={}",productId);
=======
    log.info("Product={}", productId);
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
    Assertions.assertThat(productId).isGreaterThan(0L);
  }

  //조회
  @Test
  @DisplayName("상품조회")
<<<<<<< HEAD
  void findById(){
    Long productId = 163L;
    Optional<Product> product = productDAO.findById(productId);
//    if(product.isPresent()) {
//      log.info("product={}", product.get());
//    }else{
=======
  void findById() {
    Long productId = 181L;
    Optional<Product> product = productDAO.findById(productId);
//    if (product.isPresent()) {
//      log.info("product={}", product.get());
//    } else {
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
//      log.info("조회한 결과 없음");
//    }
//    Assertions.assertThat(product.stream().count())
//        .isEqualTo(1);
<<<<<<< HEAD
    Product findedProduct = product.orElseThrow();// 없으면 java.util.NoSuchElementException
=======
    Product findedProduct = product.orElseThrow();//없으면 java.util.NoSuchElementException
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
    Assertions.assertThat(findedProduct.getPname()).isEqualTo("복사기");
    Assertions.assertThat(findedProduct.getQuantity()).isEqualTo(10L);
    Assertions.assertThat(findedProduct.getPrice()).isEqualTo(1000000L);
  }

  //수정
  @Test
  @DisplayName("상품수정")
<<<<<<< HEAD
  void update() {
    Long productId = 163L;
=======
  void update(){
    Long productId = 182L;
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
    Product product = new Product();
    product.setPname("복사기_수정");
    product.setQuantity(20L);
    product.setPrice(2000000L);
    int updatedRowCount = productDAO.update(productId, product);
    Optional<Product> findedProduct = productDAO.findById(productId);

    Assertions.assertThat(updatedRowCount).isEqualTo(1);
    Assertions.assertThat(findedProduct.get().getPname()).isEqualTo(product.getPname());
    Assertions.assertThat(findedProduct.get().getQuantity()).isEqualTo(product.getQuantity());
    Assertions.assertThat(findedProduct.get().getPrice()).isEqualTo(product.getPrice());
<<<<<<< HEAD
=======

>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
  }

  //삭제
  @Test
  @DisplayName("상품삭제")
<<<<<<< HEAD
  void delete() {
    Long productId = 165L;
    int deletedRowCount = productDAO.delete(productId);
    Optional<Product> findedProduct = productDAO.findById(productId);
   // Product product = findedProduct.orElseThrow();
    //case1)
//    Assertions.assertThat(findedProduct.ofNullable("없음").orElseThrow())
//        .isNotEqualTo("없음");

=======
  void delete(){
    Long productId = 183L;
    int deleteRowCount = productDAO.delete(productId);
    Optional<Product> findedProduct = productDAO.findById(productId);
//    Product product = findedProduct.orElseThrow();
    //case1)
//    Assertions.assertThat(findedProduct.ofNullable("없음")
//        .orElseThrow())
//        .isNotEqualTo("없음");
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
    //case2)
    Assertions.assertThatThrownBy(()->findedProduct.orElseThrow())
        .isInstanceOf(NoSuchElementException.class);
  }

  //목록
  @Test
  @DisplayName("상품목록")
<<<<<<< HEAD
  void findAll() {
    List<Product> list = productDAO.findAll();
    //case1)
//    for(Product product : list){
//      log.info("product={}",product);
//    }
    //case2)
//    list.stream().forEach(product ->log.info("product={}",product));

    Assertions.assertThat(list.size()).isGreaterThan(0);
  }

  @Test
  @DisplayName("상품존재")
  void isExist(){
    Long prodocutId = 244L;
    boolean exist = productDAO.isExist(prodocutId);
    Assertions.assertThat(exist).isTrue();
  }
  @Test
  @DisplayName("상품무")
  void isExist2(){
    Long prodocutId = 0L;
    boolean exist = productDAO.isExist(prodocutId);
    Assertions.assertThat(exist).isFalse();
  }

  @Test
  @DisplayName("전체 삭제")
  void deleteAll(){
    int deletedRows = productDAO.deleteAll();
    int countOfRecord = productDAO.countOfRecord();
    Assertions.assertThat(countOfRecord).isEqualTo(0);
  }

  @Test
  @DisplayName("레코드 건수")
  void countOfRecord(){
    int countOfRecord = productDAO.countOfRecord();
    log.info("countOfRecord={}",countOfRecord);
  }

=======
  void findAll(){
    List<Product> list = productDAO.findAll();
    //case1)
//    for(Product product : list){
//      log.info("product={}", product);
//    }
    //case2)
//    list.stream().forEach(product -> log.info("product={}",product));

    Assertions.assertThat(list.size()).isGreaterThan(0);
  }
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
}
