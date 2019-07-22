(ns com.google.cloud.bigtable.data.v2.models.MutationApi
  "The API for creating mutations for a single row."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.models MutationApi]))

(defn set-cell
  "Adds a mutation which sets the value of the specified cell.

   This is a convenience override that converts Strings to ByteStrings.

  family-name - `java.lang.String`
  qualifier - `java.lang.String`
  timestamp - `long`
  value - `java.lang.String`

  returns: `T`"
  ([^MutationApi this ^java.lang.String family-name ^java.lang.String qualifier ^Long timestamp ^java.lang.String value]
    (-> this (.setCell family-name qualifier timestamp value)))
  ([^MutationApi this ^java.lang.String family-name ^java.lang.String qualifier ^java.lang.String value]
    (-> this (.setCell family-name qualifier value))))

(defn delete-cells
  "Adds a mutation which deletes cells from the specified column, restricted to a given timestamp
   range.

  family-name - The family name. - `java.lang.String`
  qualifier - The qualifier. - `com.google.protobuf.ByteString`
  timestamp-range - The timestamp range in microseconds. - `com.google.cloud.bigtable.data.v2.models.Range$TimestampRange`

  returns: `T`"
  ([^MutationApi this ^java.lang.String family-name ^com.google.protobuf.ByteString qualifier ^com.google.cloud.bigtable.data.v2.models.Range$TimestampRange timestamp-range]
    (-> this (.deleteCells family-name qualifier timestamp-range)))
  ([^MutationApi this ^java.lang.String family-name ^java.lang.String qualifier]
    (-> this (.deleteCells family-name qualifier))))

(defn delete-family
  "Adds a mutation which deletes all cells from the specified column family.

  family-name - `java.lang.String`

  returns: `T`"
  ([^MutationApi this ^java.lang.String family-name]
    (-> this (.deleteFamily family-name))))

(defn delete-row
  "Adds a mutation which deletes all cells from the containing row.

  returns: `T`"
  ([^MutationApi this]
    (-> this (.deleteRow))))

