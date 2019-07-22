(ns com.google.cloud.scheduler.v1.CloudSchedulerClient$ListJobsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.scheduler.v1 CloudSchedulerClient$ListJobsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.scheduler.v1.CloudSchedulerClient$ListJobsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (CloudSchedulerClient$ListJobsPagedResponse/createAsync context future-response)))

