package com.example.mylogin

import java.util.*

class CouponList
{
    public var coupList: MutableList<Coupons> = ArrayList()
    public var catList: MutableList<String> = ArrayList()
    var indexer: Int? = null
    private var single_instance: CouponList? = null
    fun setIndex(_index: Int)
    {
        indexer = _index
    }
    fun getIndex(): Int?
    {
        return indexer
    }
    fun PopulateList(_coupon : Coupons)
    {
        coupList.add(_coupon)

    }

    fun getInstance(): CouponList? {
        if (single_instance == null) single_instance = CouponList()
        return single_instance
    }

}