package pl.xperios.app.querydsl.q;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QFilmCategory is a Querydsl query type for FilmCategory
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFilmCategory extends com.querydsl.sql.RelationalPathBase<FilmCategory> {

    private static final long serialVersionUID = 762105811;

    public static final QFilmCategory filmCategory = new QFilmCategory("film_category");

    public final NumberPath<Byte> categoryId = createNumber("categoryId", Byte.class);

    public final NumberPath<Short> filmId = createNumber("filmId", Short.class);

    public final DateTimePath<java.time.LocalDateTime> lastUpdate = createDateTime("lastUpdate", java.time.LocalDateTime.class);

    public final com.querydsl.sql.PrimaryKey<FilmCategory> primary = createPrimaryKey(categoryId, filmId);

    public final com.querydsl.sql.ForeignKey<Category> filmCategoryCategoryFk = createForeignKey(categoryId, "category_id");

    public final com.querydsl.sql.ForeignKey<Film> filmCategoryFilmFk = createForeignKey(filmId, "film_id");

    public QFilmCategory(String variable) {
        super(FilmCategory.class, forVariable(variable), "null", "film_category");
        addMetadata();
    }

    public QFilmCategory(String variable, String schema, String table) {
        super(FilmCategory.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFilmCategory(String variable, String schema) {
        super(FilmCategory.class, forVariable(variable), schema, "film_category");
        addMetadata();
    }

    public QFilmCategory(Path<? extends FilmCategory> path) {
        super(path.getType(), path.getMetadata(), "null", "film_category");
        addMetadata();
    }

    public QFilmCategory(PathMetadata metadata) {
        super(FilmCategory.class, metadata, "null", "film_category");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(categoryId, ColumnMetadata.named("category_id").withIndex(2).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(filmId, ColumnMetadata.named("film_id").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(lastUpdate, ColumnMetadata.named("last_update").withIndex(3).ofType(Types.TIMESTAMP).withSize(26).notNull());
    }

}

