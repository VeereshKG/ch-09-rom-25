package com.xworkz.shopingmall.shopingmall;

import com.xworkz.shopingmall.constants.Type;
import com.xworkz.shopingmall.exception.*;
import com.xworkz.shopingmall.shop.Shop;
import com.xworkz.shopingmall.validator.ShopValidator;

public class ShopingMallImpl implements ShopingMall {

    public ShopingMallImpl(int size) {
        shops = new Shop[size];
    }

    public Shop[] shops;
    int index;
    ShopValidator validator = new ShopValidator();

    @Override
    public boolean addShop(Shop shop) {
        boolean isShopAdded = false;
        try {
                if (validator.isDetailsValid(shop)) {
                    shops[index++] = shop;
                    isShopAdded = true;
                }
             else System.out.println("invalid shop");
            if (isShopAdded == false) {
                ShopNotAddedException shopNotAddedException = new ShopNotAddedException("Shope not added");
                throw shopNotAddedException;
            }
        } catch (ShopNotAddedException e) {
            e.printStackTrace();
        }
        return isShopAdded;
    }

    @Override
    public void getShopDetails() {
        System.out.println("the shop list are :");

        for (Shop shop : shops) {
            System.out.println("the id of the shop is   " + shop.getShopId());
            System.out.println("the name of the shop is " + shop.getName());
            System.out.println("the type of the shop is  " + shop.getShopType());
            System.out.println("the flor of the shop is   " + shop.getWhichFloor());
            System.out.println("the address off the shop is  " + shop.getAddress());
            System.out.println("--------------------------------------------------");
        }
    }

