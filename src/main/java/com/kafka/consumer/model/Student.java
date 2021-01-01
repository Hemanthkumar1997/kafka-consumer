package com.kafka.consumer.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class Student {
    private String name;
    private String usn;
}
