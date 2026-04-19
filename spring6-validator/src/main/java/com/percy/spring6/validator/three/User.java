package com.percy.spring6.validator.three;

import com.percy.spring6.validator.four.CannotBlank;
import jakarta.validation.constraints.*;

public class User {

    @NotNull
    private String name;
    @Min(0)
    @Max(150)
    private int age;

    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手機號碼格式錯誤")
    @NotBlank(message ="手機號碼不能為空")
    private String phone;

    @CannotBlank
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
