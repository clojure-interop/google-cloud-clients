(ns com.google.cloud.bigtable.data.v2.models.DefaultRowAdapter
  "Default implementation of a RowAdapter that uses Rows to represent logical rows."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models DefaultRowAdapter]))

(defn ->default-row-adapter
  "Constructor."
  (^DefaultRowAdapter []
    (new DefaultRowAdapter )))

(defn scan-marker-row?
  "Checks if the given row is a special marker row. Please the documentation for RowAdapter.RowBuilder for more information

  row - `com.google.cloud.bigtable.data.v2.models.Row`

  returns: `boolean`"
  (^Boolean [^DefaultRowAdapter this ^com.google.cloud.bigtable.data.v2.models.Row row]
    (-> this (.isScanMarkerRow row))))

(defn create-row-builder
  "Creates a new instance of a RowAdapter.RowBuilder.

  returns: `com.google.cloud.bigtable.data.v2.models.RowAdapter$RowBuilder<com.google.cloud.bigtable.data.v2.models.Row>`"
  (^com.google.cloud.bigtable.data.v2.models.RowAdapter$RowBuilder [^DefaultRowAdapter this]
    (-> this (.createRowBuilder))))

(defn get-key
  "row - `com.google.cloud.bigtable.data.v2.models.Row`

  returns: `com.google.protobuf.ByteString`"
  (^com.google.protobuf.ByteString [^DefaultRowAdapter this ^com.google.cloud.bigtable.data.v2.models.Row row]
    (-> this (.getKey row))))

(defn create-row-from-proto
  "Helper to convert a proto Row to a model Row.

   For internal use only.

  row - `com.google.bigtable.v2.Row`

  returns: `com.google.cloud.bigtable.data.v2.models.Row`"
  (^com.google.cloud.bigtable.data.v2.models.Row [^DefaultRowAdapter this ^com.google.bigtable.v2.Row row]
    (-> this (.createRowFromProto row))))

