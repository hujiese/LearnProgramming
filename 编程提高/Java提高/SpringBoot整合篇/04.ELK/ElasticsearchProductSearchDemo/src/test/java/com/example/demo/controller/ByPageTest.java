package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ByPageTest {
    @Autowired
    private ProductRepository productRepository;

    /**
     * Description: 分页查询
     */
    @Test
    public void termQuery() {
        // 分页：
        int page = 0;
        int size = 1;//每页文档数

        // 构建查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilderQueryBuilder = new NativeSearchQueryBuilder();
        // 查询词,只能查询一个汉字,或者一个英文单词
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.termQuery("name", "富"));
        // 搜索，获取结果
        nativeSearchQueryBuilderQueryBuilder.withPageable(PageRequest.of(page, size));
        Page<Product> products = productRepository.search(nativeSearchQueryBuilderQueryBuilder.build());
        // 总条数
          for (Product product : products) {
            System.out.println(product);
        }
    }


    /**
     * Description: 分页查询+排序
     */
    @Test
    public void searchByPageAndSort() {
        // 分页：
        int page = 0;
        int size = 2;//每页文档数

        // 构建查询条件
        NativeSearchQueryBuilder nativeSearchQueryBuilderQueryBuilder = new NativeSearchQueryBuilder();
        // 查询词,只能查询一个汉字,或者一个英文单词
        nativeSearchQueryBuilderQueryBuilder.withQuery(QueryBuilders.termQuery("body", "测"));
        // 搜索，获取结果
        nativeSearchQueryBuilderQueryBuilder.withSort(SortBuilders.fieldSort("id").order(SortOrder.DESC));
        nativeSearchQueryBuilderQueryBuilder.withPageable(PageRequest.of(page, size));
        Page<Product> products = productRepository.search(nativeSearchQueryBuilderQueryBuilder.build());
        // 总条数
        for (Product product : products) {
            System.out.println(product);
        }
    }
}