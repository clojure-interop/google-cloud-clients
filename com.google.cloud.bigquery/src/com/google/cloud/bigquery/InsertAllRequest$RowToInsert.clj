(ns com.google.cloud.bigquery.InsertAllRequest$RowToInsert
  "A Google Big Query row to be inserted into a table. Each RowToInsert has an associated
  id used by BigQuery to detect duplicate insertion requests on a best-effort basis. Please
  notice that data for fields of type LegacySQLTypeName.BYTES must be provided as a
  base64 encoded string.

  Example usage of creating a row to insert:



  List<Long> repeatedFieldValue = Arrays.asList(1L, 2L);
  Map<String, Object> recordContent = new HashMap<String, Object>();
  recordContent.put(\"subfieldName1\", \"value\");
  recordContent.put(\"subfieldName2\", repeatedFieldValue);
  Map<String, Object> rowContent = new HashMap<String, Object>();
  rowContent.put(\"booleanFieldName\", true);
  rowContent.put(\"bytesFieldName\", \"DQ4KDQ==\");
  rowContent.put(\"recordFieldName\", recordContent);
  RowToInsert row = new RowToInsert(\"rowId\", rowContent);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery InsertAllRequest$RowToInsert]))

(defn *of
  "Creates a row to be inserted with associated id. Please notice that data for fields of type
   LegacySQLTypeName.BYTES must be provided as a base64 encoded string.

  id - id of the row, used to identify duplicates - `java.lang.String`
  content - the actual content of the row - `java.util.Map`

  returns: `com.google.cloud.bigquery.InsertAllRequest$RowToInsert`"
  (^com.google.cloud.bigquery.InsertAllRequest$RowToInsert [^java.lang.String id ^java.util.Map content]
    (InsertAllRequest$RowToInsert/of id content))
  (^com.google.cloud.bigquery.InsertAllRequest$RowToInsert [^java.util.Map content]
    (InsertAllRequest$RowToInsert/of content)))

(defn get-id
  "Returns the id associated with the row. Returns null if not set.

  returns: `java.lang.String`"
  (^java.lang.String [^InsertAllRequest$RowToInsert this]
    (-> this (.getId))))

(defn get-content
  "Returns the actual content of the row, as a map.

   The returned map is always immutable. Its iteration order is unspecified.

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^InsertAllRequest$RowToInsert this]
    (-> this (.getContent))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InsertAllRequest$RowToInsert this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InsertAllRequest$RowToInsert this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InsertAllRequest$RowToInsert this ^java.lang.Object obj]
    (-> this (.equals obj))))

