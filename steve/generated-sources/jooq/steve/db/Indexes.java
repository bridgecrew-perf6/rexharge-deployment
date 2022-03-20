/*
 * This file is generated by jOOQ.
 */
package jooq.steve.db;


import jooq.steve.db.tables.ChargeBox;
import jooq.steve.db.tables.ConnectorMeterValue;
import jooq.steve.db.tables.ConnectorStatus;
import jooq.steve.db.tables.OcppTag;
import jooq.steve.db.tables.Reservation;
import jooq.steve.db.tables.SchemaVersion;
import jooq.steve.db.tables.TransactionStart;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in stevedb.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index CHARGEBOX_OP_EP_IDX = Internal.createIndex(DSL.name("chargebox_op_ep_idx"), ChargeBox.CHARGE_BOX, new OrderField[] { ChargeBox.CHARGE_BOX.OCPP_PROTOCOL, ChargeBox.CHARGE_BOX.ENDPOINT_ADDRESS }, false);
    public static final Index CMV_VALUE_TIMESTAMP_IDX = Internal.createIndex(DSL.name("cmv_value_timestamp_idx"), ConnectorMeterValue.CONNECTOR_METER_VALUE, new OrderField[] { ConnectorMeterValue.CONNECTOR_METER_VALUE.VALUE_TIMESTAMP }, false);
    public static final Index CONNECTOR_STATUS_CPK_ST_IDX = Internal.createIndex(DSL.name("connector_status_cpk_st_idx"), ConnectorStatus.CONNECTOR_STATUS, new OrderField[] { ConnectorStatus.CONNECTOR_STATUS.CONNECTOR_PK, ConnectorStatus.CONNECTOR_STATUS.STATUS_TIMESTAMP }, false);
    public static final Index FK_CONNECTOR_PK_RESERV_IDX = Internal.createIndex(DSL.name("fk_connector_pk_reserv_idx"), Reservation.RESERVATION, new OrderField[] { Reservation.RESERVATION.CONNECTOR_PK }, false);
    public static final Index RESERVATION_EXPIRY_IDX = Internal.createIndex(DSL.name("reservation_expiry_idx"), Reservation.RESERVATION, new OrderField[] { Reservation.RESERVATION.EXPIRY_DATETIME }, false);
    public static final Index RESERVATION_START_IDX = Internal.createIndex(DSL.name("reservation_start_idx"), Reservation.RESERVATION, new OrderField[] { Reservation.RESERVATION.START_DATETIME }, false);
    public static final Index RESERVATION_STATUS_IDX = Internal.createIndex(DSL.name("reservation_status_idx"), Reservation.RESERVATION, new OrderField[] { Reservation.RESERVATION.STATUS }, false);
    public static final Index SCHEMA_VERSION_S_IDX = Internal.createIndex(DSL.name("schema_version_s_idx"), SchemaVersion.SCHEMA_VERSION, new OrderField[] { SchemaVersion.SCHEMA_VERSION.SUCCESS }, false);
    public static final Index TRANSACTION_PK_UNIQUE = Internal.createIndex(DSL.name("transaction_pk_unique"), Reservation.RESERVATION, new OrderField[] { Reservation.RESERVATION.TRANSACTION_PK }, true);
    public static final Index TRANSACTION_START_IDX = Internal.createIndex(DSL.name("transaction_start_idx"), TransactionStart.TRANSACTION_START, new OrderField[] { TransactionStart.TRANSACTION_START.START_TIMESTAMP }, false);
    public static final Index USER_EXPIRYDATE_IDX = Internal.createIndex(DSL.name("user_expirydate_idx"), OcppTag.OCPP_TAG, new OrderField[] { OcppTag.OCPP_TAG.EXPIRY_DATE }, false);
}
