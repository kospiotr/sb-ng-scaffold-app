package pl.xperios.app.querydsl.q;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QActor is a Querydsl query type for Actor
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QActor extends com.querydsl.sql.RelationalPathBase<Actor> {

    private static final long serialVersionUID = 1101869540;

    public static final QActor actor = new QActor("actor");

    public final NumberPath<Short> actorId = createNumber("actorId", Short.class);

    public final StringPath firstName = createString("firstName");

    public final StringPath lastName = createString("lastName");

    public final DateTimePath<java.time.LocalDateTime> lastUpdate = createDateTime("lastUpdate", java.time.LocalDateTime.class);

    public final com.querydsl.sql.PrimaryKey<Actor> primary = createPrimaryKey(actorId);

    public final com.querydsl.sql.ForeignKey<FilmActor> _filmActorActorFk = createInvForeignKey(actorId, "actor_id");

    public QActor(String variable) {
        super(Actor.class, forVariable(variable), "null", "actor");
        addMetadata();
    }

    public QActor(String variable, String schema, String table) {
        super(Actor.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QActor(String variable, String schema) {
        super(Actor.class, forVariable(variable), schema, "actor");
        addMetadata();
    }

    public QActor(Path<? extends Actor> path) {
        super(path.getType(), path.getMetadata(), "null", "actor");
        addMetadata();
    }

    public QActor(PathMetadata metadata) {
        super(Actor.class, metadata, "null", "actor");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actorId, ColumnMetadata.named("actor_id").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(firstName, ColumnMetadata.named("first_name").withIndex(2).ofType(Types.VARCHAR).withSize(45).notNull());
        addMetadata(lastName, ColumnMetadata.named("last_name").withIndex(3).ofType(Types.VARCHAR).withSize(45).notNull());
        addMetadata(lastUpdate, ColumnMetadata.named("last_update").withIndex(4).ofType(Types.TIMESTAMP).withSize(26).notNull());
    }

}

