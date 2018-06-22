package com.example.asus.suppa.models;

public class TagsModel {

    private String id;
    private String tag;
    private String desc;
    private String tagimage;

    public TagsModel(String id, String tag, String desc) {
        this.id = id;
        this.tag = tag;
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTagimage() {
        return tagimage;
    }

    public void setTagimage(String tagimage) {
        this.tagimage = tagimage;
    }


}
