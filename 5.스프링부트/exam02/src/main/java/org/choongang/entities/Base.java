package org.choongang.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter @Setter
@MappedSuperclass // 공통으로 사용할 슈퍼클래스
@EntityListeners(AuditingEntityListener.class)
public abstract class Base {
    @CreatedDate
    @Column(updatable = false) // 초기에만 추가 가능, 수정 불가
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(insertable = false) // 추가 불가, 수정 가능
    private LocalDateTime modifiedAt;
}
