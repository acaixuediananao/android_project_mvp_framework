package com.android_project_mvp_framework.bean;

import com.android_project_mvp_framework.net.ResponseResult;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xiaolong.wei on 2017/9/13.
 */

public class DataBean extends ResponseResult<DataBean> implements Serializable {



        /**
         * activity : {"id":898,"title":"测试积分抽奖","type":"lottery","category":"membership_lottery","create_time":"2017-09-15 15:07:28","begin_time":"2017-09-06 06:10:00","end_time":"2017-10-20 03:07:00","desc":"","enabled":true,"ordering":0,"long_term":false}
         * lottery_setting : {"id":3,"category":"membership_lottery","active":1,"random_cheet":0.5,"daily_limit":null,"reward_index":"{\"钢钉\":0,\"1%加息券\":1,\"100元抵现券\":2,\"1000积分\":3,\"薄荷糖\":4,\"咸鱼十条\":5,\"2%加息券\":6,\"喜洋洋\":7}","executor":null,"next_time":null,"update_time":null,"reward_image0":null,"reward_image1":null,"reward_image2":"/images/d858eb08ac1e7679af12841495fede05.png","reward_image3":"/images/4481a088d101c61f3656627a9c435d1d.png","reward_image4":"/images/6a4996ccf68b782a5ea43303f6025cd7.png","reward_image5":"/images/e3b6d4cbe97f7ccd9b925a09ea8ec902.png","reward_image6":"/images/9e2ed8382bacb618e12a8eda1eacbd48.png","reward_image7":"/images/4c06d2902a55c3d88d3d40dae2a845cb.png","reward_image8":null,"reward_image9":null,"reward_image0_hover":"钢钉","reward_image1_hover":"1%加息券","reward_image2_hover":"100元抵现券","reward_image3_hover":"1000积分","reward_image4_hover":"薄荷糖","reward_image5_hover":"咸鱼十条","reward_image6_hover":"2%加息券","reward_image7_hover":"喜洋洋","reward_image8_hover":null,"reward_image9_hover":null,"reward_image10_hover":null,"reward_image10":null,"memo":null,"cost_points":1999}
         * giftlist : {"special":null,"virtual":[],"material":[]}
         * activity_on : true
         * user : {"id":800124542,"secure_email":null,"secure_email_mask":null,"secure_phone":"15210966236","secure_phone_mask":"152******36","nickname":null,"qq_openid":null,"qq_nickname":null,"weibo_uid":null,"weibo_nickname":null,"weixin_openid":null,"displayname":"15210966236","displayname_mask":"152******36","maskname":null,"password":"$2a$10$lELkdFbmdrmfUvJy0HLspOhTulJpf6F9JPjGHdSTL9s2Wtg9asD6e","register_time":"2017-08-23 10:41:08","register_by":"phone","idcard_name":"赖逸轩","idcard_number":"522427197909141372","birthday":"1979-09-14","sex":1,"idcard_validated":true,"email":null,"phone":null,"role":"INVESTOR","membership":"base","invite_level":null,"upgrade_time":null,"has_yeepay":false,"has_umbpay":true,"company_id":null,"refer_user_id":null,"company_json":null,"push_flag":0,"server_type":"computer","audit_time":"2017-08-23 10:41:53","autoinvest_auth":false,"user_type":"USER","_borrower":false,"_active":true,"_curproduct_user":false}
         * lottery_record : []
         */

        private ActivityBean activity;
        private LotterySettingBean lottery_setting;
        private GiftlistBean giftlist;
        private boolean activity_on;
        private UserBean user;
        private List<?> lottery_record;

        public ActivityBean getActivity() {
            return activity;
        }

        public void setActivity(ActivityBean activity) {
            this.activity = activity;
        }

        public LotterySettingBean getLottery_setting() {
            return lottery_setting;
        }

        public void setLottery_setting(LotterySettingBean lottery_setting) {
            this.lottery_setting = lottery_setting;
        }

        public GiftlistBean getGiftlist() {
            return giftlist;
        }

        public void setGiftlist(GiftlistBean giftlist) {
            this.giftlist = giftlist;
        }

        public boolean isActivity_on() {
            return activity_on;
        }

