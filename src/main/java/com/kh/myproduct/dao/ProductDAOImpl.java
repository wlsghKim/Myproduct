package com.kh.myproduct.dao;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
=======
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Repository
@RequiredArgsConstructor
<<<<<<< HEAD
public class ProductDAOImpl implements ProductDAO{
=======
public class ProductDAOImpl implements ProductDAO {
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9

  private final NamedParameterJdbcTemplate template;

  /**
   * 등록
   *
   * @param product 상품
   * @return 상품아이디
   */
  @Override
  public Long save(Product product) {
    StringBuffer sb = new StringBuffer();
    sb.append("insert into product(product_id,pname,quantity,price) ");
    sb.append("values(product_product_id_seq.nextval, :pname, :quantity, :price) ");

    SqlParameterSource param = new BeanPropertySqlParameterSource(product);
    KeyHolder keyHolder = new GeneratedKeyHolder();
<<<<<<< HEAD
    template.update(sb.toString(),param,keyHolder,new String[]{"product_id"});
//    template.update(sb.toString(),param,keyHolder,new String[]{"product_id","pname"});

    long productId = keyHolder.getKey().longValue(); //상품아이디

    //String pname = (String)keyHolder.getKeys().get("pname");
=======
    template.update(sb.toString(), param, keyHolder, new String[]{"product_id"});
//  template.update(sb.toString(), param, keyHolder, new String[]{"product_id","pname"});

    long productId = keyHolder.getKey().longValue(); //상품아이디

//    String pname = (String)keyHolder.getKeys().get("pname");
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
    return productId;
  }

  /**
   * 조회
   *
   * @param productId 상품아이디
   * @return 상품
   */
  @Override
  public Optional<Product> findById(Long productId) {
    StringBuffer sb = new StringBuffer();
    sb.append("select product_id, pname, quantity, price ");
<<<<<<< HEAD
    sb.append("  from product ");
    sb.append(" where product_id = :id ");
=======
    sb.append("from product ");
    sb.append("where product_id = :id ");
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9

    try {
      Map<String, Long> param = Map.of("id", productId);

      Product product = template.queryForObject(
          sb.toString(), param, productRowMapper());
      return Optional.of(product);
<<<<<<< HEAD
    } catch (EmptyResultDataAccessException e) {
      //조회결과가 없는 경우
=======
    }catch (EmptyResultDataAccessException e){
     //조회결과가 없는 경우
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
      return Optional.empty();
    }
  }

  /**
   * 수정
   *
   * @param productId 상품아이디
   * @param product   상품
   * @return 수정된 레코드 수
   */
  @Override
  public int update(Long productId, Product product) {
    StringBuffer sb = new StringBuffer();
    sb.append("update product ");
<<<<<<< HEAD
    sb.append("   set pname = :pname, ");
    sb.append("       quantity = :quantity, ");
    sb.append("       price = :price ");
    sb.append(" where product_id = :id ");

    SqlParameterSource param = new MapSqlParameterSource()
        .addValue("pname",product.getPname())
        .addValue("quantity",product.getQuantity())
        .addValue("price",product.getPrice())
        .addValue("id",productId);

    return template.update(sb.toString(),param);
=======
    sb.append("  set pname = :pname, ");
    sb.append("      quantity = :quantity, ");
    sb.append("      price = :price ");
    sb.append(" where product_id = :id ");

    SqlParameterSource param = new MapSqlParameterSource()
        .addValue("pname", product.getPname())
        .addValue("quantity",product.getQuantity())
        .addValue("price", product.getPrice())
        .addValue("id", productId);

    return template.update(sb.toString(), param);
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
  }

