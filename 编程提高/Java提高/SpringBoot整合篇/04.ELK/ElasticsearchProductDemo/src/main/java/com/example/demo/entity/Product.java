package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import java.io.Serializable;

//indexName索引名称 可以理解为数据库名 必须为小写 不然会报org.elasticsearch.indices.InvalidIndexNameException异常
//type类型 可以理解为表名，由于只是单机版没有集群，所以replicas 副本设置为0
@Document(indexName = "ec", type = "product", replicas = 0, shards = 5)
@Data
public class Product implements Serializable {
    
    /**
     * Description:  @Id注解必须是springframework包下的     * org.springframework.data.annotation.Id
     */
    private Long id;

    // ik_max_word使用ik分词器
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String name;

    /**
     * Description: 分类
     */
    @Field(type = FieldType.Keyword)//存储数据时候，不会分词建立索引
    private String category;

    /**
     * Description: 价格
     */
    @Field(type = FieldType.Double)
    private Double price;

    /**
     * Description:  图片地址
     */
    @Field(index = false, type = FieldType.Keyword)//不建立索引
    private String images;

    private String body;

    public Product(Long id, String name, String category, Double price, String images, String body) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.images = images;
        this.body = body;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
