package com.ruanko.springboothelloworld.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author zzhay
 * @Date 2023/7/21/021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonResult<T> {
    private boolean b;
    private String msg;
    private T data;
}
