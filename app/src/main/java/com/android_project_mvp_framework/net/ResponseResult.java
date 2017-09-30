package com.android_project_mvp_framework.net;

import com.android_project_mvp_framework.bean.ErrorBean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xiaolong.wei on 2017/9/18.
 */

public class ResponseResult<T>  implements Serializable{


    /**
     * success : true
     * error : null
     * data : {"activity":{"id":898,"title":"测试积分抽奖","type":"lottery","category":"membership_lottery","create_time":"2017-09-15 15:07:28","begin_time":"2017-09-06 06:10:00","end_time":"2017-10-20 03:07:00","desc":"","enabled":true,"ordering":0,"long_term":false},"lottery_setting":{"id":3,"category":"membership_lottery","active":1,"random_cheet":0.5,"daily_limit":null,"reward_index":"{\"钢钉\":0,\"1%加息券\":1,\"100元抵现券\":2,\"1000积分\":3,\"薄荷糖\":4,\"咸鱼十条\":5,\"2%加息券\":6,\"喜洋洋\":7}","executor":null,"next_time":null,"update_time":null,"reward_image0":null,"reward_image1":null,"reward_image2":"/images/d858eb08ac1e7679af12841495fede05.png","reward_image3":"/images/4481a088d101c61f3656627a9c435d1d.png","reward_image4":"/images/6a4996ccf68b782a5ea43303f6025cd7.png","reward_image5":"/images/e3b6d4cbe97f7ccd9b925a09ea8ec902.png","reward_image6":"/images/9e2ed8382bacb618e12a8eda1eacbd48.png","reward_image7":"/images/4c06d2902a55c3d88d3d40dae2a845cb.png","reward_image8":null,"reward_image9":null,"reward_image0_hover":"钢钉","reward_image1_hover":"1%加息券","reward_image2_hover":"100元抵现券","reward_image3_hover":"1000积分","reward_image4_hover":"薄荷糖","reward_image5_hover":"咸鱼十条","reward_image6_hover":"2%加息券","reward_image7_hover":"喜洋洋","reward_image8_hover":null,"reward_image9_hover":null,"reward_image10_hover":null,"reward_image10":null,"memo":null,"cost_points":1999},"giftlist":{"special":null,"virtual":[],"material":[]},"activity_on":true,"user":{"id":800124542,"secure_email":null,"secure_email_mask":null,"secure_phone":"15210966236","secure_phone_mask":"152******36","nickname":null,"qq_openid":null,"qq_nickname":null,"weibo_uid":null,"weibo_nickname":null,"weixin_openid":null,"displayname":"15210966236","displayname_mask":"152******36","maskname":null,"password":"$2a$10$lELkdFbmdrmfUvJy0HLspOhTulJpf6F9JPjGHdSTL9s2Wtg9asD6e","register_time":"2017-08-23 10:41:08","register_by":"phone","idcard_name":"赖逸轩","idcard_number":"522427197909141372","birthday":"1979-09-14","sex":1,"idcard_validated":true,"email":null,"phone":null,"role":"INVESTOR","membership":"base","invite_level":null,"upgrade_time":null,"has_yeepay":false,"has_umbpay":true,"company_id":null,"refer_user_id":null,"company_json":null,"push_flag":0,"server_type":"computer","audit_time":"2017-08-23 10:41:53","autoinvest_auth":false,"user_type":"USER","_borrower":false,"_active":true,"_curproduct_user":false},"lottery_record":[]}
     */

    private boolean success;
    private List<ErrorBean> error;
    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<ErrorBean> getError() {
        return error;
    }

    public void setError(List<ErrorBean> error) {
        this.error = error;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
