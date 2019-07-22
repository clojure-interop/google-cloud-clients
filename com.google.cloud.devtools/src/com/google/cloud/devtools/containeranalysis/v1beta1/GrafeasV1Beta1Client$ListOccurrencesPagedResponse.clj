(ns com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListOccurrencesPagedResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.devtools.containeranalysis.v1beta1 GrafeasV1Beta1Client$ListOccurrencesPagedResponse]))

(defn *create-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListOccurrencesPagedResponse>`"
  (^com.google.api.core.ApiFuture [^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (GrafeasV1Beta1Client$ListOccurrencesPagedResponse/createAsync context future-response)))

