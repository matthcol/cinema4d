
package org.example.cinema.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {

    public String nom;
    public String prenom;
    public int age;
}

