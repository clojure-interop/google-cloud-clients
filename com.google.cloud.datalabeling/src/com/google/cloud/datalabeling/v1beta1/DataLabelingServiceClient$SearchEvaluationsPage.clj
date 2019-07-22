(ns com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchEvaluationsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datalabeling.v1beta1 DataLabelingServiceClient$SearchEvaluationsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchEvaluationsPage>`"
  (^com.google.api.core.ApiFuture [^DataLabelingServiceClient$SearchEvaluationsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

