(ns com.google.cloud.bigquery.BigQuery
  "An interface for Google Cloud BigQuery."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery BigQuery]))

(defn get-job
  "Returns the requested job or null if not found. If the location of the job is not \"US\"
   or \"EU\", getJob(JobId, JobOption...) must be used instead.

   Example of getting a job.



   String jobName = \"my_job_name\";
   Job job = bigquery.getJob(jobName);
   if (job == null) {
     // job was not found
   }

  job-id - `java.lang.String`
  options - `com.google.cloud.bigquery.BigQuery$JobOption`

  returns: `com.google.cloud.bigquery.Job`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.Job [^BigQuery this ^java.lang.String job-id ^com.google.cloud.bigquery.BigQuery$JobOption options]
    (-> this (.getJob job-id options))))

(defn cancel
  "Sends a job cancel request. This call will return immediately. The job status can then be
   checked using either getJob(JobId, JobOption...) or getJob(String,
   JobOption...)).

   If the location of the job is not \"US\" or \"EU\", cancel(JobId) must be used instead.

   Example of cancelling a job.



   String jobName = \"my_job_name\";
   boolean success = bigquery.cancel(jobName);
   if (success) {
     // job was cancelled
   } else {
     // job was not found
   }

  job-id - `java.lang.String`

  returns: true if cancel was requested successfully, false if the job was not
       found - `boolean`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^Boolean [^BigQuery this ^java.lang.String job-id]
    (-> this (.cancel job-id))))

(defn delete
  "Deletes the requested dataset.

   Example of deleting a dataset from its id, even if non-empty.



   String datasetName = \"my_dataset_name\";
   boolean deleted = bigquery.delete(datasetName, DatasetDeleteOption.deleteContents());
   if (deleted) {
     // the dataset was deleted
   } else {
     // the dataset was not found
   }

  dataset-id - `java.lang.String`
  options - `com.google.cloud.bigquery.BigQuery$DatasetDeleteOption`

  returns: true if dataset was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^Boolean [^BigQuery this ^java.lang.String dataset-id ^com.google.cloud.bigquery.BigQuery$DatasetDeleteOption options]
    (-> this (.delete dataset-id options)))
  (^Boolean [^BigQuery this ^com.google.cloud.bigquery.TableId table-id]
    (-> this (.delete table-id))))

(defn query
  "Runs the query associated with the request, using the given JobId.

   If the location of the job is not \"US\" or \"EU\", the jobId must specify the job
   location.

   This method cannot be used in conjuction with QueryJobConfiguration.dryRun()
   queries. Since dry-run queries are not actually executed, there's no way to retrieve results.

   See query(QueryJobConfiguration, JobOption...) for examples on populating a QueryJobConfiguration.

  configuration - `com.google.cloud.bigquery.QueryJobConfiguration`
  job-id - `com.google.cloud.bigquery.JobId`
  options - `com.google.cloud.bigquery.BigQuery$JobOption`

  returns: `com.google.cloud.bigquery.TableResult`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.TableResult [^BigQuery this ^com.google.cloud.bigquery.QueryJobConfiguration configuration ^com.google.cloud.bigquery.JobId job-id ^com.google.cloud.bigquery.BigQuery$JobOption options]
    (-> this (.query configuration job-id options)))
  (^com.google.cloud.bigquery.TableResult [^BigQuery this ^com.google.cloud.bigquery.QueryJobConfiguration configuration ^com.google.cloud.bigquery.BigQuery$JobOption options]
    (-> this (.query configuration options))))

(defn get-dataset
  "Returns the requested dataset or null if not found.

   Example of getting a dataset.



   String datasetName = \"my_dataset\";
   Dataset dataset = bigquery.getDataset(datasetName);

  dataset-id - `java.lang.String`
  options - `com.google.cloud.bigquery.BigQuery$DatasetOption`

  returns: `com.google.cloud.bigquery.Dataset`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.Dataset [^BigQuery this ^java.lang.String dataset-id ^com.google.cloud.bigquery.BigQuery$DatasetOption options]
    (-> this (.getDataset dataset-id options))))

