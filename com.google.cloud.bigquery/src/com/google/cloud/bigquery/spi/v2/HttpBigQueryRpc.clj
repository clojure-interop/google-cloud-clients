(ns com.google.cloud.bigquery.spi.v2.HttpBigQueryRpc
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.spi.v2 HttpBigQueryRpc]))

(defn ->http-big-query-rpc
  "Constructor.

  options - `com.google.cloud.bigquery.BigQueryOptions`"
  (^HttpBigQueryRpc [^com.google.cloud.bigquery.BigQueryOptions options]
    (new HttpBigQueryRpc options)))

(def *-default-projection
  "Static Constant.

  type: java.lang.String"
  HttpBigQueryRpc/DEFAULT_PROJECTION)

(defn delete-routine
  "Description copied from interface: BigQueryRpc

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  routine-id - `java.lang.String`

  returns: true if routine was deleted, false if it was not found - `boolean`"
  (^Boolean [^HttpBigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.lang.String routine-id]
    (-> this (.deleteRoutine project-id dataset-id routine-id))))

(defn get-job
  "Description copied from interface: BigQueryRpc

  project-id - `java.lang.String`
  job-id - `java.lang.String`
  location - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.Job`"
  (^com.google.api.services.bigquery.model.Job [^HttpBigQueryRpc this ^java.lang.String project-id ^java.lang.String job-id ^java.lang.String location ^java.util.Map options]
    (-> this (.getJob project-id job-id location options))))

(defn cancel
  "Description copied from interface: BigQueryRpc

  project-id - `java.lang.String`
  job-id - `java.lang.String`
  location - `java.lang.String`

  returns: true if cancel was requested successfully, false if the job was not
       found - `boolean`"
  (^Boolean [^HttpBigQueryRpc this ^java.lang.String project-id ^java.lang.String job-id ^java.lang.String location]
    (-> this (.cancel project-id job-id location))))

(defn get-dataset
  "Description copied from interface: BigQueryRpc

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.Dataset`"
  (^com.google.api.services.bigquery.model.Dataset [^HttpBigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.util.Map options]
    (-> this (.getDataset project-id dataset-id options))))

(defn update
  "Description copied from interface: BigQueryRpc

  routine - `com.google.api.services.bigquery.model.Routine`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.Routine`"
  (^com.google.api.services.bigquery.model.Routine [^HttpBigQueryRpc this ^com.google.api.services.bigquery.model.Routine routine ^java.util.Map options]
    (-> this (.update routine options))))

(defn list-tables
  "Description copied from interface: BigQueryRpc

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.bigquery.model.Table>>`"
  (^com.google.cloud.Tuple [^HttpBigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.util.Map options]
    (-> this (.listTables project-id dataset-id options))))

(defn list-table-data
  "Description copied from interface: BigQueryRpc

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  table-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.TableDataList`"
  (^com.google.api.services.bigquery.model.TableDataList [^HttpBigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.lang.String table-id ^java.util.Map options]
    (-> this (.listTableData project-id dataset-id table-id options))))

(defn delete-table
  "Description copied from interface: BigQueryRpc

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  table-id - `java.lang.String`

  returns: true if table was deleted, false if it was not found - `boolean`"
  (^Boolean [^HttpBigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.lang.String table-id]
    (-> this (.deleteTable project-id dataset-id table-id))))

(defn list-datasets
  "Description copied from interface: BigQueryRpc

  project-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.bigquery.model.Dataset>>`"
  (^com.google.cloud.Tuple [^HttpBigQueryRpc this ^java.lang.String project-id ^java.util.Map options]
    (-> this (.listDatasets project-id options))))

(defn patch
  "Description copied from interface: BigQueryRpc

  dataset - `com.google.api.services.bigquery.model.Dataset`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.Dataset`"
  (^com.google.api.services.bigquery.model.Dataset [^HttpBigQueryRpc this ^com.google.api.services.bigquery.model.Dataset dataset ^java.util.Map options]
    (-> this (.patch dataset options))))

(defn get-routine
  "Description copied from interface: BigQueryRpc

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  routine-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.Routine`"
  (^com.google.api.services.bigquery.model.Routine [^HttpBigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.lang.String routine-id ^java.util.Map options]
    (-> this (.getRoutine project-id dataset-id routine-id options))))

