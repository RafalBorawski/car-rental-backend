package com.miwi.carrental.domain.entity;

import java.awt.Color;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;


@Data
@Table(name = "car_parameter")
@Entity
public class CarParameter {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "PK_car_parameter")
  private Long id;

  @Column(name = "year_of_prod")
  private Integer yearOfProd;

  @Column(name = "daily_rate")
  private Integer dailyRate;

  @Column(name = "color")
  private Color color;

  @Column(name = "current_mileage")
  private Integer currentMileage;

  @ManyToOne
  @JoinColumn(name = "FK_engine")
  private Engine engine;

  @ManyToOne
  @JoinColumn(name = "FK_drive_train")
  private DriveTrain driveTrain;

  @ManyToOne
  @JoinColumn(name = "FK_body_type")
  private BodyType bodyType;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Integer getYearOfProd() {
    return yearOfProd;
  }

  public void setYearOfProd(Integer yearOfProd) {
    this.yearOfProd = yearOfProd;
  }

  public Integer getDailyRate() {
    return dailyRate;
  }

  public void setDailyRate(Integer dailyRate) {
    this.dailyRate = dailyRate;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Integer getCurrentMileage() {
    return currentMileage;
  }

  public void setCurrentMileage(Integer currentMileage) {
    this.currentMileage = currentMileage;
  }

  public BodyType getBodyType() {
    return bodyType;
  }

  public void setBodyType(BodyType bodyType) {
    this.bodyType = bodyType;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public DriveTrain getDriveTrain() {
    return driveTrain;
  }

  public void setDriveTrain(DriveTrain driveTrain) {
    this.driveTrain = driveTrain;
  }
}