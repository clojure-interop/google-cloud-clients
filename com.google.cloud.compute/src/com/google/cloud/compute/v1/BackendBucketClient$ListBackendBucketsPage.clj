(ns com.google.cloud.compute.v1.BackendBucketClient$ListBackendBucketsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendBucketClient$ListBackendBucketsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.compute.v1.BackendBucketClient$ListBackendBucketsPage>`"
  (^com.google.api.core.ApiFuture [^BackendBucketClient$ListBackendBucketsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

