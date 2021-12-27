package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.elasticsearch.common.unit.Fuzziness;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FuzzySearchTest {

    @Autowired
    private ProductRepository productRepository;

    /**
     * Description: 左右模糊。
     */
    @Test
    public void queryStringQuery() {
        // 查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilderQueryBuilder = new NativeSearchQueryBuilder();
        //  左右模糊
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.queryStringQuery("金帅觉得香蕉好吃").field("name"));
        // 搜索，获取结果
        Page<Product>  products= productRepository.search(nativeSearchQueryBuilderQueryBuilder.build());
        for (Product product : products) {
            System.out.println(product);
        }
    }

    /**
     * Description: 前缀查询prefixQuery。
     */
    @Test
    public void prefixQuery() {
        // 查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilderQueryBuilder = new NativeSearchQueryBuilder();
        //  左右模糊
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.prefixQuery("name","香"));
        // 搜索，获取结果
        Page<Product>  products= productRepository.search(nativeSearchQueryBuilderQueryBuilder.build());
        for (Product product : products) {
            System.out.println(product);
        }
    }

    /**
     * Description: 分词模糊查询。
     */
    @Test
    public void fuzzyQuery() {
        // 查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilderQueryBuilder = new NativeSearchQueryBuilder();
            nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.fuzzyQuery("name","红富").fuzziness(Fuzziness.ONE));
        // 搜索，获取结果
        Page<Product>  products= productRepository.search(nativeSearchQueryBuilderQueryBuilder.build());
        for (Product product : products) {
            System.out.println(product);
        }
    }

    /**
     * Description: 通配符查询wildcard query。
     */
    @Test
    public void wildcardQuery() {
        // 查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilderQueryBuilder = new NativeSearchQueryBuilder();
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.wildcardQuery("name","金*"));
        // 搜索，获取结果
        Page<Product>  products= productRepository.search(nativeSearchQueryBuilderQueryBuilder.build());
        for (Product product : products) {
            System.out.println(product);
        }
    }

    /**
     * Description: 通配符查询wildcard query。
     */
    @Test
    public void wildcardQuery2() {
        // 查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilderQueryBuilder = new NativeSearchQueryBuilder();
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.wildcardQuery("name","香?"));
        // 搜索，获取结果
        Page<Product>  products= productRepository.search(nativeSearchQueryBuilderQueryBuilder.build());
        for (Product product : products) {
            System.out.println(product);
        }
    }
}