package com.stock.service;

import com.stock.entity.USStockRss;

import java.time.LocalDateTime;

/**
 * @ClassName StockService
 * @Author huiyj
 * @Version 1.0
 * @Description StockService
 **/
public interface StockService {

    public void saveStockNews(USStockRss stockNews);

    public Boolean isStockNewsExist(String stockCode, String link);

    public Long getStockUnusualCounts(USStockRss stockNews, LocalDateTime startDate, LocalDateTime endDate);

}
