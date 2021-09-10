package com.olive.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Education {
private String type;
private String grade;
private Integer marks;
private Integer passoutYear;
}
