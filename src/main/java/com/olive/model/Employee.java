package com.olive.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
private Integer id;
private String ename;
private double esal;
private Address addr;
private List<Education> edu;
	
}
