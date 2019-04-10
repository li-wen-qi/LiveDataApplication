package cn.kzj.livedataapplication;

/**
 * 作者：liwenqi on 2019/4/10 18:21
 * 邮箱：liwenqi@zelkova.cn
 * 描述：
 */
public class User {
    public String name;
    public int sex;

    public User(String name, int sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                ", name='" + name + '\'' +
                ", sex='" + sex+ '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}