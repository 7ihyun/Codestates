package com.codestates.coffee.controller;

import com.codestates.coffee.dto.CoffeePatchDto;
import com.codestates.coffee.dto.CoffeePostDto;
import com.codestates.coffee.dto.CoffeeResponseDto;
import com.codestates.coffee.entity.Coffee;
import com.codestates.coffee.mapper.CoffeeMapper;
import com.codestates.coffee.service.CoffeeService;
import com.codestates.response.MultiResponseDto;
import com.codestates.response.SingleResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v11/coffees")
@Validated
public class CoffeeController {
    private final CoffeeService coffeeService;
    private final CoffeeMapper mapper;

    public CoffeeController(CoffeeService coffeeService, CoffeeMapper mapper) {
        this.coffeeService = coffeeService;
        this.mapper = mapper;
    }

    // 커피 정보 등록
    @PostMapping
    public ResponseEntity postCoffee(@Valid @RequestBody CoffeePostDto coffeePostDto) {
        Coffee coffee = coffeeService.createCoffee(mapper.coffeePostDtoToCoffee(coffeePostDto));

        return new ResponseEntity<>(
                new SingleResponseDto<>(mapper.coffeeToCoffeeResponseDto(coffee)), HttpStatus.CREATED);
    }

    // 커피 정보 수정
    @PatchMapping("/{coffee-id}")
    public ResponseEntity patchCoffee(@PathVariable("coffee-id") @Positive long coffeeId,
                                      @Valid @RequestBody CoffeePatchDto coffeePatchDto) {
        coffeePatchDto.setCoffeeId(coffeeId);
        Coffee coffee = coffeeService.updateCoffee(mapper.coffeePatchDtoToCoffee(coffeePatchDto));

        return new ResponseEntity<>(
                new SingleResponseDto<>(mapper.coffeeToCoffeeResponseDto(coffee)), HttpStatus.OK);
    }

    // 특정 커피 정보 조회
    @GetMapping("/{coffee-id}")
    public ResponseEntity getCoffee(@PathVariable("coffee-id") long coffeeId) {
        Coffee coffee = coffeeService.findCoffee(coffeeId);

        return new ResponseEntity<>(
                new SingleResponseDto<>(mapper.coffeeToCoffeeResponseDto(coffee)), HttpStatus.OK);
    }

    // 전체 커피 목록 조회
    @GetMapping
    public ResponseEntity getCoffees(@Positive @RequestParam int page, @Positive @RequestParam int size) {
        Page<Coffee> pageCoffees = coffeeService.findCoffees(page - 1, size);
        List<Coffee> coffees = pageCoffees.getContent();

        return new ResponseEntity<>(
                new MultiResponseDto<>(mapper.coffeesToCoffeeResponseDtos(coffees), pageCoffees), HttpStatus.OK);
    }

    // 커피 정보 삭제
    @DeleteMapping("/{coffee-id}")
    public ResponseEntity deleteCoffee(@PathVariable("coffee-id") long coffeeId) {
        coffeeService.deleteCoffee(coffeeId);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
