package com.xworkz.watchapp.watchshop;

import com.xworkz.watchapp.constants.Warranty;
import com.xworkz.watchapp.exception.*;
import com.xworkz.watchapp.validator.WatchValidator;
import com.xworkz.watchapp.watch.Watch;

public class WatchShopImpl implements WatchShop {

    public WatchShopImpl(int size) {
        watches = new Watch[size];
    }

    public Watch[] watches;
    int index;
    WatchValidator watchValidator = new WatchValidator();

    @Override
    public boolean addWatch(Watch watch) {
        boolean isWatchAdded = false;
        try {
            if (watchValidator.isWatchDetailsValid(watch)) {
                watches[index++] = watch;
                isWatchAdded = true;
            } else System.out.println("invalid watch");
            if (isWatchAdded == false) {
                WatchNotAddedException watchNotAddedException = new WatchNotAddedException("watch not added");
                throw watchNotAddedException;
            }
        } catch (WatchNotAddedException e) {
            e.printStackTrace();

        }
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
    public String getModelNameById(int id) {
        String name = null;
        try {
            if (id != 0) {
                for (Watch watch : watches) {
                    if (watch.getId() == id) {
                        name = watch.getModelName();
                    }
                }
            } else System.out.println("Enter valid ID");
            if (name == null) {
                ModelNameNotFoundException modelNameNotFoundException = new ModelNameNotFoundException("ModelName not found");
                throw modelNameNotFoundException;
            }
        } catch (ModelNameNotFoundException e) {
            e.printStackTrace();
        }
        return name;
    }

    @Override
    public int getIdByModelName(String modelName) {
        int id = 0;
        try {
            if (modelName != null) {
                for (Watch watch : watches) {
                    if (watch.getModelName().equalsIgnoreCase(modelName)) {
                        id = watch.getId();
                    }
                }
            } else System.out.println("Enter valid name");
            if (id == 0) {
                IdNotFoundException idNotFoundException = new IdNotFoundException("Id not found");
                throw idNotFoundException;
            }
        } catch (IdNotFoundException e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public String getCompanyNameById(int id) {
        String company = null;
        try {
            if (id != 0) {
                for (Watch watch : watches) {
                    if (watch.getId() == id) {
                        company = watch.getCompanyName();
                    }
                }
            } else System.out.println("Enter valid ID");
            if (company == null) {
                CompanyNameNotFoundException companyNameNotFoundException = new CompanyNameNotFoundException("CompanyName not found");
                throw companyNameNotFoundException;
            }
        } catch (CompanyNameNotFoundException e) {
            e.printStackTrace();
        }
        return company;
    }

    @Override
    public String getCompanyNameByModelName(String modelName) {
        String company = null;
        try {
            if (modelName != null) {
                for (Watch watch : watches) {
                    if (watch.getModelName().equalsIgnoreCase(modelName)) {
                        company = watch.getCompanyName();
                    }
                }
            } else System.out.println("Enter valid name");
            if (company == null) {
                CompanyNameNotFoundException companyNameNotFoundException = new CompanyNameNotFoundException("CompanyName not found");
                throw companyNameNotFoundException;
            }
        } catch (CompanyNameNotFoundException e) {
            e.printStackTrace();
        }
        return company;
    }

    @Override
    public double getPriceById(int id) {
        double price = 0;
        try {
            if (id != 0) {
                for (Watch watch : watches) {
                    if (watch.getId() == id) {
                        price = watch.getPrice();
                    }
                }
            } else System.out.println("Enter valid ID");
            if (price == 0) {
                PriceNotFoundException priceNotFoundException = new PriceNotFoundException("price not found");
                throw priceNotFoundException;
            }
        } catch (PriceNotFoundException e) {
            e.printStackTrace();
        }
        return price;
    }

    @Override
    public double getPriceByModelName(String modelName) {
        double price = 0;
        try {
            if (modelName != null) {
                for (Watch watch : watches) {
                    if (watch.getModelName().equalsIgnoreCase(modelName)) {
                        price = watch.getPrice();
                    }
                }
            } else System.out.println("Enter valid name");
            if (price == 0) {
                PriceNotFoundException priceNotFoundException = new PriceNotFoundException("price not found");
                throw priceNotFoundException;
            }
        } catch (PriceNotFoundException e) {
            e.printStackTrace();
        }
        return price;
    }

    @Override
    public Warranty getWarrantyById(int id) {
        Warranty warranty = null;
        try {
            if (id != 0) {
                for (Watch watch : watches) {
                    if (watch.getId() == id) {
                        warranty = watch.getWarranty();
                    }
                }
            } else System.out.println("Enter valid ID");
            if (warranty == null) {
                WarrantyNotFoundException warrantyNotFoundException = new WarrantyNotFoundException("Warranty not found");
                throw warrantyNotFoundException;
            }
        } catch (WarrantyNotFoundException e) {
            e.printStackTrace();
        }
        return warranty;
    }

    @Override
    public Warranty getWarrantyByModelName(String modelName) {
        Warranty warranty = null;
        try {
            if (modelName != null) {
                for (Watch watch : watches) {
                    if (watch.getModelName().equalsIgnoreCase(modelName)) {
                        warranty = watch.getWarranty();
                    }
                }
            } else System.out.println("Enter valid name");
            if (warranty == null) {
                WarrantyNotFoundException warrantyNotFoundException = new WarrantyNotFoundException("Warranty not found");
                throw warrantyNotFoundException;
            }
        } catch (WarrantyNotFoundException e) {
            e.printStackTrace();
        }
        return warranty;
    }

    @Override

    public boolean updateModelNameById(int id, String newModelName) {
        boolean isUpdated = false;
        try {
            if (id != 0) {
                for (Watch watch : watches) {
                    if (watch.getId() == id) {
                        watch.setModelName(newModelName);
                        isUpdated = true;
                    }
                }
            } else System.out.println("Enter valid ID");
            if (isUpdated == false) {
                UpdateModelNameNotDoneException updateModelNameNotDoneException = new UpdateModelNameNotDoneException("updateModelName not done");
                throw updateModelNameNotDoneException;
            }
        } catch (UpdateModelNameNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateCompanyNameById(int id, String newCompanyName) {
        boolean isUpdated = false;
        try {
            if (id != 0) {
                for (Watch watch : watches) {
                    if (watch.getId() == id) {
                        watch.setCompanyName(newCompanyName);
                        isUpdated = true;
                    }
                }
            } else System.out.println("Enter valid ID");
            if (isUpdated == false) {
                UpdateCompanyNameNotDoneException updateCompanyNameNotDoneException = new UpdateCompanyNameNotDoneException("UpdateCompanyName not done");
                throw updateCompanyNameNotDoneException;
            }
        } catch (UpdateCompanyNameNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updatePriceById(int id, double newPrice) {
        boolean isUpdated = false;
        try {
            if (id != 0) {
                for (Watch watch : watches) {
                    if (watch.getId() == id) {
                        watch.setPrice(newPrice);
                        isUpdated = true;
                    }
                }
            } else System.out.println("Enter valid ID");
            if (isUpdated == false) {
                UpdatePriceNotDoneException updatePriceNotDoneException = new UpdatePriceNotDoneException("updatePrice not done");
                throw updatePriceNotDoneException;
            }
        } catch (UpdatePriceNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateWarrantyById(int id, Warranty newWarranty) {
        boolean isUpdated = false;
        try {
            if (id != 0) {
                for (Watch watch : watches) {
                    if (watch.getId() == id) {
                        watch.setWarranty(newWarranty);
                        isUpdated = true;
                    }
                }
            } else System.out.println("Enter valid ID");
            if (isUpdated == false) {
                throw new UpdateWarrantyNotDoneException("updateWarranty not done");
            }
        } catch (UpdateWarrantyNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public Watch getWatchDetailsById(int id) {

        Watch watch = null;
        try {
            if (id != 0) {
                for (Watch watch1 : watches) {
                    if (watch1.getId() == id) {
                        watch = watch1;
                    }
                }
            }
            if (watch == null) {
                throw new WatchDetailsNotFoundException("WatchDetails not found");
            }
        } catch (WatchDetailsNotFoundException e) {
            e.printStackTrace();
        }
        return watch;
    }

    @Override
    public void fetchWatchDetails(Watch watch) {
        try {
            System.out.println("the id of the watch is  " + watch.getId());
            System.out.println("the model of the watch is  " + watch.getModelName());
            System.out.println("the cName of the watch is  " + watch.getCompanyName());
            System.out.println("the price of the watch is  " + watch.getPrice());
            System.out.println("the warrent of the watch is  " + watch.getWarranty());
            System.out.println("-----------------------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public int size() {
        return watches.length;
    }
}