/**
 * Created By VijayKumar Moohite
 * Date : 7/5/2023
 * Time : 4:57 PM
 * Project : ManyToOneRelationshipApplicationHB3
 **/

package org.mahagan.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "studentList")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;
    private String firtstName;
    private String lastName;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addId")
    private Addres addres;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirtstName() {
        return firtstName;
    }

    public void setFirtstName(String firtstName) {
        this.firtstName = firtstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Addres getAddres() {
        return addres;
    }

    public void setAddres(Addres addres) {
        this.addres = addres;
    }
}
