(ns com.google.cloud.bigtable.data.v2.models.RowAdapter$RowBuilder
  "A SAX style row factory. It is responsible for creating two types of rows: standard data rows
  and special marker rows. Marker rows are emitted when skipping lots of rows due to filters. The
  server notifies the client of the last row it skipped to help client resume in case of error.

  State management is handled external to the implementation of this class and guarantees the
  following order:


    Exactly 1 startRow for each row.
    Exactly 1 startCell for each cell.
    At least 1 cellValue for each cell.
    Exactly 1 finishCell for each cell.
    Exactly 1 finishRow for each row.


  createScanMarkerRow can be called one or more times between finishRow and
  startRow. reset can be called at any point and can be invoked multiple times in
  a row."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models RowAdapter$RowBuilder]))

(defn start-row
  "Called to start a new row. This will be called once per row.

  key - `com.google.protobuf.ByteString`"
  ([^RowAdapter$RowBuilder this ^com.google.protobuf.ByteString key]
    (-> this (.startRow key))))

(defn start-cell
  "Called to start a new cell in a row.

  family - `java.lang.String`
  qualifier - `com.google.protobuf.ByteString`
  timestamp - `long`
  labels - `java.util.List`
  size - `long`"
  ([^RowAdapter$RowBuilder this ^java.lang.String family ^com.google.protobuf.ByteString qualifier ^Long timestamp ^java.util.List labels ^Long size]
    (-> this (.startCell family qualifier timestamp labels size))))

(defn cell-value
  "Called multiple times per cell to concatenate the cell value.

  value - `com.google.protobuf.ByteString`"
  ([^RowAdapter$RowBuilder this ^com.google.protobuf.ByteString value]
    (-> this (.cellValue value))))

(defn finish-cell
  "Called once per cell to signal the end of the value (unless reset)."
  ([^RowAdapter$RowBuilder this]
    (-> this (.finishCell))))

(defn finish-row
  "Called once per row to signal that all cells have been processed (unless reset).

  returns: `RowT`"
  ([^RowAdapter$RowBuilder this]
    (-> this (.finishRow))))

(defn reset
  "Called when the current in progress row should be dropped"
  ([^RowAdapter$RowBuilder this]
    (-> this (.reset))))

(defn create-scan-marker-row
  "Creates a special row to mark server progress before any data is received

  key - `com.google.protobuf.ByteString`

  returns: `RowT`"
  ([^RowAdapter$RowBuilder this ^com.google.protobuf.ByteString key]
    (-> this (.createScanMarkerRow key))))

