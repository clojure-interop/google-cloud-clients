(ns com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotationSpecSetsPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datalabeling.v1beta1 DataLabelingServiceClient$ListAnnotationSpecSetsPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient$ListAnnotationSpecSetsPage>`"
  (^com.google.api.core.ApiFuture [^DataLabelingServiceClient$ListAnnotationSpecSetsPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

