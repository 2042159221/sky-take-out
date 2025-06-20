package com.sky.service;

import java.util.List;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

/**
 * @title DishService
 * @description [简要说明类的功能]
 *
 * @author Ming
 * @date 2025/6/12
 * @version 1.0
 * @since 2025/6/12
 * @project sky-take-out
 *
 * @contact email: millionfire@outlook.com
 * @github https://github.com/2042159221
 *
 * @copyright Copyright (c) 2025
 * All rights reserved.
 */
public interface DishService {
    /**
     * 新增菜品和对应的口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);

    /**
     * 菜品分页查询
     * @param dishPageQueryDTO
     * @return
     */
    public PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 菜品批量删除
     * 
     * @param ids
     */
    void deleteBatch(List<Long> ids);

    /**
     * 根据id查询菜品和对应的口味数据
     * 
     * @param id
     * @return
     */
    DishVO getByIdWithFLavor(Long id);

     /**
     * 根据id修改菜品基本信息和对应的口味信息
     * @param dishDTO
     * 
     */
    void updateWithFlavor(DishDTO dishDTO);

    /**
     * 根据分类id查询菜品
     * @param categoryId
     * @return
     */
    List<Dish> list(Long categoryId);

    /**条件查询菜品和口味
     * @param dish
     * @return
     * 
     */
    List<DishVO> listWithFlavor(Dish dish);

    /**
     * 菜品起售停售
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);
}
