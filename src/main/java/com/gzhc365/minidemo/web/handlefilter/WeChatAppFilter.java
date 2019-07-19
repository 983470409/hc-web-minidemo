package com.gzhc365.minidemo.web.handlefilter;

import com.gzhc365.component.utils.entity.HcContext;
import com.gzhc365.gateway.facade.GateWayFacade;
import com.gzhc365.web.controller.BaseController;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用户后期扩展拦截请求
 */
public class WeChatAppFilter extends BaseFilter {

    private GateWayFacade gateWayFacade;

    public HcContext getHcContext(HttpServletRequest request) {
        return (HcContext) request.getAttribute(BaseController.HC_CONTEXT);
    }

    /**
     * 微信小程序获取openid、unionid和sessionkey
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException {
        logger.debug("进入微信小程序授权http请求");
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        filter(chain, req, resp);
    }

    public void setGateWayFacade(GateWayFacade gateWayFacade) {
        this.gateWayFacade = gateWayFacade;
    }

    /**
     * 返回 #{bare_field_comment}
     */
    public GateWayFacade getGateWayFacade() {
        return gateWayFacade;
    }

    public void destroy() {
    }

    public void init(FilterConfig arg0) throws ServletException {
    }

}