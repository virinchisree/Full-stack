package com.contact;

import org.jetbrains.annotations.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;
import java.util.Objects;


public class AddBean {

    @NotNull
    private String name;
    @NotNull
    @NumberFormat(pattern = "##### #####")
    private String phoneno;
    @NotNull
    private String emailid;
    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddBean)) return false;
        AddBean addBean = (AddBean) o;
        return Objects.equals(getName(), addBean.getName()) &&
                Objects.equals(getPhoneno(), addBean.getPhoneno()) &&
                Objects.equals(getEmailid(), addBean.getEmailid()) &&
                Objects.equals(getDob(), addBean.getDob());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPhoneno(), getEmailid(), getDob());
    }

    @Override
    public String toString() {
        return "AddBean{" +
                "name='" + name + '\'' +
                ", phoneno='" + phoneno + '\'' +
                ", emailid='" + emailid + '\'' +
                ", dob=" + dob +
                '}';
    }
}
