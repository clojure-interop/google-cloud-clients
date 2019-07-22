(ns com.google.cloud.bigtable.data.v2.models.RowAdapter
  "An extension point that allows end users to plug in a custom implementation of logical rows. This
  useful in cases where the user would like to apply advanced client side filtering of cells. This
  adapter acts like a factory for a SAX style row builder."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models RowAdapter]))

(defn create-row-builder
  "Creates a new instance of a RowAdapter.RowBuilder.

  returns: `com.google.cloud.bigtable.data.v2.models.RowAdapter$RowBuilder<RowT>`"
  (^com.google.cloud.bigtable.data.v2.models.RowAdapter$RowBuilder [^RowAdapter this]
    (-> this (.createRowBuilder))))

(defn scan-marker-row?
  "Checks if the given row is a special marker row. Please the documentation for RowAdapter.RowBuilder for more information

  row - `RowT`

  returns: `boolean`"
  (^Boolean [^RowAdapter this row]
    (-> this (.isScanMarkerRow row))))

(defn get-key
  "row - `RowT`

  returns: `com.google.protobuf.ByteString`"
  (^com.google.protobuf.ByteString [^RowAdapter this row]
    (-> this (.getKey row))))

