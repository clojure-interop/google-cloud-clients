(ns com.google.cloud.bigquery.spi.v2.BigQueryRpc
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.spi.v2 BigQueryRpc]))

(defn delete-routine
  "Deletes the requested routine.

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  routine-id - `java.lang.String`

  returns: true if routine was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^Boolean [^BigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.lang.String routine-id]
    (-> this (.deleteRoutine project-id dataset-id routine-id))))

(defn get-job
  "Returns the requested job or null if not found.

  project-id - `java.lang.String`
  job-id - `java.lang.String`
  location - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.Job`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.api.services.bigquery.model.Job [^BigQueryRpc this ^java.lang.String project-id ^java.lang.String job-id ^java.lang.String location ^java.util.Map options]
    (-> this (.getJob project-id job-id location options))))

(defn cancel
  "Sends a job cancel request. This call will return immediately, and the client will need to poll
   for the job status to see if the cancel completed successfully.

  project-id - `java.lang.String`
  job-id - `java.lang.String`
  location - `java.lang.String`

  returns: true if cancel was requested successfully, false if the job was not
       found - `boolean`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^Boolean [^BigQueryRpc this ^java.lang.String project-id ^java.lang.String job-id ^java.lang.String location]
    (-> this (.cancel project-id job-id location))))

(defn get-dataset
  "Returns the requested dataset or null if not found.

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.Dataset`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.api.services.bigquery.model.Dataset [^BigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.util.Map options]
    (-> this (.getDataset project-id dataset-id options))))

(defn update
  "Updates the requested routine.

  routine - `com.google.api.services.bigquery.model.Routine`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.Routine`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.api.services.bigquery.model.Routine [^BigQueryRpc this ^com.google.api.services.bigquery.model.Routine routine ^java.util.Map options]
    (-> this (.update routine options))))

(defn list-tables
  "Lists the dataset's tables, keyed by page token. Partial information is returned on a table
   (tableReference, friendlyName, id and type). To get full information use getTable(String, String, String, Map).

  project-id - `java.lang.String`
  dataset - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.bigquery.model.Table>>`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.Tuple [^BigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset ^java.util.Map options]
    (-> this (.listTables project-id dataset options))))

(defn list-table-data
  "Lists the table's rows.

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  table-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.TableDataList`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.api.services.bigquery.model.TableDataList [^BigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.lang.String table-id ^java.util.Map options]
    (-> this (.listTableData project-id dataset-id table-id options))))

(defn delete-table
  "Delete the requested table.

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  table-id - `java.lang.String`

  returns: true if table was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^Boolean [^BigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.lang.String table-id]
    (-> this (.deleteTable project-id dataset-id table-id))))

(defn list-datasets
  "Lists the provided project's datasets, keyed by page token. Partial information is returned on
   a dataset (datasetReference, friendlyName and id). To get full information use getDataset(String, String, Map).

  project-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.bigquery.model.Dataset>>`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.Tuple [^BigQueryRpc this ^java.lang.String project-id ^java.util.Map options]
    (-> this (.listDatasets project-id options))))

(defn patch
  "Updates dataset information.

  dataset - `com.google.api.services.bigquery.model.Dataset`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.Dataset`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.api.services.bigquery.model.Dataset [^BigQueryRpc this ^com.google.api.services.bigquery.model.Dataset dataset ^java.util.Map options]
    (-> this (.patch dataset options))))

(defn get-routine
  "Returns the requested routine or null if not found.

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  routine-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.Routine`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.api.services.bigquery.model.Routine [^BigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.lang.String routine-id ^java.util.Map options]
    (-> this (.getRoutine project-id dataset-id routine-id options))))

