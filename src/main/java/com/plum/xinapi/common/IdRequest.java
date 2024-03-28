package com.plum.xinapi.common;

import lombok.Data;

import java.io.Serializable;

/**
 * id请求
 */
@Data
public class IdRequest implements Serializable {
    private static final long serialVersionUID = -1998421405990384978L;
    /**
     * id
     */
    private Long id;
}
