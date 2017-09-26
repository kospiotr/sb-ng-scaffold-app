package pl.xperios.app.querydsl.q;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QInventory is a Querydsl query type for Inventory
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QInventory extends com.querydsl.sql.RelationalPathBase<Inventory> {

    private static final long serialVersionUID = -742125109;

    public static final QInventory inventory = new QInventory("inventory");

    public final NumberPath<Short> filmId = createNumber("filmId", Short.class);

    public final NumberPath<Integer> inventoryId = createNumber("inventoryId", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> lastUpdate = createDateTime("lastUpdate", java.time.LocalDateTime.class);

    public final NumberPath<Byte> storeId = createNumber("storeId", Byte.class);

    public final com.querydsl.sql.PrimaryKey<Inventory> primary = createPrimaryKey(inventoryId);

    public final com.querydsl.sql.ForeignKey<Film> inventoryFilmFk = createForeignKey(filmId, "film_id");

    public final com.querydsl.sql.ForeignKey<Store> inventoryStoreFk = createForeignKey(storeId, "store_id");

    public final com.querydsl.sql.ForeignKey<Rental> _rentalInventoryFk = createInvForeignKey(inventoryId, "inventory_id");

    public QInventory(String variable) {
        super(Inventory.class, forVariable(variable), "null", "inventory");
        addMetadata();
    }

    public QInventory(String variable, String schema, String table) {
        super(Inventory.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QInventory(String variable, String schema) {
        super(Inventory.class, forVariable(variable), schema, "inventory");
        addMetadata();
    }

    public QInventory(Path<? extends Inventory> path) {
        super(path.getType(), path.getMetadata(), "null", "inventory");
        addMetadata();
    }

    public QInventory(PathMetadata metadata) {
        super(Inventory.class, metadata, "null", "inventory");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(filmId, ColumnMetadata.named("film_id").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(inventoryId, ColumnMetadata.named("inventory_id").withIndex(1).ofType(Types.INTEGER).withSize(8).notNull());
        addMetadata(lastUpdate, ColumnMetadata.named("last_update").withIndex(4).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(storeId, ColumnMetadata.named("store_id").withIndex(3).ofType(Types.TINYINT).withSize(3).notNull());
    }

}