(defn update
  "Updates dataset information.

   Example of updating a dataset by changing its description.
   SNIPPET bigquery_update_table_description



   // String datasetName = \"my_dataset_name\";
   // String tableName = \"my_table_name\";
   // String newDescription = \"new_description\";

   Table beforeTable = bigquery.getTable(datasetName, tableName);
   TableInfo tableInfo = beforeTable.toBuilder()
       .setDescription(newDescription)
       .build();
   Table afterTable = bigquery.update(tableInfo);

   SNIPPET bigquery_update_table_description

  dataset-info - `com.google.cloud.bigquery.DatasetInfo`
  options - `com.google.cloud.bigquery.BigQuery$DatasetOption`

  returns: `com.google.cloud.bigquery.Dataset`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.Dataset [^BigQuery this ^com.google.cloud.bigquery.DatasetInfo dataset-info ^com.google.cloud.bigquery.BigQuery$DatasetOption options]
    (-> this (.update dataset-info options))))

(defn list-tables
  "Lists the tables in the dataset. This method returns partial information on each table: (TableInfo.getTableId(), TableInfo.getFriendlyName(), TableInfo.getGeneratedId() and type,
   which is part of TableInfo.getDefinition()). To get complete information use either getTable(TableId, TableOption...) or getTable(String, String, TableOption...).

   Example of listing the tables in a dataset, specifying the page size.



   String datasetName = \"my_dataset_name\";
   Page<Table> tables = bigquery.listTables(datasetName, TableListOption.pageSize(100));
   for (Table table : tables.iterateAll()) {
     // do something with the table
   }

  dataset-id - `java.lang.String`
  options - `com.google.cloud.bigquery.BigQuery$TableListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.bigquery.Table>`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.api.gax.paging.Page [^BigQuery this ^java.lang.String dataset-id ^com.google.cloud.bigquery.BigQuery$TableListOption options]
    (-> this (.listTables dataset-id options))))

(defn list-table-data
  "Lists the table's rows. If the schema is not null, it is available to the
   FieldValueList iterated over.

   Example of listing table rows with schema.



   String datasetName = \"my_dataset_name\";
   String tableName = \"my_table_name\";
   Schema schema = ...;
   String field = \"field\";
   TableResult tableData = bigquery.listTableData(datasetName, tableName, schema);
   for (FieldValueList row : tableData.iterateAll()) {
     row.get(field);
   }

  dataset-id - `java.lang.String`
  table-id - `java.lang.String`
  schema - `com.google.cloud.bigquery.Schema`
  options - `com.google.cloud.bigquery.BigQuery$TableDataListOption`

  returns: `com.google.cloud.bigquery.TableResult`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.TableResult [^BigQuery this ^java.lang.String dataset-id ^java.lang.String table-id ^com.google.cloud.bigquery.Schema schema ^com.google.cloud.bigquery.BigQuery$TableDataListOption options]
    (-> this (.listTableData dataset-id table-id schema options)))
  (^com.google.cloud.bigquery.TableResult [^BigQuery this ^java.lang.String dataset-id ^java.lang.String table-id ^com.google.cloud.bigquery.BigQuery$TableDataListOption options]
    (-> this (.listTableData dataset-id table-id options)))
  (^com.google.cloud.bigquery.TableResult [^BigQuery this ^com.google.cloud.bigquery.TableId table-id ^com.google.cloud.bigquery.BigQuery$TableDataListOption options]
    (-> this (.listTableData table-id options))))

(defn list-datasets
  "Lists the datasets in the provided project. This method returns partial information on each
   dataset: (DatasetInfo.getDatasetId(), DatasetInfo.getFriendlyName() and DatasetInfo.getGeneratedId()). To get complete information use either getDataset(String,
   DatasetOption...) or getDataset(DatasetId, DatasetOption...).

   Example of listing datasets in a project, specifying the page size.



   String projectId = \"my_project_id\";
   // List datasets in a specified project
   Page<Dataset> datasets = bigquery.listDatasets(projectId, DatasetListOption.pageSize(100));
   for (Dataset dataset : datasets.iterateAll()) {
     // do something with the dataset
   }

  project-id - `java.lang.String`
  options - `com.google.cloud.bigquery.BigQuery$DatasetListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.bigquery.Dataset>`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.api.gax.paging.Page [^BigQuery this ^java.lang.String project-id ^com.google.cloud.bigquery.BigQuery$DatasetListOption options]
    (-> this (.listDatasets project-id options)))
  (^com.google.api.gax.paging.Page [^BigQuery this ^com.google.cloud.bigquery.BigQuery$DatasetListOption options]
    (-> this (.listDatasets options))))

(defn list-partitions
  "table-id - `com.google.cloud.bigquery.TableId`

  returns: A list of the partition ids present in the partitioned table - `java.util.List<java.lang.String>`"
  (^java.util.List [^BigQuery this ^com.google.cloud.bigquery.TableId table-id]
    (-> this (.listPartitions table-id))))

