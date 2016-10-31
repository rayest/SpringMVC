package cn.rayest.annotation;

/**
 * Created by Rayest on 2016/10/31 0031.
 */
public class Annotation {
    private String requestParameter;
    private String requestBody;

    public String getRequestParameter() {
        return requestParameter;
    }

    public void setRequestParameter(String requestParameter) {
        this.requestParameter = requestParameter;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }
}
