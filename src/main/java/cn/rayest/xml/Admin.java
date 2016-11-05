package cn.rayest.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Rayest on 2016/10/2 0002.
 * 获取 xml 格式的数据，需要在实体类中对类和类中属性的get方法进行相应的注释
 */
@XmlRootElement  // 根元素
public class Admin {
    private String name;
    private Integer age;

    @XmlElement // 非根元素
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement // 非根元素
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
