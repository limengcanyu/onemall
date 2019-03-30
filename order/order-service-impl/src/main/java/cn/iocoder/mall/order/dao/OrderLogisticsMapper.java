package cn.iocoder.mall.order.dao;

import cn.iocoder.mall.order.dataobject.OrderLogisticsDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * 订单 item mapper
 *
 * @author Sin
 * @time 2019-03-16 15:09
 */
@Repository
public interface OrderLogisticsMapper {

    /**
     * 插入数据
     *
     * @param orderLogisticsDO
     */
    void insert(OrderLogisticsDO orderLogisticsDO);

    /**
     * 更新 - 根据id
     *
     * @param orderLogisticsDO
     */
    void updateById(OrderLogisticsDO orderLogisticsDO);

    /**
     * 查询 - 根据 orderId
     *
     * @param ids
     * @return
     */
    List<OrderLogisticsDO> selectByIds(
            @Param("ids") Collection<Integer> ids
    );
}