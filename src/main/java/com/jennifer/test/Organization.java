package com.jennifer.test;

import com.jennifer.test.ObjectId;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by lance.zhou on 2014/10/27.
 */
@XmlRootElement(name = "Organization")
@XmlAccessorType(XmlAccessType.FIELD)
public class Organization extends ObjectId {
    @XmlElement(name = "rcAccountId")
    String rcAccountId;
    @XmlElement(name = "name")
    String name;
    @XmlElement(name = "email")
    String email;
    @XmlElement(name = "contactPhone")
    String contactPhone;
    @XmlElement(name = "creationTime")
    Date creationTime;
//    @XmlElement(name = "accessLevel")
//    AccessLevel accessLevel;
//    @XmlElement(name = "type")
//    OrganizationType organizationType;
    @XmlElement(name = "usagePlan")
    ObjectId usagePlan;
    @XmlElement(name = "brand")
    String brand;

    public String getRcAccountId() {
        return rcAccountId;
    }

    public void setRcAccountId(String rcAccountId) {
        this.rcAccountId = rcAccountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

//    public AccessLevel getAccessLevel() {
//        return accessLevel;
//    }
//
//    public void setAccessLevel(AccessLevel accessLevel) {
//        this.accessLevel = accessLevel;
//    }
//
//    public OrganizationType getOrganizationType() {
//        return organizationType;
//    }
//
//    public void setOrganizationType(OrganizationType organizationType) {
//        this.organizationType = organizationType;
//    }

    public ObjectId getUsagePlan() {
        return usagePlan;
    }

    public void setUsagePlan(ObjectId usagePlan) {
        this.usagePlan = usagePlan;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
