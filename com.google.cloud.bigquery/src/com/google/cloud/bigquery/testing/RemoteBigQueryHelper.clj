(ns com.google.cloud.bigquery.testing.RemoteBigQueryHelper
  "Utility to create a remote BigQuery configuration for testing. BigQuery options can be obtained
  via the getOptions() method. Returned options have custom ServiceOptions.getRetrySettings(): RetrySettings.getMaxAttempts() is 10, RetrySettings.getMaxRetryDelay() is 30000, RetrySettings.getTotalTimeout() is
  120000 and RetrySettings.getInitialRetryDelay() is 250. HttpTransportOptions.getConnectTimeout() and HttpTransportOptions.getReadTimeout() are
  both set to 60000."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.testing RemoteBigQueryHelper]))

(defn *force-delete
  "Deletes a dataset, even if non-empty.

  bigquery - the BigQuery service to be used to issue the delete request - `com.google.cloud.bigquery.BigQuery`
  dataset - the dataset to be deleted - `java.lang.String`

  returns: true if deletion succeeded, false if the dataset was not found - `boolean`

  throws: com.google.cloud.bigquery.BigQueryException - upon failure"
  (^Boolean [^com.google.cloud.bigquery.BigQuery bigquery ^java.lang.String dataset]
    (RemoteBigQueryHelper/forceDelete bigquery dataset)))

(defn *generate-dataset-name
  "Returns a dataset name generated using a random UUID.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RemoteBigQueryHelper/generateDatasetName )))

(defn *generate-model-name
  "returns: `java.lang.String`"
  (^java.lang.String []
    (RemoteBigQueryHelper/generateModelName )))

(defn *generate-routine-name
  "returns: `java.lang.String`"
  (^java.lang.String []
    (RemoteBigQueryHelper/generateRoutineName )))

(defn *create
  "Creates a RemoteBigQueryHelper object for the given project id and JSON key input
   stream.

  project-id - id of the project to be used for running the tests - `java.lang.String`
  key-stream - input stream for a JSON key - `java.io.InputStream`

  returns: A RemoteBigQueryHelper object for the provided options - `com.google.cloud.bigquery.testing.RemoteBigQueryHelper`

  throws: com.google.cloud.bigquery.testing.RemoteBigQueryHelper$BigQueryHelperException - if keyStream is not a valid JSON key stream"
  (^com.google.cloud.bigquery.testing.RemoteBigQueryHelper [^java.lang.String project-id ^java.io.InputStream key-stream]
    (RemoteBigQueryHelper/create project-id key-stream))
  (^com.google.cloud.bigquery.testing.RemoteBigQueryHelper []
    (RemoteBigQueryHelper/create )))

(defn get-options
  "Returns a BigQueryOptions object to be used for testing.

  returns: `com.google.cloud.bigquery.BigQueryOptions`"
  (^com.google.cloud.bigquery.BigQueryOptions [^RemoteBigQueryHelper this]
    (-> this (.getOptions))))

