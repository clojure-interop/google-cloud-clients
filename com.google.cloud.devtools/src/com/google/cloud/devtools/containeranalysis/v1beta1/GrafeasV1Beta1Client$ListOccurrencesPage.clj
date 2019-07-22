(ns com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListOccurrencesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.devtools.containeranalysis.v1beta1 GrafeasV1Beta1Client$ListOccurrencesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListOccurrencesPage>`"
  (^com.google.api.core.ApiFuture [^GrafeasV1Beta1Client$ListOccurrencesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

