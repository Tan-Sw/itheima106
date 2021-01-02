package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 包名:com.itheima.pojo
 *
 * @author Shaowu Tan
 * @Classname itms
 * @Date 2020/12/31 17:46
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Items implements Serializable {
    private Integer id;
    private String name;
    private Float price;
    private String pic;
    private Date createTime;
    private String detail;
}
