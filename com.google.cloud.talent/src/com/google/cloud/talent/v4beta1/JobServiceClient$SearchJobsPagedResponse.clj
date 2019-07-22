(ns com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 JobServiceClient$SearchJobsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.talent.v4beta1.JobServiceClient$SearchJobsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (JobServiceClient$SearchJobsPagedResponse/createAsync context future-response)))

