package com.comment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comment.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findLastComments(int limit);
}
