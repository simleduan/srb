package com.study.srb.core.mapper;

import com.study.srb.core.pojo.dto.ExcelDictDTO;
import com.study.srb.core.pojo.entity.Dict;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 数据字典 Mapper 接口
 * </p>
 *
 * @author xiaocai
 * @since 2021-11-16
 */
public interface DictMapper extends BaseMapper<Dict> {

    void insertBatch(List<ExcelDictDTO> list);
}
