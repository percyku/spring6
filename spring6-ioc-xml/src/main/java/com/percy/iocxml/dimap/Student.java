package com.percy.iocxml.dimap;

import java.util.List;
import java.util.Map;

public class Student {


    private List<Lesson> lessonList;

    private Map<String,Teacher> teacherMap;

    private String sId;
    private String sName;




    public void run(){
        System.out.println("學生編號:"+getsId()+",學生名稱:"+getsName());
        System.out.println(getTeacherMap());
        System.out.println(getLessonList());
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }
}
