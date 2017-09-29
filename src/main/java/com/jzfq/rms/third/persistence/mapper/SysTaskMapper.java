package com.jzfq.rms.third.persistence.mapper;

import com.jzfq.rms.third.common.domain.SysTask;

public interface SysTaskMapper {

    int insertTask(SysTask task);

    SysTask selectByTaskSlug(String taskSlug);

    int updateTask(SysTask task);

}
