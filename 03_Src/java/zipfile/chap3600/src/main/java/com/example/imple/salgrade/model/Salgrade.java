package com.example.imple.salgrade.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName="of")
@NoArgsConstructor
@Builder
public class Salgrade {
	int 	grade;
	Integer losal;
	Integer hisal;
}