(defn list-jobs
  "Lists the project's jobs.

  project-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.bigquery.model.Job>>`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.Tuple [^BigQueryRpc this ^java.lang.String project-id ^java.util.Map options]
    (-> this (.listJobs project-id options))))

(defn insert-all
  "Sends an insert all request.

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  table-id - `java.lang.String`
  request - `com.google.api.services.bigquery.model.TableDataInsertAllRequest`

  returns: `com.google.api.services.bigquery.model.TableDataInsertAllResponse`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.api.services.bigquery.model.TableDataInsertAllResponse [^BigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.lang.String table-id ^com.google.api.services.bigquery.model.TableDataInsertAllRequest request]
    (-> this (.insertAll project-id dataset-id table-id request))))

(defn delete-model
  "Delete the requested model.

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  model-id - `java.lang.String`

  returns: true if model was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^Boolean [^BigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.lang.String model-id]
    (-> this (.deleteModel project-id dataset-id model-id))))

(defn get-query-results
  "Returns results of the query associated with the provided job.

  project-id - `java.lang.String`
  job-id - `java.lang.String`
  location - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.GetQueryResultsResponse`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.api.services.bigquery.model.GetQueryResultsResponse [^BigQueryRpc this ^java.lang.String project-id ^java.lang.String job-id ^java.lang.String location ^java.util.Map options]
    (-> this (.getQueryResults project-id job-id location options))))

(defn list-routines
  "project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.bigquery.model.Routine>>`"
  (^com.google.cloud.Tuple [^BigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.util.Map options]
    (-> this (.listRoutines project-id dataset-id options))))

(defn create
  "Creates a new dataset.

  dataset - `com.google.api.services.bigquery.model.Dataset`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.Dataset`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.api.services.bigquery.model.Dataset [^BigQueryRpc this ^com.google.api.services.bigquery.model.Dataset dataset ^java.util.Map options]
    (-> this (.create dataset options))))

(defn get-table
  "Returns the requested table or null if not found.

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  table-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.Table`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.api.services.bigquery.model.Table [^BigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.lang.String table-id ^java.util.Map options]
    (-> this (.getTable project-id dataset-id table-id options))))

(defn get-model
  "Returns the requested model or null if not found.

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  model-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.Model`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.api.services.bigquery.model.Model [^BigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.lang.String model-id ^java.util.Map options]
    (-> this (.getModel project-id dataset-id model-id options))))

(defn open
  "Opens a resumable upload session to load data into a BigQuery table and returns an upload URI.

  job - load job - `com.google.api.services.bigquery.model.Job`

  returns: `java.lang.String`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^java.lang.String [^BigQueryRpc this ^com.google.api.services.bigquery.model.Job job]
    (-> this (.open job))))

(defn write
  "Uploads the provided data to the resumable upload session at the specified position. This
   method returns the job created to insert the rows, only when last is true.

  upload-id - the resumable upload session URI - `java.lang.String`
  to-write - a byte array of data to upload - `byte[]`
  to-write-offset - offset in the toWrite param to start writing from - `int`
  dest-offset - offset in the destination where to upload data to - `long`
  length - the number of bytes to upload - `int`
  last - true indicates that the last chunk is being uploaded - `boolean`

  returns: returns the job created to insert the rows, only when last is true.
       Returns null otherwise - `com.google.api.services.bigquery.model.Job`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.api.services.bigquery.model.Job [^BigQueryRpc this ^java.lang.String upload-id to-write ^Integer to-write-offset ^Long dest-offset ^Integer length ^Boolean last]
    (-> this (.write upload-id to-write to-write-offset dest-offset length last))))

(defn delete-dataset
  "Delete the requested dataset.

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  options - `java.util.Map`

  returns: true if dataset was deleted, false if it was not found - `boolean`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^Boolean [^BigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.util.Map options]
    (-> this (.deleteDataset project-id dataset-id options))))

(defn list-models
  "Lists the dataset's models, keyed by page token.

  project-id - `java.lang.String`
  dataset - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.bigquery.model.Model>>`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^com.google.cloud.Tuple [^BigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset ^java.util.Map options]
    (-> this (.listModels project-id dataset options))))

