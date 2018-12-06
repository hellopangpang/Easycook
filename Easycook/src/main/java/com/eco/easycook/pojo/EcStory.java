package com.eco.easycook.pojo;

public class EcStory {
    private Integer ecSid;

    private Integer ecUid;

    private String ecScontent;

    private String ecTime;

    private Integer ecFlag;

    private EcStoryimg img;

    private EcComment comments;

    public EcStoryimg getImg() {
        return img;
    }

    public void setImg(EcStoryimg img) {
        this.img = img;
    }

    public EcComment getComments() {
        return comments;
    }

    public void setComments(EcComment comments) {
        this.comments = comments;
    }

    public Integer getEcSid() {
        return ecSid;
    }

    public void setEcSid(Integer ecSid) {
        this.ecSid = ecSid;
    }

    public Integer getEcUid() {
        return ecUid;
    }

    public void setEcUid(Integer ecUid) {
        this.ecUid = ecUid;
    }

    public String getEcScontent() {
        return ecScontent;
    }

    public void setEcScontent(String ecScontent) {
        this.ecScontent = ecScontent == null ? null : ecScontent.trim();
    }

    public String getEcTime() {
        return ecTime;
    }

    public void setEcTime(String ecTime) {
        this.ecTime = ecTime == null ? null : ecTime.trim();
    }

    public Integer getEcFlag() {
        return ecFlag;
    }

    public void setEcFlag(Integer ecFlag) {
        this.ecFlag = ecFlag;
    }
}