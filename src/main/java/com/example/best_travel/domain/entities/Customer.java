package com.example.best_travel.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Customer {

  @Id
  private String dni;
  @Column(length = 50)
  private String fullName;
  @Column(length = 50)
  private String creditCard;
  @Column(length = 12)
  private String phoneNumber;
  private Integer totalFlights;
  private Integer totalLodgings;
  private Integer totalTours;

}
