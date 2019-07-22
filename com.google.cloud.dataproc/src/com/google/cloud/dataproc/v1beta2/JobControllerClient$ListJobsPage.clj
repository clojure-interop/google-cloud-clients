(ns com.google.cloud.dataproc.v1beta2.JobControllerClient$ListJobsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1beta2 JobControllerClient$ListJobsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.dataproc.v1beta2.JobControllerClient$ListJobsPage>`"
  (^com.google.api.core.ApiFuture [^JobControllerClient$ListJobsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

