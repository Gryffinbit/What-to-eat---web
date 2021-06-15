package entity;

import java.sql.Timestamp;
import java.util.Dictionary;
import java.util.Hashtable;

public class PublicFoods {
    private int fid;
    private String foodName;
    private String area;
    private int minNum;
    private int maxNum;
    private int minPrice;
    private int maxPrice;
    private int submitter;
    private boolean verify;
    private Timestamp modifyTime;

    public int getFid() {
        return fid;
    }

    public String getArea() {
        return area;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public int getMinNum() {
        return minNum;
    }

    public int getMinPrice() {
        return minPrice;
    }


    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public int getSubmitter() {
        return submitter;
    }

    public boolean isVerify() {
        return verify;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public void setMinNum(int minNum) {
        this.minNum = minNum;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    public void setSubmitter(int submitter) {
        this.submitter = submitter;
    }

    public void setVerify(boolean verify) {
        this.verify = verify;
    }

    public Dictionary toDictionary(){
        Dictionary tmp = new Hashtable();
        tmp.put("fid", getFid());
        tmp.put("foodName", getFoodName());
        tmp.put("area", getArea());
        tmp.put("minNum", getMinNum());
        tmp.put("maxNum", getMaxNum());
        tmp.put("minPrice", getMinPrice());
        tmp.put("maxPrice", getMaxPrice());
        tmp.put("submitter", getSubmitter());
        tmp.put("verify", isVerify());
        tmp.put("modifyTime", getModifyTime());
        return tmp;
    }
}

