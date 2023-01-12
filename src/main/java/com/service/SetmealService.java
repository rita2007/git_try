package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dto.SetmealDto;
import com.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时删除套餐和菜品的关联数据
     */
    public void removeWithDish(List<Long> ids);

    //根据id查询套餐信息和对应的菜品信息
    public SetmealDto getByIdWithDishes(Long id);

    //更新套餐信息，同时更新对应的菜品信息
    public  void updateWithDishes(SetmealDto setmealDto);
}
