package com.example.book.springboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // 부모 Entity로 쓰이면 필드 값들이 자동으로 colum으로 인식
@EntityListeners(AuditingEntityListener.class) // 이 클래스에 auditing 기능을 추가하겠다.
public abstract class BaseTimeEntity { // Todo: 왜 추상 클래스로 만들지?

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;

}
