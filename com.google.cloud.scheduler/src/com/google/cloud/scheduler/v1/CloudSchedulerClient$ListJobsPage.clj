(ns com.google.cloud.scheduler.v1.CloudSchedulerClient$ListJobsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.scheduler.v1 CloudSchedulerClient$ListJobsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.scheduler.v1.CloudSchedulerClient$ListJobsPage>`"
  (^com.google.api.core.ApiFuture [^CloudSchedulerClient$ListJobsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

