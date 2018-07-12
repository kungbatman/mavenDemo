package com.xwx.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    private Integer id;
    
    @NotNull(message="{user.name.null.error}")
    @Size(max=20,min=2,message="{user.name.size.error}")
    private String name;

    @NotNull(message="{user.age.null.error}")
    @Min(1)
    @Max(100)
    private Integer age;

    public Integer getId() {
        return id;
    }

	public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    @Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}