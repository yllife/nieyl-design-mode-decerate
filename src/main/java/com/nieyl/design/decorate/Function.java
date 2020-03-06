package com.nieyl.design.decorate;

import lombok.Data;

import java.io.*;

/**
 * 功能信息封装实体
 */
@Data
public class Function implements Cloneable, Serializable {

    private String name;

    private String no;

    private String desc;

    @Override
    protected Function clone() throws CloneNotSupportedException {
        return (Function) super.clone();
    }

    public Function deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (Function) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