(defn get-routine
  "Returns the requested routine or null if not found.

  dataset-id - `java.lang.String`
  routine-id - `java.lang.String`
  options - `com.google.cloud.bigquery.BigQuery$RoutineOption`

  returns: `com.google.cloud.bigquery.Routine`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.Routine [^BigQuery this ^java.lang.String dataset-id ^java.lang.String routine-id ^com.google.cloud.bigquery.BigQuery$RoutineOption options]
    (-> this (.getRoutine dataset-id routine-id options)))
  (^com.google.cloud.bigquery.Routine [^BigQuery this ^com.google.cloud.bigquery.RoutineId routine-id ^com.google.cloud.bigquery.BigQuery$RoutineOption options]
    (-> this (.getRoutine routine-id options))))

(defn list-jobs
  "Lists the jobs.

   Example of listing jobs, specifying the page size.



   Page<Job> jobs = bigquery.listJobs(JobListOption.pageSize(100));
   for (Job job : jobs.iterateAll()) {
     // do something with the job
   }

  options - `com.google.cloud.bigquery.BigQuery$JobListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.bigquery.Job>`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.api.gax.paging.Page [^BigQuery this ^com.google.cloud.bigquery.BigQuery$JobListOption options]
    (-> this (.listJobs options))))

(defn writer
  "Returns a channel to write data to be inserted into a BigQuery table. Data format and other
   options can be configured using the WriteChannelConfiguration parameter. If the job is
   not in \"US\" or \"EU\", the jobId must contain the location of the job.

   Example of creating a channel with which to write to a table.



   String datasetName = \"my_dataset_name\";
   String tableName = \"my_table_name\";
   String csvData = \"StringValue1\\nStringValue2\\n\";
   String location = \"us\";
   TableId tableId = TableId.of(datasetName, tableName);
   WriteChannelConfiguration writeChannelConfiguration =
       WriteChannelConfiguration.newBuilder(tableId).setFormatOptions(FormatOptions.csv()).build();
   // The location must be specified; other fields can be auto-detected.
   JobId jobId = JobId.newBuilder().setLocation(location).build();
   TableDataWriteChannel writer = bigquery.writer(jobId, writeChannelConfiguration);
   // Write data to writer
   try {
     writer.write(ByteBuffer.wrap(csvData.getBytes(Charsets.UTF_8)));
   } finally {
     writer.close();
   }
   // Get load job
   Job job = writer.getJob();
   job = job.waitFor();
   LoadStatistics stats = job.getStatistics();
   return stats.getOutputRows();

  job-id - `com.google.cloud.bigquery.JobId`
  write-channel-configuration - `com.google.cloud.bigquery.WriteChannelConfiguration`

  returns: `com.google.cloud.bigquery.TableDataWriteChannel`"
  (^com.google.cloud.bigquery.TableDataWriteChannel [^BigQuery this ^com.google.cloud.bigquery.JobId job-id ^com.google.cloud.bigquery.WriteChannelConfiguration write-channel-configuration]
    (-> this (.writer job-id write-channel-configuration)))
  (^com.google.cloud.bigquery.TableDataWriteChannel [^BigQuery this ^com.google.cloud.bigquery.WriteChannelConfiguration write-channel-configuration]
    (-> this (.writer write-channel-configuration))))

