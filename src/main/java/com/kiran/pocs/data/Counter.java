package com.kiran.pocs.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

//@RedisHash("Counter")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Counter implements Serializable {
    private int count;
    private String id;
}
