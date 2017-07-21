package org.colorcoding.ibas.sales.repository;

import org.colorcoding.ibas.bobas.common.*;
import org.colorcoding.ibas.bobas.repository.*;
import org.colorcoding.ibas.sales.bo.productsuit.*;
import org.colorcoding.ibas.sales.bo.salesdelivery.*;
import org.colorcoding.ibas.sales.bo.salesorder.*;
import org.colorcoding.ibas.sales.bo.salesreturn.*;

/**
* Sales仓库应用
*/
public interface IBORepositorySalesApp extends IBORepositoryApplication {

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-产品套装
     * @param criteria 查询
     * @return 操作结果
     */
    IOperationResult<IProductSuit> fetchProductSuit(ICriteria criteria);

    /**
     * 保存-产品套装
     * @param bo 对象实例
     * @return 操作结果
     */
    IOperationResult<IProductSuit> saveProductSuit(IProductSuit bo);

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-销售交货
     * @param criteria 查询
     * @return 操作结果
     */
    IOperationResult<ISalesDelivery> fetchSalesDelivery(ICriteria criteria);

    /**
     * 保存-销售交货
     * @param bo 对象实例
     * @return 操作结果
     */
    IOperationResult<ISalesDelivery> saveSalesDelivery(ISalesDelivery bo);

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-销售订单
     * @param criteria 查询
     * @return 操作结果
     */
    IOperationResult<ISalesOrder> fetchSalesOrder(ICriteria criteria);

    /**
     * 保存-销售订单
     * @param bo 对象实例
     * @return 操作结果
     */
    IOperationResult<ISalesOrder> saveSalesOrder(ISalesOrder bo);

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-销售退货
     * @param criteria 查询
     * @return 操作结果
     */
    IOperationResult<ISalesReturn> fetchSalesReturn(ICriteria criteria);

    /**
     * 保存-销售退货
     * @param bo 对象实例
     * @return 操作结果
     */
    IOperationResult<ISalesReturn> saveSalesReturn(ISalesReturn bo);

    //--------------------------------------------------------------------------------------------//

}
