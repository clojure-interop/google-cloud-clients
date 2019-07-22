(ns com.google.cloud.bigquery.InsertAllRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery InsertAllRequest$Builder]))

(defn set-table
  "Sets the destination table for rows insert request.

  table - `com.google.cloud.bigquery.TableId`

  returns: `com.google.cloud.bigquery.InsertAllRequest$Builder`"
  (^com.google.cloud.bigquery.InsertAllRequest$Builder [^InsertAllRequest$Builder this ^com.google.cloud.bigquery.TableId table]
    (-> this (.setTable table))))

(defn set-rows
  "Sets the rows to insert as a list of InsertAllRequest.RowToInsert objects.

  rows - `java.lang.Iterable`

  returns: `com.google.cloud.bigquery.InsertAllRequest$Builder`"
  (^com.google.cloud.bigquery.InsertAllRequest$Builder [^InsertAllRequest$Builder this ^java.lang.Iterable rows]
    (-> this (.setRows rows))))

(defn add-row
  "Adds a row to be inserted with associated id. Please notice that data for fields of type
   LegacySQLTypeName.BYTES must be provided as a base64 encoded string.

   Example usage of adding a row with associated id:



   InsertAllRequest.Builder builder = InsertAllRequest.builder(tableId);
   List<Long> repeatedFieldValue = Arrays.asList(1L, 2L);
   Map<String, Object> recordContent = new HashMap<String, Object>();
   recordContent.put(\"subfieldName1\", \"value\");
   recordContent.put(\"subfieldName2\", repeatedFieldValue);
   Map<String, Object> rowContent = new HashMap<String, Object>();
   rowContent.put(\"booleanFieldName\", true);
   rowContent.put(\"bytesFieldName\", \"DQ4KDQ==\");
   rowContent.put(\"recordFieldName\", recordContent);
   builder.addRow(\"rowId\", rowContent);

  id - `java.lang.String`
  content - `java.util.Map`

  returns: `com.google.cloud.bigquery.InsertAllRequest$Builder`"
  (^com.google.cloud.bigquery.InsertAllRequest$Builder [^InsertAllRequest$Builder this ^java.lang.String id ^java.util.Map content]
    (-> this (.addRow id content)))
  (^com.google.cloud.bigquery.InsertAllRequest$Builder [^InsertAllRequest$Builder this ^com.google.cloud.bigquery.InsertAllRequest$RowToInsert row-to-insert]
    (-> this (.addRow row-to-insert))))

(defn set-skip-invalid-rows
  "Sets whether to insert all valid rows of a request, even if invalid rows exist. If not set
   the entire insert request will fail if it contains an invalid row.

  skip-invalid-rows - `boolean`

  returns: `com.google.cloud.bigquery.InsertAllRequest$Builder`"
  (^com.google.cloud.bigquery.InsertAllRequest$Builder [^InsertAllRequest$Builder this ^Boolean skip-invalid-rows]
    (-> this (.setSkipInvalidRows skip-invalid-rows))))

(defn set-ignore-unknown-values
  "Sets whether to accept rows that contain values that do not match the schema. The unknown
   values are ignored. If not set, rows with unknown values are considered to be invalid.

  ignore-unknown-values - `boolean`

  returns: `com.google.cloud.bigquery.InsertAllRequest$Builder`"
  (^com.google.cloud.bigquery.InsertAllRequest$Builder [^InsertAllRequest$Builder this ^Boolean ignore-unknown-values]
    (-> this (.setIgnoreUnknownValues ignore-unknown-values))))

(defn set-template-suffix
  "If specified, the destination table is treated as a base template. Rows are inserted into an
   instance table named \"{destination}{templateSuffix}\". BigQuery will manage the creation of
   the instance table, using the schema of the base template table. Table creation might take
   some time. To obtain table's information after BigQuery.insertAll(InsertAllRequest)
   is called use:



   String suffixTableId = ...;
   TableInfo suffixTable = bigquery.getTable(DATASET, suffixTableId);
   while (suffixTable == null) {
     Thread.sleep(1000L);
     suffixTable = bigquery.getTable(DATASET, suffixTableId);
   }

  template-suffix - `java.lang.String`

  returns: `com.google.cloud.bigquery.InsertAllRequest$Builder`"
  (^com.google.cloud.bigquery.InsertAllRequest$Builder [^InsertAllRequest$Builder this ^java.lang.String template-suffix]
    (-> this (.setTemplateSuffix template-suffix))))

(defn build
  "Creates an InsertAllRequest object.

  returns: `com.google.cloud.bigquery.InsertAllRequest`"
  (^com.google.cloud.bigquery.InsertAllRequest [^InsertAllRequest$Builder this]
    (-> this (.build))))

