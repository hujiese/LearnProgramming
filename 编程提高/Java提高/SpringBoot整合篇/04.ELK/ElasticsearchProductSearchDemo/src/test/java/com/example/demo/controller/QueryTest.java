package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.AbstractAggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.aggregations.metrics.valuecount.ValueCountAggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class QueryTest {
    @Autowired
    private ProductRepository productRepository;

    /**
     * Description: 根据价格范围查询
     */
    @Test
    public void queryByPriceBetween() {
        Iterable<Product> list = productRepository.findByPriceBetween(7.00, 20.00);
        for (Product product : list) {
            System.out.println(product);
        }
    }

    /**
     * Description: 单个词查询
     */
    @Test
    public void termQuery() {
        // 构建查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilderQueryBuilder = new NativeSearchQueryBuilder();
        // 查询词,只能查询一个汉字,或者一个英文单词
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.termQuery("name", "富"));
        // 搜索，获取结果
        Page<Product> products = productRepository.search(nativeSearchQueryBuilderQueryBuilder.build());
        // 总条数
        for (Product product : products) {
            System.out.println(product);
        }
    }

    /**
     * Description: 多参数termsQuery
     */
    @Test
    public void termsQuery() {
        // 构建查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilderQueryBuilder = new NativeSearchQueryBuilder();
        // 查询词,只能查询一个汉字,或者一个英文单词
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.termsQuery("name", "富","香","梨"));
        // 搜索，获取结果
        Page<Product> products = productRepository.search(nativeSearchQueryBuilderQueryBuilder.build());
        // 总条数
        for (Product product : products) {
            System.out.println(product);
        }
    }


    /**
     * Description: matchQuery分词查询，采用默认的分词器。
     */
    @Test
    public void matchQuery() {
        // 查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilderQueryBuilder = new NativeSearchQueryBuilder();
        // 查询词
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.matchQuery("name", "香蕉"));
        // 搜索，获取结果
        Page<Product>  products= productRepository.search(nativeSearchQueryBuilderQueryBuilder.build());
        for (Product product : products) {
            System.out.println(product);
        }
    }

    /**
     * Description: 多字段查询
     */
    @Test
    public void multiMatchQuery() {
        // 构建查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilder  = new NativeSearchQueryBuilder();
        nativeSearchQueryBuilder.withQuery(QueryBuilders.multiMatchQuery("红富士金帅香蕉","name","body"));
        // 搜索，获取结果
        Page<Product> products = productRepository.search(nativeSearchQueryBuilder.build());
        // 总条数
        for (Product product : products) {
            System.out.println(product);
        }
    }


    @Test
    public void searchByBukey() {
    }
}