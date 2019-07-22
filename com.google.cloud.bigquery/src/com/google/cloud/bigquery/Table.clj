(ns com.google.cloud.bigquery.Table
  "A Google BigQuery Table.

  Objects of this class are immutable. Operations that modify the table like update(com.google.cloud.bigquery.BigQuery.TableOption...)
  return a new object. To get a Table object with the most recent information use reload(com.google.cloud.bigquery.BigQuery.TableOption...). Table adds a layer of service-related functionality over TableInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Table]))

(defn list
  "Returns the paginated list rows in this table.

   Example of listing rows in the table given a schema.



   Schema schema = ...;
   String field = \"my_field\";
   Page<FieldValueList> page = table.list(schema);
   for (FieldValueList row : page.iterateAll()) {
     row.get(field);
   }

  schema - `com.google.cloud.bigquery.Schema`
  options - table data list options - `com.google.cloud.bigquery.BigQuery$TableDataListOption`

  returns: `com.google.cloud.bigquery.TableResult`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.TableResult [^Table this ^com.google.cloud.bigquery.Schema schema ^com.google.cloud.bigquery.BigQuery$TableDataListOption options]
    (-> this (.list schema options)))
  (^com.google.cloud.bigquery.TableResult [^Table this ^com.google.cloud.bigquery.BigQuery$TableDataListOption options]
    (-> this (.list options))))

(defn copy
  "Starts a BigQuery Job to copy the current table to the provided destination table. Returns the
   started Job object.

   Example of copying the table to a destination table.



   String datasetName = \"my_dataset\";
   String tableName = \"my_destination_table\";
   Job job = table.copy(datasetName, tableName);
   // Wait for the job to complete.
   try {
     Job completedJob = job.waitFor(RetryOption.initialRetryDelay(Duration.ofSeconds(1)),
         RetryOption.totalTimeout(Duration.ofMinutes(3)));
     if (completedJob != null && completedJob.getStatus().getError() == null) {
       // Job completed successfully
     } else {
       // Handle error case
     }
   } catch (InterruptedException e) {
     // Handle interrupted wait
   }

  destination-dataset - the user-defined id of the destination dataset - `java.lang.String`
  destination-table - the user-defined id of the destination table - `java.lang.String`
  options - job options - `com.google.cloud.bigquery.BigQuery$JobOption`

  returns: `com.google.cloud.bigquery.Job`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.Job [^Table this ^java.lang.String destination-dataset ^java.lang.String destination-table ^com.google.cloud.bigquery.BigQuery$JobOption options]
    (-> this (.copy destination-dataset destination-table options)))
  (^com.google.cloud.bigquery.Job [^Table this ^com.google.cloud.bigquery.TableId destination-table ^com.google.cloud.bigquery.BigQuery$JobOption options]
    (-> this (.copy destination-table options))))

(defn delete
  "Deletes this table.

   Example of deleting the table.



   boolean deleted = table.delete();
   if (deleted) {
     // the table was deleted
   } else {
     // the table was not found
   }

  returns: true if table was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^Boolean [^Table this]
    (-> this (.delete))))

(defn load
  "Starts a BigQuery Job to load data into the current table from the provided source URI. Returns
   the started Job object.

   Example loading data from a single Google Cloud Storage file.



   String sourceUri = \"gs://my_bucket/filename.csv\";
   Job job = table.load(FormatOptions.csv(), sourceUri);
   // Wait for the job to complete
   try {
     Job completedJob = job.waitFor(RetryOption.initialRetryDelay(Duration.ofSeconds(1)),
               RetryOption.totalTimeout(Duration.ofMinutes(3)));
     if (completedJob != null && completedJob.getStatus().getError() == null) {
       // Job completed successfully
     } else {
       // Handle error case
     }
   } catch (InterruptedException e) {
     // Handle interrupted wait
   }

  format - the format of the data to load - `com.google.cloud.bigquery.FormatOptions`
  source-uri - the fully-qualified Google Cloud Storage URI (e.g. gs://bucket/path) from which to load the data - `java.lang.String`
  options - job options - `com.google.cloud.bigquery.BigQuery$JobOption`

  returns: `com.google.cloud.bigquery.Job`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.Job [^Table this ^com.google.cloud.bigquery.FormatOptions format ^java.lang.String source-uri ^com.google.cloud.bigquery.BigQuery$JobOption options]
    (-> this (.load format source-uri options))))

(defn update
  "Updates the table's information with this table's information. Dataset's and table's
   user-defined ids cannot be changed. A new Table object is returned.

   Example of updating the table's information.



   Table updatedTable = table.toBuilder().setDescription(\"new description\").build().update();

  options - dataset options - `com.google.cloud.bigquery.BigQuery$TableOption`

  returns: a Table object with updated information - `com.google.cloud.bigquery.Table`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.Table [^Table this ^com.google.cloud.bigquery.BigQuery$TableOption options]
    (-> this (.update options))))