(defn insert-all
  "Sends an insert all request.

   Example of inserting rows into a table without running a load job.



   String datasetName = \"my_dataset_name\";
   String tableName = \"my_table_name\";
   TableId tableId = TableId.of(datasetName, tableName);
   // Values of the row to insert
   Map<String, Object> rowContent = new HashMap<>();
   rowContent.put(\"booleanField\", true);
   // Bytes are passed in base64
   rowContent.put(\"bytesField\", \"Cg0NDg0=\"); // 0xA, 0xD, 0xD, 0xE, 0xD in base64
   // Records are passed as a map
   Map<String, Object> recordsContent = new HashMap<>();
   recordsContent.put(\"stringField\", \"Hello, World!\");
   rowContent.put(\"recordField\", recordsContent);
   InsertAllResponse response =
       bigquery.insertAll(
           InsertAllRequest.newBuilder(tableId)
               .addRow(\"rowId\", rowContent)
               // More rows can be added in the same RPC by invoking .addRow() on the builder
               .build());
   if (response.hasErrors()) {
     // If any of the insertions failed, this lets you inspect the errors
     for (Entry<Long, List<BigQueryError>> entry : response.getInsertErrors().entrySet()) {
       // inspect row error
     }
   }

  request - `com.google.cloud.bigquery.InsertAllRequest`

  returns: `com.google.cloud.bigquery.InsertAllResponse`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.InsertAllResponse [^BigQuery this ^com.google.cloud.bigquery.InsertAllRequest request]
    (-> this (.insertAll request))))

(defn get-query-results
  "Returns results of the query associated with the provided job.

   Users are encouraged to use Job#getQueryResults(QueryResultsOption...) instead.

  job-id - `com.google.cloud.bigquery.JobId`
  options - `com.google.cloud.bigquery.BigQuery$QueryResultsOption`

  returns: `com.google.cloud.bigquery.QueryResponse`"
  (^com.google.cloud.bigquery.QueryResponse [^BigQuery this ^com.google.cloud.bigquery.JobId job-id ^com.google.cloud.bigquery.BigQuery$QueryResultsOption options]
    (-> this (.getQueryResults job-id options))))

(defn list-routines
  "Lists the routines in the specified dataset.

  dataset-id - `java.lang.String`
  options - `com.google.cloud.bigquery.BigQuery$RoutineListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.bigquery.Routine>`"
  (^com.google.api.gax.paging.Page [^BigQuery this ^java.lang.String dataset-id ^com.google.cloud.bigquery.BigQuery$RoutineListOption options]
    (-> this (.listRoutines dataset-id options))))

(defn create
  "Creates a new dataset.

   Example of creating a dataset.



   String datasetName = \"my_dataset_name\";
   Dataset dataset = null;
   DatasetInfo datasetInfo = DatasetInfo.newBuilder(datasetName).build();
   try {
     // the dataset was created
     dataset = bigquery.create(datasetInfo);
   } catch (BigQueryException e) {
     // the dataset was not created
   }

  dataset-info - `com.google.cloud.bigquery.DatasetInfo`
  options - `com.google.cloud.bigquery.BigQuery$DatasetOption`

  returns: `com.google.cloud.bigquery.Dataset`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.Dataset [^BigQuery this ^com.google.cloud.bigquery.DatasetInfo dataset-info ^com.google.cloud.bigquery.BigQuery$DatasetOption options]
    (-> this (.create dataset-info options))))

(defn get-table
  "Returns the requested table or null if not found.

   Example of getting a table.



   String datasetName = \"my_dataset_name\";
   String tableName = \"my_table_name\";
   Table table = bigquery.getTable(datasetName, tableName);

  dataset-id - `java.lang.String`
  table-id - `java.lang.String`
  options - `com.google.cloud.bigquery.BigQuery$TableOption`

  returns: `com.google.cloud.bigquery.Table`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.Table [^BigQuery this ^java.lang.String dataset-id ^java.lang.String table-id ^com.google.cloud.bigquery.BigQuery$TableOption options]
    (-> this (.getTable dataset-id table-id options)))
  (^com.google.cloud.bigquery.Table [^BigQuery this ^com.google.cloud.bigquery.TableId table-id ^com.google.cloud.bigquery.BigQuery$TableOption options]
    (-> this (.getTable table-id options))))

(defn get-model
  "Returns the requested model or null if not found.

  dataset-id - `java.lang.String`
  model-id - `java.lang.String`
  options - `com.google.cloud.bigquery.BigQuery$ModelOption`

  returns: `com.google.cloud.bigquery.Model`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.bigquery.Model [^BigQuery this ^java.lang.String dataset-id ^java.lang.String model-id ^com.google.cloud.bigquery.BigQuery$ModelOption options]
    (-> this (.getModel dataset-id model-id options)))
  (^com.google.cloud.bigquery.Model [^BigQuery this ^com.google.cloud.bigquery.ModelId table-id ^com.google.cloud.bigquery.BigQuery$ModelOption options]
    (-> this (.getModel table-id options))))

(defn list-models
  "Lists the models in the dataset.

  dataset-id - `java.lang.String`
  options - `com.google.cloud.bigquery.BigQuery$ModelListOption`

  returns: `com.google.api.gax.paging.Page<com.google.cloud.bigquery.Model>`"
  (^com.google.api.gax.paging.Page [^BigQuery this ^java.lang.String dataset-id ^com.google.cloud.bigquery.BigQuery$ModelListOption options]
    (-> this (.listModels dataset-id options))))

