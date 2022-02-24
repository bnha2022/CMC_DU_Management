package cmc.du21.cms.http;

import lombok.Getter;

@Getter
public class Response<T> {

    public static final int CODE_SUCCESS = 200;

    public static final int CODE_NOT_FOUND = 404;

    public static final int CODE_BUSINESS = 406;

    public static final int CODE_LOGIN_USER_NOT_FOUND = 403;

    public static final int CODE_INVALID = 410;

    protected Integer code;

    public static <T> Response<T> ok() {
        Response<T> response = new Response<>();
        response.code = CODE_SUCCESS;
        return response;
    }

    public Response<T> code(int code) {
        this.code = code;
        return this;
    }

    private T data;

    public static <T> Response<T> build() {
        return new Response<T>();
    }

    public Response<T> data(T data) {
        this.data = data;
        return this;
    }

}
