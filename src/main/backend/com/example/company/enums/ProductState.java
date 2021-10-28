package com.example.company.enums;

public enum ProductState {
    ACTIVE(1, "Active"), DISCOUNTED(2, "Discounted");

    private int state;
    private String valueState;

    ProductState(int state, String valueState) {
        this.state = state;
        this.valueState = valueState;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setValueState(String valueState) {
        this.valueState = valueState;
    }

    public String getValueState() {
        return valueState;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ProductState{" +
                "state=" + state +
                ", valueState='" + valueState + '\'' +
                '}';
    }
}
