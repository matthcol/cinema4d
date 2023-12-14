
package org.example.cinema.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private Integer id;
    private String name;
    private String firstname;
    private int age;

}

