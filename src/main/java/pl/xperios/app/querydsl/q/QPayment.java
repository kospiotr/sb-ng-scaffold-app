package pl.xperios.app.querydsl.q;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPayment is a Querydsl query type for Payment
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPayment extends com.querydsl.sql.RelationalPathBase<Payment> {

    private static final long serialVersionUID = -1585350091;

    public static final QPayment payment = new QPayment("payment");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final NumberPath<Short> customerId = createNumber("customerId", Short.class);

    public final DateTimePath<java.time.LocalDateTime> lastUpdate = createDateTime("lastUpdate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> paymentDate = createDateTime("paymentDate", java.time.LocalDateTime.class);

    public final NumberPath<Short> paymentId = createNumber("paymentId", Short.class);

    public final NumberPath<Integer> rentalId = createNumber("rentalId", Integer.class);

    public final NumberPath<Byte> staffId = createNumber("staffId", Byte.class);

    public final com.querydsl.sql.PrimaryKey<Payment> primary = createPrimaryKey(paymentId);

    public final com.querydsl.sql.ForeignKey<Customer> paymentCustomerFk = createForeignKey(customerId, "customer_id");

    public final com.querydsl.sql.ForeignKey<Staff> paymentStaffFk = createForeignKey(staffId, "staff_id");

    public final com.querydsl.sql.ForeignKey<Rental> paymentRentalFk = createForeignKey(rentalId, "rental_id");

    public QPayment(String variable) {
        super(Payment.class, forVariable(variable), "null", "payment");
        addMetadata();
    }

    public QPayment(String variable, String schema, String table) {
        super(Payment.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPayment(String variable, String schema) {
        super(Payment.class, forVariable(variable), schema, "payment");
        addMetadata();
    }

    public QPayment(Path<? extends Payment> path) {
        super(path.getType(), path.getMetadata(), "null", "payment");
        addMetadata();
    }

    public QPayment(PathMetadata metadata) {
        super(Payment.class, metadata, "null", "payment");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(amount, ColumnMetadata.named("amount").withIndex(5).ofType(Types.DECIMAL).withSize(5).withDigits(2).notNull());
        addMetadata(customerId, ColumnMetadata.named("customer_id").withIndex(2).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(lastUpdate, ColumnMetadata.named("last_update").withIndex(7).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(paymentDate, ColumnMetadata.named("payment_date").withIndex(6).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(paymentId, ColumnMetadata.named("payment_id").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(rentalId, ColumnMetadata.named("rental_id").withIndex(4).ofType(Types.INTEGER).withSize(10));
        addMetadata(staffId, ColumnMetadata.named("staff_id").withIndex(3).ofType(Types.TINYINT).withSize(3).notNull());
    }

}

