package com.example.order.utils;

import com.example.order.VO.ResultVO;

/**
 * @Title: ResultVOUtil
 * @ProjectName order
 * @date 2019/11/1514:32
 */
public class ResultVOUtil {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
