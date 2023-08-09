package ua.hillel.tests.lesson25rest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ua.hillel.automation.java.rest25.PostControler;
import ua.hillel.automation.java.rest25.entities.Comment;
import ua.hillel.automation.java.rest25.entities.CommentWithLombok;
import ua.hillel.automation.java.rest25.entities.Post;
import ua.hillel.tests.listeners.CustomExtendReportListener;

import java.io.IOException;

@Listeners({CustomExtendReportListener.class})
public class RestPostTest {

    @Test
    public void getAllPostsTest() throws IOException {
        PostControler postControler = new PostControler();
        //postControler.getAllPosts();
        //postControler.getPostById(1);
        //postControler.getPostById(10);
        //postControler.createNewPost();
        //postControler.createNewPostWithJson("Kate","from Kharkiv");

        Post post = new Post();
        post.setUserId(123);
        post.setTitle("title");
        post.setBody("body");
        Post newPost = postControler.createPostWithGson(post);
        System.out.println(newPost);

        Assert.assertEquals(post,newPost,"Post is not created successfully"); //пост що ми відправили дорівнює тому що нам прийшов
        Assert.assertNotEquals(newPost.getId(),0,"New ID is empty"); //поле ID посту що нам прийшов не дорівнює нулю

        CommentWithLombok commentWithLombok = new CommentWithLombok();





    }
}
