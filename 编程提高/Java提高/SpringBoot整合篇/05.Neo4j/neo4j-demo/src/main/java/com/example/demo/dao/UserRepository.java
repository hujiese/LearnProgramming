package com.example.demo.dao;

import com.example.demo.entity.sensi.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends Neo4jRepository<User, Long> {

    // 根据 userId 查找用户节点
    @Query("MATCH (n:User {userId: $userId}) RETURN n")
    User findAllByUserId(@Param("userId") String userId);

    // 创建用户节点
    @Query("MERGE (n:User {userId: $userId}) RETURN n")
    User createUser(@Param("userId") String userId);

    // 根据userId删除用户节点
    long deleteUserByUserId(String userId);

    // 查找该用户LIKE多少个博文
    @Query("MATCH (u:User {userId: $userId}) " +
            "WITH size((u)-[:LIKE]->()) as out " +
            "RETURN out")
    long getLikeCountByUserId(String userId);

    // 根据blogId分页查找某个blog的所有 LIKE User 信息
    @Query(value = "MATCH (u:User)-[:LIKE]->(b:Blog) " +
            "WHERE b.blogId = $blogId RETURN u SKIP $skip LIMIT $limit")
    List<User> getAllLikeByBlogId(@Param("blogId") String blogId, Pageable pageable);

    // 根据blogId查找某个blog的所有 LIKE User 信息
    @Query(value = "MATCH (u:User)-[:LIKE]->(b:Blog) " +
            "WHERE b.blogId = $blogId RETURN u")
    List<User> getAllLikeByBlogId(@Param("blogId") String blogId);

    // 查找该用户FAVORITE多少个博文
    @Query("MATCH (u:User {userId: $userId}) " +
            "WITH size((u)-[:FAVORITE]->()) as out " +
            "RETURN out")
    long getFavoriteCountByUserId(String userId);

    // 创建索引
    @Query("CREATE INDEX FOR (u:User) ON (u.userId)")
    void createUserIndex();
}