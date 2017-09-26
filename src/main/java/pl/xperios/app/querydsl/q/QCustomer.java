package pl.xperios.app.querydsl.q;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCustomer is a Querydsl query type for Customer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCustomer extends com.querydsl.sql.RelationalPathBase<Customer> {

    private static final long serialVersionUID = 1617247631;

    public static final QCustomer customer = new QCustomer("customer");

    public final BooleanPath active = createBoolean("active");

    public final NumberPath<Short> addressId = createNumber("addressId", Short.class);

    public final DateTimePath<java.time.LocalDateTime> createDate = createDateTime("createDate", java.time.LocalDateTime.class);

    public final NumberPath<Short> customerId = createNumber("customerId", Short.class);

    public final StringPath email = createString("email");

    public final StringPath firstName = createString("firstName");

    public final StringPath lastName = createString("lastName");

    public final DateTimePath<java.time.LocalDateTime> lastUpdate = createDateTime("lastUpdate", java.time.LocalDateTime.class);

    public final NumberPath<Byte> storeId = createNumber("storeId", Byte.class);

    public final com.querydsl.sql.PrimaryKey<Customer> primary = createPrimaryKey(customerId);

    public final com.querydsl.sql.ForeignKey<Store> customerStoreFk = createForeignKey(storeId, "store_id");

    public final com.querydsl.sql.ForeignKey<Address> customerAddressFk = createForeignKey(addressId, "address_id");

    public final com.querydsl.sql.ForeignKey<Payment> _paymentCustomerFk = createInvForeignKey(customerId, "customer_id");

    public final com.querydsl.sql.ForeignKey<Rental> _rentalCustomerFk = createInvForeignKey(customerId, "customer_id");

    public QCustomer(String variable) {
        super(Customer.class, forVariable(variable), "null", "customer");
        addMetadata();
    }

    public QCustomer(String variable, String schema, String table) {
        super(Customer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCustomer(String variable, String schema) {
        super(Customer.class, forVariable(variable), schema, "customer");
        addMetadata();
    }

    public QCustomer(Path<? extends Customer> path) {
        super(path.getType(), path.getMetadata(), "null", "customer");
        addMetadata();
    }

    public QCustomer(PathMetadata metadata) {
        super(Customer.class, metadata, "null", "customer");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(active, ColumnMetadata.named("active").withIndex(7).ofType(Types.BIT).withSize(1).notNull());
        addMetadata(addressId, ColumnMetadata.named("address_id").withIndex(6).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(createDate, ColumnMetadata.named("create_date").withIndex(8).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(customerId, ColumnMetadata.named("customer_id").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(email, ColumnMetadata.named("email").withIndex(5).ofType(Types.VARCHAR).withSize(50));
        addMetadata(firstName, ColumnMetadata.named("first_name").withIndex(3).ofType(Types.VARCHAR).withSize(45).notNull());
        addMetadata(lastName, ColumnMetadata.named("last_name").withIndex(4).ofType(Types.VARCHAR).withSize(45).notNull());
        addMetadata(lastUpdate, ColumnMetadata.named("last_update").withIndex(9).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(storeId, ColumnMetadata.named("store_id").withIndex(2).ofType(Types.TINYINT).withSize(3).notNull());
    }

}

