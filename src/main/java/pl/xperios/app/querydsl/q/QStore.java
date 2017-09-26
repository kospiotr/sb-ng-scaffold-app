package pl.xperios.app.querydsl.q;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QStore is a Querydsl query type for Store
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QStore extends com.querydsl.sql.RelationalPathBase<Store> {

    private static final long serialVersionUID = 1118994640;

    public static final QStore store = new QStore("store");

    public final NumberPath<Short> addressId = createNumber("addressId", Short.class);

    public final DateTimePath<java.time.LocalDateTime> lastUpdate = createDateTime("lastUpdate", java.time.LocalDateTime.class);

    public final NumberPath<Byte> managerStaffId = createNumber("managerStaffId", Byte.class);

    public final NumberPath<Byte> storeId = createNumber("storeId", Byte.class);

    public final com.querydsl.sql.PrimaryKey<Store> primary = createPrimaryKey(storeId);

    public final com.querydsl.sql.ForeignKey<Address> storeAddressFk = createForeignKey(addressId, "address_id");

    public final com.querydsl.sql.ForeignKey<Staff> storeStaffFk = createForeignKey(managerStaffId, "staff_id");

    public final com.querydsl.sql.ForeignKey<Staff> _staffStoreFk = createInvForeignKey(storeId, "store_id");

    public final com.querydsl.sql.ForeignKey<Inventory> _inventoryStoreFk = createInvForeignKey(storeId, "store_id");

    public final com.querydsl.sql.ForeignKey<Customer> _customerStoreFk = createInvForeignKey(storeId, "store_id");

    public QStore(String variable) {
        super(Store.class, forVariable(variable), "null", "store");
        addMetadata();
    }

    public QStore(String variable, String schema, String table) {
        super(Store.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QStore(String variable, String schema) {
        super(Store.class, forVariable(variable), schema, "store");
        addMetadata();
    }

    public QStore(Path<? extends Store> path) {
        super(path.getType(), path.getMetadata(), "null", "store");
        addMetadata();
    }

    public QStore(PathMetadata metadata) {
        super(Store.class, metadata, "null", "store");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(addressId, ColumnMetadata.named("address_id").withIndex(3).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(lastUpdate, ColumnMetadata.named("last_update").withIndex(4).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(managerStaffId, ColumnMetadata.named("manager_staff_id").withIndex(2).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(storeId, ColumnMetadata.named("store_id").withIndex(1).ofType(Types.TINYINT).withSize(3).notNull());
    }

}

