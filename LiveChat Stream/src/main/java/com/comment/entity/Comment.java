package com.comment.entity;

import jakarta.persistence.Entity;

@Entity
public class Comment {
	private String id;
	private long userId;
	private String content;
	private long timestamp;

	public Comment(String id, long userId, String content, long timestamp) {
		super();
		this.id = id;
		this.userId = userId;
		this.content = content;
		this.timestamp = timestamp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

}
