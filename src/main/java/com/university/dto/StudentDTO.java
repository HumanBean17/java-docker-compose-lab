package com.university.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

    String id;
    String name;
    String group;
    Integer visitPercentage;
}
