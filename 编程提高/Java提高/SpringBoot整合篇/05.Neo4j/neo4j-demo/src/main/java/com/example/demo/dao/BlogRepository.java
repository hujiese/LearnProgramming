package com.example.demo.dao;

import com.example.demo.entity.sensi.Blog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends Neo4jRepository<Blog, Long> {

    // 根据blogId找到相关节点
    @Query("MATCH (n:Blog {blogId: $blogId}) RETURN n")
    Blog findAllByBlogId(@Param("blogId") String blogId);

    // 通过blogId创建节点
    @Query("MERGE (n:Blog {blogId: $blogId}) RETURN n")
    Blog createBlog(@Param("blogId") String blogId);

    // 不重复创建 User -[LIKE]-> Blog 的关系，如果相关节点不存在则会自动创建
    @Query("MERGE (u:User {userId: $userId})" +
            "MERGE (b:Blog {blogId: $blogId})" +
            "MERGE ((u)-[r:LIKE]->(b))")
    void likeAction(@Param("blogId") String blogId, @Param("userId") String userId);

    // 解除 User -[LIKE]-> Blog 的关系
    @Query("MATCH (:User {userId:$userId})-[r:LIKE]->(:Blog{blogId:$blogId}) DELETE r")
    void delLikeAction(@Param("blogId") String blogId, @Param("userId") String userId);

    // 通过 blogId 删除节点
    long deleteBlogByBlogId(String blogId);

    // 查找有多少个用户 LIKE 博文
    @Query("MATCH (b:Blog {blogId: $blogId}) " +
            "WITH size((b)<-[:LIKE]-()) as in " +
            "RETURN in")
    long getLikeCountsByBlogId(String blogId);


    // 分页查找某个用户 LIKE 的所有 Blog
    @Query(value = "MATCH (u:User)-[:LIKE]->(b:Blog) " +
            "WHERE u.userId=$userId RETURN b SKIP $skip LIMIT $limit")
    List<Blog> getAllLikeBlogUserId(@Param("userId") String userId, Pageable pageable);

    // 查找某个用户 LIKE 的所有 Blog
    @Query(value = "MATCH (u:User)-[:LIKE]->(b:Blog) " +
            "WHERE u.userId=$userId RETURN b")
    List<Blog> getAllLikeBlogUserId(@Param("userId") String userId);

    // 创建索引
    @Query("CREATE INDEX FOR (b:Blog) ON (b.blogId)")
    void createBlogIndex();
}