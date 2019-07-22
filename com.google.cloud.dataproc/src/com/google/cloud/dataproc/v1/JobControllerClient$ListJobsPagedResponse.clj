(ns com.google.cloud.dataproc.v1.JobControllerClient$ListJobsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1 JobControllerClient$ListJobsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.dataproc.v1.JobControllerClient$ListJobsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (JobControllerClient$ListJobsPagedResponse/createAsync context future-response)))

