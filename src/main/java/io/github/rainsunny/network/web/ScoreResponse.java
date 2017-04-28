package io.github.rainsunny.network.web;

import java.io.Serializable;

/**
 * @author wangjie
 *         4/28/17
 */
public class ScoreResponse implements Serializable {
    private static final long serialVersionUID = 1994703951099449370L;
    private int error_code;
    private String error_msg;
    private double network_score;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public double getNetwork_score() {
        return network_score;
    }

    public void setNetwork_score(double network_score) {
        this.network_score = network_score;
    }

    @Override
    public String toString() {
        return "ScoreResponse{" +
                "error_code=" + error_code +
                ", error_msg='" + error_msg + '\'' +
                ", network_score=" + network_score +
                '}';
    }
}
