package pl.xperios.app.querydsl.q;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFilmActor is a Querydsl query type for FilmActor
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFilmActor extends com.querydsl.sql.RelationalPathBase<FilmActor> {

    private static final long serialVersionUID = 163024704;

    public static final QFilmActor filmActor = new QFilmActor("film_actor");

    public final NumberPath<Short> actorId = createNumber("actorId", Short.class);

    public final NumberPath<Short> filmId = createNumber("filmId", Short.class);

    public final DateTimePath<java.time.LocalDateTime> lastUpdate = createDateTime("lastUpdate", java.time.LocalDateTime.class);

    public final com.querydsl.sql.PrimaryKey<FilmActor> primary = createPrimaryKey(actorId, filmId);

    public final com.querydsl.sql.ForeignKey<Film> filmActorFilmFk = createForeignKey(filmId, "film_id");

    public final com.querydsl.sql.ForeignKey<Actor> filmActorActorFk = createForeignKey(actorId, "actor_id");

    public QFilmActor(String variable) {
        super(FilmActor.class, forVariable(variable), "null", "film_actor");
        addMetadata();
    }

    public QFilmActor(String variable, String schema, String table) {
        super(FilmActor.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFilmActor(String variable, String schema) {
        super(FilmActor.class, forVariable(variable), schema, "film_actor");
        addMetadata();
    }

    public QFilmActor(Path<? extends FilmActor> path) {
        super(path.getType(), path.getMetadata(), "null", "film_actor");
        addMetadata();
    }

    public QFilmActor(PathMetadata metadata) {
        super(FilmActor.class, metadata, "null", "film_actor");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actorId, ColumnMetadata.named("actor_id").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(filmId, ColumnMetadata.named("film_id").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(lastUpdate, ColumnMetadata.named("last_update").withIndex(3).ofType(Types.TIMESTAMP).withSize(26).notNull());
    }

}

