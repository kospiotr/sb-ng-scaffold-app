package pl.xperios.app.querydsl.q;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QLanguage is a Querydsl query type for Language
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QLanguage extends com.querydsl.sql.RelationalPathBase<Language> {

    private static final long serialVersionUID = -602517239;

    public static final QLanguage language = new QLanguage("language");

    public final NumberPath<Byte> languageId = createNumber("languageId", Byte.class);

    public final DateTimePath<java.time.LocalDateTime> lastUpdate = createDateTime("lastUpdate", java.time.LocalDateTime.class);

    public final StringPath name = createString("name");

    public final com.querydsl.sql.PrimaryKey<Language> primary = createPrimaryKey(languageId);

    public final com.querydsl.sql.ForeignKey<Film> _filmLanguageFk = createInvForeignKey(languageId, "language_id");

    public final com.querydsl.sql.ForeignKey<Film> _filmLanguageOriginalFk = createInvForeignKey(languageId, "original_language_id");

    public QLanguage(String variable) {
        super(Language.class, forVariable(variable), "null", "language");
        addMetadata();
    }

    public QLanguage(String variable, String schema, String table) {
        super(Language.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLanguage(String variable, String schema) {
        super(Language.class, forVariable(variable), schema, "language");
        addMetadata();
    }

    public QLanguage(Path<? extends Language> path) {
        super(path.getType(), path.getMetadata(), "null", "language");
        addMetadata();
    }

    public QLanguage(PathMetadata metadata) {
        super(Language.class, metadata, "null", "language");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(languageId, ColumnMetadata.named("language_id").withIndex(1).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(lastUpdate, ColumnMetadata.named("last_update").withIndex(3).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.CHAR).withSize(20).notNull());
    }

}

