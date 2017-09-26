package pl.xperios.app.querydsl.q;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QStaff is a Querydsl query type for Staff
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QStaff extends com.querydsl.sql.RelationalPathBase<Staff> {

    private static final long serialVersionUID = 1118980815;

    public static final QStaff staff = new QStaff("staff");

    public final BooleanPath active = createBoolean("active");

    public final NumberPath<Short> addressId = createNumber("addressId", Short.class);

    public final StringPath email = createString("email");

    public final StringPath firstName = createString("firstName");

    public final StringPath lastName = createString("lastName");

    public final DateTimePath<java.time.LocalDateTime> lastUpdate = createDateTime("lastUpdate", java.time.LocalDateTime.class);

    public final StringPath password = createString("password");

    public final SimplePath<byte[]> picture = createSimple("picture", byte[].class);

    public final NumberPath<Byte> staffId = createNumber("staffId", Byte.class);

    public final NumberPath<Byte> storeId = createNumber("storeId", Byte.class);

    public final StringPath username = createString("username");

    public final com.querydsl.sql.PrimaryKey<Staff> primary = createPrimaryKey(staffId);

    public final com.querydsl.sql.ForeignKey<Store> staffStoreFk = createForeignKey(storeId, "store_id");

    public final com.querydsl.sql.ForeignKey<Address> staffAddressFk = createForeignKey(addressId, "address_id");

    public final com.querydsl.sql.ForeignKey<Payment> _paymentStaffFk = createInvForeignKey(staffId, "staff_id");

    public final com.querydsl.sql.ForeignKey<Store> _storeStaffFk = createInvForeignKey(staffId, "manager_staff_id");

    public final com.querydsl.sql.ForeignKey<Rental> _rentalStaffFk = createInvForeignKey(staffId, "staff_id");

    public QStaff(String variable) {
        super(Staff.class, forVariable(variable), "null", "staff");
        addMetadata();
    }

    public QStaff(String variable, String schema, String table) {
        super(Staff.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QStaff(String variable, String schema) {
        super(Staff.class, forVariable(variable), schema, "staff");
        addMetadata();
    }

    public QStaff(Path<? extends Staff> path) {
        super(path.getType(), path.getMetadata(), "null", "staff");
        addMetadata();
    }

    public QStaff(PathMetadata metadata) {
        super(Staff.class, metadata, "null", "staff");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(active, ColumnMetadata.named("active").withIndex(8).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(addressId, ColumnMetadata.named("address_id").withIndex(4).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(email, ColumnMetadata.named("email").withIndex(6).ofType(Types.VARCHAR).withSize(50));
        addMetadata(firstName, ColumnMetadata.named("first_name").withIndex(2).ofType(Types.VARCHAR).withSize(45).notNull());
        addMetadata(lastName, ColumnMetadata.named("last_name").withIndex(3).ofType(Types.VARCHAR).withSize(45).notNull());
        addMetadata(lastUpdate, ColumnMetadata.named("last_update").withIndex(11).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(password, ColumnMetadata.named("password").withIndex(10).ofType(Types.VARCHAR).withSize(40));
        addMetadata(picture, ColumnMetadata.named("picture").withIndex(5).ofType(Types.LONGVARBINARY).withSize(65535));
        addMetadata(staffId, ColumnMetadata.named("staff_id").withIndex(1).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(storeId, ColumnMetadata.named("store_id").withIndex(7).ofType(Types.TINYINT).withSize(3).notNull());
        addMetadata(username, ColumnMetadata.named("username").withIndex(9).ofType(Types.VARCHAR).withSize(16).notNull());
    }

}

