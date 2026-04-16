package com.percy.iocxml.ditest;

import java.util.List;

public class Dept {

    private List<Emp> empList;

    private String dname;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public void info(){
        System.out.println("部門名稱:"+dname);
        for(Emp emp : empList){
            System.out.println(emp.getEname());
        }
    }

}
