(ns com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListEvaluationJobsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datalabeling.v1beta1 DataLabelingServiceClient$ListEvaluationJobsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListEvaluationJobsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (DataLabelingServiceClient$ListEvaluationJobsPagedResponse/createAsync context future-response)))

