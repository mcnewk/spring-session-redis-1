package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Greeting implements Serializable {

    private final UUID id;
    private final String content;

}
