package com.jzfq.rms.third.service;

import com.jzfq.rms.third.common.mongo.BaseData;

import java.util.List;

public interface IMongoService {
    public void save(List<BaseData> list);

    public Long findCount( Class c);


}
