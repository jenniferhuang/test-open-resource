package com.jennifer.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by lance.zhou on 2014/10/27.
 */
@XmlRootElement(name = "ObjectId")
@XmlAccessorType(XmlAccessType.FIELD)
public class ObjectId {
    @XmlElement(name = "id")
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static ObjectId create(String id) {
        ObjectId objectId = new ObjectId();
        objectId.setId(id);
        return objectId;
    }
}
