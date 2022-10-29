package com.design.principle.compositReuse.example.news;


public class GoodsController {

    private GoodsService goodsService;

    public void modify(){
        goodsService.modify();
    }
}
