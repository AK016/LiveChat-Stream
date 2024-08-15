package com.comment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comment.entity.Comment;
import com.comment.entity.User;
import com.comment.repository.CommentRepository;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment saveComment(String content, User user) {
        return null; 
        //rahul
    }

    public List<Comment> getLastComments(int limit) {
        return null;
        //rahul
    }
}
