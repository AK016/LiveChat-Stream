package com.comment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.comment.entity.Comment;
import com.comment.entity.User;
import com.comment.service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {

	@Autowired
	private CommentService commentService;

	@PostMapping
	public ResponseEntity<Comment> postComment(@RequestBody String content, @AuthenticationPrincipal User user) {
		return null;
		//rahul
	}

	@GetMapping("/recent")
	public ResponseEntity<List<Comment>> getRecentComments(@RequestParam(defaultValue = "10") int count) {
		return null;
		//rahul
	}
}