    @Override
    public String getNameByShopId(int shopId) {
        String name = null;
        try {
            if (shopId != 0) {
                for (Shop shop : shops) {
                    if (shop.getShopId() == shopId) {
                        name = shop.getName();
                    }
                }
            } else System.out.println("enter valid ID");
            if (name == null) {
                NameNotFoundException nameNotFoundException = new NameNotFoundException("name not found");
                throw nameNotFoundException;

            }
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return name;
    }

    @Override
    public Type getShopTypeByShopId(int shopId) {
        Type type = null;
        try {
            if (shopId != 0) {
                for (Shop shop : shops) {
                    if (shop.getShopId() == shopId) {
                        type = shop.getShopType();
                    }
                }
            } else System.out.println("enter valid ID");
            if (type == null) {
                ShopTypeNotFoundException shopTypeNotFoundException = new ShopTypeNotFoundException("ShopType not found");
                throw shopTypeNotFoundException;
            }
        } catch (ShopTypeNotFoundException e) {
            e.printStackTrace();
        }
        return type;
    }

    @Override
    public int getFloorByShopId(int shopId) {
        int floor = 0;
        try {
            if (shopId != 0) {
                for (Shop shop : shops) {
                    if (shop.getShopId() == shopId) {
                        floor = shop.getWhichFloor();
                    }
                }
            } else System.out.println("enter valid ID");
            if (floor == 0) {
                FloorNotFoundException floorNotFoundException = new FloorNotFoundException("floor not found");
                throw floorNotFoundException;
            }
        } catch (FloorNotFoundException e) {
            e.printStackTrace();
        }
        return floor;
    }

    @Override
    public String getAddressByShopId(int shopId) {
        String address = null;
        try {
            if (shopId != 0) {
                for (Shop shop : shops) {
                    if (shop.getShopId() == shopId) {
                        address = shop.getAddress();
                    }
                }
            } else System.out.println("enter valid ID");
            if (address == null) {
                AddressNotFoundException addressNotFoundException = new AddressNotFoundException("Address not found");
                throw addressNotFoundException;
            }

        } catch (AddressNotFoundException e) {
            e.printStackTrace();
        }
        return address;
    }

    @Override
    public int getIdByShopName(String name) {
        int id = 0;
        try {
            if (name != null) {
                for (Shop shop : shops) {
                    if (shop.getName().equalsIgnoreCase(name)) {
                        id = shop.getShopId();
                    }
                }
            } else System.out.println("enter valid name");
            if (id == 0) {
                IdNotFoundException idNotFoundException = new IdNotFoundException("id not found");
                throw idNotFoundException;
            }
        } catch (IdNotFoundException e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public Type getShopTypeByShopName(String name) {
        Type type = null;
        try {
            if (name != null) {
                for (Shop shop : shops) {
                    if (shop.getName().equalsIgnoreCase(name)) {
                        type = shop.getShopType();
                    }
                }
            } else System.out.println("enter valid name");
            if (type == null) {
                ShopTypeNotFoundException shopTypeNotFoundException = new ShopTypeNotFoundException("ShopType not found");
                throw shopTypeNotFoundException;
            }
        } catch (ShopTypeNotFoundException e) {
            e.printStackTrace();
        }
        return type;
    }

    @Override
    public int getFloorByShopName(String name) {
        int floor = 0;
        try {
            if (name != null) {
                for (Shop shop : shops) {
                    if (shop.getName().equalsIgnoreCase(name)) {
                        floor = shop.getWhichFloor();
                    }
                }
            } else System.out.println("enter valid name");
            if (floor == 0) {
                FloorNotFoundException floorNotFoundException = new FloorNotFoundException("floor not found");
                throw floorNotFoundException;
            }
        } catch (FloorNotFoundException e) {
            e.printStackTrace();
        }
        return floor;
    }

    @Override
    public String getAddressByShopName(String name) {
        String address = null;
        try {
            if (name != null) {
                for (Shop shop : shops) {
                    if (shop.getName().equalsIgnoreCase(name)) {
                        address = shop.getAddress();
                    }
                }
            } else System.out.println("enter valid name");
            if (address == null) {
                AddressNotFoundException addressNotFoundException = new AddressNotFoundException("Address not found");
                throw addressNotFoundException;
            }

        } catch (AddressNotFoundException e) {
            e.printStackTrace();
        }
        return address;
    }

    @Override
    public boolean updateNameByShopId(int shopId, String newName) {
        boolean isUpdated = false;
        try {
            if (shopId != 0) {
                for (Shop shop : shops) {
                    if (shop.getShopId() == shopId) {
                        shop.setName(newName);
                        isUpdated = true;
                    }
                }
            } else
                System.out.println("Enter valid ID");
            if (isUpdated == false) {
                UpdateNameNotDoneException updateNameNotDoneException = new UpdateNameNotDoneException("name not updated");
                throw updateNameNotDoneException;
            }

        } catch (UpdateNameNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateShopTypeByShopId(int shopId, Type newType) {
        boolean isUpdated = false;
        try {
            if (shopId != 0) {
                for (Shop shop : shops) {
                    if (shop.getShopId() == shopId) {
                        shop.setShopType(newType);
                        isUpdated = true;
                    }
                }
            } else
                System.out.println("Enter valid ID");
            if (isUpdated == false) {
                UpdateShopNotFoundException updateShopNotFoundException = new UpdateShopNotFoundException("updateShop not done");
                throw updateShopNotFoundException;
            }
        } catch (UpdateShopNotFoundException e) {
            e.printStackTrace();
        }

        return isUpdated;
    }

    @Override
    public boolean updateFloorByShopId(int shopId, int newFloor) {
        boolean isUpdated = false;
        try {
            if (shopId != 0) {
                for (Shop shop : shops) {
                    if (shop.getShopId() == shopId) {
                        shop.setWhichFloor(newFloor);
                        isUpdated = true;
                    }
                }
            } else {
                System.out.println("Enter valid ID");
            }
            if (isUpdated == false) {
                UpdateFloorNotDoneException updateFloorNotDoneException = new UpdateFloorNotDoneException("updateFloor not done");
                throw updateFloorNotDoneException;
            }
        } catch (UpdateFloorNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateAddressByShopId(int shopId, String newAddress) {
        boolean isUpdated = false;
        try {
            if (shopId != 0) {
                for (Shop shop : shops) {
                    if (shop.getShopId() == shopId) {
                        shop.setAddress(newAddress);
                        isUpdated = true;
                    }
                }
            } else {
                System.out.println("Enter valid ID");
            }
            if (isUpdated == false) {
                UpdateAddressNotFoundException updateAddressNotFoundException = new UpdateAddressNotFoundException("updateAddress not done");
                throw updateAddressNotFoundException;
            }
        } catch (UpdateAddressNotFoundException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override

    public Shop getShopDetailsById(int id) {

        Shop shop = null;
        try {
            if (id != 0) {
                for (Shop shop1 : shops) {
                    if (shop1.getShopId() == id) {
                        shop = shop1;
                    }
                }
            }
            if (shop == null) {
                ShopDetailsNotFoundException shopDetailsNotFoundException = new ShopDetailsNotFoundException("ShopDetails not found");
                throw shopDetailsNotFoundException;
            }
        } catch (ShopDetailsNotFoundException e) {
            e.printStackTrace();
        }
        return shop;
    }

    @Override
    public void fetchShopDetails(Shop shop) {
        try {

            System.out.println("the id of the shop is   " + shop.getShopId());
            System.out.println("the name of the shop is " + shop.getName());
            System.out.println("the type of the shop is  " + shop.getShopType());
            System.out.println("the flor of the shop is   " + shop.getWhichFloor());
            System.out.println("the address off the shop is  " + shop.getAddress());
            System.out.println("--------------------------------------------------");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public int size() {
        return shops.length;
    }
}
