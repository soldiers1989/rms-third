package com.jzfq.rms.third.web.action.masterWork.test;

import com.jzfq.rms.third.common.utils.SpringContextHolder;
import com.jzfq.rms.third.service.IRiskPostDataService;
import com.jzfq.rms.third.web.action.masterWork.Master;
import com.jzfq.rms.third.web.action.masterWork.Worker;
import com.jzfq.rms.third.web.action.model.BrScoreModel;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        IRiskPostDataService riskPostDataService = SpringContextHolder.getBean(IRiskPostDataService.class);


        Master master=new Master(new Worker(riskPostDataService), 50);

        //分配任务  76028 个任务

        for(int i=1;i<=76028;i++) {
            BrScoreModel info = new BrScoreModel();
//                hssfrow = hssfsheet.getRow(j);
            info.setId(i);
            info.setScore("1");
//                logger.info("当前行：" + j+ "当前数据：【"+info.toString()+"】");
            //添加任务
            master.submit(info);
//            master.submit(t);
        }
        master.execute();

        long start = System.currentTimeMillis();
        while(true){
            if(master.isComplete()){
                long end = System.currentTimeMillis() - start;
                int ret = master.getResult();
                System.out.println("最终结果：" + ret + "， 执行耗时：" + end);
                break;
            }
        }

    }


}
