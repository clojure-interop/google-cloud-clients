(ns com.google.cloud.bigtable.data.v2.models.RowCell
  "Default representation of a cell in a Row."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models RowCell]))

(defn ->row-cell
  "Constructor."
  (^RowCell []
    (new RowCell )))

(defn *compare-by-native
  "A comparator that compares the cells by Bigtable native ordering:


     Family lexicographically ascending
     Qualifier lexicographically ascending
     Timestamp in reverse chronological order


   Labels and values are not included in the comparison.

  returns: `java.util.Comparator<com.google.cloud.bigtable.data.v2.models.RowCell>`"
  (^java.util.Comparator []
    (RowCell/compareByNative )))

(defn *create
  "Creates a new instance of the RowCell.

  family - `java.lang.String`
  qualifier - `com.google.protobuf.ByteString`
  timestamp - `long`
  labels - `java.util.List`
  value - `com.google.protobuf.ByteString`

  returns: `com.google.cloud.bigtable.data.v2.models.RowCell`"
  (^com.google.cloud.bigtable.data.v2.models.RowCell [^java.lang.String family ^com.google.protobuf.ByteString qualifier ^Long timestamp ^java.util.List labels ^com.google.protobuf.ByteString value]
    (RowCell/create family qualifier timestamp labels value)))

(defn get-family
  "The cell's family

  returns: `java.lang.String`"
  (^java.lang.String [^RowCell this]
    (-> this (.getFamily))))

(defn get-qualifier
  "The cell's qualifier (column name)

  returns: `com.google.protobuf.ByteString`"
  (^com.google.protobuf.ByteString [^RowCell this]
    (-> this (.getQualifier))))

(defn get-timestamp
  "The timestamp of the cell

  returns: `long`"
  (^Long [^RowCell this]
    (-> this (.getTimestamp))))

(defn get-value
  "The value of the cell

  returns: `com.google.protobuf.ByteString`"
  (^com.google.protobuf.ByteString [^RowCell this]
    (-> this (.getValue))))

(defn get-labels
  "The labels assigned to the cell

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RowCell this]
    (-> this (.getLabels))))

