(ns com.google.cloud.bigquery.InsertAllRequest
  "Google Cloud BigQuery insert all request. This class can be used to stream data into BigQuery one
  record at a time without needing to run a load job. This approach enables querying data without
  the delay of running a load job. There are several important trade-offs to consider before
  choosing an approach."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery InsertAllRequest]))

(defn *new-builder
  "Returns a builder for an InsertAllRequest object given the destination table and the
   rows to insert.

  dataset-id - `java.lang.String`
  table-id - `java.lang.String`
  rows - `java.lang.Iterable`

  returns: `com.google.cloud.bigquery.InsertAllRequest$Builder`"
  (^com.google.cloud.bigquery.InsertAllRequest$Builder [^java.lang.String dataset-id ^java.lang.String table-id ^java.lang.Iterable rows]
    (InsertAllRequest/newBuilder dataset-id table-id rows))
  (^com.google.cloud.bigquery.InsertAllRequest$Builder [^com.google.cloud.bigquery.TableId table ^java.lang.Iterable rows]
    (InsertAllRequest/newBuilder table rows))
  (^com.google.cloud.bigquery.InsertAllRequest$Builder [^com.google.cloud.bigquery.TableId table]
    (InsertAllRequest/newBuilder table)))

(defn *of
  "Returns a InsertAllRequest object given the destination table and the rows to insert.

  dataset-id - `java.lang.String`
  table-id - `java.lang.String`
  rows - `java.lang.Iterable`

  returns: `com.google.cloud.bigquery.InsertAllRequest`"
  (^com.google.cloud.bigquery.InsertAllRequest [^java.lang.String dataset-id ^java.lang.String table-id ^java.lang.Iterable rows]
    (InsertAllRequest/of dataset-id table-id rows))
  (^com.google.cloud.bigquery.InsertAllRequest [^com.google.cloud.bigquery.TableId table-id ^java.lang.Iterable rows]
    (InsertAllRequest/of table-id rows)))

(defn get-table
  "Returns the destination table for rows insert request.

  returns: `com.google.cloud.bigquery.TableId`"
  (^com.google.cloud.bigquery.TableId [^InsertAllRequest this]
    (-> this (.getTable))))

(defn get-rows
  "Returns the rows to be inserted.

  returns: `java.util.List<com.google.cloud.bigquery.InsertAllRequest$RowToInsert>`"
  (^java.util.List [^InsertAllRequest this]
    (-> this (.getRows))))

(defn ignore-unknown-values
  "Returns whether to accept rows that contain values that do not match the schema. The unknown
   values are ignored. If not set, rows with unknown values are considered to be invalid.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^InsertAllRequest this]
    (-> this (.ignoreUnknownValues))))

(defn skip-invalid-rows
  "Returns whether to insert all valid rows of a request, even if invalid rows exist. If not set
   the entire insert request will fail if it contains an invalid row.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^InsertAllRequest this]
    (-> this (.skipInvalidRows))))

(defn get-template-suffix
  "If specified, the destination table is treated as a base template. Rows are inserted into an
   instance table named \"{destination}{templateSuffix}\". BigQuery will manage the creation of the
   instance table, using the schema of the base template table. Table creation might take some
   time. To obtain table's information after BigQuery.insertAll(InsertAllRequest) is
   called use:



   String suffixTableId = ...;
   TableInfo suffixTable = bigquery.getTable(DATASET, suffixTableId);
   while (suffixTable == null) {
     Thread.sleep(1000L);
     suffixTable = bigquery.getTable(DATASET, suffixTableId);
   }

  returns: `java.lang.String`"
  (^java.lang.String [^InsertAllRequest this]
    (-> this (.getTemplateSuffix))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InsertAllRequest this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InsertAllRequest this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InsertAllRequest this ^java.lang.Object obj]
    (-> this (.equals obj))))