(defn extract
  "Starts a BigQuery Job to extract the current table to the provided destination URI. Returns the
   started Job object.

   Example extracting data to single Google Cloud Storage file.



   String format = \"CSV\";
   String gcsUrl = \"gs://my_bucket/filename.csv\";
   Job job = table.extract(format, gcsUrl);
   // Wait for the job to complete
   try {
     Job completedJob = job.waitFor(RetryOption.initialRetryDelay(Duration.ofSeconds(1)),
         RetryOption.totalTimeout(Duration.ofMinutes(3)));
     if (completedJob != null && completedJob.getStatus().getError() == null) {
       // Job completed successfully
     } else {
       // Handle error case
     }
   } catch (InterruptedException e) {
     // Handle interrupted wait
   }

  format - the format of the extracted data - `java.lang.String`
  destination-uri - the fully-qualified Google Cloud Storage URI (e.g. gs://bucket/path) where the extracted table should be written - `java.lang.String`
  options - job options - `com.google.cloud.bigquery.BigQuery$JobOption`

  returns: `com.google.cloud.bigquery.Job`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.Job [^Table this ^java.lang.String format ^java.lang.String destination-uri ^com.google.cloud.bigquery.BigQuery$JobOption options]
    (-> this (.extract format destination-uri options))))

(defn reload
  "Fetches current table's latest information. Returns null if the table does not exist.

   Example of fetching the table's latest information, specifying particular table fields to
   get.



   TableField field1 = TableField.LAST_MODIFIED_TIME;
   TableField field2 = TableField.NUM_ROWS;
   Table latestTable = table.reload(TableOption.fields(field1, field2));
   if (latestTable == null) {
     // the table was not found
   }

  options - table options - `com.google.cloud.bigquery.BigQuery$TableOption`

  returns: a Table object with latest information or null if not found - `com.google.cloud.bigquery.Table`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.Table [^Table this ^com.google.cloud.bigquery.BigQuery$TableOption options]
    (-> this (.reload options))))

(defn insert
  "Insert rows into the table.

   Streaming inserts reside temporarily in the streaming buffer, which has different
   availability characteristics than managed storage. Certain operations do not interact with the
   streaming buffer, such as #list(TableDataListOption...) and #copy(TableId,
   JobOption...). As such, recent streaming data will not be present in the destination table or
   output.

   Example of inserting rows into the table, ignoring invalid rows.



   String rowId1 = \"rowId1\";
   String rowId2 = \"rowId2\";
   List<RowToInsert> rows = new ArrayList<>();
   Map<String, Object> row1 = new HashMap<>();
   row1.put(\"stringField\", 1);
   row1.put(\"booleanField\", true);
   Map<String, Object> row2 = new HashMap<>();
   row2.put(\"stringField\", \"value2\");
   row2.put(\"booleanField\", false);
   rows.add(RowToInsert.of(rowId1, row1));
   rows.add(RowToInsert.of(rowId2, row2));
   InsertAllResponse response = table.insert(rows, true, true);
   // do something with response

  rows - rows to be inserted - `java.lang.Iterable`
  skip-invalid-rows - whether to insert all valid rows, even if invalid rows exist. If not set the entire insert operation will fail if rows to be inserted contain an invalid row - `boolean`
  ignore-unknown-values - whether to accept rows that contain values that do not match the schema. The unknown values are ignored. If not set, rows with unknown values are considered to be invalid - `boolean`

  returns: `com.google.cloud.bigquery.InsertAllResponse`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.InsertAllResponse [^Table this ^java.lang.Iterable rows ^Boolean skip-invalid-rows ^Boolean ignore-unknown-values]
    (-> this (.insert rows skip-invalid-rows ignore-unknown-values)))
  (^com.google.cloud.bigquery.InsertAllResponse [^Table this ^java.lang.Iterable rows]
    (-> this (.insert rows))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Table this]
    (-> this (.hashCode))))

(defn get-big-query
  "Returns the table's BigQuery object used to issue requests.

  returns: `com.google.cloud.bigquery.BigQuery`"
  (^com.google.cloud.bigquery.BigQuery [^Table this]
    (-> this (.getBigQuery))))

(defn exists?
  "Checks if this table exists.

   Example of checking if the table exists.



   boolean exists = table.exists();
   if (exists) {
     // the table exists
   } else {
     // the table was not found
   }

  returns: true if this table exists, false otherwise - `boolean`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^Boolean [^Table this]
    (-> this (.exists))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Table this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "Description copied from class: TableInfo

  returns: `com.google.cloud.bigquery.Table$Builder`"
  (^com.google.cloud.bigquery.Table$Builder [^Table this]
    (-> this (.toBuilder))))

