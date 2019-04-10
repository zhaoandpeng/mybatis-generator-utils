package org.wcy.gen.model;

import java.util.Date;

/**
 * 修理品交接记录表
 * 
 * @author wcyong
 * 
 * @date 2019-04-01
 */
public class ZsRepairRecord {
    /**
     * 接受日期
     */
    private Short id;

    /**
     * 接受日期
     */
    private String productNo;

    /**
     * 接受日期
     */
    private String productModel;

    /**
     * 接受日期
     */
    private String sap0rderCode;

    /**
     * 接受日期
     */
    private String commentText;

    /**
     * 接受日期
     */
    private String comeUserId;

    /**
     * 接受日期
     */
    private Date comeTime;

    /**
     * 接受日期
     */
    private String createUserId;

    /**
     * 接受日期
     */
    private Date createDate;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel == null ? null : productModel.trim();
    }

    public String getSap0rderCode() {
        return sap0rderCode;
    }

    public void setSap0rderCode(String sap0rderCode) {
        this.sap0rderCode = sap0rderCode == null ? null : sap0rderCode.trim();
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText == null ? null : commentText.trim();
    }

    public String getComeUserId() {
        return comeUserId;
    }

    public void setComeUserId(String comeUserId) {
        this.comeUserId = comeUserId == null ? null : comeUserId.trim();
    }

    public Date getComeTime() {
        return comeTime;
    }

    public void setComeTime(Date comeTime) {
        this.comeTime = comeTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}