(ns com.google.cloud.bigquery.Dataset
  "A Google BigQuery Dataset.

  Objects of this class are immutable. Operations that modify the dataset like update(com.google.cloud.bigquery.BigQuery.DatasetOption...)
  return a new object. To get a Dataset object with the most recent information use reload(com.google.cloud.bigquery.BigQuery.DatasetOption...). Dataset adds a layer of service-related functionality over DatasetInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Dataset]))

(defn list
  "Returns the paginated list of tables in this dataset.

   Example of listing tables in the dataset.



   Page<Table> tables = dataset.list();
   for (Table table : tables.iterateAll()) {
     // do something with the table
   }

  options - options for listing tables - `com.google.cloud.bigquery.BigQuery$TableListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.bigquery.Table>`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.api.gax.paging.Page [^Dataset this ^com.google.cloud.bigquery.BigQuery$TableListOption options]
    (-> this (.list options))))

(defn delete
  "Deletes this dataset.

   Example of deleting a dataset.



   boolean deleted = dataset.delete();
   if (deleted) {
     // The dataset was deleted
   } else {
     // The dataset was not found
   }

  options - `com.google.cloud.bigquery.BigQuery$DatasetDeleteOption`

  returns: true if dataset was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^Boolean [^Dataset this ^com.google.cloud.bigquery.BigQuery$DatasetDeleteOption options]
    (-> this (.delete options))))

(defn update
  "Updates the dataset's information with this dataset's information. Dataset's user-defined id
   cannot be changed. A new Dataset object is returned.

   Example of updating a dataset.



   String friendlyName = \"my_friendly_name\";
   Builder builder = dataset.toBuilder();
   builder.setFriendlyName(friendlyName);
   Dataset updatedDataset = builder.build().update();

  options - dataset options - `com.google.cloud.bigquery.BigQuery$DatasetOption`

  returns: a Dataset object with updated information - `com.google.cloud.bigquery.Dataset`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.Dataset [^Dataset this ^com.google.cloud.bigquery.BigQuery$DatasetOption options]
    (-> this (.update options))))

(defn reload
  "Fetches current dataset's latest information. Returns null if the dataset does not
   exist.

   Example of reloading a dataset.



   Dataset latestDataset = dataset.reload();
   if (latestDataset == null) {
     // The dataset was not found
   }

  options - dataset options - `com.google.cloud.bigquery.BigQuery$DatasetOption`

  returns: a Dataset object with latest information or null if not found - `com.google.cloud.bigquery.Dataset`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.Dataset [^Dataset this ^com.google.cloud.bigquery.BigQuery$DatasetOption options]
    (-> this (.reload options))))

(defn create
  "Creates a new table in this dataset.

   Example of creating a table in the dataset with schema and time partitioning.



   String tableName = “my_table”;
   String fieldName = “my_field”;
   Schema schema = Schema.of(Field.of(fieldName, LegacySQLTypeName.STRING));
   StandardTableDefinition definition = StandardTableDefinition.newBuilder()
       .setSchema(schema)
       .setTimePartitioning(TimePartitioning.of(TimePartitioning.Type.DAY))
       .build();
   Table table = dataset.create(tableName, definition);

  table-id - the table's user-defined id - `java.lang.String`
  definition - the table's definition - `com.google.cloud.bigquery.TableDefinition`
  options - options for table creation - `com.google.cloud.bigquery.BigQuery$TableOption`

  returns: a Table object for the created table - `com.google.cloud.bigquery.Table`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.Table [^Dataset this ^java.lang.String table-id ^com.google.cloud.bigquery.TableDefinition definition ^com.google.cloud.bigquery.BigQuery$TableOption options]
    (-> this (.create table-id definition options))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Dataset this]
    (-> this (.hashCode))))

(defn get-big-query
  "Returns the dataset's BigQuery object used to issue requests.

  returns: `com.google.cloud.bigquery.BigQuery`"
  (^com.google.cloud.bigquery.BigQuery [^Dataset this]
    (-> this (.getBigQuery))))

(defn exists?
  "Checks if this dataset exists.

   Example of checking whether a dataset exists.



   boolean exists = dataset.exists();
   if (exists) {
     // the dataset exists
   } else {
     // the dataset was not found
   }

  returns: true if this dataset exists, false otherwise - `boolean`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^Boolean [^Dataset this]
    (-> this (.exists))))

(defn get
  "Returns the requested table in this dataset or null if not found.

   Example of getting a table in the dataset.



   String tableName = “my_table”;
   Table table = dataset.get(tableName);

  table-id - user-defined id of the requested table - `java.lang.String`
  options - table options - `com.google.cloud.bigquery.BigQuery$TableOption`

  returns: `com.google.cloud.bigquery.Table`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.Table [^Dataset this ^java.lang.String table-id ^com.google.cloud.bigquery.BigQuery$TableOption options]
    (-> this (.get table-id options))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Dataset this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "Description copied from class: DatasetInfo

  returns: `com.google.cloud.bigquery.Dataset$Builder`"
  (^com.google.cloud.bigquery.Dataset$Builder [^Dataset this]
    (-> this (.toBuilder))))

