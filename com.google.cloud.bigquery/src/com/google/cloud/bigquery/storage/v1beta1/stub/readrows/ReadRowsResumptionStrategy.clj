(ns com.google.cloud.bigquery.storage.v1beta1.stub.readrows.ReadRowsResumptionStrategy
  "An implementation of a StreamResumptionStrategy for the ReadRows API. This class tracks
  the offset of the last row received and, upon retry, attempts to resume the stream at the next
  offset.

  This class is considered an internal implementation detail and not meant to be used by
  applications."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.storage.v1beta1.stub.readrows ReadRowsResumptionStrategy]))

(defn ->read-rows-resumption-strategy
  "Constructor."
  (^ReadRowsResumptionStrategy []
    (new ReadRowsResumptionStrategy )))

(defn create-new
  "returns: `com.google.api.gax.retrying.StreamResumptionStrategy<com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsResponse>`"
  (^com.google.api.gax.retrying.StreamResumptionStrategy [^ReadRowsResumptionStrategy this]
    (-> this (.createNew))))

(defn process-response
  "response - `com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsResponse`

  returns: `com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsResponse`"
  (^com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsResponse [^ReadRowsResumptionStrategy this ^com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsResponse response]
    (-> this (.processResponse response))))

(defn get-resume-request
  "Given the initial/original request, this implementation generates a request that will yield
   a new stream whose first response would come right after the last response received by
   processResponse. It takes into account the offset from the original request.

  original-request - `com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsRequest`

  returns: `com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsRequest`"
  (^com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsRequest [^ReadRowsResumptionStrategy this ^com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsRequest original-request]
    (-> this (.getResumeRequest original-request))))

(defn can-resume?
  "returns: `boolean`"
  (^Boolean [^ReadRowsResumptionStrategy this]
    (-> this (.canResume))))

