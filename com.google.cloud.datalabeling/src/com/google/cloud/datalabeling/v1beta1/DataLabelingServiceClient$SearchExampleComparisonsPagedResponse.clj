(ns com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchExampleComparisonsPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datalabeling.v1beta1 DataLabelingServiceClient$SearchExampleComparisonsPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$SearchExampleComparisonsPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (DataLabelingServiceClient$SearchExampleComparisonsPagedResponse/createAsync context future-response)))

