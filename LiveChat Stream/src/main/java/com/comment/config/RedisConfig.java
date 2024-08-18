package com.comment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

   @Bean
    public RedisConnectionFactory redisConnectionFactory(){
       return new LettuceConnectionFactory("127.0.0.1", 6379);
   }

   @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory ){
       RedisTemplate<String, Object> template = new RedisTemplate<>();
       template.setConnectionFactory(redisConnectionFactory);
       template.setKeySerializer(new StringRedisSerializer());
       template.setHashKeySerializer(new StringRedisSerializer());
       template.setValueSerializer(new GenericToStringSerializer<>(Object.class));
       template.setHashValueSerializer(new GenericToStringSerializer<>(Object.class));
       return template;
   }
}