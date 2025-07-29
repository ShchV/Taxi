package com.laba.taxi.user.driver;

<<<<<<< HEAD
public class Response<T> {
    private boolean success;
    private String message;
    private T data;

    public Response(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess() { return success; }
    public String getMessage() { return message; }
    public T getData() { return data; }

    @Override
    public String toString() {
        return "Response{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
=======
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
>>>>>>> 7e46d72 (Final project)
