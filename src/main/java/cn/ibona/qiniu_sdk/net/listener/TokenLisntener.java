package cn.ibona.qiniu_sdk.net.listener;

/**
 * Created by yuanmingzhuo on 16-3-11.
 * 监听 token
 */
public interface TokenLisntener {


    /**
     * 成功回调
     */
    void getTokenSuccess();

    /**
     * 失败回调
     * @param msg 失败信息
     */
    void getTokenError(String msg);


}