(defn list-jobs
  "Description copied from interface: BigQueryRpc

  project-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.bigquery.model.Job>>`"
  (^com.google.cloud.Tuple [^HttpBigQueryRpc this ^java.lang.String project-id ^java.util.Map options]
    (-> this (.listJobs project-id options))))

(defn insert-all
  "Description copied from interface: BigQueryRpc

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  table-id - `java.lang.String`
  request - `com.google.api.services.bigquery.model.TableDataInsertAllRequest`

  returns: `com.google.api.services.bigquery.model.TableDataInsertAllResponse`"
  (^com.google.api.services.bigquery.model.TableDataInsertAllResponse [^HttpBigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.lang.String table-id ^com.google.api.services.bigquery.model.TableDataInsertAllRequest request]
    (-> this (.insertAll project-id dataset-id table-id request))))

(defn delete-model
  "Description copied from interface: BigQueryRpc

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  model-id - `java.lang.String`

  returns: true if model was deleted, false if it was not found - `boolean`"
  (^Boolean [^HttpBigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.lang.String model-id]
    (-> this (.deleteModel project-id dataset-id model-id))))

(defn get-query-results
  "Description copied from interface: BigQueryRpc

  project-id - `java.lang.String`
  job-id - `java.lang.String`
  location - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.GetQueryResultsResponse`"
  (^com.google.api.services.bigquery.model.GetQueryResultsResponse [^HttpBigQueryRpc this ^java.lang.String project-id ^java.lang.String job-id ^java.lang.String location ^java.util.Map options]
    (-> this (.getQueryResults project-id job-id location options))))

(defn list-routines
  "project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.bigquery.model.Routine>>`"
  (^com.google.cloud.Tuple [^HttpBigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.util.Map options]
    (-> this (.listRoutines project-id dataset-id options))))

(defn create
  "Description copied from interface: BigQueryRpc

  dataset - `com.google.api.services.bigquery.model.Dataset`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.Dataset`"
  (^com.google.api.services.bigquery.model.Dataset [^HttpBigQueryRpc this ^com.google.api.services.bigquery.model.Dataset dataset ^java.util.Map options]
    (-> this (.create dataset options))))

(defn get-table
  "Description copied from interface: BigQueryRpc

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  table-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.Table`"
  (^com.google.api.services.bigquery.model.Table [^HttpBigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.lang.String table-id ^java.util.Map options]
    (-> this (.getTable project-id dataset-id table-id options))))

(defn get-model
  "Description copied from interface: BigQueryRpc

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  model-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.api.services.bigquery.model.Model`"
  (^com.google.api.services.bigquery.model.Model [^HttpBigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.lang.String model-id ^java.util.Map options]
    (-> this (.getModel project-id dataset-id model-id options))))

(defn open
  "Description copied from interface: BigQueryRpc

  load-job - load job - `com.google.api.services.bigquery.model.Job`

  returns: `java.lang.String`"
  (^java.lang.String [^HttpBigQueryRpc this ^com.google.api.services.bigquery.model.Job load-job]
    (-> this (.open load-job))))

(defn write
  "Description copied from interface: BigQueryRpc

  upload-id - the resumable upload session URI - `java.lang.String`
  to-write - a byte array of data to upload - `byte[]`
  to-write-offset - offset in the toWrite param to start writing from - `int`
  dest-offset - offset in the destination where to upload data to - `long`
  length - the number of bytes to upload - `int`
  last - true indicates that the last chunk is being uploaded - `boolean`

  returns: returns the job created to insert the rows, only when last is true.
       Returns null otherwise - `com.google.api.services.bigquery.model.Job`"
  (^com.google.api.services.bigquery.model.Job [^HttpBigQueryRpc this ^java.lang.String upload-id to-write ^Integer to-write-offset ^Long dest-offset ^Integer length ^Boolean last]
    (-> this (.write upload-id to-write to-write-offset dest-offset length last))))

(defn delete-dataset
  "Description copied from interface: BigQueryRpc

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  options - `java.util.Map`

  returns: true if dataset was deleted, false if it was not found - `boolean`"
  (^Boolean [^HttpBigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.util.Map options]
    (-> this (.deleteDataset project-id dataset-id options))))

(defn list-models
  "Description copied from interface: BigQueryRpc

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`
  options - `java.util.Map`

  returns: `com.google.cloud.Tuple<java.lang.String,java.lang.Iterable<com.google.api.services.bigquery.model.Model>>`"
  (^com.google.cloud.Tuple [^HttpBigQueryRpc this ^java.lang.String project-id ^java.lang.String dataset-id ^java.util.Map options]
    (-> this (.listModels project-id dataset-id options))))

