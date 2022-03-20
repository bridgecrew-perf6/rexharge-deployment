/*
 * This file is generated by jOOQ.
 */
package jooq.steve.db.tables;


import de.rwth.idsg.steve.utils.DateTimeConverter;

import java.util.Arrays;
import java.util.List;

import jooq.steve.db.Indexes;
import jooq.steve.db.Keys;
import jooq.steve.db.Stevedb;
import jooq.steve.db.tables.records.OcppTagRecord;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class OcppTag extends TableImpl<OcppTagRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>stevedb.ocpp_tag</code>
     */
    public static final OcppTag OCPP_TAG = new OcppTag();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OcppTagRecord> getRecordType() {
        return OcppTagRecord.class;
    }

    /**
     * The column <code>stevedb.ocpp_tag.id_tag</code>.
     */
    public final TableField<OcppTagRecord, String> ID_TAG = createField(DSL.name("id_tag"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>stevedb.ocpp_tag.parent_id_tag</code>.
     */
    public final TableField<OcppTagRecord, String> PARENT_ID_TAG = createField(DSL.name("parent_id_tag"), SQLDataType.VARCHAR(255).defaultValue(DSL.field("NULL::character varying", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>stevedb.ocpp_tag.expiry_date</code>.
     */
    public final TableField<OcppTagRecord, DateTime> EXPIRY_DATE = createField(DSL.name("expiry_date"), SQLDataType.TIMESTAMP(6).defaultValue(DSL.field("NULL::timestamp without time zone", SQLDataType.TIMESTAMP)), this, "", new DateTimeConverter());

    /**
     * The column <code>stevedb.ocpp_tag.note</code>.
     */
    public final TableField<OcppTagRecord, String> NOTE = createField(DSL.name("note"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>stevedb.ocpp_tag.ocpp_tag_pk</code>.
     */
    public final TableField<OcppTagRecord, Integer> OCPP_TAG_PK = createField(DSL.name("ocpp_tag_pk"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>stevedb.ocpp_tag.max_active_transaction_count</code>.
     */
    public final TableField<OcppTagRecord, Integer> MAX_ACTIVE_TRANSACTION_COUNT = createField(DSL.name("max_active_transaction_count"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("1", SQLDataType.INTEGER)), this, "");

    private OcppTag(Name alias, Table<OcppTagRecord> aliased) {
        this(alias, aliased, null);
    }

    private OcppTag(Name alias, Table<OcppTagRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>stevedb.ocpp_tag</code> table reference
     */
    public OcppTag(String alias) {
        this(DSL.name(alias), OCPP_TAG);
    }

    /**
     * Create an aliased <code>stevedb.ocpp_tag</code> table reference
     */
    public OcppTag(Name alias) {
        this(alias, OCPP_TAG);
    }

    /**
     * Create a <code>stevedb.ocpp_tag</code> table reference
     */
    public OcppTag() {
        this(DSL.name("ocpp_tag"), null);
    }

    public <O extends Record> OcppTag(Table<O> child, ForeignKey<O, OcppTagRecord> key) {
        super(child, key, OCPP_TAG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Stevedb.STEVEDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.USER_EXPIRYDATE_IDX);
    }

    @Override
    public Identity<OcppTagRecord, Integer> getIdentity() {
        return (Identity<OcppTagRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<OcppTagRecord> getPrimaryKey() {
        return Keys.USERS_PKEY;
    }

    @Override
    public List<UniqueKey<OcppTagRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.USER_PKEY);
    }

    @Override
    public List<ForeignKey<OcppTagRecord, ?>> getReferences() {
        return Arrays.asList(Keys.OCPP_TAG__FK_OCPP_TAG_PARENT_ID_TAG);
    }

    private transient OcppTag _ocppTag;

    /**
     * Get the implicit join path to the <code>stevedb.ocpp_tag</code> table.
     */
    public OcppTag ocppTag() {
        if (_ocppTag == null)
            _ocppTag = new OcppTag(this, Keys.OCPP_TAG__FK_OCPP_TAG_PARENT_ID_TAG);

        return _ocppTag;
    }

    @Override
    public OcppTag as(String alias) {
        return new OcppTag(DSL.name(alias), this);
    }

    @Override
    public OcppTag as(Name alias) {
        return new OcppTag(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OcppTag rename(String name) {
        return new OcppTag(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OcppTag rename(Name name) {
        return new OcppTag(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, DateTime, String, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
