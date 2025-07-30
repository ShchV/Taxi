package com.laba.taxi.user.driver;

import com.laba.taxi.annotations.EntityInfo;

@EntityInfo(passenger = "Victoria", date = "2025-07-25")
public record Response(String message, boolean success) {
    @Override
    public String toString() {
        return "Response{" +
                "message='" + message + '\'' +
                ", success=" + success +
                '}';
    }
}
