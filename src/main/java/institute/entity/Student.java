package institute.entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "students")
public class Student implements Serializable {

 @Id
 @Column(name = "student_id")
 @GeneratedValue
 private Integer id;

 @Column(name = "first_name")
 private String firstName;
  
 @Column(name = "last_name")
 private String lastName;

 public String getFirstName() {
  return firstName;
 }

 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }

 public Integer getId() {
  return id;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 public String getLastName() {
  return lastName;
 }

 public void setLastName(String lastName) {
  this.lastName = lastName;
 }

}