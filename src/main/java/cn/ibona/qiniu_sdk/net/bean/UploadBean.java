package cn.ibona.qiniu_sdk.net.bean;

/**
 * Created by yuanmingzhuo on 16-3-11.
 * 上传信息封装
 */
public class UploadBean {

    private String uid;
    private String imagePath;
    private String imageName;
    private String token;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "UploadBean{" +
                "uid='" + uid + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", imageName='" + imageName + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
