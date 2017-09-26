package pl.xperios.app.querydsl.q;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QRental is a Querydsl query type for Rental
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRental extends com.querydsl.sql.RelationalPathBase<Rental> {

    private static final long serialVersionUID = 286585621;

    public static final QRental rental = new QRental("rental");

    public final NumberPath<Short> customerId = createNumber("customerId", Short.class);

    public final NumberPath<Integer> inventoryId = createNumber("inventoryId", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> lastUpdate = createDateTime("lastUpdate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> rentalDate = createDateTime("rentalDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> rentalId = createNumber("rentalId", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> returnDate = createDateTime("returnDate", java.time.LocalDateTime.class);

    public final NumberPath<Byte> staffId = createNumber("staffId", Byte.class);

    public final com.querydsl.sql.PrimaryKey<Rental> primary = createPrimaryKey(rentalId);

    public final com.querydsl.sql.ForeignKey<Customer> rentalCustomerFk = createForeignKey(customerId, "customer_id");

    public final com.querydsl.sql.ForeignKey<Staff> rentalStaffFk = createForeignKey(staffId, "staff_id");

    public final com.querydsl.sql.ForeignKey<Inventory> rentalInventoryFk = createForeignKey(inventoryId, "inventory_id");

    public final com.querydsl.sql.ForeignKey<Payment> _paymentRentalFk = createInvForeignKey(rentalId, "rental_id");

    public QRental(String variable) {
        super(Rental.class, forVariable(variable), "null", "rental");
        addMetadata();
    }

    public QRental(String variable, String schema, String table) {
        super(Rental.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRental(String variable, String schema) {
        super(Rental.class, forVariable(variable), schema, "rental");
        addMetadata();
    }

    public QRental(Path<? extends Rental> path) {
        super(path.getType(), path.getMetadata(), "null", "rental");
        addMetadata();
    }

    public QRental(PathMetadata metadata) {
        super(Rental.class, metadata, "null", "rental");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(customerId, ColumnMetadata.named("customer_id").withIndex(4).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(inventoryId, ColumnMetadata.named("inventory_id").withIndex(3).ofType(Types.INTEGER).withSize(8).notNull());
        addMetadata(lastUpdate, ColumnMetadata.named("last_update").withIndex(7).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(rentalDate, ColumnMetadata.named("rental_date").withIndex(2).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(rentalId, ColumnMetadata.named("rental_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(returnDate, ColumnMetadata.named("return_date").withIndex(5).ofType(Types.TIMESTAMP).withSize(26));
        addMetadata(staffId, ColumnMetadata.named("staff_id").withIndex(6).ofType(Types.TINYINT).withSize(3).notNull());
    }

}

