package com.example.demo;

import com.example.demo.dao.BlogRepository;
import com.example.demo.dao.UserRepository;
import com.example.demo.entity.sensi.Blog;
import com.example.demo.entity.sensi.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BlogRepository blogRepository;

    @Test
    void testCreateNode() {
        String userId = "bdcecd18-3179-49a5-b7ea-d8d0d6ecbb1b";
        String blogId = "64aeb0ddcb0d1a19ab0c8001";

        User user = userRepository.createUser(userId);
        Blog blog = blogRepository.createBlog(blogId);

        System.out.println(user);
        System.out.println(blog);
    }

    @Test
    void testQueryNode() {
        String userId = "bdcecd18-3179-49a5-b7ea-d8d0d6ecbb1b";
        String blogId = "64aeb0ddcb0d1a19ab0c8001";

        User user = userRepository.findAllByUserId(userId);
        Blog blog = blogRepository.findAllByBlogId(blogId);

        System.out.println(user);
        System.out.println(blog);
    }

    @Test
    void testLikeAction() {
        String userId = "bdcecd18-3179-49a5-b7ea-d8d0d6ecbb1b";
        String blogId = "64aeb0ddcb0d1a19ab0c8001";

        blogRepository.likeAction(blogId, userId);
    }

    @Test
    void testdelLikeAction() {
        String userId = "bdcecd18-3179-49a5-b7ea-d8d0d6ecbb1b";
        String blogId = "64aeb0ddcb0d1a19ab0c8001";

        blogRepository.delLikeAction(blogId, userId);
    }

    @Test
    void testdelNode() {
        String userId = "bdcecd18-3179-49a5-b7ea-d8d0d6ecbb1b";
        String blogId = "64aeb0ddcb0d1a19ab0c8001";

        long cnt1 = blogRepository.deleteBlogByBlogId(blogId);
        long cnt2 = userRepository.deleteUserByUserId(userId);

        System.out.println(cnt1);
        System.out.println(cnt2);
    }

    @Test
    void createComplexNode() {
        String userId1 = "bdcecd18-3179-49a5-b7ea-d8d0d6ecbb1b";
        String userId2 = "591eccb5-577b-4d4a-b422-27bffcd32f51";
        String userId3 = "1af1c154-697e-41c7-93fd-4c9800a5c159";

        String blogId1 = "64aeb0ddcb0d1a19ab0c8001";
        String blogId2 = "64a683d7588e45624e2b6c15";
        String blogId3 = "64a684e7588e45624e2b6c22";

        blogRepository.likeAction(blogId1, userId1);
        blogRepository.likeAction(blogId1, userId2);
        blogRepository.likeAction(blogId1, userId3);

        blogRepository.likeAction(blogId2, userId1);
        blogRepository.likeAction(blogId2, userId2);
        blogRepository.likeAction(blogId2, userId3);

        blogRepository.likeAction(blogId3, userId1);
        blogRepository.likeAction(blogId3, userId2);
        blogRepository.likeAction(blogId3, userId3);
    }

    @Test
    void testUserCount() {
        String blogId = "64aeb0ddcb0d1a19ab0c8001";
        long count = blogRepository.getLikeCountsByBlogId(blogId);
        System.out.println(count);
    }

    @Test
    void testGetAllUser() {
        String blogId = "64aeb0ddcb0d1a19ab0c8001";
        // 测试查询所有
        List<User> users = userRepository.getAllLikeByBlogId(blogId);
        System.out.println(users);

        // 测试分页
        Pageable pageable = PageRequest.of(1,2);
        users = userRepository.getAllLikeByBlogId(blogId, pageable);
        System.out.println(users);
    }

    @Test
    void testBlogCount() {
        String userId = "bdcecd18-3179-49a5-b7ea-d8d0d6ecbb1b";
        long count = userRepository.getLikeCountByUserId(userId);
        System.out.println(count);
    }

    @Test
    void testGetAllBlog() {
        String userId = "bdcecd18-3179-49a5-b7ea-d8d0d6ecbb1b";
        // 测试查询所有
        List<Blog> blogs = blogRepository.getAllLikeBlogUserId(userId);
        System.out.println(blogs);

        // 测试分页
        Pageable pageable = PageRequest.of(1,2);
        blogs = blogRepository.getAllLikeBlogUserId(userId, pageable);
        System.out.println(blogs);
    }
}
