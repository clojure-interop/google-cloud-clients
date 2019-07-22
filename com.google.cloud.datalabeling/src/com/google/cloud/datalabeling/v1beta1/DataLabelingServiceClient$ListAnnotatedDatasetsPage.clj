(ns com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotatedDatasetsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datalabeling.v1beta1 DataLabelingServiceClient$ListAnnotatedDatasetsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotatedDatasetsPage>`"
  (^com.google.api.core.ApiFuture [^DataLabelingServiceClient$ListAnnotatedDatasetsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

