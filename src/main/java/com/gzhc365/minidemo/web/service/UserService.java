package com.gzhc365.minidemo.web.service;

import com.gzhc365.component.utils.entity.HcContext;
import com.gzhc365.minidemo.facade.UserFacade;
import com.gzhc365.minidemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户相关业务逻辑实现
 *
 * @author chengang
 * @date 19-4-15
 * @time 下午5:57
 * @since JDK 1.8
 */
@Service
public class UserService {
    @Autowired
    private UserFacade userFacade;

    /**
     * 获取指定用户信息
     *
     * @param userId
     * @param context
     * @return
     * @throws com.gzhc365.minicommon.exception.MiniCenterException
     */
    public User getById(Long userId, HcContext context) {
        return userFacade.getById(userId, context);
    }

}
