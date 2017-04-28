package io.github.rainsunny.network.web;

import java.io.Serializable;

/**
 * @author wangjie
 *         4/28/17
 */
public class ScoreRequest implements Serializable {
    private static final long serialVersionUID = -1611225025571930730L;
    private String account_id;
    private String id_no;
    private String mobile_no;
    private String bank_card_no;
    private String device_id;
    private String lmac;
    private String ip;

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getId_no() {
        return id_no;
    }

    public void setId_no(String id_no) {
        this.id_no = id_no;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getBank_card_no() {
        return bank_card_no;
    }

    public void setBank_card_no(String bank_card_no) {
        this.bank_card_no = bank_card_no;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getLmac() {
        return lmac;
    }

    public void setLmac(String lmac) {
        this.lmac = lmac;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "ScoreRequest{" +
                "account_id='" + account_id + '\'' +
                ", id_no='" + id_no + '\'' +
                ", mobile_no='" + mobile_no + '\'' +
                ", bank_card_no='" + bank_card_no + '\'' +
                ", device_id='" + device_id + '\'' +
                ", lmac='" + lmac + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
