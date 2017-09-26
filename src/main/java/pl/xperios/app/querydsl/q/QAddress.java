package pl.xperios.app.querydsl.q;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAddress is a Querydsl query type for Address
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAddress extends com.querydsl.sql.RelationalPathBase<Address> {

    private static final long serialVersionUID = -1946360797;

    public static final QAddress address1 = new QAddress("address");

    public final StringPath address = createString("address");

    public final StringPath address2 = createString("address2");

    public final NumberPath<Short> addressId = createNumber("addressId", Short.class);

    public final NumberPath<Short> cityId = createNumber("cityId", Short.class);

    public final StringPath district = createString("district");

    public final DateTimePath<java.time.LocalDateTime> lastUpdate = createDateTime("lastUpdate", java.time.LocalDateTime.class);

    public final SimplePath<byte[]> location = createSimple("location", byte[].class);

    public final StringPath phone = createString("phone");

    public final StringPath postalCode = createString("postalCode");

    public final com.querydsl.sql.PrimaryKey<Address> primary = createPrimaryKey(addressId);

    public final com.querydsl.sql.ForeignKey<City> addressCityFk = createForeignKey(cityId, "city_id");

    public final com.querydsl.sql.ForeignKey<Staff> _staffAddressFk = createInvForeignKey(addressId, "address_id");

    public final com.querydsl.sql.ForeignKey<Customer> _customerAddressFk = createInvForeignKey(addressId, "address_id");

    public final com.querydsl.sql.ForeignKey<Store> _storeAddressFk = createInvForeignKey(addressId, "address_id");

    public QAddress(String variable) {
        super(Address.class, forVariable(variable), "null", "address");
        addMetadata();
    }

    public QAddress(String variable, String schema, String table) {
        super(Address.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAddress(String variable, String schema) {
        super(Address.class, forVariable(variable), schema, "address");
        addMetadata();
    }

    public QAddress(Path<? extends Address> path) {
        super(path.getType(), path.getMetadata(), "null", "address");
        addMetadata();
    }

    public QAddress(PathMetadata metadata) {
        super(Address.class, metadata, "null", "address");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(address, ColumnMetadata.named("address").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(address2, ColumnMetadata.named("address2").withIndex(3).ofType(Types.VARCHAR).withSize(50));
        addMetadata(addressId, ColumnMetadata.named("address_id").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(cityId, ColumnMetadata.named("city_id").withIndex(5).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(district, ColumnMetadata.named("district").withIndex(4).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(lastUpdate, ColumnMetadata.named("last_update").withIndex(9).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(location, ColumnMetadata.named("location").withIndex(8).ofType(Types.BINARY).withSize(65535).notNull());
        addMetadata(phone, ColumnMetadata.named("phone").withIndex(7).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(postalCode, ColumnMetadata.named("postal_code").withIndex(6).ofType(Types.VARCHAR).withSize(10));
    }

}

