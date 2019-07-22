(ns com.google.cloud.talent.v4beta1.JobServiceClient$ListJobsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 JobServiceClient$ListJobsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.talent.v4beta1.JobServiceClient$ListJobsPage>`"
  (^com.google.api.core.ApiFuture [^JobServiceClient$ListJobsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