  /**
   * 삭제
   *
   * @param productId 상품아이디
   * @return 삭제된 레코드 수
   */
  @Override
  public int delete(Long productId) {
    String sql = "delete from product where product_id = :id ";
    return template.update(sql,Map.of("id",productId));
  }

<<<<<<< HEAD
  @Override
  public int deleteAll() {
    String sql = "delete from product ";
    Map<String,String> param = new LinkedHashMap<>();
    int deletedRowCnt = template.update(sql, param);
    return deletedRowCnt;
  }

=======
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
  /**
   * 목록
   *
   * @return 상품목록
   */
  @Override
  public List<Product> findAll() {
<<<<<<< HEAD
    StringBuffer sb = new StringBuffer();
    sb.append("select product_id, pname, quantity, price ");
    sb.append("  from product ");

    List<Product> list = template.query(
        sb.toString(),
        BeanPropertyRowMapper.newInstance(Product.class)  // 레코드 컬럼과 자바객체 멤버필드가 동일한 이름일경우, camelcase지원
=======
    StringBuffer sb =new StringBuffer();
    sb.append("select product_id, pname, quantity, price ");
    sb.append(" from product");

    List<Product> list = template.query(
        sb.toString(),
        BeanPropertyRowMapper.newInstance(Product.class) // 레코드 컬럼과 자바객체 멈버필드가 동일한 이름일경우, camelcase지원
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
    );

    return list;
  }

<<<<<<< HEAD
  class RowMapperImpl implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
      Product product = new Product();
      product.setProductId(rs.getLong("product_id"));
      product.setPname(rs.getString("pname"));
      product.setQuantity(rs.getLong("quantity"));
      product.setPrice(rs.getLong("price"));
      return product;
    }
  }

=======
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
//  RowMapper<Product> rowMapper = new RowMapper<Product>() {
//    @Override
//    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
//      Product product = new Product();
//      product.setProductId(rs.getLong("product_id"));
//      product.setPname(rs.getString("pname"));
//      product.setQuantity(rs.getLong("quantity"));
//      product.setPrice(rs.getLong("price"));
//      return product;
//    }
//  };
//
//  RowMapper<Product> rowMapper2 = (rs, rowNum) -> {
<<<<<<< HEAD
//      Product product = new Product();
//      product.setProductId(rs.getLong("product_id"));
//      product.setPname(rs.getString("pname"));
//      product.setQuantity(rs.getLong("quantity"));
//      product.setPrice(rs.getLong("price"));
//      return product;
=======
//    Product product = new Product();
//    product.setProductId(rs.getLong("product_id"));
//    product.setPname(rs.getString("pname"));
//    product.setQuantity(rs.getLong("quantity"));
//    product.setPrice(rs.getLong("price"));
//    return product;
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
//  };

  //수동 매핑
  private RowMapper<Product> productRowMapper() {
    return (rs, rowNum) -> {
      Product product = new Product();
      product.setProductId(rs.getLong("product_id"));
      product.setPname(rs.getString("pname"));
      product.setQuantity(rs.getLong("quantity"));
      product.setPrice(rs.getLong("price"));
      return product;
    };
  }
<<<<<<< HEAD

  //자동매핑 : 테이블의 컬럼명과 자바객체 타입의 멤버필드가 같아야한다.
  // BeanPropertyRowMapper.newInstance(자바객체타입)

  @Override
  public boolean isExist(Long productId) {
    boolean isExist = false;
    String sql = "select count(*) from product where product_id = :product_id";

    Map<String,Long> param = Map.of("product_id",productId);
    Integer integer = template.queryForObject(sql, param, Integer.class);
    isExist = (integer > 0) ? true : false;
    return isExist;
  }

  @Override
  public int countOfRecord() {
    String sql = "select count(*) from product ";
    Map<String,String> param = new LinkedHashMap<>();
    Integer rows = template.queryForObject(sql, param, Integer.class);
    return rows;
  }
}
=======
  // 자동매핑 : 테이블의 컬럼명과 자바객체 타입의 멤버필드가 같아야한다.
  // BeanPropertyRowMapper.newInstance(자바객체타입)

}
>>>>>>> e90d0169f5ad108a1ee3059e39d908e20152c7c9
