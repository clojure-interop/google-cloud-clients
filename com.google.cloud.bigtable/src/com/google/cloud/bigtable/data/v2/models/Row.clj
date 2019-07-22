(ns com.google.cloud.bigtable.data.v2.models.Row
  "Default representation of a logical row.

  The cells contained within, will be sorted by the native order. Please see RowCell.compareByNative() for details."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models Row]))

(defn ->row
  "Constructor."
  (^Row []
    (new Row )))

(defn *compare-by-key
  "Returns a comparator that compares two Row objects by comparing the result of getKey()} for each.

  returns: `java.util.Comparator<com.google.cloud.bigtable.data.v2.models.Row>`"
  (^java.util.Comparator []
    (Row/compareByKey )))

(defn *create
  "Creates a new instance of the Row.

  key - `com.google.protobuf.ByteString`
  cells - `java.util.List`

  returns: `com.google.cloud.bigtable.data.v2.models.Row`"
  (^com.google.cloud.bigtable.data.v2.models.Row [^com.google.protobuf.ByteString key ^java.util.List cells]
    (Row/create key cells)))

(defn get-key
  "Returns the row key

  returns: `com.google.protobuf.ByteString`"
  (^com.google.protobuf.ByteString [^Row this]
    (-> this (.getKey))))

(defn get-cells
  "Returns a sublist of the cells that belong to the specified family and qualifier.

  family - `java.lang.String`
  qualifier - `java.lang.String`

  returns: `java.util.List<com.google.cloud.bigtable.data.v2.models.RowCell>`"
  (^java.util.List [^Row this ^java.lang.String family ^java.lang.String qualifier]
    (-> this (.getCells family qualifier)))
  (^java.util.List [^Row this ^java.lang.String family]
    (-> this (.getCells family)))
  (^java.util.List [^Row this]
    (-> this (.getCells))))

