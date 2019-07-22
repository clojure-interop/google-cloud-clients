(ns com.google.cloud.dataproc.v1beta2.ClusterControllerClient$ListClustersPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1beta2 ClusterControllerClient$ListClustersPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.dataproc.v1beta2.ClusterControllerClient$ListClustersPage>`"
  (^com.google.api.core.ApiFuture [^ClusterControllerClient$ListClustersPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

