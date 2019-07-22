(ns com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNotesPage
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.devtools.containeranalysis.v1beta1 GrafeasV1Beta1Client$ListNotesPage]))

(defn create-page-async
  "context - `com.google.api.gax.rpc.PageContext`
  future-response - `com.google.api.core.ApiFuture`

  returns: `com.google.api.core.ApiFuture<com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNotesPage>`"
  (^com.google.api.core.ApiFuture [^GrafeasV1Beta1Client$ListNotesPage this ^com.google.api.gax.rpc.PageContext context ^com.google.api.core.ApiFuture future-response]
    (-> this (.createPageAsync context future-response))))

