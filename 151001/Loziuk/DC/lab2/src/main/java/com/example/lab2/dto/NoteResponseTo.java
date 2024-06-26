package com.example.lab2.dto;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class NoteResponseTo {
    int id;
    int issueId;
    @Size(min = 2, max = 2048)
    String content;
}
