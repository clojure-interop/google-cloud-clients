(ns com.google.cloud.bigquery.TableResult
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery TableResult]))

(defn ->table-result
  "Constructor.

  If schema is non-null, TableResult adds the schema to FieldValueLists
   when iterating through them. pageNoSchema must not be null.

  schema - `com.google.cloud.bigquery.Schema`
  total-rows - `long`
  page-no-schema - `com.google.api.gax.paging.Page`"
  (^TableResult [^com.google.cloud.bigquery.Schema schema ^Long total-rows ^com.google.api.gax.paging.Page page-no-schema]
    (new TableResult schema total-rows page-no-schema)))

(defn get-values
  "returns: `java.lang.Iterable<com.google.cloud.bigquery.FieldValueList>`"
  (^java.lang.Iterable [^TableResult this]
    (-> this (.getValues))))

(defn iterate-all
  "returns: `java.lang.Iterable<com.google.cloud.bigquery.FieldValueList>`"
  (^java.lang.Iterable [^TableResult this]
    (-> this (.iterateAll))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TableResult this]
    (-> this (.toString))))

(defn get-next-page
  "returns: `com.google.cloud.bigquery.TableResult`"
  (^com.google.cloud.bigquery.TableResult [^TableResult this]
    (-> this (.getNextPage))))

(defn get-next-page-token
  "returns: `java.lang.String`"
  (^java.lang.String [^TableResult this]
    (-> this (.getNextPageToken))))

(defn get-total-rows
  "Returns the total number of rows in the complete result set, which can be more than the number
   of rows in the first page of results returned by getValues().

  returns: `long`"
  (^Long [^TableResult this]
    (-> this (.getTotalRows))))

(defn get-schema
  "Returns the schema of the results. Null if the schema is not supplied.

  returns: `com.google.cloud.bigquery.Schema`"
  (^com.google.cloud.bigquery.Schema [^TableResult this]
    (-> this (.getSchema))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TableResult this]
    (-> this (.hashCode))))

(defn has-next-page?
  "returns: `boolean`"
  (^Boolean [^TableResult this]
    (-> this (.hasNextPage))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TableResult this ^java.lang.Object obj]
    (-> this (.equals obj))))

