package com.xworkz.watchapp.watchshop;

import com.xworkz.watchapp.constants.Warranty;
import com.xworkz.watchapp.validator.WatchValidator;
import com.xworkz.watchapp.watch.Watch;

public class WatchShopImpl implements WatchShop{

    public WatchShopImpl(int size){
         watches = new Watch[size];
    }

   public  Watch[] watches ;
    int index;
WatchValidator watchValidator = new WatchValidator();
@Override
    public boolean addWatch(Watch watch) {
        boolean isWatchAdded = false;

        if (watch != null) {
            if(watchValidator.isWatchDetailsValid(watch)) {
                watches[index++] = watch;
                isWatchAdded = true;
            }
        } else System.out.println("invalid watch");
        return isWatchAdded;
    }
@Override
    public void getWatchDetails() {
        System.out.println("the watch list are:");
        for (Watch watch : watches) {
            System.out.println("the id of the watch is  " + watch.getId());
            System.out.println("the model of the watch is  " + watch.getModelName());
            System.out.println("the cName of the watch is  " + watch.getCompanyName());
            System.out.println("the price of the watch is  " + watch.getPrice());
            System.out.println("the warrent of the watch is  " + watch.getWarranty());
            System.out.println("-----------------------------------------------");

        }
    }
@Override
    public String getModelNameById(int id){
        String name = null;
        if(id != 0){
            for(Watch watch : watches){
                if(watch.getId() == id){
                    name = watch.getModelName();
                }
            }
        } else System.out.println("Enter valid ID");
        if(name == null) System.out.println("ID not found");
        return name;
    }
    @Override
    public int getIdByModelName(String modelName){
        int id = 0;
        if(modelName != null){
            for(Watch watch : watches){
                if(watch.getModelName().equalsIgnoreCase(modelName)){
                    id = watch.getId();
                }
            }
        } else System.out.println("Enter valid name");
        if(id == 0) System.out.println("Name not found");
        return id;
    }
    @Override
    public String getCompanyNameById(int id){
        String company = null;
        if(id != 0){
            for(Watch watch : watches){
                if(watch.getId() == id){
                    company = watch.getCompanyName();
                }
            }
        } else System.out.println("Enter valid ID");
        if(company == null) System.out.println("ID not found");
        return company;
    }
    @Override
    public String getCompanyNameByModelName(String modelName){
        String company = null;
        if(modelName != null){
            for(Watch watch : watches){
                if(watch.getModelName().equalsIgnoreCase(modelName)){
                    company = watch.getCompanyName();
                }
            }
        } else System.out.println("Enter valid name");
        if(company == null) System.out.println("Name not found");
        return company;
    }
    @Override
    public double getPriceById(int id){
        double price = 0;
        if(id != 0){
            for(Watch watch : watches){
                if(watch.getId() == id){
                    price = watch.getPrice();
                }
            }
        } else System.out.println("Enter valid ID");
        if(price == 0) System.out.println("ID not found");
        return price;
    }
    @Override
    public double getPriceByModelName(String modelName){
        double price = 0;
        if(modelName != null){
            for(Watch watch : watches){
                if(watch.getModelName().equalsIgnoreCase(modelName)){
                    price = watch.getPrice();
                }
            }
        } else System.out.println("Enter valid name");
        if(price == 0) System.out.println("Name not found");
        return price;
    }
    @Override
    public Warranty getWarrantyById(int id){
        Warranty warranty = null;
        if(id != 0){
            for(Watch watch : watches){
                if(watch.getId() == id){
                    warranty = watch.getWarranty();
                }
            }
        } else System.out.println("Enter valid ID");
        if(warranty == null) System.out.println("ID not found");
        return warranty;
    }
    @Override
    public Warranty getWarrantyByModelName(String modelName){
        Warranty warranty = null;
        if(modelName != null){
            for(Watch watch : watches){
                if(watch.getModelName().equalsIgnoreCase(modelName)){
                    warranty = watch.getWarranty();
                }
            }
        } else System.out.println("Enter valid name");
        if(warranty == null) System.out.println("Name not found");
        return warranty;
    }
@Override

    public boolean updateModelNameById(int id, String newModelName){
        boolean isUpdated = false;
        if(id != 0){
            for(Watch watch : watches){
                if(watch.getId() == id){
                    watch.setModelName(newModelName);
                    isUpdated = true;
                }
            }
        } else System.out.println("Enter valid ID");
        return isUpdated;
    }
    @Override
    public boolean updateCompanyNameById(int id, String newCompanyName){
        boolean isUpdated = false;
        if(id != 0){
            for(Watch watch : watches){
                if(watch.getId() == id){
                    watch.setCompanyName(newCompanyName);
                    isUpdated = true;
                }
            }
        } else System.out.println("Enter valid ID");
        return isUpdated;
    }
    @Override
    public boolean updatePriceById(int id, double newPrice){
        boolean isUpdated = false;
        if(id != 0){
            for(Watch watch : watches){
                if(watch.getId() == id){
                    watch.setPrice(newPrice);
                    isUpdated = true;
                }
            }
        } else System.out.println("Enter valid ID");
        return isUpdated;
    }
    @Override
    public boolean updateWarrantyById(int id, Warranty newWarranty){
        boolean isUpdated = false;
        if(id != 0){
            for(Watch watch : watches){
                if(watch.getId() == id){
                    watch.setWarranty(newWarranty);
                    isUpdated = true;
                }
            }
        } else System.out.println("Enter valid ID");
        return isUpdated;
    }
    @Override
    public Watch getWatchDetailsById(int id){

        Watch watch = null;
        if (id != 0){
            for (Watch watch1 : watches){
                if (watch1.getId() == id){
                    watch = watch1;
                }
            }
        }
        return watch;
    }
@Override
    public void fetchWatchDetails(Watch watch) {

            System.out.println("the id of the watch is  " + watch.getId());
            System.out.println("the model of the watch is  " + watch.getModelName());
            System.out.println("the cName of the watch is  " + watch.getCompanyName());
            System.out.println("the price of the watch is  " + watch.getPrice());
            System.out.println("the warrent of the watch is  " + watch.getWarranty());
            System.out.println("-----------------------------------------------");

        }


    @Override
    public int size() {
        return watches.length;
    }
}