        public void setActivity_on(boolean activity_on) {
            this.activity_on = activity_on;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public List<?> getLottery_record() {
            return lottery_record;
        }

        public void setLottery_record(List<?> lottery_record) {
            this.lottery_record = lottery_record;
        }

        public static class ActivityBean {
            /**
             * id : 898
             * title : 测试积分抽奖
             * type : lottery
             * category : membership_lottery
             * create_time : 2017-09-15 15:07:28
             * begin_time : 2017-09-06 06:10:00
             * end_time : 2017-10-20 03:07:00
             * desc :
             * enabled : true
             * ordering : 0
             * long_term : false
             */

            private int id;
            private String title;
            private String type;
            private String category;
            private String create_time;
            private String begin_time;
            private String end_time;
            private String desc;
            private boolean enabled;
            private int ordering;
            private boolean long_term;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public String getBegin_time() {
                return begin_time;
            }

            public void setBegin_time(String begin_time) {
                this.begin_time = begin_time;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public boolean isEnabled() {
                return enabled;
            }

            public void setEnabled(boolean enabled) {
                this.enabled = enabled;
            }

            public int getOrdering() {
                return ordering;
            }

            public void setOrdering(int ordering) {
                this.ordering = ordering;
            }

            public boolean isLong_term() {
                return long_term;
            }

            public void setLong_term(boolean long_term) {
                this.long_term = long_term;
            }
        }

        public static class LotterySettingBean {
            /**
             * id : 3
             * category : membership_lottery
             * active : 1
             * random_cheet : 0.5
             * daily_limit : null
             * reward_index : {"钢钉":0,"1%加息券":1,"100元抵现券":2,"1000积分":3,"薄荷糖":4,"咸鱼十条":5,"2%加息券":6,"喜洋洋":7}
             * executor : null
             * next_time : null
             * update_time : null
             * reward_image0 : null
             * reward_image1 : null
             * reward_image2 : /images/d858eb08ac1e7679af12841495fede05.png
             * reward_image3 : /images/4481a088d101c61f3656627a9c435d1d.png
             * reward_image4 : /images/6a4996ccf68b782a5ea43303f6025cd7.png
             * reward_image5 : /images/e3b6d4cbe97f7ccd9b925a09ea8ec902.png
             * reward_image6 : /images/9e2ed8382bacb618e12a8eda1eacbd48.png
             * reward_image7 : /images/4c06d2902a55c3d88d3d40dae2a845cb.png
             * reward_image8 : null
             * reward_image9 : null
             * reward_image0_hover : 钢钉
             * reward_image1_hover : 1%加息券
             * reward_image2_hover : 100元抵现券
             * reward_image3_hover : 1000积分
             * reward_image4_hover : 薄荷糖
             * reward_image5_hover : 咸鱼十条
             * reward_image6_hover : 2%加息券
             * reward_image7_hover : 喜洋洋
             * reward_image8_hover : null
             * reward_image9_hover : null
             * reward_image10_hover : null
             * reward_image10 : null
             * memo : null
             * cost_points : 1999
             */

            private int id;
            private String category;
            private int active;
            private double random_cheet;
            private Object daily_limit;
            private String reward_index;
            private Object executor;
            private Object next_time;
            private Object update_time;
            private Object reward_image0;
            private Object reward_image1;
            private String reward_image2;
            private String reward_image3;
            private String reward_image4;
            private String reward_image5;
            private String reward_image6;
            private String reward_image7;
            private Object reward_image8;
            private Object reward_image9;
            private String reward_image0_hover;
            private String reward_image1_hover;
            private String reward_image2_hover;
            private String reward_image3_hover;
            private String reward_image4_hover;
            private String reward_image5_hover;
            private String reward_image6_hover;
            private String reward_image7_hover;
            private Object reward_image8_hover;
            private Object reward_image9_hover;
            private Object reward_image10_hover;
            private Object reward_image10;
            private Object memo;
            private int cost_points;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public int getActive() {
                return active;
            }

            public void setActive(int active) {
                this.active = active;
            }

            public double getRandom_cheet() {
                return random_cheet;
            }

            public void setRandom_cheet(double random_cheet) {
                this.random_cheet = random_cheet;
            }

            public Object getDaily_limit() {
                return daily_limit;
            }

            public void setDaily_limit(Object daily_limit) {
                this.daily_limit = daily_limit;
            }

            public String getReward_index() {
                return reward_index;
            }

            public void setReward_index(String reward_index) {
                this.reward_index = reward_index;
            }

            public Object getExecutor() {
                return executor;
            }

            public void setExecutor(Object executor) {
                this.executor = executor;
            }

            public Object getNext_time() {
                return next_time;
            }

            public void setNext_time(Object next_time) {
                this.next_time = next_time;
            }

            public Object getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(Object update_time) {
                this.update_time = update_time;
            }

            public Object getReward_image0() {
                return reward_image0;
            }

            public void setReward_image0(Object reward_image0) {
                this.reward_image0 = reward_image0;
            }

            public Object getReward_image1() {
                return reward_image1;
            }

            public void setReward_image1(Object reward_image1) {
                this.reward_image1 = reward_image1;
            }

            public String getReward_image2() {
                return reward_image2;
            }

            public void setReward_image2(String reward_image2) {
                this.reward_image2 = reward_image2;
            }

            public String getReward_image3() {
                return reward_image3;
            }

            public void setReward_image3(String reward_image3) {
                this.reward_image3 = reward_image3;
            }

            public String getReward_image4() {
                return reward_image4;
            }

            public void setReward_image4(String reward_image4) {
                this.reward_image4 = reward_image4;
            }

            public String getReward_image5() {
                return reward_image5;
            }

            public void setReward_image5(String reward_image5) {
                this.reward_image5 = reward_image5;
            }

            public String getReward_image6() {
                return reward_image6;
            }

            public void setReward_image6(String reward_image6) {
                this.reward_image6 = reward_image6;
            }

            public String getReward_image7() {
                return reward_image7;
            }

            public void setReward_image7(String reward_image7) {
                this.reward_image7 = reward_image7;
            }

            public Object getReward_image8() {
                return reward_image8;
            }

            public void setReward_image8(Object reward_image8) {
                this.reward_image8 = reward_image8;
            }

            public Object getReward_image9() {
                return reward_image9;
            }

            public void setReward_image9(Object reward_image9) {
                this.reward_image9 = reward_image9;
            }

            public String getReward_image0_hover() {
                return reward_image0_hover;
            }

            public void setReward_image0_hover(String reward_image0_hover) {
                this.reward_image0_hover = reward_image0_hover;
            }

            public String getReward_image1_hover() {
                return reward_image1_hover;
            }

            public void setReward_image1_hover(String reward_image1_hover) {
                this.reward_image1_hover = reward_image1_hover;
            }

            public String getReward_image2_hover() {
                return reward_image2_hover;
            }

            public void setReward_image2_hover(String reward_image2_hover) {
                this.reward_image2_hover = reward_image2_hover;
            }

            public String getReward_image3_hover() {
                return reward_image3_hover;
            }

            public void setReward_image3_hover(String reward_image3_hover) {
                this.reward_image3_hover = reward_image3_hover;
            }

            public String getReward_image4_hover() {
                return reward_image4_hover;
            }

            public void setReward_image4_hover(String reward_image4_hover) {
                this.reward_image4_hover = reward_image4_hover;
            }

            public String getReward_image5_hover() {
                return reward_image5_hover;
            }

            public void setReward_image5_hover(String reward_image5_hover) {
                this.reward_image5_hover = reward_image5_hover;
            }

            public String getReward_image6_hover() {
                return reward_image6_hover;
            }

            public void setReward_image6_hover(String reward_image6_hover) {
                this.reward_image6_hover = reward_image6_hover;
            }

            public String getReward_image7_hover() {
                return reward_image7_hover;
            }

            public void setReward_image7_hover(String reward_image7_hover) {
                this.reward_image7_hover = reward_image7_hover;
            }

            public Object getReward_image8_hover() {
                return reward_image8_hover;
            }

            public void setReward_image8_hover(Object reward_image8_hover) {
                this.reward_image8_hover = reward_image8_hover;
            }

            public Object getReward_image9_hover() {
                return reward_image9_hover;
            }

            public void setReward_image9_hover(Object reward_image9_hover) {
                this.reward_image9_hover = reward_image9_hover;
            }

            public Object getReward_image10_hover() {
                return reward_image10_hover;
            }

            public void setReward_image10_hover(Object reward_image10_hover) {
                this.reward_image10_hover = reward_image10_hover;
            }

            public Object getReward_image10() {
                return reward_image10;
            }

            public void setReward_image10(Object reward_image10) {
                this.reward_image10 = reward_image10;
            }

            public Object getMemo() {
                return memo;
            }

            public void setMemo(Object memo) {
                this.memo = memo;
            }

            public int getCost_points() {
                return cost_points;
            }

            public void setCost_points(int cost_points) {
                this.cost_points = cost_points;
            }
        }

        public static class GiftlistBean {
            /**
             * special : null
             * virtual : []
             * material : []
             */

            private Object special;
            private List<?> virtual;
            private List<?> material;

            public Object getSpecial() {
                return special;
            }

            public void setSpecial(Object special) {
                this.special = special;
            }

            public List<?> getVirtual() {
                return virtual;
            }

            public void setVirtual(List<?> virtual) {
                this.virtual = virtual;
            }

            public List<?> getMaterial() {
                return material;
            }

            public void setMaterial(List<?> material) {
                this.material = material;
            }
        }

        public static class UserBean {
            /**
             * id : 800124542
             * secure_email : null
             * secure_email_mask : null
             * secure_phone : 15210966236
             * secure_phone_mask : 152******36
             * nickname : null
             * qq_openid : null
             * qq_nickname : null
             * weibo_uid : null
             * weibo_nickname : null
             * weixin_openid : null
             * displayname : 15210966236
             * displayname_mask : 152******36
             * maskname : null
             * password : $2a$10$lELkdFbmdrmfUvJy0HLspOhTulJpf6F9JPjGHdSTL9s2Wtg9asD6e
             * register_time : 2017-08-23 10:41:08
             * register_by : phone
             * idcard_name : 赖逸轩
             * idcard_number : 522427197909141372
             * birthday : 1979-09-14
             * sex : 1
             * idcard_validated : true
             * email : null
             * phone : null
             * role : INVESTOR
             * membership : base
             * invite_level : null
             * upgrade_time : null
             * has_yeepay : false
             * has_umbpay : true
             * company_id : null
             * refer_user_id : null
             * company_json : null
             * push_flag : 0
             * server_type : computer
             * audit_time : 2017-08-23 10:41:53
             * autoinvest_auth : false
             * user_type : USER
             * _borrower : false
             * _active : true
             * _curproduct_user : false
             */

            private int id;
            private Object secure_email;
            private Object secure_email_mask;
            private String secure_phone;
            private String secure_phone_mask;
            private Object nickname;
            private Object qq_openid;
            private Object qq_nickname;
            private Object weibo_uid;
            private Object weibo_nickname;
            private Object weixin_openid;
            private String displayname;
            private String displayname_mask;
            private Object maskname;
            private String password;
            private String register_time;
            private String register_by;
            private String idcard_name;
            private String idcard_number;
            private String birthday;
            private int sex;
            private boolean idcard_validated;
            private Object email;
            private Object phone;
            private String role;
            private String membership;
            private Object invite_level;
            private Object upgrade_time;
            private boolean has_yeepay;
            private boolean has_umbpay;
            private Object company_id;
            private Object refer_user_id;
            private Object company_json;
            private int push_flag;
            private String server_type;
            private String audit_time;
            private boolean autoinvest_auth;
            private String user_type;
            private boolean _borrower;
            private boolean _active;
            private boolean _curproduct_user;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public Object getSecure_email() {
                return secure_email;
            }

            public void setSecure_email(Object secure_email) {
                this.secure_email = secure_email;
            }

            public Object getSecure_email_mask() {
                return secure_email_mask;
            }

            public void setSecure_email_mask(Object secure_email_mask) {
                this.secure_email_mask = secure_email_mask;
            }

            public String getSecure_phone() {
                return secure_phone;
            }

            public void setSecure_phone(String secure_phone) {
                this.secure_phone = secure_phone;
            }

            public String getSecure_phone_mask() {
                return secure_phone_mask;
            }

            public void setSecure_phone_mask(String secure_phone_mask) {
                this.secure_phone_mask = secure_phone_mask;
            }

            public Object getNickname() {
                return nickname;
            }

            public void setNickname(Object nickname) {
                this.nickname = nickname;
            }

            public Object getQq_openid() {
                return qq_openid;
            }

            public void setQq_openid(Object qq_openid) {
                this.qq_openid = qq_openid;
            }

            public Object getQq_nickname() {
                return qq_nickname;
            }

            public void setQq_nickname(Object qq_nickname) {
                this.qq_nickname = qq_nickname;
            }

            public Object getWeibo_uid() {
                return weibo_uid;
            }

            public void setWeibo_uid(Object weibo_uid) {
                this.weibo_uid = weibo_uid;
            }

            public Object getWeibo_nickname() {
                return weibo_nickname;
            }

            public void setWeibo_nickname(Object weibo_nickname) {
                this.weibo_nickname = weibo_nickname;
            }

            public Object getWeixin_openid() {
                return weixin_openid;
            }

            public void setWeixin_openid(Object weixin_openid) {
                this.weixin_openid = weixin_openid;
            }

            public String getDisplayname() {
                return displayname;
            }

            public void setDisplayname(String displayname) {
                this.displayname = displayname;
            }

            public String getDisplayname_mask() {
                return displayname_mask;
            }

            public void setDisplayname_mask(String displayname_mask) {
                this.displayname_mask = displayname_mask;
            }

            public Object getMaskname() {
                return maskname;
            }

            public void setMaskname(Object maskname) {
                this.maskname = maskname;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getRegister_time() {
                return register_time;
            }

            public void setRegister_time(String register_time) {
                this.register_time = register_time;
            }

            public String getRegister_by() {
                return register_by;
            }

            public void setRegister_by(String register_by) {
                this.register_by = register_by;
            }

            public String getIdcard_name() {
                return idcard_name;
            }

            public void setIdcard_name(String idcard_name) {
                this.idcard_name = idcard_name;
            }

            public String getIdcard_number() {
                return idcard_number;
            }

            public void setIdcard_number(String idcard_number) {
                this.idcard_number = idcard_number;
            }

            public String getBirthday() {
                return birthday;
            }

            public void setBirthday(String birthday) {
                this.birthday = birthday;
            }

            public int getSex() {
                return sex;
            }

            public void setSex(int sex) {
                this.sex = sex;
            }

            public boolean isIdcard_validated() {
                return idcard_validated;
            }

            public void setIdcard_validated(boolean idcard_validated) {
                this.idcard_validated = idcard_validated;
            }

            public Object getEmail() {
                return email;
            }

            public void setEmail(Object email) {
                this.email = email;
            }

            public Object getPhone() {
                return phone;
            }

            public void setPhone(Object phone) {
                this.phone = phone;
            }

            public String getRole() {
                return role;
            }

            public void setRole(String role) {
                this.role = role;
            }

            public String getMembership() {
                return membership;
            }

            public void setMembership(String membership) {
                this.membership = membership;
            }

            public Object getInvite_level() {
                return invite_level;
            }

            public void setInvite_level(Object invite_level) {
                this.invite_level = invite_level;
            }

            public Object getUpgrade_time() {
                return upgrade_time;
            }

            public void setUpgrade_time(Object upgrade_time) {
                this.upgrade_time = upgrade_time;
            }

            public boolean isHas_yeepay() {
                return has_yeepay;
            }

            public void setHas_yeepay(boolean has_yeepay) {
                this.has_yeepay = has_yeepay;
            }

            public boolean isHas_umbpay() {
                return has_umbpay;
            }

            public void setHas_umbpay(boolean has_umbpay) {
                this.has_umbpay = has_umbpay;
            }

            public Object getCompany_id() {
                return company_id;
            }

            public void setCompany_id(Object company_id) {
                this.company_id = company_id;
            }

            public Object getRefer_user_id() {
                return refer_user_id;
            }

            public void setRefer_user_id(Object refer_user_id) {
                this.refer_user_id = refer_user_id;
            }

            public Object getCompany_json() {
                return company_json;
            }

            public void setCompany_json(Object company_json) {
                this.company_json = company_json;
            }

            public int getPush_flag() {
                return push_flag;
            }

            public void setPush_flag(int push_flag) {
                this.push_flag = push_flag;
            }

            public String getServer_type() {
                return server_type;
            }

            public void setServer_type(String server_type) {
                this.server_type = server_type;
            }

            public String getAudit_time() {
                return audit_time;
            }

            public void setAudit_time(String audit_time) {
                this.audit_time = audit_time;
            }

            public boolean isAutoinvest_auth() {
                return autoinvest_auth;
            }

            public void setAutoinvest_auth(boolean autoinvest_auth) {
                this.autoinvest_auth = autoinvest_auth;
            }

            public String getUser_type() {
                return user_type;
            }

            public void setUser_type(String user_type) {
                this.user_type = user_type;
            }

            public boolean is_borrower() {
                return _borrower;
            }

            public void set_borrower(boolean _borrower) {
                this._borrower = _borrower;
            }

            public boolean is_active() {
                return _active;
            }

            public void set_active(boolean _active) {
                this._active = _active;
            }

            public boolean is_curproduct_user() {
                return _curproduct_user;
            }

            public void set_curproduct_user(boolean _curproduct_user) {
                this._curproduct_user = _curproduct_user;
            }
        }
}
