(ns com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchExampleComparisonsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datalabeling.v1beta1 DataLabelingServiceClient$SearchExampleComparisonsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchExampleComparisonsPage>`"
  (^com.google.api.core.ApiFuture [^DataLabelingServiceClient$SearchExampleComparisonsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

