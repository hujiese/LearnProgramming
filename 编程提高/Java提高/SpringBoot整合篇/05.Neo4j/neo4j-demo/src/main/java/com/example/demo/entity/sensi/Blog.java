package com.example.demo.entity.sensi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Node("Blog")
@AllArgsConstructor
@NoArgsConstructor
public class Blog {

    @Id
    @GeneratedValue
    private Long id;

    @Index
    private String blogId;

    @Relationship(type = "LIKE", direction = Relationship.Direction.INCOMING)
    private List<User> likeBlogUsers = new ArrayList<>();

}
