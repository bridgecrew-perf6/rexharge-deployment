/*
 * This file is generated by jOOQ.
 */
package jooq.steve.db.tables;


import de.rwth.idsg.steve.utils.DateTimeConverter;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import jooq.steve.db.Indexes;
import jooq.steve.db.Keys;
import jooq.steve.db.Stevedb;
import jooq.steve.db.tables.records.ChargeBoxRecord;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ChargeBox extends TableImpl<ChargeBoxRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>stevedb.charge_box</code>
     */
    public static final ChargeBox CHARGE_BOX = new ChargeBox();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ChargeBoxRecord> getRecordType() {
        return ChargeBoxRecord.class;
    }

    /**
     * The column <code>stevedb.charge_box.charge_box_id</code>.
     */
    public final TableField<ChargeBoxRecord, String> CHARGE_BOX_ID = createField(DSL.name("charge_box_id"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>stevedb.charge_box.endpoint_address</code>.
     */
    public final TableField<ChargeBoxRecord, String> ENDPOINT_ADDRESS = createField(DSL.name("endpoint_address"), SQLDataType.VARCHAR(255).defaultValue(DSL.field("NULL::character varying", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>stevedb.charge_box.ocpp_protocol</code>.
     */
    public final TableField<ChargeBoxRecord, String> OCPP_PROTOCOL = createField(DSL.name("ocpp_protocol"), SQLDataType.VARCHAR(255).defaultValue(DSL.field("NULL::character varying", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>stevedb.charge_box.charge_point_vendor</code>.
     */
    public final TableField<ChargeBoxRecord, String> CHARGE_POINT_VENDOR = createField(DSL.name("charge_point_vendor"), SQLDataType.VARCHAR(255).defaultValue(DSL.field("NULL::character varying", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>stevedb.charge_box.charge_point_model</code>.
     */
    public final TableField<ChargeBoxRecord, String> CHARGE_POINT_MODEL = createField(DSL.name("charge_point_model"), SQLDataType.VARCHAR(255).defaultValue(DSL.field("NULL::character varying", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>stevedb.charge_box.charge_point_serial_number</code>.
     */
    public final TableField<ChargeBoxRecord, String> CHARGE_POINT_SERIAL_NUMBER = createField(DSL.name("charge_point_serial_number"), SQLDataType.VARCHAR(255).defaultValue(DSL.field("NULL::character varying", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>stevedb.charge_box.charge_box_serial_number</code>.
     */
    public final TableField<ChargeBoxRecord, String> CHARGE_BOX_SERIAL_NUMBER = createField(DSL.name("charge_box_serial_number"), SQLDataType.VARCHAR(255).defaultValue(DSL.field("NULL::character varying", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>stevedb.charge_box.fw_version</code>.
     */
    public final TableField<ChargeBoxRecord, String> FW_VERSION = createField(DSL.name("fw_version"), SQLDataType.VARCHAR(255).defaultValue(DSL.field("NULL::character varying", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>stevedb.charge_box.fw_update_status</code>.
     */
    public final TableField<ChargeBoxRecord, String> FW_UPDATE_STATUS = createField(DSL.name("fw_update_status"), SQLDataType.VARCHAR(255).defaultValue(DSL.field("NULL::character varying", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>stevedb.charge_box.fw_update_timestamp</code>.
     */
    public final TableField<ChargeBoxRecord, DateTime> FW_UPDATE_TIMESTAMP = createField(DSL.name("fw_update_timestamp"), SQLDataType.TIMESTAMP(6).defaultValue(DSL.field("NULL::timestamp without time zone", SQLDataType.TIMESTAMP)), this, "", new DateTimeConverter());

    /**
     * The column <code>stevedb.charge_box.iccid</code>.
     */
    public final TableField<ChargeBoxRecord, String> ICCID = createField(DSL.name("iccid"), SQLDataType.VARCHAR(255).defaultValue(DSL.field("NULL::character varying", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>stevedb.charge_box.imsi</code>.
     */
    public final TableField<ChargeBoxRecord, String> IMSI = createField(DSL.name("imsi"), SQLDataType.VARCHAR(255).defaultValue(DSL.field("NULL::character varying", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>stevedb.charge_box.meter_type</code>.
     */
    public final TableField<ChargeBoxRecord, String> METER_TYPE = createField(DSL.name("meter_type"), SQLDataType.VARCHAR(255).defaultValue(DSL.field("NULL::character varying", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>stevedb.charge_box.meter_serial_number</code>.
     */
    public final TableField<ChargeBoxRecord, String> METER_SERIAL_NUMBER = createField(DSL.name("meter_serial_number"), SQLDataType.VARCHAR(255).defaultValue(DSL.field("NULL::character varying", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>stevedb.charge_box.diagnostics_status</code>.
     */
    public final TableField<ChargeBoxRecord, String> DIAGNOSTICS_STATUS = createField(DSL.name("diagnostics_status"), SQLDataType.VARCHAR(255).defaultValue(DSL.field("NULL::character varying", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>stevedb.charge_box.diagnostics_timestamp</code>.
     */
    public final TableField<ChargeBoxRecord, DateTime> DIAGNOSTICS_TIMESTAMP = createField(DSL.name("diagnostics_timestamp"), SQLDataType.TIMESTAMP(6).defaultValue(DSL.field("NULL::timestamp without time zone", SQLDataType.TIMESTAMP)), this, "", new DateTimeConverter());

    /**
     * The column <code>stevedb.charge_box.last_heartbeat_timestamp</code>.
     */
    public final TableField<ChargeBoxRecord, DateTime> LAST_HEARTBEAT_TIMESTAMP = createField(DSL.name("last_heartbeat_timestamp"), SQLDataType.TIMESTAMP(6).defaultValue(DSL.field("NULL::timestamp without time zone", SQLDataType.TIMESTAMP)), this, "", new DateTimeConverter());

    /**
     * The column <code>stevedb.charge_box.note</code>.
     */
    public final TableField<ChargeBoxRecord, String> NOTE = createField(DSL.name("note"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>stevedb.charge_box.charge_box_pk</code>.
     */
    public final TableField<ChargeBoxRecord, Integer> CHARGE_BOX_PK = createField(DSL.name("charge_box_pk"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>stevedb.charge_box.description</code>.
     */
    public final TableField<ChargeBoxRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>stevedb.charge_box.location_latitude</code>.
     */
    public final TableField<ChargeBoxRecord, BigDecimal> LOCATION_LATITUDE = createField(DSL.name("location_latitude"), SQLDataType.NUMERIC(11, 8), this, "");

    /**
     * The column <code>stevedb.charge_box.location_longitude</code>.
     */
    public final TableField<ChargeBoxRecord, BigDecimal> LOCATION_LONGITUDE = createField(DSL.name("location_longitude"), SQLDataType.NUMERIC(11, 8), this, "");

    /**
     * The column <code>stevedb.charge_box.address_pk</code>.
     */
    public final TableField<ChargeBoxRecord, Integer> ADDRESS_PK = createField(DSL.name("address_pk"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>stevedb.charge_box.admin_address</code>.
     */
    public final TableField<ChargeBoxRecord, String> ADMIN_ADDRESS = createField(DSL.name("admin_address"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column
     * <code>stevedb.charge_box.insert_connector_status_after_transaction_msg</code>.
     */
    public final TableField<ChargeBoxRecord, Boolean> INSERT_CONNECTOR_STATUS_AFTER_TRANSACTION_MSG = createField(DSL.name("insert_connector_status_after_transaction_msg"), SQLDataType.BOOLEAN.defaultValue(DSL.field("true", SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>stevedb.charge_box.registration_status</code>.
     */
    public final TableField<ChargeBoxRecord, String> REGISTRATION_STATUS = createField(DSL.name("registration_status"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field("'Accepted'::character varying", SQLDataType.VARCHAR)), this, "");

    private ChargeBox(Name alias, Table<ChargeBoxRecord> aliased) {
        this(alias, aliased, null);
    }

    private ChargeBox(Name alias, Table<ChargeBoxRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>stevedb.charge_box</code> table reference
     */
    public ChargeBox(String alias) {
        this(DSL.name(alias), CHARGE_BOX);
    }

    /**
     * Create an aliased <code>stevedb.charge_box</code> table reference
     */
    public ChargeBox(Name alias) {
        this(alias, CHARGE_BOX);
    }

    /**
     * Create a <code>stevedb.charge_box</code> table reference
     */
    public ChargeBox() {
        this(DSL.name("charge_box"), null);
    }

    public <O extends Record> ChargeBox(Table<O> child, ForeignKey<O, ChargeBoxRecord> key) {
        super(child, key, CHARGE_BOX);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Stevedb.STEVEDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.CHARGEBOX_OP_EP_IDX);
    }

    @Override
    public Identity<ChargeBoxRecord, Integer> getIdentity() {
        return (Identity<ChargeBoxRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ChargeBoxRecord> getPrimaryKey() {
        return Keys.CHARGE_BOX_PKEY;
    }

    @Override
    public List<UniqueKey<ChargeBoxRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.CHARGEBOX_PKEY);
    }

    @Override
    public List<ForeignKey<ChargeBoxRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CHARGE_BOX__FK_CHARGE_BOX_ADDRESS_APK);
    }

    private transient Address _address;

    /**
     * Get the implicit join path to the <code>stevedb.address</code> table.
     */
    public Address address() {
        if (_address == null)
            _address = new Address(this, Keys.CHARGE_BOX__FK_CHARGE_BOX_ADDRESS_APK);

        return _address;
    }

    @Override
    public ChargeBox as(String alias) {
        return new ChargeBox(DSL.name(alias), this);
    }

    @Override
    public ChargeBox as(Name alias) {
        return new ChargeBox(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ChargeBox rename(String name) {
        return new ChargeBox(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ChargeBox rename(Name name) {
        return new ChargeBox(name, null);
    }
}
