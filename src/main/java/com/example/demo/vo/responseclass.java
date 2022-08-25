package com.example.demo.vo;

import com.example.demo.model.Mongoclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class responseclass {

   private Mongoclass mongo;
   private Departement dept;
}
