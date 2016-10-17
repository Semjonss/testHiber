package institute.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Source:
 * Created:     10/17/2016
 * Project:     CATGenome Browser
 * Make:        IntelliJ IDEA 14.1.1, JDK 1.8
 *
 * @author Semen_Dmitriev
 */
@Entity
@Table(name = "money")
public class Money implements Serializable {

    @Id
    @Column(name = "grant_id")
    @GeneratedValue
    private int id;
    @Column(name = "student_id")
    private int studentId;
    @Column(name = "quantity")
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
