package com.wchy.demo.basedao.elastic;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

@Document(indexName = "account", type = "doc")
public class User implements Serializable {

    private static final long serialVersionUID = 4366816915484730655L;

    @Id
    @Field(index = true, store = true, type = FieldType.Long)
    private Long uniqueId;

    @Field(index = true, analyzer = "ik_max_word", store = true, searchAnalyzer = "ik_smart", type = FieldType.Text)
    private String idType;

    @Field(index = true, analyzer = "ik_max_word", store = true, searchAnalyzer = "ik_smart", type = FieldType.Text)
    private String idNo;

    @Field(index = true, analyzer = "ik_max_word", store = true, searchAnalyzer = "ik_smart", type = FieldType.Text)
    private String userName;

    @Field(index = true, analyzer = "ik_max_word", store = true, searchAnalyzer = "ik_smart", type = FieldType.Text)
    private String mobile;

    public User() {
    }

    public User(Long uniqueId, String idType, String idNo, String userName, String mobile) {
        this.uniqueId = uniqueId;
        this.idType = idType;
        this.idNo = idNo;
        this.userName = userName;
        this.mobile = mobile;
    }

    public Long getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(Long uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
