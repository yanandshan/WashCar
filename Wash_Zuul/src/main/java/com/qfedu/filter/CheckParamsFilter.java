//package com.qfedu.filter;
//
//import com.alibaba.fastjson.JSON;
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.exception.ZuulException;
//import com.qfedu.vo.Result;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.Map;
//
///**
// * @author Administrator
// * @version 1.0
// * @date 2019/11/9 9:20
// */
//@Component
//public class CheckParamsFilter extends ZuulFilter {
//    /**
//     * 类型：
//     * pre：预处理
//     * route：过滤中
//     * post：过滤之后
//     * error：异常
//     */
//    @Override
//    public String filterType() {
//        return "pre";
//    }
//
//    /**
//     * 过滤器排序 值越小，优先级越高
//     */
//    @Override
//    public int filterOrder() {
//        return 1;
//    }
//
//    /**
//     * 当前过滤器是否生效 true:生效 false:不生效
//     */
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    /**
//     * 实现过滤的核心方法 可以实现拦截等操作
//     */
//    @Override
//    public Object run() throws ZuulException {
//        RequestContext currentContext = RequestContext.getCurrentContext();
//        HttpServletRequest request = currentContext.getRequest();
//        Map<String, String[]> map = request.getParameterMap();
//        String s = request.getRequestURI();//得到请求的url
//        System.out.println("当前请求的是：" + s);
//        if (s.endsWith(".do")) {
//            //如果请求以.do结尾，判断参数是否合法
//            if (map.containsKey("version")) {
//                System.out.println("版本号：" + Arrays.toString(map.get("version")));
//            } else {
//                //参数不合法直接进行拦截,false表示进行拦截
//                currentContext.setSendZuulResponse(false);
//                currentContext.setResponseStatusCode(HttpStatus.BAD_REQUEST.value());
//                HttpServletResponse response = currentContext.getResponse();
//                try {
//                    response.setContentType("application/json;charset=UTF-8");
//                    response.setCharacterEncoding("UTF-8");
//                    response.getWriter().write(JSON.toJSONString(Result.fail("参数非法异常！")));
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        }
//
//        return null;
//    }
//}
