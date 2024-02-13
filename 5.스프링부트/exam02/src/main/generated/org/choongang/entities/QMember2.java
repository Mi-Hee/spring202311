package org.choongang.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMember2 is a Querydsl query type for Member2
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember2 extends EntityPathBase<Member2> {

    private static final long serialVersionUID = -351702809L;

    public static final QMember2 member2 = new QMember2("member2");

    public final QBase _super = new QBase(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath email = createString("email");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedAt = _super.modifiedAt;

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public QMember2(String variable) {
        super(Member2.class, forVariable(variable));
    }

    public QMember2(Path<? extends Member2> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember2(PathMetadata metadata) {
        super(Member2.class, metadata);
    }

}

