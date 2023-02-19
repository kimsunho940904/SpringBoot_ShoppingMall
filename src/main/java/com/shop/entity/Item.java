package com.shop.entity;

import com.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "item")
@Getter
@Setter
@ToString
public class Item {

    /**
     * @id 상품 코드
     * @itemNm 상품명
     * @price 가격
     * @stockNumber 재고수량
     * @itemDetail 상품 상세 설명
     * @itemSellStatus 상품 판매 상태
     * @regTime 등록 시간
     * @updateTime 수정 시간
     */
    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, length = 50)
    private String itemNm;
    @Column(name = "price", nullable = false)
    private int price;
    @Column(nullable = false)
    private int stockNumber;
    @Lob
    @Column(nullable = false)
    private String itemDetail;
    @Enumerated(EnumType.STRING)
    private ItemSellStatus itemSellStatus;
    private LocalDateTime regTime;
    private LocalDateTime updateTime;
}
