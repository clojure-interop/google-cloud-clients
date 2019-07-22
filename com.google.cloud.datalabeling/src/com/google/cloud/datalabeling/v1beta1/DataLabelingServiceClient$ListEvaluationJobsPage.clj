(ns com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListEvaluationJobsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datalabeling.v1beta1 DataLabelingServiceClient$ListEvaluationJobsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListEvaluationJobsPage>`"
  (^com.google.api.core.ApiFuture [^DataLabelingServiceClient$ListEvaluationJobsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

