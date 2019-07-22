(ns com.google.cloud.dataproc.v1.ClusterControllerClient$ListClustersPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1 ClusterControllerClient$ListClustersPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.dataproc.v1.ClusterControllerClient$ListClustersPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (ClusterControllerClient$ListClustersPagedResponse/createAsync context future-response)))

