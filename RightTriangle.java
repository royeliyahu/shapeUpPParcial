package com.royE.ShapeUp.Shapes;


import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * I didnt use an abstract class since I have no other shapes to mange, nor shared properties
 *
 */
@Entity
public class RightTriangle {

    @Id
    private Integer id;
    private Double firstEdge;
    private Double secondEdge;
    private Double hypotenuse;
    private Boolean hypotenuseCalculationState;

    public RightTriangle() {
        this.hypotenuseCalculationState = false;
    }

    public RightTriangle(Integer id, Double firstEdge, Double secondEdge, Double hypotenuse,
                         Boolean hypotenuseCalculationState) {
        this.id = id;
        this.firstEdge = firstEdge;
        this.secondEdge = secondEdge;
        this.hypotenuse = hypotenuse;
        this.hypotenuseCalculationState = hypotenuseCalculationState;
    }

    public RightTriangle(Integer id, Double firstEdge, Double secondEdge) {
        this.id = id;
        this.firstEdge = firstEdge;
        this.secondEdge = secondEdge;
        this.hypotenuseCalculationState = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(Double firstEdge) {
        this.firstEdge = firstEdge;
    }

    public Double getSecondEdge() {
        return secondEdge;
    }

    public void setSecondEdge(Double secondEdge) {
        this.secondEdge = secondEdge;
    }

    public Double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(Double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public Boolean getHypotenuseCalculationState() {
        return hypotenuseCalculationState;
    }

    public void setHypotenuseCalculationState(Boolean hypotenuseCalculationState) {
        this.hypotenuseCalculationState = hypotenuseCalculationState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RightTriangle that = (RightTriangle) o;

        if (!id.equals(that.id)) return false;
        if (!firstEdge.equals(that.firstEdge)) return false;
        return secondEdge.equals(that.secondEdge);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + firstEdge.hashCode();
        result = 31 * result + secondEdge.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "id=" + id +
                ", firstEdge=" + firstEdge +
                ", secondEdge=" + secondEdge +
                ", hypotenuse=" + hypotenuse +
                ", hypotenuseCalculationState=" + hypotenuseCalculationState +
                '}';
    }
}
