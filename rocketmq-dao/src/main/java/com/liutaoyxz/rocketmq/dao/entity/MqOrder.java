package com.liutaoyxz.rocketmq.dao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MqOrder implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_order.order_id
     *
     * @mbggenerated
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_order.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_order.order_status
     *
     * @mbggenerated
     */
    private String orderStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_order.pay_status
     *
     * @mbggenerated
     */
    private String payStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_order.shipping_status
     *
     * @mbggenerated
     */
    private String shippingStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_order.address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_order.consignee
     *
     * @mbggenerated
     */
    private String consignee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_order.goods_id
     *
     * @mbggenerated
     */
    private Integer goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_order.goods_number
     *
     * @mbggenerated
     */
    private Integer goodsNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_order.goods_price
     *
     * @mbggenerated
     */
    private BigDecimal goodsPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_order.goods_amount
     *
     * @mbggenerated
     */
    private BigDecimal goodsAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_order.order_amount
     *
     * @mbggenerated
     */
    private BigDecimal orderAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_order.coupon_id
     *
     * @mbggenerated
     */
    private String couponId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_order.money_paid
     *
     * @mbggenerated
     */
    private BigDecimal moneyPaid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_order.pay_amount
     *
     * @mbggenerated
     */
    private BigDecimal payAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_order.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_order.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_order.confirmTime
     *
     * @mbggenerated
     */
    private Date confirmtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_order.pay_time
     *
     * @mbggenerated
     */
    private Date payTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mq_order
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_order.order_id
     *
     * @return the value of mq_order.order_id
     *
     * @mbggenerated
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_order.order_id
     *
     * @param orderId the value for mq_order.order_id
     *
     * @mbggenerated
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_order.user_id
     *
     * @return the value of mq_order.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_order.user_id
     *
     * @param userId the value for mq_order.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_order.order_status
     *
     * @return the value of mq_order.order_status
     *
     * @mbggenerated
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_order.order_status
     *
     * @param orderStatus the value for mq_order.order_status
     *
     * @mbggenerated
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_order.pay_status
     *
     * @return the value of mq_order.pay_status
     *
     * @mbggenerated
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_order.pay_status
     *
     * @param payStatus the value for mq_order.pay_status
     *
     * @mbggenerated
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_order.shipping_status
     *
     * @return the value of mq_order.shipping_status
     *
     * @mbggenerated
     */
    public String getShippingStatus() {
        return shippingStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_order.shipping_status
     *
     * @param shippingStatus the value for mq_order.shipping_status
     *
     * @mbggenerated
     */
    public void setShippingStatus(String shippingStatus) {
        this.shippingStatus = shippingStatus == null ? null : shippingStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_order.address
     *
     * @return the value of mq_order.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_order.address
     *
     * @param address the value for mq_order.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_order.consignee
     *
     * @return the value of mq_order.consignee
     *
     * @mbggenerated
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_order.consignee
     *
     * @param consignee the value for mq_order.consignee
     *
     * @mbggenerated
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_order.goods_id
     *
     * @return the value of mq_order.goods_id
     *
     * @mbggenerated
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_order.goods_id
     *
     * @param goodsId the value for mq_order.goods_id
     *
     * @mbggenerated
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_order.goods_number
     *
     * @return the value of mq_order.goods_number
     *
     * @mbggenerated
     */
    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_order.goods_number
     *
     * @param goodsNumber the value for mq_order.goods_number
     *
     * @mbggenerated
     */
    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_order.goods_price
     *
     * @return the value of mq_order.goods_price
     *
     * @mbggenerated
     */
    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_order.goods_price
     *
     * @param goodsPrice the value for mq_order.goods_price
     *
     * @mbggenerated
     */
    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_order.goods_amount
     *
     * @return the value of mq_order.goods_amount
     *
     * @mbggenerated
     */
    public BigDecimal getGoodsAmount() {
        return goodsAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_order.goods_amount
     *
     * @param goodsAmount the value for mq_order.goods_amount
     *
     * @mbggenerated
     */
    public void setGoodsAmount(BigDecimal goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_order.order_amount
     *
     * @return the value of mq_order.order_amount
     *
     * @mbggenerated
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_order.order_amount
     *
     * @param orderAmount the value for mq_order.order_amount
     *
     * @mbggenerated
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_order.coupon_id
     *
     * @return the value of mq_order.coupon_id
     *
     * @mbggenerated
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_order.coupon_id
     *
     * @param couponId the value for mq_order.coupon_id
     *
     * @mbggenerated
     */
    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_order.money_paid
     *
     * @return the value of mq_order.money_paid
     *
     * @mbggenerated
     */
    public BigDecimal getMoneyPaid() {
        return moneyPaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_order.money_paid
     *
     * @param moneyPaid the value for mq_order.money_paid
     *
     * @mbggenerated
     */
    public void setMoneyPaid(BigDecimal moneyPaid) {
        this.moneyPaid = moneyPaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_order.pay_amount
     *
     * @return the value of mq_order.pay_amount
     *
     * @mbggenerated
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_order.pay_amount
     *
     * @param payAmount the value for mq_order.pay_amount
     *
     * @mbggenerated
     */
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_order.create_time
     *
     * @return the value of mq_order.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_order.create_time
     *
     * @param createTime the value for mq_order.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_order.update_time
     *
     * @return the value of mq_order.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_order.update_time
     *
     * @param updateTime the value for mq_order.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_order.confirmTime
     *
     * @return the value of mq_order.confirmTime
     *
     * @mbggenerated
     */
    public Date getConfirmtime() {
        return confirmtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_order.confirmTime
     *
     * @param confirmtime the value for mq_order.confirmTime
     *
     * @mbggenerated
     */
    public void setConfirmtime(Date confirmtime) {
        this.confirmtime = confirmtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_order.pay_time
     *
     * @return the value of mq_order.pay_time
     *
     * @mbggenerated
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_order.pay_time
     *
     * @param payTime the value for mq_order.pay_time
     *
     * @mbggenerated
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mq_order
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MqOrder other = (MqOrder) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getPayStatus() == null ? other.getPayStatus() == null : this.getPayStatus().equals(other.getPayStatus()))
            && (this.getShippingStatus() == null ? other.getShippingStatus() == null : this.getShippingStatus().equals(other.getShippingStatus()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getConsignee() == null ? other.getConsignee() == null : this.getConsignee().equals(other.getConsignee()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsNumber() == null ? other.getGoodsNumber() == null : this.getGoodsNumber().equals(other.getGoodsNumber()))
            && (this.getGoodsPrice() == null ? other.getGoodsPrice() == null : this.getGoodsPrice().equals(other.getGoodsPrice()))
            && (this.getGoodsAmount() == null ? other.getGoodsAmount() == null : this.getGoodsAmount().equals(other.getGoodsAmount()))
            && (this.getOrderAmount() == null ? other.getOrderAmount() == null : this.getOrderAmount().equals(other.getOrderAmount()))
            && (this.getCouponId() == null ? other.getCouponId() == null : this.getCouponId().equals(other.getCouponId()))
            && (this.getMoneyPaid() == null ? other.getMoneyPaid() == null : this.getMoneyPaid().equals(other.getMoneyPaid()))
            && (this.getPayAmount() == null ? other.getPayAmount() == null : this.getPayAmount().equals(other.getPayAmount()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getConfirmtime() == null ? other.getConfirmtime() == null : this.getConfirmtime().equals(other.getConfirmtime()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mq_order
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getPayStatus() == null) ? 0 : getPayStatus().hashCode());
        result = prime * result + ((getShippingStatus() == null) ? 0 : getShippingStatus().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getConsignee() == null) ? 0 : getConsignee().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsNumber() == null) ? 0 : getGoodsNumber().hashCode());
        result = prime * result + ((getGoodsPrice() == null) ? 0 : getGoodsPrice().hashCode());
        result = prime * result + ((getGoodsAmount() == null) ? 0 : getGoodsAmount().hashCode());
        result = prime * result + ((getOrderAmount() == null) ? 0 : getOrderAmount().hashCode());
        result = prime * result + ((getCouponId() == null) ? 0 : getCouponId().hashCode());
        result = prime * result + ((getMoneyPaid() == null) ? 0 : getMoneyPaid().hashCode());
        result = prime * result + ((getPayAmount() == null) ? 0 : getPayAmount().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getConfirmtime() == null) ? 0 : getConfirmtime().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mq_order
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", shippingStatus=").append(shippingStatus);
        sb.append(", address=").append(address);
        sb.append(", consignee=").append(consignee);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsNumber=").append(goodsNumber);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsAmount=").append(goodsAmount);
        sb.append(", orderAmount=").append(orderAmount);
        sb.append(", couponId=").append(couponId);
        sb.append(", moneyPaid=").append(moneyPaid);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", confirmtime=").append(confirmtime);
        sb.append(", payTime=").append(payTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}