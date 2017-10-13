package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.GpjCarDetailModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
 * 车辆仓库mapper
 * @author 大连桔子分期科技有限公司
 */
public interface GpjCarDetailModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GpjCarDetailModel record);

    int insertSelective(GpjCarDetailModel record);

    GpjCarDetailModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GpjCarDetailModel record);

    int updateByPrimaryKey(GpjCarDetailModel record);

    void batchInsert(List<GpjCarDetailModel> lst);

    Integer getCountCarDetailModel();

    List<GpjCarDetailModel> selectByModelSlugList(@Param("slugs") Set<String>  slugs);

    void batchDelete(@Param("slugs") Set<String> slugs);
}