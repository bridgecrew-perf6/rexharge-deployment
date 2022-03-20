/*
 * This file is generated by jOOQ.
 */
package jooq.steve.db.tables;


import de.rwth.idsg.steve.utils.DateTimeConverter;

import java.math.BigDecimal;

import jooq.steve.db.Keys;
import jooq.steve.db.Stevedb;
import jooq.steve.db.tables.records.ChargingProfileRecord;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class ChargingProfile extends TableImpl<ChargingProfileRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>stevedb.charging_profile</code>
     */
    public static final ChargingProfile CHARGING_PROFILE = new ChargingProfile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ChargingProfileRecord> getRecordType() {
        return ChargingProfileRecord.class;
    }

    /**
     * The column <code>stevedb.charging_profile.charging_profile_pk</code>.
     */
    public final TableField<ChargingProfileRecord, Integer> CHARGING_PROFILE_PK = createField(DSL.name("charging_profile_pk"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>stevedb.charging_profile.stack_level</code>.
     */
    public final TableField<ChargingProfileRecord, Integer> STACK_LEVEL = createField(DSL.name("stack_level"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>stevedb.charging_profile.charging_profile_purpose</code>.
     */
    public final TableField<ChargingProfileRecord, String> CHARGING_PROFILE_PURPOSE = createField(DSL.name("charging_profile_purpose"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>stevedb.charging_profile.charging_profile_kind</code>.
     */
    public final TableField<ChargingProfileRecord, String> CHARGING_PROFILE_KIND = createField(DSL.name("charging_profile_kind"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>stevedb.charging_profile.recurrency_kind</code>.
     */
    public final TableField<ChargingProfileRecord, String> RECURRENCY_KIND = createField(DSL.name("recurrency_kind"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>stevedb.charging_profile.valid_from</code>.
     */
    public final TableField<ChargingProfileRecord, DateTime> VALID_FROM = createField(DSL.name("valid_from"), SQLDataType.TIMESTAMP(6), this, "", new DateTimeConverter());

    /**
     * The column <code>stevedb.charging_profile.valid_to</code>.
     */
    public final TableField<ChargingProfileRecord, DateTime> VALID_TO = createField(DSL.name("valid_to"), SQLDataType.TIMESTAMP(6), this, "", new DateTimeConverter());

    /**
     * The column <code>stevedb.charging_profile.duration_in_seconds</code>.
     */
    public final TableField<ChargingProfileRecord, Integer> DURATION_IN_SECONDS = createField(DSL.name("duration_in_seconds"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>stevedb.charging_profile.start_schedule</code>.
     */
    public final TableField<ChargingProfileRecord, DateTime> START_SCHEDULE = createField(DSL.name("start_schedule"), SQLDataType.TIMESTAMP(6), this, "", new DateTimeConverter());

    /**
     * The column <code>stevedb.charging_profile.charging_rate_unit</code>.
     */
    public final TableField<ChargingProfileRecord, String> CHARGING_RATE_UNIT = createField(DSL.name("charging_rate_unit"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>stevedb.charging_profile.min_charging_rate</code>.
     */
    public final TableField<ChargingProfileRecord, BigDecimal> MIN_CHARGING_RATE = createField(DSL.name("min_charging_rate"), SQLDataType.NUMERIC(15, 1), this, "");

    /**
     * The column <code>stevedb.charging_profile.description</code>.
     */
    public final TableField<ChargingProfileRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>stevedb.charging_profile.note</code>.
     */
    public final TableField<ChargingProfileRecord, String> NOTE = createField(DSL.name("note"), SQLDataType.CLOB, this, "");

    private ChargingProfile(Name alias, Table<ChargingProfileRecord> aliased) {
        this(alias, aliased, null);
    }

    private ChargingProfile(Name alias, Table<ChargingProfileRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>stevedb.charging_profile</code> table reference
     */
    public ChargingProfile(String alias) {
        this(DSL.name(alias), CHARGING_PROFILE);
    }

    /**
     * Create an aliased <code>stevedb.charging_profile</code> table reference
     */
    public ChargingProfile(Name alias) {
        this(alias, CHARGING_PROFILE);
    }

    /**
     * Create a <code>stevedb.charging_profile</code> table reference
     */
    public ChargingProfile() {
        this(DSL.name("charging_profile"), null);
    }

    public <O extends Record> ChargingProfile(Table<O> child, ForeignKey<O, ChargingProfileRecord> key) {
        super(child, key, CHARGING_PROFILE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Stevedb.STEVEDB;
    }

    @Override
    public Identity<ChargingProfileRecord, Integer> getIdentity() {
        return (Identity<ChargingProfileRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ChargingProfileRecord> getPrimaryKey() {
        return Keys.CHARGING_PROFILE_PKEY;
    }

    @Override
    public ChargingProfile as(String alias) {
        return new ChargingProfile(DSL.name(alias), this);
    }

    @Override
    public ChargingProfile as(Name alias) {
        return new ChargingProfile(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ChargingProfile rename(String name) {
        return new ChargingProfile(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ChargingProfile rename(Name name) {
        return new ChargingProfile(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Integer, Integer, String, String, String, DateTime, DateTime, Integer, DateTime, String, BigDecimal, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
