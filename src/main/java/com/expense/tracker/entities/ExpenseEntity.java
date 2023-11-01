package com.expense.tracker.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseEntity {

	private Long expenseId;

	private String expenseDescription;

	private double Amount;

}
