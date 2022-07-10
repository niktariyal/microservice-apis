package com.microservice.user.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

//    @Id
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
