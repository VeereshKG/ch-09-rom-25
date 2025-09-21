package com.xworkz.watchapp.watchshop;

import com.xworkz.watchapp.constants.Warranty;
import com.xworkz.watchapp.watch.Watch;

public interface WatchShop {

    int size();

    boolean addWatch(Watch watch);
    void getWatchDetails();
    String getModelNameById(int id);
    int getIdByModelName(String modelName);
    String getCompanyNameById(int id);
    String getCompanyNameByModelName(String modelName);
    double getPriceById(int id);
    double getPriceByModelName(String modelName);
    Warranty getWarrantyById(int id);
    Warranty getWarrantyByModelName(String modelName);
    boolean updateModelNameById(int id, String newModelName);
    boolean updateCompanyNameById(int id, String newCompanyName);
    boolean updatePriceById(int id, double newPrice);
    boolean updateWarrantyById(int id, Warranty newWarranty);
    Watch getWatchDetailsById(int id);
    void fetchWatchDetails(Watch watch);
}
